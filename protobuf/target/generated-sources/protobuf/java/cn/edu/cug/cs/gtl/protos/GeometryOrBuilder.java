// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cn/edu/cug/cs/gtl/protos/geometry.proto

package cn.edu.cug.cs.gtl.protos;

public interface GeometryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cn.edu.cug.cs.gtl.protos.Geometry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Identifier identifier = 1;</code>
   * @return Whether the identifier field is set.
   */
  boolean hasIdentifier();
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Identifier identifier = 1;</code>
   * @return The identifier.
   */
  cn.edu.cug.cs.gtl.protos.Identifier getIdentifier();
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Identifier identifier = 1;</code>
   */
  cn.edu.cug.cs.gtl.protos.IdentifierOrBuilder getIdentifierOrBuilder();

  /**
   * <code>.cn.edu.cug.cs.gtl.protos.GeometryType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.GeometryType type = 2;</code>
   * @return The type.
   */
  cn.edu.cug.cs.gtl.protos.GeometryType getType();

  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Color4f color = 3;</code>
   * @return Whether the color field is set.
   */
  boolean hasColor();
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Color4f color = 3;</code>
   * @return The color.
   */
  cn.edu.cug.cs.gtl.protos.Color4f getColor();
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Color4f color = 3;</code>
   */
  cn.edu.cug.cs.gtl.protos.Color4fOrBuilder getColorOrBuilder();

  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Color4f fill_color = 4;</code>
   * @return Whether the fillColor field is set.
   */
  boolean hasFillColor();
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Color4f fill_color = 4;</code>
   * @return The fillColor.
   */
  cn.edu.cug.cs.gtl.protos.Color4f getFillColor();
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Color4f fill_color = 4;</code>
   */
  cn.edu.cug.cs.gtl.protos.Color4fOrBuilder getFillColorOrBuilder();

  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Envelope3D bound = 5;</code>
   * @return Whether the bound field is set.
   */
  boolean hasBound();
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Envelope3D bound = 5;</code>
   * @return The bound.
   */
  cn.edu.cug.cs.gtl.protos.Envelope3D getBound();
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Envelope3D bound = 5;</code>
   */
  cn.edu.cug.cs.gtl.protos.Envelope3DOrBuilder getBoundOrBuilder();

  /**
   * <code>.google.protobuf.Any shape = 6;</code>
   * @return Whether the shape field is set.
   */
  boolean hasShape();
  /**
   * <code>.google.protobuf.Any shape = 6;</code>
   * @return The shape.
   */
  com.google.protobuf.Any getShape();
  /**
   * <code>.google.protobuf.Any shape = 6;</code>
   */
  com.google.protobuf.AnyOrBuilder getShapeOrBuilder();
}
