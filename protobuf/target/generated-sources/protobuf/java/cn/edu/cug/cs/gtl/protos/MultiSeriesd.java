// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cn/edu/cug/cs/gtl/protos/series.proto

package cn.edu.cug.cs.gtl.protos;

/**
 * Protobuf type {@code cn.edu.cug.cs.gtl.protos.MultiSeriesd}
 */
public  final class MultiSeriesd extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cn.edu.cug.cs.gtl.protos.MultiSeriesd)
    MultiSeriesdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiSeriesd.newBuilder() to construct.
  private MultiSeriesd(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiSeriesd() {
    time_ = emptyDoubleList();
    series_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiSeriesd();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiSeriesd(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 9: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              time_ = newDoubleList();
              mutable_bitField0_ |= 0x00000001;
            }
            time_.addDouble(input.readDouble());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              time_ = newDoubleList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              time_.addDouble(input.readDouble());
            }
            input.popLimit(limit);
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              series_ = new java.util.ArrayList<cn.edu.cug.cs.gtl.protos.Seriesd>();
              mutable_bitField0_ |= 0x00000002;
            }
            series_.add(
                input.readMessage(cn.edu.cug.cs.gtl.protos.Seriesd.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        time_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        series_ = java.util.Collections.unmodifiableList(series_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn.edu.cug.cs.gtl.protos.Series.internal_static_cn_edu_cug_cs_gtl_protos_MultiSeriesd_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.edu.cug.cs.gtl.protos.Series.internal_static_cn_edu_cug_cs_gtl_protos_MultiSeriesd_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.edu.cug.cs.gtl.protos.MultiSeriesd.class, cn.edu.cug.cs.gtl.protos.MultiSeriesd.Builder.class);
  }

  public static final int TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.DoubleList time_;
  /**
   * <code>repeated double time = 1;</code>
   * @return A list containing the time.
   */
  public java.util.List<java.lang.Double>
      getTimeList() {
    return time_;
  }
  /**
   * <code>repeated double time = 1;</code>
   * @return The count of time.
   */
  public int getTimeCount() {
    return time_.size();
  }
  /**
   * <code>repeated double time = 1;</code>
   * @param index The index of the element to return.
   * @return The time at the given index.
   */
  public double getTime(int index) {
    return time_.getDouble(index);
  }
  private int timeMemoizedSerializedSize = -1;

  public static final int SERIES_FIELD_NUMBER = 2;
  private java.util.List<cn.edu.cug.cs.gtl.protos.Seriesd> series_;
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
   */
  public java.util.List<cn.edu.cug.cs.gtl.protos.Seriesd> getSeriesList() {
    return series_;
  }
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
   */
  public java.util.List<? extends cn.edu.cug.cs.gtl.protos.SeriesdOrBuilder> 
      getSeriesOrBuilderList() {
    return series_;
  }
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
   */
  public int getSeriesCount() {
    return series_.size();
  }
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
   */
  public cn.edu.cug.cs.gtl.protos.Seriesd getSeries(int index) {
    return series_.get(index);
  }
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
   */
  public cn.edu.cug.cs.gtl.protos.SeriesdOrBuilder getSeriesOrBuilder(
      int index) {
    return series_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (getTimeList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(timeMemoizedSerializedSize);
    }
    for (int i = 0; i < time_.size(); i++) {
      output.writeDoubleNoTag(time_.getDouble(i));
    }
    for (int i = 0; i < series_.size(); i++) {
      output.writeMessage(2, series_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      dataSize = 8 * getTimeList().size();
      size += dataSize;
      if (!getTimeList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      timeMemoizedSerializedSize = dataSize;
    }
    for (int i = 0; i < series_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, series_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cn.edu.cug.cs.gtl.protos.MultiSeriesd)) {
      return super.equals(obj);
    }
    cn.edu.cug.cs.gtl.protos.MultiSeriesd other = (cn.edu.cug.cs.gtl.protos.MultiSeriesd) obj;

    if (!getTimeList()
        .equals(other.getTimeList())) return false;
    if (!getSeriesList()
        .equals(other.getSeriesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getTimeCount() > 0) {
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTimeList().hashCode();
    }
    if (getSeriesCount() > 0) {
      hash = (37 * hash) + SERIES_FIELD_NUMBER;
      hash = (53 * hash) + getSeriesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.edu.cug.cs.gtl.protos.MultiSeriesd parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.MultiSeriesd parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.MultiSeriesd parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.MultiSeriesd parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.MultiSeriesd parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.MultiSeriesd parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.MultiSeriesd parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.MultiSeriesd parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.MultiSeriesd parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.MultiSeriesd parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.MultiSeriesd parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.MultiSeriesd parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cn.edu.cug.cs.gtl.protos.MultiSeriesd prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code cn.edu.cug.cs.gtl.protos.MultiSeriesd}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cn.edu.cug.cs.gtl.protos.MultiSeriesd)
      cn.edu.cug.cs.gtl.protos.MultiSeriesdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.edu.cug.cs.gtl.protos.Series.internal_static_cn_edu_cug_cs_gtl_protos_MultiSeriesd_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.edu.cug.cs.gtl.protos.Series.internal_static_cn_edu_cug_cs_gtl_protos_MultiSeriesd_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.edu.cug.cs.gtl.protos.MultiSeriesd.class, cn.edu.cug.cs.gtl.protos.MultiSeriesd.Builder.class);
    }

    // Construct using cn.edu.cug.cs.gtl.protos.MultiSeriesd.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getSeriesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      time_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000001);
      if (seriesBuilder_ == null) {
        series_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        seriesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.edu.cug.cs.gtl.protos.Series.internal_static_cn_edu_cug_cs_gtl_protos_MultiSeriesd_descriptor;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.MultiSeriesd getDefaultInstanceForType() {
      return cn.edu.cug.cs.gtl.protos.MultiSeriesd.getDefaultInstance();
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.MultiSeriesd build() {
      cn.edu.cug.cs.gtl.protos.MultiSeriesd result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.MultiSeriesd buildPartial() {
      cn.edu.cug.cs.gtl.protos.MultiSeriesd result = new cn.edu.cug.cs.gtl.protos.MultiSeriesd(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        time_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.time_ = time_;
      if (seriesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          series_ = java.util.Collections.unmodifiableList(series_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.series_ = series_;
      } else {
        result.series_ = seriesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cn.edu.cug.cs.gtl.protos.MultiSeriesd) {
        return mergeFrom((cn.edu.cug.cs.gtl.protos.MultiSeriesd)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.edu.cug.cs.gtl.protos.MultiSeriesd other) {
      if (other == cn.edu.cug.cs.gtl.protos.MultiSeriesd.getDefaultInstance()) return this;
      if (!other.time_.isEmpty()) {
        if (time_.isEmpty()) {
          time_ = other.time_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTimeIsMutable();
          time_.addAll(other.time_);
        }
        onChanged();
      }
      if (seriesBuilder_ == null) {
        if (!other.series_.isEmpty()) {
          if (series_.isEmpty()) {
            series_ = other.series_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSeriesIsMutable();
            series_.addAll(other.series_);
          }
          onChanged();
        }
      } else {
        if (!other.series_.isEmpty()) {
          if (seriesBuilder_.isEmpty()) {
            seriesBuilder_.dispose();
            seriesBuilder_ = null;
            series_ = other.series_;
            bitField0_ = (bitField0_ & ~0x00000002);
            seriesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSeriesFieldBuilder() : null;
          } else {
            seriesBuilder_.addAllMessages(other.series_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      cn.edu.cug.cs.gtl.protos.MultiSeriesd parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.edu.cug.cs.gtl.protos.MultiSeriesd) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.DoubleList time_ = emptyDoubleList();
    private void ensureTimeIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        time_ = mutableCopy(time_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated double time = 1;</code>
     * @return A list containing the time.
     */
    public java.util.List<java.lang.Double>
        getTimeList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(time_) : time_;
    }
    /**
     * <code>repeated double time = 1;</code>
     * @return The count of time.
     */
    public int getTimeCount() {
      return time_.size();
    }
    /**
     * <code>repeated double time = 1;</code>
     * @param index The index of the element to return.
     * @return The time at the given index.
     */
    public double getTime(int index) {
      return time_.getDouble(index);
    }
    /**
     * <code>repeated double time = 1;</code>
     * @param index The index to set the value at.
     * @param value The time to set.
     * @return This builder for chaining.
     */
    public Builder setTime(
        int index, double value) {
      ensureTimeIsMutable();
      time_.setDouble(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double time = 1;</code>
     * @param value The time to add.
     * @return This builder for chaining.
     */
    public Builder addTime(double value) {
      ensureTimeIsMutable();
      time_.addDouble(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double time = 1;</code>
     * @param values The time to add.
     * @return This builder for chaining.
     */
    public Builder addAllTime(
        java.lang.Iterable<? extends java.lang.Double> values) {
      ensureTimeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, time_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double time = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTime() {
      time_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.util.List<cn.edu.cug.cs.gtl.protos.Seriesd> series_ =
      java.util.Collections.emptyList();
    private void ensureSeriesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        series_ = new java.util.ArrayList<cn.edu.cug.cs.gtl.protos.Seriesd>(series_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cn.edu.cug.cs.gtl.protos.Seriesd, cn.edu.cug.cs.gtl.protos.Seriesd.Builder, cn.edu.cug.cs.gtl.protos.SeriesdOrBuilder> seriesBuilder_;

    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
     */
    public java.util.List<cn.edu.cug.cs.gtl.protos.Seriesd> getSeriesList() {
      if (seriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(series_);
      } else {
        return seriesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
     */
    public int getSeriesCount() {
      if (seriesBuilder_ == null) {
        return series_.size();
      } else {
        return seriesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Seriesd getSeries(int index) {
      if (seriesBuilder_ == null) {
        return series_.get(index);
      } else {
        return seriesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
     */
    public Builder setSeries(
        int index, cn.edu.cug.cs.gtl.protos.Seriesd value) {
      if (seriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSeriesIsMutable();
        series_.set(index, value);
        onChanged();
      } else {
        seriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
     */
    public Builder setSeries(
        int index, cn.edu.cug.cs.gtl.protos.Seriesd.Builder builderForValue) {
      if (seriesBuilder_ == null) {
        ensureSeriesIsMutable();
        series_.set(index, builderForValue.build());
        onChanged();
      } else {
        seriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
     */
    public Builder addSeries(cn.edu.cug.cs.gtl.protos.Seriesd value) {
      if (seriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSeriesIsMutable();
        series_.add(value);
        onChanged();
      } else {
        seriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
     */
    public Builder addSeries(
        int index, cn.edu.cug.cs.gtl.protos.Seriesd value) {
      if (seriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSeriesIsMutable();
        series_.add(index, value);
        onChanged();
      } else {
        seriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
     */
    public Builder addSeries(
        cn.edu.cug.cs.gtl.protos.Seriesd.Builder builderForValue) {
      if (seriesBuilder_ == null) {
        ensureSeriesIsMutable();
        series_.add(builderForValue.build());
        onChanged();
      } else {
        seriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
     */
    public Builder addSeries(
        int index, cn.edu.cug.cs.gtl.protos.Seriesd.Builder builderForValue) {
      if (seriesBuilder_ == null) {
        ensureSeriesIsMutable();
        series_.add(index, builderForValue.build());
        onChanged();
      } else {
        seriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
     */
    public Builder addAllSeries(
        java.lang.Iterable<? extends cn.edu.cug.cs.gtl.protos.Seriesd> values) {
      if (seriesBuilder_ == null) {
        ensureSeriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, series_);
        onChanged();
      } else {
        seriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
     */
    public Builder clearSeries() {
      if (seriesBuilder_ == null) {
        series_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        seriesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
     */
    public Builder removeSeries(int index) {
      if (seriesBuilder_ == null) {
        ensureSeriesIsMutable();
        series_.remove(index);
        onChanged();
      } else {
        seriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Seriesd.Builder getSeriesBuilder(
        int index) {
      return getSeriesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
     */
    public cn.edu.cug.cs.gtl.protos.SeriesdOrBuilder getSeriesOrBuilder(
        int index) {
      if (seriesBuilder_ == null) {
        return series_.get(index);  } else {
        return seriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
     */
    public java.util.List<? extends cn.edu.cug.cs.gtl.protos.SeriesdOrBuilder> 
         getSeriesOrBuilderList() {
      if (seriesBuilder_ != null) {
        return seriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(series_);
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Seriesd.Builder addSeriesBuilder() {
      return getSeriesFieldBuilder().addBuilder(
          cn.edu.cug.cs.gtl.protos.Seriesd.getDefaultInstance());
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Seriesd.Builder addSeriesBuilder(
        int index) {
      return getSeriesFieldBuilder().addBuilder(
          index, cn.edu.cug.cs.gtl.protos.Seriesd.getDefaultInstance());
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Seriesd series = 2;</code>
     */
    public java.util.List<cn.edu.cug.cs.gtl.protos.Seriesd.Builder> 
         getSeriesBuilderList() {
      return getSeriesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cn.edu.cug.cs.gtl.protos.Seriesd, cn.edu.cug.cs.gtl.protos.Seriesd.Builder, cn.edu.cug.cs.gtl.protos.SeriesdOrBuilder> 
        getSeriesFieldBuilder() {
      if (seriesBuilder_ == null) {
        seriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cn.edu.cug.cs.gtl.protos.Seriesd, cn.edu.cug.cs.gtl.protos.Seriesd.Builder, cn.edu.cug.cs.gtl.protos.SeriesdOrBuilder>(
                series_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        series_ = null;
      }
      return seriesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:cn.edu.cug.cs.gtl.protos.MultiSeriesd)
  }

  // @@protoc_insertion_point(class_scope:cn.edu.cug.cs.gtl.protos.MultiSeriesd)
  private static final cn.edu.cug.cs.gtl.protos.MultiSeriesd DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.edu.cug.cs.gtl.protos.MultiSeriesd();
  }

  public static cn.edu.cug.cs.gtl.protos.MultiSeriesd getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiSeriesd>
      PARSER = new com.google.protobuf.AbstractParser<MultiSeriesd>() {
    @java.lang.Override
    public MultiSeriesd parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiSeriesd(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiSeriesd> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiSeriesd> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cn.edu.cug.cs.gtl.protos.MultiSeriesd getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

