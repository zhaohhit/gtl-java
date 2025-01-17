package cn.edu.cug.cs.gtl.jts.geom;

import java.awt.Shape;
import java.awt.geom.IllegalPathStateException;
import java.awt.geom.PathIterator;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.edu.cug.cs.gtl.jts.geom.impl.CoordinateArraySequence;
import cn.edu.cug.cs.gtl.jts.geom.impl.CoordinateArraySequenceFactory;
import cn.edu.cug.cs.gtl.jts.geom.util.AffineTransformation;
import cn.edu.cug.cs.gtl.jts.operation.polygonize.Polygonizer;
import org.geotools.geometry.AbstractDirectPosition;
import org.geotools.geometry.GeneralDirectPosition;
import org.geotools.referencing.CRS;
import org.geotools.referencing.GeodeticCalculator;
import org.geotools.referencing.crs.DefaultGeographicCRS;
import org.geotools.referencing.operation.projection.PointOutsideEnvelopeException;
import org.geotools.resources.Classes;
import org.geotools.resources.geometry.ShapeUtilities;
import org.geotools.resources.i18n.ErrorKeys;
import org.geotools.resources.i18n.Errors;
import org.opengis.geometry.BoundingBox;
import org.opengis.geometry.DirectPosition;
import org.opengis.geometry.MismatchedDimensionException;
import org.opengis.referencing.FactoryException;
import org.opengis.referencing.crs.CoordinateReferenceSystem;
import org.opengis.referencing.cs.CoordinateSystemAxis;
import org.opengis.referencing.operation.MathTransform;
import org.opengis.referencing.operation.TransformException;

import cn.edu.cug.cs.gtl.jts.algorithm.CGAlgorithms;
import cn.edu.cug.cs.gtl.jts.awt.ShapeReader;

/**
 * JTS Geometry utility methods, bringing Geotools to JTS.
 * <p>
 * Offers geotools based services such as reprojection.
 * <p>
 * Responsibilities:
 * <ul>
 * <li>transformation</li>
 * <li>coordinate sequence editing</li>
 * <li>common coordinate sequence implementations for specific uses</li>
 * </ul>
 *
 * @author Jody Garnett
 * @author Martin Desruisseaux
 * @author Simone Giannecchini, GeoSolutions.
 * @author Michael Bedward
 * @version $Id$
 * @source $URL$
 * @since 2.2
 */
public final class JTS {
    /**
     * A pool of direct positions for use in {@link #orthodromicDistance}.
     */
    private static final GeneralDirectPosition[] POSITIONS = new GeneralDirectPosition[4];

    public static final AffineTransformation Y_INVERSION = new AffineTransformation(1, 0, 0, 0, -1, 0);

    static {
        for (int i = 0; i < POSITIONS.length; i++) {
            POSITIONS[i] = new GeneralDirectPosition(i);
        }
    }

    /**
     * Geodetic calculators already created for a given coordinate reference system. For use in
     * {@link #orthodromicDistance}.
     * <p>
     * Note: We would like to use {@link org.geotools.util.CanonicalSet}, but we can't because
     * {@link GeodeticCalculator} keep a reference to the CRS which is used as the key.
     */
    private static final Map<CoordinateReferenceSystem, GeodeticCalculator> CALCULATORS = new HashMap<CoordinateReferenceSystem, GeodeticCalculator>();

    /**
     * Do not allow instantiation of this class.
     */
    private JTS() {
    }

    /**
     * Makes sure that an argument is non-null.
     *
     * @param name   Argument name.
     * @param object User argument.
     * @throws IllegalArgumentException if {@code object} is null.
     */
    private static void ensureNonNull(final String name, final Object object)
            throws IllegalArgumentException {
        if (object == null) {
            throw new IllegalArgumentException(Errors.format(ErrorKeys.NULL_ARGUMENT_$1, name));
        }
    }

    /**
     * Transforms the envelope using the specified math transform. Note that this method can not
     * handle the case where the envelope contains the North or South pole, or when it cross the
     * &plusmn;180ï¿½ longitude, because {@linkplain MathTransform math transforms} do not carry
     * suffisient informations. For a more robust envelope transformation, use
     * {@link ReferencedEnvelope#transform(CoordinateReferenceSystem, boolean)} instead.
     *
     * @param envelope  The envelope to transform.
     * @param transform The transform to use.
     * @return The transformed Envelope
     * @throws TransformException if at least one coordinate can't be transformed.
     */
    public static Envelope transform(final Envelope envelope, final MathTransform transform)
            throws TransformException {
        return transform(envelope, null, transform, 5);
    }

