// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cn/edu/cug/cs/gtl/protos/series.proto

package cn.edu.cug.cs.gtl.protos;

public interface TimeSeriesiOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cn.edu.cug.cs.gtl.protos.TimeSeriesi)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int32 time = 1;</code>
   * @return A list containing the time.
   */
  java.util.List<java.lang.Integer> getTimeList();
  /**
   * <code>repeated int32 time = 1;</code>
   * @return The count of time.
   */
  int getTimeCount();
  /**
   * <code>repeated int32 time = 1;</code>
   * @param index The index of the element to return.
   * @return The time at the given index.
   */
  int getTime(int index);

  /**
   * <code>repeated int32 data = 2;</code>
   * @return A list containing the data.
   */
  java.util.List<java.lang.Integer> getDataList();
  /**
   * <code>repeated int32 data = 2;</code>
   * @return The count of data.
   */
  int getDataCount();
  /**
   * <code>repeated int32 data = 2;</code>
   * @param index The index of the element to return.
   * @return The data at the given index.
   */
  int getData(int index);
}
