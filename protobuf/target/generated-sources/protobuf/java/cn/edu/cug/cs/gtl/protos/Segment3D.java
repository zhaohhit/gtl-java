// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cn/edu/cug/cs/gtl/protos/geometry.proto

package cn.edu.cug.cs.gtl.protos;

/**
 * Protobuf type {@code cn.edu.cug.cs.gtl.protos.Segment3D}
 */
public  final class Segment3D extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cn.edu.cug.cs.gtl.protos.Segment3D)
    Segment3DOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Segment3D.newBuilder() to construct.
  private Segment3D(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Segment3D() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Segment3D();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Segment3D(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            cn.edu.cug.cs.gtl.protos.Vertex3d.Builder subBuilder = null;
            if (start_ != null) {
              subBuilder = start_.toBuilder();
            }
            start_ = input.readMessage(cn.edu.cug.cs.gtl.protos.Vertex3d.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(start_);
              start_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            cn.edu.cug.cs.gtl.protos.Vertex3d.Builder subBuilder = null;
            if (end_ != null) {
              subBuilder = end_.toBuilder();
            }
            end_ = input.readMessage(cn.edu.cug.cs.gtl.protos.Vertex3d.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(end_);
              end_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn.edu.cug.cs.gtl.protos.Geometries.internal_static_cn_edu_cug_cs_gtl_protos_Segment3D_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.edu.cug.cs.gtl.protos.Geometries.internal_static_cn_edu_cug_cs_gtl_protos_Segment3D_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.edu.cug.cs.gtl.protos.Segment3D.class, cn.edu.cug.cs.gtl.protos.Segment3D.Builder.class);
  }

  public static final int START_FIELD_NUMBER = 1;
  private cn.edu.cug.cs.gtl.protos.Vertex3d start_;
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d start = 1;</code>
   * @return Whether the start field is set.
   */
  public boolean hasStart() {
    return start_ != null;
  }
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d start = 1;</code>
   * @return The start.
   */
  public cn.edu.cug.cs.gtl.protos.Vertex3d getStart() {
    return start_ == null ? cn.edu.cug.cs.gtl.protos.Vertex3d.getDefaultInstance() : start_;
  }
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d start = 1;</code>
   */
  public cn.edu.cug.cs.gtl.protos.Vertex3dOrBuilder getStartOrBuilder() {
    return getStart();
  }

  public static final int END_FIELD_NUMBER = 2;
  private cn.edu.cug.cs.gtl.protos.Vertex3d end_;
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d end = 2;</code>
   * @return Whether the end field is set.
   */
  public boolean hasEnd() {
    return end_ != null;
  }
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d end = 2;</code>
   * @return The end.
   */
  public cn.edu.cug.cs.gtl.protos.Vertex3d getEnd() {
    return end_ == null ? cn.edu.cug.cs.gtl.protos.Vertex3d.getDefaultInstance() : end_;
  }
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d end = 2;</code>
   */
  public cn.edu.cug.cs.gtl.protos.Vertex3dOrBuilder getEndOrBuilder() {
    return getEnd();
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
    if (start_ != null) {
      output.writeMessage(1, getStart());
    }
    if (end_ != null) {
      output.writeMessage(2, getEnd());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (start_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStart());
    }
    if (end_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEnd());
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
    if (!(obj instanceof cn.edu.cug.cs.gtl.protos.Segment3D)) {
      return super.equals(obj);
    }
    cn.edu.cug.cs.gtl.protos.Segment3D other = (cn.edu.cug.cs.gtl.protos.Segment3D) obj;

    if (hasStart() != other.hasStart()) return false;
    if (hasStart()) {
      if (!getStart()
          .equals(other.getStart())) return false;
    }
    if (hasEnd() != other.hasEnd()) return false;
    if (hasEnd()) {
      if (!getEnd()
          .equals(other.getEnd())) return false;
    }
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
    if (hasStart()) {
      hash = (37 * hash) + START_FIELD_NUMBER;
      hash = (53 * hash) + getStart().hashCode();
    }
    if (hasEnd()) {
      hash = (37 * hash) + END_FIELD_NUMBER;
      hash = (53 * hash) + getEnd().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.edu.cug.cs.gtl.protos.Segment3D parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.Segment3D parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Segment3D parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.Segment3D parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Segment3D parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.Segment3D parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Segment3D parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.Segment3D parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Segment3D parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.Segment3D parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Segment3D parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.Segment3D parseFrom(
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
  public static Builder newBuilder(cn.edu.cug.cs.gtl.protos.Segment3D prototype) {
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
   * Protobuf type {@code cn.edu.cug.cs.gtl.protos.Segment3D}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cn.edu.cug.cs.gtl.protos.Segment3D)
      cn.edu.cug.cs.gtl.protos.Segment3DOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.edu.cug.cs.gtl.protos.Geometries.internal_static_cn_edu_cug_cs_gtl_protos_Segment3D_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.edu.cug.cs.gtl.protos.Geometries.internal_static_cn_edu_cug_cs_gtl_protos_Segment3D_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.edu.cug.cs.gtl.protos.Segment3D.class, cn.edu.cug.cs.gtl.protos.Segment3D.Builder.class);
    }

    // Construct using cn.edu.cug.cs.gtl.protos.Segment3D.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (startBuilder_ == null) {
        start_ = null;
      } else {
        start_ = null;
        startBuilder_ = null;
      }
      if (endBuilder_ == null) {
        end_ = null;
      } else {
        end_ = null;
        endBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.edu.cug.cs.gtl.protos.Geometries.internal_static_cn_edu_cug_cs_gtl_protos_Segment3D_descriptor;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.Segment3D getDefaultInstanceForType() {
      return cn.edu.cug.cs.gtl.protos.Segment3D.getDefaultInstance();
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.Segment3D build() {
      cn.edu.cug.cs.gtl.protos.Segment3D result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.Segment3D buildPartial() {
      cn.edu.cug.cs.gtl.protos.Segment3D result = new cn.edu.cug.cs.gtl.protos.Segment3D(this);
      if (startBuilder_ == null) {
        result.start_ = start_;
      } else {
        result.start_ = startBuilder_.build();
      }
      if (endBuilder_ == null) {
        result.end_ = end_;
      } else {
        result.end_ = endBuilder_.build();
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
      if (other instanceof cn.edu.cug.cs.gtl.protos.Segment3D) {
        return mergeFrom((cn.edu.cug.cs.gtl.protos.Segment3D)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.edu.cug.cs.gtl.protos.Segment3D other) {
      if (other == cn.edu.cug.cs.gtl.protos.Segment3D.getDefaultInstance()) return this;
      if (other.hasStart()) {
        mergeStart(other.getStart());
      }
      if (other.hasEnd()) {
        mergeEnd(other.getEnd());
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
      cn.edu.cug.cs.gtl.protos.Segment3D parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.edu.cug.cs.gtl.protos.Segment3D) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private cn.edu.cug.cs.gtl.protos.Vertex3d start_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.edu.cug.cs.gtl.protos.Vertex3d, cn.edu.cug.cs.gtl.protos.Vertex3d.Builder, cn.edu.cug.cs.gtl.protos.Vertex3dOrBuilder> startBuilder_;
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d start = 1;</code>
     * @return Whether the start field is set.
     */
    public boolean hasStart() {
      return startBuilder_ != null || start_ != null;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d start = 1;</code>
     * @return The start.
     */
    public cn.edu.cug.cs.gtl.protos.Vertex3d getStart() {
      if (startBuilder_ == null) {
        return start_ == null ? cn.edu.cug.cs.gtl.protos.Vertex3d.getDefaultInstance() : start_;
      } else {
        return startBuilder_.getMessage();
      }
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d start = 1;</code>
     */
    public Builder setStart(cn.edu.cug.cs.gtl.protos.Vertex3d value) {
      if (startBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        start_ = value;
        onChanged();
      } else {
        startBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d start = 1;</code>
     */
    public Builder setStart(
        cn.edu.cug.cs.gtl.protos.Vertex3d.Builder builderForValue) {
      if (startBuilder_ == null) {
        start_ = builderForValue.build();
        onChanged();
      } else {
        startBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d start = 1;</code>
     */
    public Builder mergeStart(cn.edu.cug.cs.gtl.protos.Vertex3d value) {
      if (startBuilder_ == null) {
        if (start_ != null) {
          start_ =
            cn.edu.cug.cs.gtl.protos.Vertex3d.newBuilder(start_).mergeFrom(value).buildPartial();
        } else {
          start_ = value;
        }
        onChanged();
      } else {
        startBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d start = 1;</code>
     */
    public Builder clearStart() {
      if (startBuilder_ == null) {
        start_ = null;
        onChanged();
      } else {
        start_ = null;
        startBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d start = 1;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Vertex3d.Builder getStartBuilder() {
      
      onChanged();
      return getStartFieldBuilder().getBuilder();
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d start = 1;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Vertex3dOrBuilder getStartOrBuilder() {
      if (startBuilder_ != null) {
        return startBuilder_.getMessageOrBuilder();
      } else {
        return start_ == null ?
            cn.edu.cug.cs.gtl.protos.Vertex3d.getDefaultInstance() : start_;
      }
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d start = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.edu.cug.cs.gtl.protos.Vertex3d, cn.edu.cug.cs.gtl.protos.Vertex3d.Builder, cn.edu.cug.cs.gtl.protos.Vertex3dOrBuilder> 
        getStartFieldBuilder() {
      if (startBuilder_ == null) {
        startBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cn.edu.cug.cs.gtl.protos.Vertex3d, cn.edu.cug.cs.gtl.protos.Vertex3d.Builder, cn.edu.cug.cs.gtl.protos.Vertex3dOrBuilder>(
                getStart(),
                getParentForChildren(),
                isClean());
        start_ = null;
      }
      return startBuilder_;
    }

    private cn.edu.cug.cs.gtl.protos.Vertex3d end_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.edu.cug.cs.gtl.protos.Vertex3d, cn.edu.cug.cs.gtl.protos.Vertex3d.Builder, cn.edu.cug.cs.gtl.protos.Vertex3dOrBuilder> endBuilder_;
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d end = 2;</code>
     * @return Whether the end field is set.
     */
    public boolean hasEnd() {
      return endBuilder_ != null || end_ != null;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d end = 2;</code>
     * @return The end.
     */
    public cn.edu.cug.cs.gtl.protos.Vertex3d getEnd() {
      if (endBuilder_ == null) {
        return end_ == null ? cn.edu.cug.cs.gtl.protos.Vertex3d.getDefaultInstance() : end_;
      } else {
        return endBuilder_.getMessage();
      }
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d end = 2;</code>
     */
    public Builder setEnd(cn.edu.cug.cs.gtl.protos.Vertex3d value) {
      if (endBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        end_ = value;
        onChanged();
      } else {
        endBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d end = 2;</code>
     */
    public Builder setEnd(
        cn.edu.cug.cs.gtl.protos.Vertex3d.Builder builderForValue) {
      if (endBuilder_ == null) {
        end_ = builderForValue.build();
        onChanged();
      } else {
        endBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d end = 2;</code>
     */
    public Builder mergeEnd(cn.edu.cug.cs.gtl.protos.Vertex3d value) {
      if (endBuilder_ == null) {
        if (end_ != null) {
          end_ =
            cn.edu.cug.cs.gtl.protos.Vertex3d.newBuilder(end_).mergeFrom(value).buildPartial();
        } else {
          end_ = value;
        }
        onChanged();
      } else {
        endBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d end = 2;</code>
     */
    public Builder clearEnd() {
      if (endBuilder_ == null) {
        end_ = null;
        onChanged();
      } else {
        end_ = null;
        endBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d end = 2;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Vertex3d.Builder getEndBuilder() {
      
      onChanged();
      return getEndFieldBuilder().getBuilder();
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d end = 2;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Vertex3dOrBuilder getEndOrBuilder() {
      if (endBuilder_ != null) {
        return endBuilder_.getMessageOrBuilder();
      } else {
        return end_ == null ?
            cn.edu.cug.cs.gtl.protos.Vertex3d.getDefaultInstance() : end_;
      }
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Vertex3d end = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.edu.cug.cs.gtl.protos.Vertex3d, cn.edu.cug.cs.gtl.protos.Vertex3d.Builder, cn.edu.cug.cs.gtl.protos.Vertex3dOrBuilder> 
        getEndFieldBuilder() {
      if (endBuilder_ == null) {
        endBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cn.edu.cug.cs.gtl.protos.Vertex3d, cn.edu.cug.cs.gtl.protos.Vertex3d.Builder, cn.edu.cug.cs.gtl.protos.Vertex3dOrBuilder>(
                getEnd(),
                getParentForChildren(),
                isClean());
        end_ = null;
      }
      return endBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cn.edu.cug.cs.gtl.protos.Segment3D)
  }

  // @@protoc_insertion_point(class_scope:cn.edu.cug.cs.gtl.protos.Segment3D)
  private static final cn.edu.cug.cs.gtl.protos.Segment3D DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.edu.cug.cs.gtl.protos.Segment3D();
  }

  public static cn.edu.cug.cs.gtl.protos.Segment3D getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Segment3D>
      PARSER = new com.google.protobuf.AbstractParser<Segment3D>() {
    @java.lang.Override
    public Segment3D parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Segment3D(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Segment3D> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Segment3D> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cn.edu.cug.cs.gtl.protos.Segment3D getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