    /**
     * Transforms the densified envelope using the specified math transform. The envelope is
     * densified (extra points put around the outside edge) to provide a better new envelope for
     * high deformed situations.
     * <p>
     * If an optional target envelope is provided, this envelope will be
     * {@linkplain Envelope#expandToInclude expanded} with the transformation result. It will
     * <strong>not</strong> be {@linkplain Envelope#setToNull nullified} before the expansion.
     * <p>
     * Note that this method can not handle the case where the envelope contains the North or South
     * pole, or when it cross the &plusmn;180ï¿½ longitude, because {@linkplain MathTransform math
     * transforms} do not carry suffisient informations. For a more robust envelope transformation,
     * use {@link ReferencedEnvelope#transform(CoordinateReferenceSystem, boolean, int)} instead.
     *
     * @param sourceEnvelope The envelope to transform.
     * @param targetEnvelope An envelope to expand with the transformation result, or {@code null} for
     *                       returning an new envelope.
     * @param transform      The transform to use.
     * @param npoints        Densification of each side of the rectangle.
     * @return {@code targetEnvelope} if it was non-null, or a new envelope otherwise. In all case,
     * the returned envelope fully contains the transformed envelope.
     * @throws TransformException if a coordinate can't be transformed.
     */
    public static Envelope transform(final Envelope sourceEnvelope, Envelope targetEnvelope,
                                     final MathTransform transform, int npoints) throws TransformException {
        ensureNonNull("sourceEnvelope", sourceEnvelope);
        ensureNonNull("transform", transform);

        if (transform.getSourceDimensions() != transform.getTargetDimensions() ||
                transform.getSourceDimensions() < 2) {
            throw new MismatchedDimensionException(Errors.format(ErrorKeys.BAD_TRANSFORM_$1,
                    Classes.getShortClassName(transform)));
        }

        npoints++; // for the starting point.

        final double[] coordinates = new double[(4 * npoints) * 2];
        final double xmin = sourceEnvelope.getMinX();
        final double xmax = sourceEnvelope.getMaxX();
        final double ymin = sourceEnvelope.getMinY();
        final double ymax = sourceEnvelope.getMaxY();
        final double scaleX = (xmax - xmin) / npoints;
        final double scaleY = (ymax - ymin) / npoints;

        int offset = 0;

        for (int t = 0; t < npoints; t++) {
            final double dx = scaleX * t;
            final double dy = scaleY * t;
            coordinates[offset++] = xmin; // Left side, increasing toward top.
            coordinates[offset++] = ymin + dy;
            coordinates[offset++] = xmin + dx; // Top side, increasing toward right.
            coordinates[offset++] = ymax;
            coordinates[offset++] = xmax; // Right side, increasing toward bottom.
            coordinates[offset++] = ymax - dy;
            coordinates[offset++] = xmax - dx; // Bottom side, increasing toward left.
            coordinates[offset++] = ymin;
        }
        assert offset == coordinates.length;
        xform(transform, coordinates, coordinates);

        // Now find the min/max of the result
        if (targetEnvelope == null) {
            targetEnvelope = new Envelope();
        }

        for (int t = 0; t < offset; ) {
            targetEnvelope.expandToInclude(coordinates[t++], coordinates[t++]);
        }

        return targetEnvelope;
    }


    /**
     * Transform the provided 2D direct position into 3D (0 Ellipsoidal height assumed when
     * converting from {@link DefaultGeographicCRS#WGS84} to {@link DefaultGeographicCRS#WGS84_3D}).
     *
     * @param srcPosition           Source 2D position
     * @param transformToWGS84      From source CRS to To WGS84
     * @param transformFromWGS84_3D From WGS84_3D to target CRS
     * @return Position in target CRS as calculated by transform2
     * @throws TransformException
     */
    private static DirectPosition transformTo3D(GeneralDirectPosition srcPosition, MathTransform transformToWGS84,
                                                MathTransform transformFromWGS84_3D) throws TransformException {
        DirectPosition world2D = transformToWGS84.transform(srcPosition, null);

        DirectPosition world3D = new GeneralDirectPosition(DefaultGeographicCRS.WGS84_3D);
        world3D.setOrdinate(0, world2D.getOrdinate(0));
        world3D.setOrdinate(1, world2D.getOrdinate(1));
        world3D.setOrdinate(2, 0.0); // 0 elliposial height is assumed

        DirectPosition targetPosition = transformFromWGS84_3D.transform(world3D, null);
        return targetPosition;
    }

    /**
     * Transform the provided 3D direct position into 2D (Ellipsoidal height is ignored when
     * converting from {@link DefaultGeographicCRS#WGS84_3D} to {@link DefaultGeographicCRS#WGS84}).
     *
     * @param srcPosition         Source 3D position
     * @param transformToWGS84_3D From source CRS to To WGS84_3D
     * @param transformFromWGS84  From WGS84 to target CRS
     * @return Position in target CRS as calculated by transform2
     * @throws TransformException
     */
    private static DirectPosition transformTo2D(GeneralDirectPosition srcPosition, MathTransform transformToWGS84_3D,
                                                MathTransform transformFromWGS84) throws TransformException {
        if (Double.isNaN(srcPosition.getOrdinate(2))) {
            srcPosition.setOrdinate(2, 0.0); // lazy add 3rd ordinate if not provided to prevent failure
        }
        DirectPosition world3D = transformToWGS84_3D.transform(srcPosition, null);

        DirectPosition world2D = new GeneralDirectPosition(DefaultGeographicCRS.WGS84);
        world2D.setOrdinate(0, world3D.getOrdinate(0));
        world2D.setOrdinate(1, world3D.getOrdinate(1));

        DirectPosition targetPosition = transformFromWGS84.transform(world2D, null);
        return targetPosition;
    }


    /**
     * Transforms the geometry using the default transformer.
     *
     * @param geom      The geom to transform
     * @param transform the transform to use during the transformation.
     * @return the transformed geometry. It will be a new geometry.
     * @throws MismatchedDimensionException if the geometry doesn't have the expected dimension for the specified transform.
     * @throws TransformException           if a point can't be transformed.
     */
    public static Geometry transform(final Geometry geom, final MathTransform transform)
            throws MismatchedDimensionException, TransformException {
        final GeometryCoordinateSequenceTransformer transformer = new GeometryCoordinateSequenceTransformer();
        transformer.setMathTransform(transform);

        return transformer.transform(geom);
    }


