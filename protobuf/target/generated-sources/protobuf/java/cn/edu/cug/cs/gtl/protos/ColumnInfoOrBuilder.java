// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cn/edu/cug/cs/gtl/protos/value.proto

package cn.edu.cug.cs.gtl.protos;

public interface ColumnInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cn.edu.cug.cs.gtl.protos.ColumnInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Value.Type type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Value.Type type = 1;</code>
   * @return The type.
   */
  cn.edu.cug.cs.gtl.protos.Value.Type getType();

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
   * <code>string code = 3;</code>
   * @return The code.
   */
  java.lang.String getCode();
  /**
   * <code>string code = 3;</code>
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <code>string title = 4;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 4;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();
}
