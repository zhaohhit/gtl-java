// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cn/edu/cug/cs/gtl/protos/geometry.proto

package cn.edu.cug.cs.gtl.protos;

public interface CubicMesh3DOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cn.edu.cug.cs.gtl.protos.CubicMesh3D)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
   */
  java.util.List<cn.edu.cug.cs.gtl.protos.Vertex3d> 
      getVerticesList();
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
   */
  cn.edu.cug.cs.gtl.protos.Vertex3d getVertices(int index);
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
   */
  int getVerticesCount();
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
   */
  java.util.List<? extends cn.edu.cug.cs.gtl.protos.Vertex3dOrBuilder> 
      getVerticesOrBuilderList();
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
   */
  cn.edu.cug.cs.gtl.protos.Vertex3dOrBuilder getVerticesOrBuilder(
      int index);

  /**
   * <code>repeated uint32 indices = 2;</code>
   * @return A list containing the indices.
   */
  java.util.List<java.lang.Integer> getIndicesList();
  /**
   * <code>repeated uint32 indices = 2;</code>
   * @return The count of indices.
   */
  int getIndicesCount();
  /**
   * <code>repeated uint32 indices = 2;</code>
   * @param index The index of the element to return.
   * @return The indices at the given index.
   */
  int getIndices(int index);
}