    /**
     * Transforms the coordinate using the provided math transform.
     *
     * @param source the source coordinate that will be transformed
     * @param dest   the coordinate that will be set. May be null or the source coordinate (or new
     *               coordinate of course).
     * @return the destination coordinate if not null or a new Coordinate.
     * @throws TransformException if the coordinate can't be transformed.
     */
    public static Coordinate transform(final Coordinate source, Coordinate dest,
                                       final MathTransform transform) throws TransformException {
        ensureNonNull("source", source);
        ensureNonNull("transform", transform);

        if (dest == null) {
            dest = new Coordinate();
        }

        final double[] array = new double[transform.getTargetDimensions()];
        copy(source, array);
        transform.transform(array, 0, array, 0, 1);

        switch (transform.getTargetDimensions()) {
            case 3:
                dest.z = array[2]; // Fall through

            case 2:
                dest.y = array[1]; // Fall through

            case 1:
                dest.x = array[0]; // Fall through

            case 0:
                break;
        }

        return dest;
    }


    /**
     * Like a transform but eXtreme!
     * <p>
     * Transforms an array of coordinates using the provided math transform. Each coordinate is
     * transformed separately. In case of a transform exception then the new value of the coordinate
     * is the last coordinate correctly transformed.
     *
     * @param transform The math transform to apply.
     * @param src       The source coordinates.
     * @param dest      The destination array for transformed coordinates.
     * @throws TransformException if this method failed to transform any of the points.
     */
    public static void xform(final MathTransform transform, final double[] src, final double[] dest)
            throws TransformException {
        ensureNonNull("transform", transform);

        final int sourceDim = transform.getSourceDimensions();
        final int targetDim = transform.getTargetDimensions();

        if (targetDim != sourceDim) {
            throw new MismatchedDimensionException();
        }

        TransformException firstError = null;
        boolean startPointTransformed = false;

        for (int i = 0; i < src.length; i += sourceDim) {
            try {
                transform.transform(src, i, dest, i, 1);

                if (!startPointTransformed) {
                    startPointTransformed = true;

                    for (int j = 0; j < i; j++) {
                        System.arraycopy(dest, j, dest, i, targetDim);
                    }
                }
            } catch (TransformException e) {
                if (firstError == null) {
                    firstError = e;
                }

                if (startPointTransformed) {
                    System.arraycopy(dest, i - targetDim, dest, i, targetDim);
                }
            }
        }

        if (!startPointTransformed && (firstError != null)) {
            throw firstError;
        }
    }

    /**
     * Computes the orthodromic distance between two points. This method:
     * <p>
     * <ol>
     * <li>Transforms both points to geographic coordinates
     * (<var>latitude</var>,<var>longitude</var>).</li>
     * <li>Computes the orthodromic distance between the two points using ellipsoidal calculations.</li>
     * </ol>
     * <p>
     * The real work is performed by {@link GeodeticCalculator}. This convenience method simply
     * manages a pool of pre-defined geodetic calculators for the given coordinate reference system
     * in order to avoid repetitive object creation. If a large amount of orthodromic distances need
     * to be computed, direct use of {@link GeodeticCalculator} provides better performance than
     * this convenience method.
     *
     * @param p1  First point
     * @param p2  Second point
     * @param crs Reference system the two points are in.
     * @return Orthodromic distance between the two points, in meters.
     * @throws TransformException if the coordinates can't be transformed from the specified CRS to a
     *                            {@linkplain org.opengis.referencing.crs.GeographicCRS geographic CRS}.
     */
    public static synchronized double orthodromicDistance(final Coordinate p1, final Coordinate p2,
                                                          final CoordinateReferenceSystem crs) throws TransformException {
        ensureNonNull("p1", p1);
        ensureNonNull("p2", p2);
        ensureNonNull("crs", crs);

        /*
         * Need to synchronize because we use a single instance of a Map (CALCULATORS) as well as
         * shared instances of GeodeticCalculator and GeneralDirectPosition (POSITIONS). None of
         * them are thread-safe.
         */
        GeodeticCalculator gc = (GeodeticCalculator) CALCULATORS.get(crs);

        if (gc == null) {
            gc = new GeodeticCalculator(crs);
            CALCULATORS.put(crs, gc);
        }
        assert crs.equals(gc.getCoordinateReferenceSystem()) : crs;

        final GeneralDirectPosition pos = POSITIONS[Math.min(POSITIONS.length - 1, crs
                .getCoordinateSystem().getDimension())];
        pos.setCoordinateReferenceSystem(crs);
        copy(p1, pos.ordinates);
        gc.setStartingPosition(pos);
        copy(p2, pos.ordinates);
        gc.setDestinationPosition(pos);

        return gc.getOrthodromicDistance();
    }

    /**
     * Creates a DirectPosition from the provided point.
     *
     * @param point
     * @param crs
     * @return DirectPosition
     */
    public static DirectPosition toDirectPosition(final Coordinate point,
                                                  final CoordinateReferenceSystem crs) {
        // GeneralDirectPosition directPosition = new GeneralDirectPosition(crs);
        // copy( point, directPosition.ordinates );
        // return directPosition;

        return new AbstractDirectPosition() {

            public CoordinateReferenceSystem getCoordinateReferenceSystem() {
                return crs;
            }

            public int getDimension() {
                return crs.getCoordinateSystem().getDimension();
            }

            public double getOrdinate(int dimension)
                    throws IndexOutOfBoundsException {
                switch (dimension) {
                    case 0:
                        return point.x;
                    case 1:
                        return point.y;
                    case 2:
                        return point.z;
                    default:
                        return Double.NaN;
                }
            }

            public void setOrdinate(int dimension, double value)
                    throws IndexOutOfBoundsException {
                switch (dimension) {
                    case 0:
                        point.x = value;
                        return;
                    case 1:
                        point.y = value;
                        return;
                    case 2:
                        point.z = value;
                        return;
                    default:
                        // ignore
                }
            }
        };
    }

