// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cn/edu/cug/cs/gtl/protos/texture.proto

package cn.edu.cug.cs.gtl.protos;

/**
 * Protobuf type {@code cn.edu.cug.cs.gtl.protos.Texture}
 */
public  final class Texture extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cn.edu.cug.cs.gtl.protos.Texture)
    TextureOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Texture.newBuilder() to construct.
  private Texture(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Texture() {
    name_ = "";
    imageName_ = "";
    imageData_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Texture();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Texture(
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
            cn.edu.cug.cs.gtl.protos.Identifier.Builder subBuilder = null;
            if (identifier_ != null) {
              subBuilder = identifier_.toBuilder();
            }
            identifier_ = input.readMessage(cn.edu.cug.cs.gtl.protos.Identifier.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(identifier_);
              identifier_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 24: {

            type_ = input.readInt32();
            break;
          }
          case 32: {

            wrapMode_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            imageName_ = s;
            break;
          }
          case 50: {

            imageData_ = input.readBytes();
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
    return cn.edu.cug.cs.gtl.protos.Textures.internal_static_cn_edu_cug_cs_gtl_protos_Texture_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.edu.cug.cs.gtl.protos.Textures.internal_static_cn_edu_cug_cs_gtl_protos_Texture_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.edu.cug.cs.gtl.protos.Texture.class, cn.edu.cug.cs.gtl.protos.Texture.Builder.class);
  }

  public static final int IDENTIFIER_FIELD_NUMBER = 1;
  private cn.edu.cug.cs.gtl.protos.Identifier identifier_;
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Identifier identifier = 1;</code>
   * @return Whether the identifier field is set.
   */
  public boolean hasIdentifier() {
    return identifier_ != null;
  }
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Identifier identifier = 1;</code>
   * @return The identifier.
   */
  public cn.edu.cug.cs.gtl.protos.Identifier getIdentifier() {
    return identifier_ == null ? cn.edu.cug.cs.gtl.protos.Identifier.getDefaultInstance() : identifier_;
  }
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.Identifier identifier = 1;</code>
   */
  public cn.edu.cug.cs.gtl.protos.IdentifierOrBuilder getIdentifierOrBuilder() {
    return getIdentifier();
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private int type_;
  /**
   * <code>int32 type = 3;</code>
   * @return The type.
   */
  public int getType() {
    return type_;
  }

  public static final int WRAP_MODE_FIELD_NUMBER = 4;
  private int wrapMode_;
  /**
   * <code>int32 wrap_mode = 4;</code>
   * @return The wrapMode.
   */
  public int getWrapMode() {
    return wrapMode_;
  }

  public static final int IMAGE_NAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object imageName_;
  /**
   * <code>string image_name = 5;</code>
   * @return The imageName.
   */
  public java.lang.String getImageName() {
    java.lang.Object ref = imageName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imageName_ = s;
      return s;
    }
  }
  /**
   * <code>string image_name = 5;</code>
   * @return The bytes for imageName.
   */
  public com.google.protobuf.ByteString
      getImageNameBytes() {
    java.lang.Object ref = imageName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      imageName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMAGE_DATA_FIELD_NUMBER = 6;
  private com.google.protobuf.ByteString imageData_;
  /**
   * <code>bytes image_data = 6;</code>
   * @return The imageData.
   */
  public com.google.protobuf.ByteString getImageData() {
    return imageData_;
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
    if (identifier_ != null) {
      output.writeMessage(1, getIdentifier());
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (type_ != 0) {
      output.writeInt32(3, type_);
    }
    if (wrapMode_ != 0) {
      output.writeInt32(4, wrapMode_);
    }
    if (!getImageNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, imageName_);
    }
    if (!imageData_.isEmpty()) {
      output.writeBytes(6, imageData_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (identifier_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getIdentifier());
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, type_);
    }
    if (wrapMode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, wrapMode_);
    }
    if (!getImageNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, imageName_);
    }
    if (!imageData_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(6, imageData_);
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
    if (!(obj instanceof cn.edu.cug.cs.gtl.protos.Texture)) {
      return super.equals(obj);
    }
    cn.edu.cug.cs.gtl.protos.Texture other = (cn.edu.cug.cs.gtl.protos.Texture) obj;

    if (hasIdentifier() != other.hasIdentifier()) return false;
    if (hasIdentifier()) {
      if (!getIdentifier()
          .equals(other.getIdentifier())) return false;
    }
    if (!getName()
        .equals(other.getName())) return false;
    if (getType()
        != other.getType()) return false;
    if (getWrapMode()
        != other.getWrapMode()) return false;
    if (!getImageName()
        .equals(other.getImageName())) return false;
    if (!getImageData()
        .equals(other.getImageData())) return false;
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
    if (hasIdentifier()) {
      hash = (37 * hash) + IDENTIFIER_FIELD_NUMBER;
      hash = (53 * hash) + getIdentifier().hashCode();
    }
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (37 * hash) + WRAP_MODE_FIELD_NUMBER;
    hash = (53 * hash) + getWrapMode();
    hash = (37 * hash) + IMAGE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getImageName().hashCode();
    hash = (37 * hash) + IMAGE_DATA_FIELD_NUMBER;
    hash = (53 * hash) + getImageData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.edu.cug.cs.gtl.protos.Texture parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.Texture parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Texture parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.Texture parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Texture parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.Texture parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Texture parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.Texture parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Texture parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.Texture parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Texture parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.Texture parseFrom(
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
  public static Builder newBuilder(cn.edu.cug.cs.gtl.protos.Texture prototype) {
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
   * Protobuf type {@code cn.edu.cug.cs.gtl.protos.Texture}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cn.edu.cug.cs.gtl.protos.Texture)
      cn.edu.cug.cs.gtl.protos.TextureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.edu.cug.cs.gtl.protos.Textures.internal_static_cn_edu_cug_cs_gtl_protos_Texture_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.edu.cug.cs.gtl.protos.Textures.internal_static_cn_edu_cug_cs_gtl_protos_Texture_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.edu.cug.cs.gtl.protos.Texture.class, cn.edu.cug.cs.gtl.protos.Texture.Builder.class);
    }

    // Construct using cn.edu.cug.cs.gtl.protos.Texture.newBuilder()
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
      if (identifierBuilder_ == null) {
        identifier_ = null;
      } else {
        identifier_ = null;
        identifierBuilder_ = null;
      }
      name_ = "";

      type_ = 0;

      wrapMode_ = 0;

      imageName_ = "";

      imageData_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.edu.cug.cs.gtl.protos.Textures.internal_static_cn_edu_cug_cs_gtl_protos_Texture_descriptor;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.Texture getDefaultInstanceForType() {
      return cn.edu.cug.cs.gtl.protos.Texture.getDefaultInstance();
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.Texture build() {
      cn.edu.cug.cs.gtl.protos.Texture result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.Texture buildPartial() {
      cn.edu.cug.cs.gtl.protos.Texture result = new cn.edu.cug.cs.gtl.protos.Texture(this);
      if (identifierBuilder_ == null) {
        result.identifier_ = identifier_;
      } else {
        result.identifier_ = identifierBuilder_.build();
      }
      result.name_ = name_;
      result.type_ = type_;
      result.wrapMode_ = wrapMode_;
      result.imageName_ = imageName_;
      result.imageData_ = imageData_;
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
      if (other instanceof cn.edu.cug.cs.gtl.protos.Texture) {
        return mergeFrom((cn.edu.cug.cs.gtl.protos.Texture)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.edu.cug.cs.gtl.protos.Texture other) {
      if (other == cn.edu.cug.cs.gtl.protos.Texture.getDefaultInstance()) return this;
      if (other.hasIdentifier()) {
        mergeIdentifier(other.getIdentifier());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (other.getWrapMode() != 0) {
        setWrapMode(other.getWrapMode());
      }
      if (!other.getImageName().isEmpty()) {
        imageName_ = other.imageName_;
        onChanged();
      }
      if (other.getImageData() != com.google.protobuf.ByteString.EMPTY) {
        setImageData(other.getImageData());
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
      cn.edu.cug.cs.gtl.protos.Texture parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.edu.cug.cs.gtl.protos.Texture) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private cn.edu.cug.cs.gtl.protos.Identifier identifier_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.edu.cug.cs.gtl.protos.Identifier, cn.edu.cug.cs.gtl.protos.Identifier.Builder, cn.edu.cug.cs.gtl.protos.IdentifierOrBuilder> identifierBuilder_;
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Identifier identifier = 1;</code>
     * @return Whether the identifier field is set.
     */
    public boolean hasIdentifier() {
      return identifierBuilder_ != null || identifier_ != null;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Identifier identifier = 1;</code>
     * @return The identifier.
     */
    public cn.edu.cug.cs.gtl.protos.Identifier getIdentifier() {
      if (identifierBuilder_ == null) {
        return identifier_ == null ? cn.edu.cug.cs.gtl.protos.Identifier.getDefaultInstance() : identifier_;
      } else {
        return identifierBuilder_.getMessage();
      }
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Identifier identifier = 1;</code>
     */
    public Builder setIdentifier(cn.edu.cug.cs.gtl.protos.Identifier value) {
      if (identifierBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        identifier_ = value;
        onChanged();
      } else {
        identifierBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Identifier identifier = 1;</code>
     */
    public Builder setIdentifier(
        cn.edu.cug.cs.gtl.protos.Identifier.Builder builderForValue) {
      if (identifierBuilder_ == null) {
        identifier_ = builderForValue.build();
        onChanged();
      } else {
        identifierBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Identifier identifier = 1;</code>
     */
    public Builder mergeIdentifier(cn.edu.cug.cs.gtl.protos.Identifier value) {
      if (identifierBuilder_ == null) {
        if (identifier_ != null) {
          identifier_ =
            cn.edu.cug.cs.gtl.protos.Identifier.newBuilder(identifier_).mergeFrom(value).buildPartial();
        } else {
          identifier_ = value;
        }
        onChanged();
      } else {
        identifierBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Identifier identifier = 1;</code>
     */
    public Builder clearIdentifier() {
      if (identifierBuilder_ == null) {
        identifier_ = null;
        onChanged();
      } else {
        identifier_ = null;
        identifierBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Identifier identifier = 1;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Identifier.Builder getIdentifierBuilder() {
      
      onChanged();
      return getIdentifierFieldBuilder().getBuilder();
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Identifier identifier = 1;</code>
     */
    public cn.edu.cug.cs.gtl.protos.IdentifierOrBuilder getIdentifierOrBuilder() {
      if (identifierBuilder_ != null) {
        return identifierBuilder_.getMessageOrBuilder();
      } else {
        return identifier_ == null ?
            cn.edu.cug.cs.gtl.protos.Identifier.getDefaultInstance() : identifier_;
      }
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.Identifier identifier = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.edu.cug.cs.gtl.protos.Identifier, cn.edu.cug.cs.gtl.protos.Identifier.Builder, cn.edu.cug.cs.gtl.protos.IdentifierOrBuilder> 
        getIdentifierFieldBuilder() {
      if (identifierBuilder_ == null) {
        identifierBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cn.edu.cug.cs.gtl.protos.Identifier, cn.edu.cug.cs.gtl.protos.Identifier.Builder, cn.edu.cug.cs.gtl.protos.IdentifierOrBuilder>(
                getIdentifier(),
                getParentForChildren(),
                isClean());
        identifier_ = null;
      }
      return identifierBuilder_;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int type_ ;
    /**
     * <code>int32 type = 3;</code>
     * @return The type.
     */
    public int getType() {
      return type_;
    }
    /**
     * <code>int32 type = 3;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private int wrapMode_ ;
    /**
     * <code>int32 wrap_mode = 4;</code>
     * @return The wrapMode.
     */
    public int getWrapMode() {
      return wrapMode_;
    }
    /**
     * <code>int32 wrap_mode = 4;</code>
     * @param value The wrapMode to set.
     * @return This builder for chaining.
     */
    public Builder setWrapMode(int value) {
      
      wrapMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 wrap_mode = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearWrapMode() {
      
      wrapMode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object imageName_ = "";
    /**
     * <code>string image_name = 5;</code>
     * @return The imageName.
     */
    public java.lang.String getImageName() {
      java.lang.Object ref = imageName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imageName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string image_name = 5;</code>
     * @return The bytes for imageName.
     */
    public com.google.protobuf.ByteString
        getImageNameBytes() {
      java.lang.Object ref = imageName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imageName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string image_name = 5;</code>
     * @param value The imageName to set.
     * @return This builder for chaining.
     */
    public Builder setImageName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imageName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string image_name = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageName() {
      
      imageName_ = getDefaultInstance().getImageName();
      onChanged();
      return this;
    }
    /**
     * <code>string image_name = 5;</code>
     * @param value The bytes for imageName to set.
     * @return This builder for chaining.
     */
    public Builder setImageNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      imageName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString imageData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes image_data = 6;</code>
     * @return The imageData.
     */
    public com.google.protobuf.ByteString getImageData() {
      return imageData_;
    }
    /**
     * <code>bytes image_data = 6;</code>
     * @param value The imageData to set.
     * @return This builder for chaining.
     */
    public Builder setImageData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imageData_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes image_data = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageData() {
      
      imageData_ = getDefaultInstance().getImageData();
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


    // @@protoc_insertion_point(builder_scope:cn.edu.cug.cs.gtl.protos.Texture)
  }

  // @@protoc_insertion_point(class_scope:cn.edu.cug.cs.gtl.protos.Texture)
  private static final cn.edu.cug.cs.gtl.protos.Texture DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.edu.cug.cs.gtl.protos.Texture();
  }

  public static cn.edu.cug.cs.gtl.protos.Texture getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Texture>
      PARSER = new com.google.protobuf.AbstractParser<Texture>() {
    @java.lang.Override
    public Texture parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Texture(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Texture> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Texture> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cn.edu.cug.cs.gtl.protos.Texture getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
