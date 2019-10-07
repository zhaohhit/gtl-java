// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cn/edu/cug/cs/gtl/protos/feature.proto

package cn.edu.cug.cs.gtl.protos;

public interface FeatureTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cn.edu.cug.cs.gtl.protos.FeatureType)
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
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.cn.edu.cug.cs.gtl.protos.GeometryType geometry_type = 3;</code>
   * @return The enum numeric value on the wire for geometryType.
   */
  int getGeometryTypeValue();
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.GeometryType geometry_type = 3;</code>
   * @return The geometryType.
   */
  cn.edu.cug.cs.gtl.protos.GeometryType getGeometryType();

  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.ColumnInfo column_info = 4;</code>
   */
  java.util.List<cn.edu.cug.cs.gtl.protos.ColumnInfo> 
      getColumnInfoList();
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.ColumnInfo column_info = 4;</code>
   */
  cn.edu.cug.cs.gtl.protos.ColumnInfo getColumnInfo(int index);
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.ColumnInfo column_info = 4;</code>
   */
  int getColumnInfoCount();
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.ColumnInfo column_info = 4;</code>
   */
  java.util.List<? extends cn.edu.cug.cs.gtl.protos.ColumnInfoOrBuilder> 
      getColumnInfoOrBuilderList();
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.ColumnInfo column_info = 4;</code>
   */
  cn.edu.cug.cs.gtl.protos.ColumnInfoOrBuilder getColumnInfoOrBuilder(
      int index);
}