    /**
     * Copies the ordinates values from the specified JTS coordinates to the specified array. The
     * destination array can have any length. Only the relevant field of the source coordinate will
     * be copied. If the array length is greater than 3, then all extra dimensions will be set to
     * {@link Double#NaN NaN}.
     *
     * @param point     The source coordinate.
     * @param ordinates The destination array.
     */
    public static void copy(final Coordinate point, final double[] ordinates) {
        ensureNonNull("point", point);
        ensureNonNull("ordinates", ordinates);

        switch (ordinates.length) {
            default:
                Arrays.fill(ordinates, 3, ordinates.length, Double.NaN); // Fall through

            case 3:
                ordinates[2] = point.z; // Fall through

            case 2:
                ordinates[1] = point.y; // Fall through

            case 1:
                ordinates[0] = point.x; // Fall through

            case 0:
                break;
        }
    }

    /**
     * Converts an arbitrary Java2D shape into a JTS geometry. The created JTS geometry may be any
     * of {@link LineString}, {@link LinearRing} or {@link MultiLineString}.
     *
     * @param shape   The Java2D shape to create.
     * @param factory The JTS factory to use for creating geometry.
     * @return The JTS geometry.
     * @deprecated Please use {@link #toGeometry(Shape)} or
     * {@link #toGeometry(Shape, GeometryFactory)}
     */
    public static Geometry shapeToGeometry(final Shape shape, final GeometryFactory factory) {
        return toGeometry(shape, factory);
    }

    /**
     * Converts an arbitrary Java2D shape into a JTS geometry. The created JTS geometry may be any
     * of {@link LineString}, {@link LinearRing} or {@link MultiLineString}.
     *
     * @param shape the input shape
     * @return A new JTS geometry instance
     * @throws IllegalArgumentException if {@code shape} is {@code null}
     */
    public static Geometry toGeometry(final Shape shape) {
        return toGeometry(shape, new GeometryFactory());
    }

    /**
     * Converts an arbitrary Java2D shape into a JTS geometry. The created JTS geometry may be any
     * of {@link LineString}, {@link LinearRing} or {@link MultiLineString}.
     *
     * @param shape   the input shape
     * @param factory the JTS factory to use to create the geometry
     * @return A new JTS geometry instance
     * @throws IllegalArgumentException if either {@code shape} or {@code factory} is {@code null}
     */
    public static Geometry toGeometry(final Shape shape, final GeometryFactory factory) {
        ensureNonNull("shape", shape);
        ensureNonNull("factory", factory);

        final PathIterator iterator = shape
                .getPathIterator(null, ShapeUtilities.getFlatness(shape));
        final double[] buffer = new double[6];
        final List<Coordinate> coords = new ArrayList<Coordinate>();
        final List<LineString> lines = new ArrayList<LineString>();

        while (!iterator.isDone()) {
            switch (iterator.currentSegment(buffer)) {
                /*
                 * Close the polygon: the last point is equal to the first point, and a LinearRing is
                 * created.
                 */
                case PathIterator.SEG_CLOSE: {
                    if (!coords.isEmpty()) {
                        coords.add(coords.get(0));
                        lines.add(factory.createLinearRing((Coordinate[]) coords
                                .toArray(new Coordinate[coords.size()])));
                        coords.clear();
                    }
                    break;
                }

                /*
                 * General case: A LineString is created from previous points, and a new LineString
                 * begin for next points.
                 */
                case PathIterator.SEG_MOVETO: {
                    if (!coords.isEmpty()) {
                        lines.add(factory.createLineString((Coordinate[]) coords
                                .toArray(new Coordinate[coords.size()])));
                        coords.clear();
                    }

                    // Fall through
                }

                case PathIterator.SEG_LINETO: {
                    coords.add(new Coordinate(buffer[0], buffer[1]));

                    break;
                }

                default:
                    throw new IllegalPathStateException();
            }

            iterator.next();
        }

        /*
         * End of loops: create the last LineString if any, then create the MultiLineString.
         */
        if (!coords.isEmpty()) {
            lines.add(factory.createLineString((Coordinate[]) coords.toArray(new Coordinate[coords
                    .size()])));
        }

        switch (lines.size()) {
            case 0:
                return null;

            case 1:
                return (LineString) lines.get(0);

            default:
                return factory.createMultiLineString(GeometryFactory.toLineStringArray(lines));
        }
    }

    /**
     * Create a Point from a ISO Geometry DirectPosition.
     *
     * @param position
     * @return Point
     */
    public static Point toGeometry(DirectPosition position) {
        return toGeometry(position, null);
    }

    /**
     * Create a Point from a ISO Geometry DirectPosition.
     *
     * @param position
     * @param factory  Optional GeometryFactory
     * @return Point
     */
    public static Point toGeometry(DirectPosition position, GeometryFactory factory) {
        if (factory == null) {
            factory = new GeometryFactory();
        }

        Coordinate coordinate = new Coordinate(position.getOrdinate(0), position.getOrdinate(1));
        if (position.getDimension() == 3) {
            coordinate.z = position.getOrdinate(2);
        }
        return factory.createPoint(coordinate);

    }


