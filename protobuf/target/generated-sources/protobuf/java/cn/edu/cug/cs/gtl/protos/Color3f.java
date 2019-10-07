// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cn/edu/cug/cs/gtl/protos/color.proto

package cn.edu.cug.cs.gtl.protos;

/**
 * Protobuf type {@code cn.edu.cug.cs.gtl.protos.Color3f}
 */
public  final class Color3f extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cn.edu.cug.cs.gtl.protos.Color3f)
    Color3fOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Color3f.newBuilder() to construct.
  private Color3f(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Color3f() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Color3f();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Color3f(
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
          case 13: {

            r_ = input.readFloat();
            break;
          }
          case 21: {

            g_ = input.readFloat();
            break;
          }
          case 29: {

            b_ = input.readFloat();
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
    return cn.edu.cug.cs.gtl.protos.Colors.internal_static_cn_edu_cug_cs_gtl_protos_Color3f_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.edu.cug.cs.gtl.protos.Colors.internal_static_cn_edu_cug_cs_gtl_protos_Color3f_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.edu.cug.cs.gtl.protos.Color3f.class, cn.edu.cug.cs.gtl.protos.Color3f.Builder.class);
  }

  public static final int R_FIELD_NUMBER = 1;
  private float r_;
  /**
   * <code>float r = 1;</code>
   * @return The r.
   */
  public float getR() {
    return r_;
  }

  public static final int G_FIELD_NUMBER = 2;
  private float g_;
  /**
   * <code>float g = 2;</code>
   * @return The g.
   */
  public float getG() {
    return g_;
  }

  public static final int B_FIELD_NUMBER = 3;
  private float b_;
  /**
   * <code>float b = 3;</code>
   * @return The b.
   */
  public float getB() {
    return b_;
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
    if (r_ != 0F) {
      output.writeFloat(1, r_);
    }
    if (g_ != 0F) {
      output.writeFloat(2, g_);
    }
    if (b_ != 0F) {
      output.writeFloat(3, b_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (r_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, r_);
    }
    if (g_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, g_);
    }
    if (b_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, b_);
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
    if (!(obj instanceof cn.edu.cug.cs.gtl.protos.Color3f)) {
      return super.equals(obj);
    }
    cn.edu.cug.cs.gtl.protos.Color3f other = (cn.edu.cug.cs.gtl.protos.Color3f) obj;

    if (java.lang.Float.floatToIntBits(getR())
        != java.lang.Float.floatToIntBits(
            other.getR())) return false;
    if (java.lang.Float.floatToIntBits(getG())
        != java.lang.Float.floatToIntBits(
            other.getG())) return false;
    if (java.lang.Float.floatToIntBits(getB())
        != java.lang.Float.floatToIntBits(
            other.getB())) return false;
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
    hash = (37 * hash) + R_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getR());
    hash = (37 * hash) + G_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getG());
    hash = (37 * hash) + B_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getB());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.edu.cug.cs.gtl.protos.Color3f parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.Color3f parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Color3f parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.Color3f parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Color3f parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.Color3f parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Color3f parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.Color3f parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Color3f parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.Color3f parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Color3f parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.Color3f parseFrom(
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
  public static Builder newBuilder(cn.edu.cug.cs.gtl.protos.Color3f prototype) {
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
   * Protobuf type {@code cn.edu.cug.cs.gtl.protos.Color3f}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cn.edu.cug.cs.gtl.protos.Color3f)
      cn.edu.cug.cs.gtl.protos.Color3fOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.edu.cug.cs.gtl.protos.Colors.internal_static_cn_edu_cug_cs_gtl_protos_Color3f_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.edu.cug.cs.gtl.protos.Colors.internal_static_cn_edu_cug_cs_gtl_protos_Color3f_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.edu.cug.cs.gtl.protos.Color3f.class, cn.edu.cug.cs.gtl.protos.Color3f.Builder.class);
    }

    // Construct using cn.edu.cug.cs.gtl.protos.Color3f.newBuilder()
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
      r_ = 0F;

      g_ = 0F;

      b_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.edu.cug.cs.gtl.protos.Colors.internal_static_cn_edu_cug_cs_gtl_protos_Color3f_descriptor;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.Color3f getDefaultInstanceForType() {
      return cn.edu.cug.cs.gtl.protos.Color3f.getDefaultInstance();
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.Color3f build() {
      cn.edu.cug.cs.gtl.protos.Color3f result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.Color3f buildPartial() {
      cn.edu.cug.cs.gtl.protos.Color3f result = new cn.edu.cug.cs.gtl.protos.Color3f(this);
      result.r_ = r_;
      result.g_ = g_;
      result.b_ = b_;
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
      if (other instanceof cn.edu.cug.cs.gtl.protos.Color3f) {
        return mergeFrom((cn.edu.cug.cs.gtl.protos.Color3f)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.edu.cug.cs.gtl.protos.Color3f other) {
      if (other == cn.edu.cug.cs.gtl.protos.Color3f.getDefaultInstance()) return this;
      if (other.getR() != 0F) {
        setR(other.getR());
      }
      if (other.getG() != 0F) {
        setG(other.getG());
      }
      if (other.getB() != 0F) {
        setB(other.getB());
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
      cn.edu.cug.cs.gtl.protos.Color3f parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.edu.cug.cs.gtl.protos.Color3f) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float r_ ;
    /**
     * <code>float r = 1;</code>
     * @return The r.
     */
    public float getR() {
      return r_;
    }
    /**
     * <code>float r = 1;</code>
     * @param value The r to set.
     * @return This builder for chaining.
     */
    public Builder setR(float value) {
      
      r_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float r = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearR() {
      
      r_ = 0F;
      onChanged();
      return this;
    }

    private float g_ ;
    /**
     * <code>float g = 2;</code>
     * @return The g.
     */
    public float getG() {
      return g_;
    }
    /**
     * <code>float g = 2;</code>
     * @param value The g to set.
     * @return This builder for chaining.
     */
    public Builder setG(float value) {
      
      g_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float g = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearG() {
      
      g_ = 0F;
      onChanged();
      return this;
    }

    private float b_ ;
    /**
     * <code>float b = 3;</code>
     * @return The b.
     */
    public float getB() {
      return b_;
    }
    /**
     * <code>float b = 3;</code>
     * @param value The b to set.
     * @return This builder for chaining.
     */
    public Builder setB(float value) {
      
      b_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float b = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearB() {
      
      b_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:cn.edu.cug.cs.gtl.protos.Color3f)
  }

  // @@protoc_insertion_point(class_scope:cn.edu.cug.cs.gtl.protos.Color3f)
  private static final cn.edu.cug.cs.gtl.protos.Color3f DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.edu.cug.cs.gtl.protos.Color3f();
  }

  public static cn.edu.cug.cs.gtl.protos.Color3f getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Color3f>
      PARSER = new com.google.protobuf.AbstractParser<Color3f>() {
    @java.lang.Override
    public Color3f parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Color3f(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Color3f> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Color3f> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cn.edu.cug.cs.gtl.protos.Color3f getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

