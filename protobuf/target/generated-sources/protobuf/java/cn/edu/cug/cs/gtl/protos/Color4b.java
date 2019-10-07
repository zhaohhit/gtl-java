// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cn/edu/cug/cs/gtl/protos/color.proto

package cn.edu.cug.cs.gtl.protos;

/**
 * Protobuf type {@code cn.edu.cug.cs.gtl.protos.Color4b}
 */
public  final class Color4b extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cn.edu.cug.cs.gtl.protos.Color4b)
    Color4bOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Color4b.newBuilder() to construct.
  private Color4b(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Color4b() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Color4b();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Color4b(
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
          case 8: {

            rgba_ = input.readInt32();
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
    return cn.edu.cug.cs.gtl.protos.Colors.internal_static_cn_edu_cug_cs_gtl_protos_Color4b_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.edu.cug.cs.gtl.protos.Colors.internal_static_cn_edu_cug_cs_gtl_protos_Color4b_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.edu.cug.cs.gtl.protos.Color4b.class, cn.edu.cug.cs.gtl.protos.Color4b.Builder.class);
  }

  public static final int RGBA_FIELD_NUMBER = 1;
  private int rgba_;
  /**
   * <code>int32 rgba = 1;</code>
   * @return The rgba.
   */
  public int getRgba() {
    return rgba_;
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
    if (rgba_ != 0) {
      output.writeInt32(1, rgba_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rgba_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, rgba_);
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
    if (!(obj instanceof cn.edu.cug.cs.gtl.protos.Color4b)) {
      return super.equals(obj);
    }
    cn.edu.cug.cs.gtl.protos.Color4b other = (cn.edu.cug.cs.gtl.protos.Color4b) obj;

    if (getRgba()
        != other.getRgba()) return false;
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
    hash = (37 * hash) + RGBA_FIELD_NUMBER;
    hash = (53 * hash) + getRgba();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.edu.cug.cs.gtl.protos.Color4b parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.Color4b parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Color4b parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.Color4b parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Color4b parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.Color4b parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Color4b parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.Color4b parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Color4b parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.Color4b parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Color4b parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.Color4b parseFrom(
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
  public static Builder newBuilder(cn.edu.cug.cs.gtl.protos.Color4b prototype) {
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
   * Protobuf type {@code cn.edu.cug.cs.gtl.protos.Color4b}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cn.edu.cug.cs.gtl.protos.Color4b)
      cn.edu.cug.cs.gtl.protos.Color4bOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.edu.cug.cs.gtl.protos.Colors.internal_static_cn_edu_cug_cs_gtl_protos_Color4b_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.edu.cug.cs.gtl.protos.Colors.internal_static_cn_edu_cug_cs_gtl_protos_Color4b_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.edu.cug.cs.gtl.protos.Color4b.class, cn.edu.cug.cs.gtl.protos.Color4b.Builder.class);
    }

    // Construct using cn.edu.cug.cs.gtl.protos.Color4b.newBuilder()
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
      rgba_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.edu.cug.cs.gtl.protos.Colors.internal_static_cn_edu_cug_cs_gtl_protos_Color4b_descriptor;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.Color4b getDefaultInstanceForType() {
      return cn.edu.cug.cs.gtl.protos.Color4b.getDefaultInstance();
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.Color4b build() {
      cn.edu.cug.cs.gtl.protos.Color4b result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.Color4b buildPartial() {
      cn.edu.cug.cs.gtl.protos.Color4b result = new cn.edu.cug.cs.gtl.protos.Color4b(this);
      result.rgba_ = rgba_;
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
      if (other instanceof cn.edu.cug.cs.gtl.protos.Color4b) {
        return mergeFrom((cn.edu.cug.cs.gtl.protos.Color4b)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.edu.cug.cs.gtl.protos.Color4b other) {
      if (other == cn.edu.cug.cs.gtl.protos.Color4b.getDefaultInstance()) return this;
      if (other.getRgba() != 0) {
        setRgba(other.getRgba());
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
      cn.edu.cug.cs.gtl.protos.Color4b parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.edu.cug.cs.gtl.protos.Color4b) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int rgba_ ;
    /**
     * <code>int32 rgba = 1;</code>
     * @return The rgba.
     */
    public int getRgba() {
      return rgba_;
    }
    /**
     * <code>int32 rgba = 1;</code>
     * @param value The rgba to set.
     * @return This builder for chaining.
     */
    public Builder setRgba(int value) {
      
      rgba_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 rgba = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRgba() {
      
      rgba_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:cn.edu.cug.cs.gtl.protos.Color4b)
  }

  // @@protoc_insertion_point(class_scope:cn.edu.cug.cs.gtl.protos.Color4b)
  private static final cn.edu.cug.cs.gtl.protos.Color4b DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.edu.cug.cs.gtl.protos.Color4b();
  }

  public static cn.edu.cug.cs.gtl.protos.Color4b getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Color4b>
      PARSER = new com.google.protobuf.AbstractParser<Color4b>() {
    @java.lang.Override
    public Color4b parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Color4b(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Color4b> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Color4b> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cn.edu.cug.cs.gtl.protos.Color4b getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