    /**
     * Convert the provided bbox to a polygon, sampling a set number of points along each side.
     *
     * @param bbox    bounding box being converted to a Polygon
     * @param factory geometry factory used to create the polygon
     * @param npoints number of points to sample along each edge
     * @return Polygon
     */
    public static Polygon toGeometry(BoundingBox bbox, GeometryFactory factory, int npoints) {
        npoints++; // for the starting point.
        if (bbox == null) {
            return null;
        }
        if (factory == null) {
            factory = new GeometryFactory();
        }

        final Coordinate[] coordinates = new Coordinate[(4 * npoints)];
        final double xmin = bbox.getMinX();
        final double xmax = bbox.getMaxX();
        final double ymin = bbox.getMinY();
        final double ymax = bbox.getMaxY();
        final double scaleX = (xmax - xmin) / npoints;
        final double scaleY = (ymax - ymin) / npoints;

        int top = 0;
        int right = npoints;
        int bottom = npoints * 2;
        int left = npoints * 3;

        for (int t = 0; t < npoints; t++) {
            final double dx = scaleX * t;
            final double dy = scaleY * t;
            coordinates[top + t] = new Coordinate(xmin + dx, ymax);
            coordinates[left + t] = new Coordinate(xmin, ymin + dy);
            coordinates[bottom + t] = new Coordinate(xmax - dx, ymin);
            coordinates[right + t] = new Coordinate(xmax, ymax - dy);
        }
        Polygon polygon = factory.createPolygon(factory.createLinearRing(coordinates), null);

        polygon.setUserData(bbox.getCoordinateReferenceSystem());

        return polygon;
    }

    /**
     * Transforms the geometry from its current crs to {@link DefaultGeographicCRS#WGS84}. If the
     * specified geometry is already in WGS84, then it is returned unchanged.
     * <p>
     * The method {@link CRS#equalsIgnoreMetadata(Object, Object)} is used to compare the numeric values
     * and axis order (so {@code CRS.decode("CRS.84")} or {@code CRS.decode("4326",true)}
     * provide an appropriate match).
     *
     * @param geom The geometry to transform.
     * @param crs  The CRS the geometry is currently in.
     * @return The geometry transformed to be in {@link DefaultGeographicCRS#WGS84}.
     * @throws TransformException If at least one coordinate can't be transformed.
     */
    public static Geometry toGeographic(Geometry geom, final CoordinateReferenceSystem crs) throws TransformException {
        if (crs == null) {
            return geom;
        }
        if (crs.getCoordinateSystem().getDimension() >= 3) {
            try {
                MathTransform transform = CRS.findMathTransform(crs, DefaultGeographicCRS.WGS84_3D);
                Geometry geometry = transform(geom, transform);

                return geometry; // The extra Z values will be ignored
            } catch (FactoryException exception) {
                throw new TransformException(Errors.format(
                        ErrorKeys.CANT_REPROJECT_$1, crs));
            }
        } else if (CRS.equalsIgnoreMetadata(crs, DefaultGeographicCRS.WGS84)) {
            return geom;
        } else {
            try {
                MathTransform transform = CRS.findMathTransform(crs, DefaultGeographicCRS.WGS84);
                return transform(geom, transform);
            } catch (FactoryException exception) {
                throw new TransformException(Errors.format(
                        ErrorKeys.CANT_REPROJECT_$1, crs));
            }
        }
    }

    /**
     * Converts a {@link BoundingBox} to a JTS polygon.
     * <p>
     * The resulting polygon contains an outer ring with vertices:
     * (x1,y1),(x2,y1),(x2,y2),(x1,y2),(x1,y1)
     *
     * @param envelope The original envelope.
     * @return The envelope as a polygon.
     * @throws IllegalArgumentException if {@code bbox} is {@code null}
     * @since 2.4
     */
    public static Polygon toGeometry(BoundingBox bbox) {
        return toGeometry(bbox, new GeometryFactory());
    }

    /**
     * Converts a {@link BoundingBox} to a JTS polygon using the given JTS geometry factory.
     * <p>
     * The resulting polygon contains an outer ring with vertices:
     * (x1,y1),(x2,y1),(x2,y2),(x1,y2),(x1,y1)
     *
     * @param envelope The original envelope.
     * @return The envelope as a polygon.
     * @throws IllegalArgumentException if either {@code bbox} or {@code factory} is {@code null}
     * @since 2.8
     */
    public static Polygon toGeometry(BoundingBox bbox, final GeometryFactory factory) {
        ensureNonNull("bbox", bbox);
        ensureNonNull("factory", factory);

        Polygon polygon = factory.createPolygon(
                factory.createLinearRing(new Coordinate[]{
                        new Coordinate(bbox.getMinX(), bbox.getMinY()),
                        new Coordinate(bbox.getMaxX(), bbox.getMinY()),
                        new Coordinate(bbox.getMaxX(), bbox.getMaxY()),
                        new Coordinate(bbox.getMinX(), bbox.getMaxY()),
                        new Coordinate(bbox.getMinX(), bbox.getMinY())}), null);
        polygon.setUserData(bbox.getCoordinateReferenceSystem());
        return polygon;
    }

    /**
     * Checks a Geometry coordinates are within the area of validity of the specified reference
     * system. If a coordinate falls outside the area of validity a
     * {@link PointOutsideEnvelopeException} is thrown
     *
     * @param geom the geometry to check
     * @param the  crs that defines the are of validity (must not be null)
     * @throws PointOutsideEnvelopeException
     * @since 2.4
     */
    public static void checkCoordinatesRange(Geometry geom, CoordinateReferenceSystem crs)
            throws PointOutsideEnvelopeException {
        // named x,y, but could be anything
        CoordinateSystemAxis x = crs.getCoordinateSystem().getAxis(0);
        CoordinateSystemAxis y = crs.getCoordinateSystem().getAxis(1);

        // check if unbounded, many projected systems are, in this case no check
        // is needed
        boolean xUnbounded = Double.isInfinite(x.getMinimumValue())
                && Double.isInfinite(x.getMaximumValue());
        boolean yUnbounded = Double.isInfinite(y.getMinimumValue())
                && Double.isInfinite(y.getMaximumValue());

        if (xUnbounded && yUnbounded) {
            return;
        }

        // check each coordinate
        Coordinate[] c = geom.getCoordinates();

        for (int i = 0; i < c.length; i++) {
            if (!xUnbounded && ((c[i].x < x.getMinimumValue()) || (c[i].x > x.getMaximumValue()))) {
                throw new PointOutsideEnvelopeException(c[i].x + " outside of ("
                        + x.getMinimumValue() + "," + x.getMaximumValue() + ")");
            }

            if (!yUnbounded && ((c[i].y < y.getMinimumValue()) || (c[i].y > y.getMaximumValue()))) {
                throw new PointOutsideEnvelopeException(c[i].y + " outside of ("
                        + y.getMinimumValue() + "," + y.getMaximumValue() + ")");
            }
        }
    }

    /**
     * Creates a smoothed copy of the input Geometry. This is only useful for polygonal and lineal
     * geometries. Point objects will be returned unchanged. The smoothing algorithm inserts new
     * vertices which are positioned using Bezier splines. All vertices of the input Geometry will
     * be present in the output Geometry.
     * <p>
     * The {@code fit} parameter controls how tightly the smoothed lines conform to the input line
     * segments, with a value of 1 being tightest and 0 being loosest. Values outside this range
     * will be adjusted up or down as required.
     * <p>
     * The input Geometry can be a simple type (e.g. LineString, Polygon), a multi-type (e.g.
     * MultiLineString, MultiPolygon) or a GeometryCollection. The returned object will be of the
     * same type.
     *
     * @param geom the input geometry
     * @param fit  tightness of fit from 0 (loose) to 1 (tight)
     * @return a new Geometry object of the same class as {@code geom}
     * @throws IllegalArgumentException if {@code geom} is {@code null}
     */
    public static Geometry smooth(final Geometry geom, double fit) {
        return smooth(geom, fit, new GeometryFactory());
    }

    /**
     * Creates a smoothed copy of the input Geometry. This is only useful for polygonal and lineal
     * geometries. Point objects will be returned unchanged. The smoothing algorithm inserts new
     * vertices which are positioned using Bezier splines. All vertices of the input Geometry will
     * be present in the output Geometry.
     * <p>
     * The {@code fit} parameter controls how tightly the smoothed lines conform to the input line
     * segments, with a value of 1 being tightest and 0 being loosest. Values outside this range
     * will be adjusted up or down as required.
     * <p>
     * The input Geometry can be a simple type (e.g. LineString, Polygon), a multi-type (e.g.
     * MultiLineString, MultiPolygon) or a GeometryCollection. The returned object will be of the
     * same type.
     *
     * @param geom    the input geometry
     * @param fit     tightness of fit from 0 (loose) to 1 (tight)
     * @param factory the GeometryFactory to use for creating smoothed objects
     * @return a new Geometry object of the same class as {@code geom}
     * @throws IllegalArgumentException if either {@code geom} or {@code factory} is {@code null}
     */
    public static Geometry smooth(final Geometry geom, double fit, final GeometryFactory factory) {

        ensureNonNull("geom", geom);
        ensureNonNull("factory", factory);

        // Adjust fit if necessary
        fit = Math.max(0.0, Math.min(1.0, fit));
        return smooth(geom, fit, factory, new GeometrySmoother(factory));
    }

    private static Geometry smooth(final Geometry geom, final double fit,
                                   final GeometryFactory factory, GeometrySmoother smoother) {

        switch (Geometries.get(geom)) {
            case POINT:
            case MULTIPOINT:
                // For points, just return the input geometry
                return geom;

            case LINESTRING:
                // This handles open and closed lines (LinearRings)
                return smoothLineString(factory, smoother, geom, fit);

            case MULTILINESTRING:
                return smoothMultiLineString(factory, smoother, geom, fit);

            case POLYGON:
                return smoother.smooth((Polygon) geom, fit);

            case MULTIPOLYGON:
                return smoothMultiPolygon(factory, smoother, geom, fit);

            case GEOMETRYCOLLECTION:
                return smoothGeometryCollection(factory, smoother, geom, fit);

            default:
                throw new UnsupportedOperationException("No smoothing method available for "
                        + geom.getGeometryType());
        }
    }

    private static Geometry smoothLineString(GeometryFactory factory, GeometrySmoother smoother,
                                             Geometry geom, double fit) {

        if (geom instanceof LinearRing) {
            // Treat as a Polygon
            Polygon poly = factory.createPolygon((LinearRing) geom, null);
            Polygon smoothed = smoother.smooth(poly, fit);
            return smoothed.getExteriorRing();

        } else {
            return smoother.smooth((LineString) geom, fit);
        }
    }

    private static Geometry smoothMultiLineString(GeometryFactory factory,
                                                  GeometrySmoother smoother, Geometry geom, double fit) {

        final int N = geom.getNumGeometries();
        LineString[] smoothed = new LineString[N];

        for (int i = 0; i < N; i++) {
            smoothed[i] = (LineString) smoothLineString(factory, smoother, geom.getGeometryN(i),
                    fit);
        }

        return factory.createMultiLineString(smoothed);
    }

    private static Geometry smoothMultiPolygon(GeometryFactory factory, GeometrySmoother smoother,
                                               Geometry geom, double fit) {

        final int N = geom.getNumGeometries();
        Polygon[] smoothed = new Polygon[N];

        for (int i = 0; i < N; i++) {
            smoothed[i] = smoother.smooth((Polygon) geom.getGeometryN(i), fit);
        }

        return factory.createMultiPolygon(smoothed);
    }

    private static Geometry smoothGeometryCollection(GeometryFactory factory,
                                                     GeometrySmoother smoother, Geometry geom, double fit) {

        final int N = geom.getNumGeometries();
        Geometry[] smoothed = new Geometry[N];

        for (int i = 0; i < N; i++) {
            smoothed[i] = smooth(geom.getGeometryN(i), fit, factory, smoother);
        }

        return factory.createGeometryCollection(smoothed);
    }

    /**
     * Creates a {@link CoordinateSequence} using the provided factory confirming the provided size
     * and dimension are respected.
     * <p>
     * If the requested dimension is larger than the CoordinateSequence implementation can provide,
     * then a sequence of maximum possible dimension should be created. An error should not be
     * thrown.
     * </p>
     * <p>
     * This method is functionally identical to calling csFactory.create(size,dim) - it contains
     * additional logic to work around a limitation on the commonly used
     * CoordinateArraySequenceFactory.</p>
     *
     * @param size      the number of coordinates in the sequence
     * @param dimension the dimension of the coordinates in the sequence
     */
    public static CoordinateSequence createCS(CoordinateSequenceFactory csFactory, int size, int dimension) {
        CoordinateSequence cs;
        if (csFactory instanceof CoordinateArraySequenceFactory && dimension == 1) {
            // work around JTS 1.14 CoordinateArraySequenceFactory regression ignoring provided dimension
            cs = new CoordinateArraySequence(size, dimension);
        } else {
            cs = csFactory.create(size, dimension);
        }
        if (cs.getDimension() != dimension) {
            // illegal state error, try and fix
            throw new IllegalStateException("Unable to use" + csFactory + " to produce CoordinateSequence with dimension " + dimension);
        }
        return cs;
    }


    /**
     * Removes collinear points from the provided linestring.
     *
     * @param ls the {@link LineString} to be simplified.
     * @return a new version of the provided {@link LineString} with collinear points removed.
     */
    static LineString removeCollinearVertices(final LineString ls) {
        if (ls == null) {
            throw new NullPointerException("The provided linestring is null");
        }

        final int N = ls.getNumPoints();
        final boolean isLinearRing = ls instanceof LinearRing;

        List<Coordinate> retain = new ArrayList<Coordinate>();
        retain.add(ls.getCoordinateN(0));

        int i0 = 0, i1 = 1, i2 = 2;
        Coordinate firstCoord = ls.getCoordinateN(i0);
        Coordinate midCoord;
        Coordinate lastCoord;
        while (i2 < N) {
            midCoord = ls.getCoordinateN(i1);
            lastCoord = ls.getCoordinateN(i2);

            final int orientation = CGAlgorithms
                    .computeOrientation(firstCoord, midCoord, lastCoord);
            // Colllinearity test
            if (orientation != CGAlgorithms.COLLINEAR) {
                // add midcoord and change head
                retain.add(midCoord);
                i0 = i1;
                firstCoord = ls.getCoordinateN(i0);
            }
            i1++;
            i2++;
        }
        retain.add(ls.getCoordinateN(N - 1));

        //
        // Return value
        //
        final int size = retain.size();
        // nothing changed?
        if (size == N) {
            // free everything and return original
            retain.clear();

            return ls;
        }

        return isLinearRing ? ls.getFactory()
                .createLinearRing(retain.toArray(new Coordinate[size])) : ls.getFactory()
                .createLineString(retain.toArray(new Coordinate[size]));
    }

    /**
     * Removes collinear vertices from the provided {@link Polygon}.
     *
     * @param polygon the instance of a {@link Polygon} to remove collinear vertices from.
     * @return a new instance of the provided {@link Polygon} without collinear vertices.
     */
    static Polygon removeCollinearVertices(final Polygon polygon) {
        if (polygon == null) {
            throw new NullPointerException("The provided Polygon is null");
        }

        // reuse existing factory
        final GeometryFactory gf = polygon.getFactory();

        // work on the exterior ring
        LineString exterior = polygon.getExteriorRing();
        LineString shell = removeCollinearVertices(exterior);
        if ((shell == null) || shell.isEmpty()) {
            return null;
        }

        // work on the holes
        List<LineString> holes = new ArrayList<LineString>();
        final int size = polygon.getNumInteriorRing();
        for (int i = 0; i < size; i++) {
            LineString hole = polygon.getInteriorRingN(i);
            hole = removeCollinearVertices(hole);
            if ((hole != null) && !hole.isEmpty()) {
                holes.add(hole);
            }
        }

        return gf.createPolygon((LinearRing) shell, holes.toArray(new LinearRing[holes.size()]));
    }

    /**
     * Removes collinear vertices from the provided {@link Geometry}.
     *
     * <p>
     * For the moment this implementation only accepts, {@link Polygon}, {@link LineString} and {@link MultiPolygon} It will throw an exception if the
     * geometry is not one of those types
     *
     * @param g the instance of a {@link Geometry} to remove collinear vertices from.
     * @return a new instance of the provided {@link Geometry} without collinear vertices.
     */
    public static Geometry removeCollinearVertices(final Geometry g) {
        if (g == null) {
            throw new NullPointerException("The provided Geometry is null");
        }
        if (g instanceof LineString) {
            return removeCollinearVertices((LineString) g);
        } else if (g instanceof Polygon) {
            return removeCollinearVertices((Polygon) g);
        } else if (g instanceof MultiPolygon) {
            MultiPolygon mp = (MultiPolygon) g;
            Polygon[] parts = new Polygon[mp.getNumGeometries()];
            for (int i = 0; i < mp.getNumGeometries(); i++) {
                Polygon part = (Polygon) mp.getGeometryN(i);
                part = removeCollinearVertices(part);
                parts[i] = part;
            }

            return g.getFactory().createMultiPolygon(parts);
        }

        throw new IllegalArgumentException(
                "This method can work on LineString, Polygon and Multipolygon: " + g.getClass());
    }

    /**
     * Removes collinear vertices from the provided {@link Geometry} if the number of point exceeds the requested minPoints.
     *
     * <p>
     * For the moment this implementation only accepts, {@link Polygon}, {@link LineString} and {@link MultiPolygon} It will throw an exception if the
     * geometry is not one of those types
     *
     * @param geometry  the instance of a {@link Geometry} to remove collinear vertices from.
     * @param minPoints perform removal of collinear points if num of vertices exceeds minPoints.
     * @return a new instance of the provided {@link Geometry} without collinear vertices.
     */
    public static Geometry removeCollinearVertices(final Geometry geometry, int minPoints) {
        ensureNonNull("geometry", geometry);

        if ((minPoints <= 0) || (geometry.getNumPoints() < minPoints)) {
            return geometry;
        }

        if (geometry instanceof LineString) {
            return removeCollinearVertices((LineString) geometry);
        } else if (geometry instanceof Polygon) {
            return removeCollinearVertices((Polygon) geometry);
        } else if (geometry instanceof MultiPolygon) {
            MultiPolygon mp = (MultiPolygon) geometry;
            Polygon[] parts = new Polygon[mp.getNumGeometries()];
            for (int i = 0; i < mp.getNumGeometries(); i++) {
                Polygon part = (Polygon) mp.getGeometryN(i);
                part = removeCollinearVertices(part);
                parts[i] = part;
            }

            return geometry.getFactory().createMultiPolygon(parts);
        }

        throw new IllegalArgumentException(
                "This method can work on LineString, Polygon and Multipolygon: "
                        + geometry.getClass());
    }

    /**
     * Given a potentially invalid polygon it rebuilds it as a list of valid polygons, eventually removing the holes
     *
     * @param polygon
     * @return
     */
    public static List<Polygon> makeValid(Polygon polygon, boolean removeHoles) {
        // add all segments into the polygonizer
        final Polygonizer p = new Polygonizer();
        polygon.apply(new CoordinateSequenceFilter() {

            public boolean isGeometryChanged() {
                return false;
            }

            public boolean isDone() {
                return false;
            }

            public void filter(CoordinateSequence seq, int i) {
                if (i == 0) {
                    return;
                }
                p.add(new GeometryFactory().createLineString(new Coordinate[]{
                        seq.getCoordinate(i - 1), seq.getCoordinate(i)}));
            }
        });

        List<Polygon> result = new ArrayList<Polygon>(p.getPolygons());

        // if necessary throw away the holes and return just the shells
        if (removeHoles) {
            for (int i = 0; i < result.size(); i++) {
                Polygon item = result.get(i);
                if (item.getNumInteriorRing() > 0) {
                    GeometryFactory factory = item.getFactory();
                    Polygon noHoles = factory.createPolygon((LinearRing) item.getExteriorRing(),
                            null);
                    result.set(i, noHoles);
                }
            }
        }

        return result;
    }

    /**
     * Converts a JTS Envelope into an equivalent {@link Rectangle2D}
     *
     * @param envelope The source envelope
     */
    public static Rectangle2D toRectangle2D(Envelope envelope) {
        if (envelope == null) {
            return null;
        }
        return new Rectangle2D.Double(envelope.getMinX(), envelope.getMinY(), envelope.getWidth(), envelope.getHeight());
    }

    /**
     * Converts a AWT {@link Rectangle2D} into a JTS Envelope
     *
     * @param rectangle The source rectangle
     */
    public static Envelope toEnvelope(Rectangle2D rectangle) {
        if (rectangle == null) {
            return null;
        }
        return new Envelope(rectangle.getMinX(), rectangle.getMaxX(), rectangle.getMinY(), rectangle.getMaxY());
    }

    /**
     * Converts a AWT polygon into a JTS one (unlike {@link toGeometry} which always returns
     * lines instead)
     *
     * @return
     */
    public static Polygon toPolygon(java.awt.Polygon polygon) {
        return toPolygonInternal(polygon);
    }

    /**
     * Converts a AWT rectangle into a JTS one (unlike {@link toGeometry} which always returns
     * lines instead)
     *
     * @return
     */
    public static Polygon toPolygon(java.awt.Rectangle rectangle) {
        return toPolygonInternal(rectangle);
    }

    /**
     * Converts a AWT rectangle into a JTS one (unlike {@link toGeometry} which always returns
     * lines instead)
     *
     * @return
     */
    public static Polygon toPolygon(Rectangle2D rectangle) {
        return toPolygonInternal(rectangle);
    }

    private static Polygon toPolygonInternal(Shape shape) {
        Geometry geomROI = null;
        if (shape != null) {
            geomROI = ShapeReader.read(shape, 0, new GeometryFactory());
            geomROI.apply(Y_INVERSION);
        }
        return (Polygon) geomROI;
    }
}
