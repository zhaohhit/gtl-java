// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cn/edu/cug/cs/gtl/protos/geometry.proto

package cn.edu.cug.cs.gtl.protos;

/**
 * Protobuf type {@code cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D}
 */
public  final class TetrahedralMesh3D extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D)
    TetrahedralMesh3DOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TetrahedralMesh3D.newBuilder() to construct.
  private TetrahedralMesh3D(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TetrahedralMesh3D() {
    vertices_ = java.util.Collections.emptyList();
    indices_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TetrahedralMesh3D();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TetrahedralMesh3D(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              vertices_ = new java.util.ArrayList<cn.edu.cug.cs.gtl.protos.Vertex3d>();
              mutable_bitField0_ |= 0x00000001;
            }
            vertices_.add(
                input.readMessage(cn.edu.cug.cs.gtl.protos.Vertex3d.parser(), extensionRegistry));
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              indices_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            indices_.addInt(input.readUInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              indices_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              indices_.addInt(input.readUInt32());
            }
            input.popLimit(limit);
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
        vertices_ = java.util.Collections.unmodifiableList(vertices_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        indices_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn.edu.cug.cs.gtl.protos.Geometries.internal_static_cn_edu_cug_cs_gtl_protos_TetrahedralMesh3D_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.edu.cug.cs.gtl.protos.Geometries.internal_static_cn_edu_cug_cs_gtl_protos_TetrahedralMesh3D_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D.class, cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D.Builder.class);
  }

  public static final int VERTICES_FIELD_NUMBER = 1;
  private java.util.List<cn.edu.cug.cs.gtl.protos.Vertex3d> vertices_;
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
   */
  public java.util.List<cn.edu.cug.cs.gtl.protos.Vertex3d> getVerticesList() {
    return vertices_;
  }
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
   */
  public java.util.List<? extends cn.edu.cug.cs.gtl.protos.Vertex3dOrBuilder> 
      getVerticesOrBuilderList() {
    return vertices_;
  }
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
   */
  public int getVerticesCount() {
    return vertices_.size();
  }
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
   */
  public cn.edu.cug.cs.gtl.protos.Vertex3d getVertices(int index) {
    return vertices_.get(index);
  }
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
   */
  public cn.edu.cug.cs.gtl.protos.Vertex3dOrBuilder getVerticesOrBuilder(
      int index) {
    return vertices_.get(index);
  }

  public static final int INDICES_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.IntList indices_;
  /**
   * <code>repeated uint32 indices = 2;</code>
   * @return A list containing the indices.
   */
  public java.util.List<java.lang.Integer>
      getIndicesList() {
    return indices_;
  }
  /**
   * <code>repeated uint32 indices = 2;</code>
   * @return The count of indices.
   */
  public int getIndicesCount() {
    return indices_.size();
  }
  /**
   * <code>repeated uint32 indices = 2;</code>
   * @param index The index of the element to return.
   * @return The indices at the given index.
   */
  public int getIndices(int index) {
    return indices_.getInt(index);
  }
  private int indicesMemoizedSerializedSize = -1;

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
    for (int i = 0; i < vertices_.size(); i++) {
      output.writeMessage(1, vertices_.get(i));
    }
    if (getIndicesList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(indicesMemoizedSerializedSize);
    }
    for (int i = 0; i < indices_.size(); i++) {
      output.writeUInt32NoTag(indices_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < vertices_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, vertices_.get(i));
    }
    {
      int dataSize = 0;
      for (int i = 0; i < indices_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(indices_.getInt(i));
      }
      size += dataSize;
      if (!getIndicesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      indicesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D)) {
      return super.equals(obj);
    }
    cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D other = (cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D) obj;

    if (!getVerticesList()
        .equals(other.getVerticesList())) return false;
    if (!getIndicesList()
        .equals(other.getIndicesList())) return false;
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
    if (getVerticesCount() > 0) {
      hash = (37 * hash) + VERTICES_FIELD_NUMBER;
      hash = (53 * hash) + getVerticesList().hashCode();
    }
    if (getIndicesCount() > 0) {
      hash = (37 * hash) + INDICES_FIELD_NUMBER;
      hash = (53 * hash) + getIndicesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D parseFrom(
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
  public static Builder newBuilder(cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D prototype) {
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
   * Protobuf type {@code cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D)
      cn.edu.cug.cs.gtl.protos.TetrahedralMesh3DOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.edu.cug.cs.gtl.protos.Geometries.internal_static_cn_edu_cug_cs_gtl_protos_TetrahedralMesh3D_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.edu.cug.cs.gtl.protos.Geometries.internal_static_cn_edu_cug_cs_gtl_protos_TetrahedralMesh3D_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D.class, cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D.Builder.class);
    }

    // Construct using cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D.newBuilder()
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
        getVerticesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (verticesBuilder_ == null) {
        vertices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        verticesBuilder_.clear();
      }
      indices_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.edu.cug.cs.gtl.protos.Geometries.internal_static_cn_edu_cug_cs_gtl_protos_TetrahedralMesh3D_descriptor;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D getDefaultInstanceForType() {
      return cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D.getDefaultInstance();
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D build() {
      cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D buildPartial() {
      cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D result = new cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D(this);
      int from_bitField0_ = bitField0_;
      if (verticesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          vertices_ = java.util.Collections.unmodifiableList(vertices_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.vertices_ = vertices_;
      } else {
        result.vertices_ = verticesBuilder_.build();
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        indices_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.indices_ = indices_;
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
      if (other instanceof cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D) {
        return mergeFrom((cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D other) {
      if (other == cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D.getDefaultInstance()) return this;
      if (verticesBuilder_ == null) {
        if (!other.vertices_.isEmpty()) {
          if (vertices_.isEmpty()) {
            vertices_ = other.vertices_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVerticesIsMutable();
            vertices_.addAll(other.vertices_);
          }
          onChanged();
        }
      } else {
        if (!other.vertices_.isEmpty()) {
          if (verticesBuilder_.isEmpty()) {
            verticesBuilder_.dispose();
            verticesBuilder_ = null;
            vertices_ = other.vertices_;
            bitField0_ = (bitField0_ & ~0x00000001);
            verticesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVerticesFieldBuilder() : null;
          } else {
            verticesBuilder_.addAllMessages(other.vertices_);
          }
        }
      }
      if (!other.indices_.isEmpty()) {
        if (indices_.isEmpty()) {
          indices_ = other.indices_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureIndicesIsMutable();
          indices_.addAll(other.indices_);
        }
        onChanged();
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
      cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<cn.edu.cug.cs.gtl.protos.Vertex3d> vertices_ =
      java.util.Collections.emptyList();
    private void ensureVerticesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        vertices_ = new java.util.ArrayList<cn.edu.cug.cs.gtl.protos.Vertex3d>(vertices_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cn.edu.cug.cs.gtl.protos.Vertex3d, cn.edu.cug.cs.gtl.protos.Vertex3d.Builder, cn.edu.cug.cs.gtl.protos.Vertex3dOrBuilder> verticesBuilder_;

    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
     */
    public java.util.List<cn.edu.cug.cs.gtl.protos.Vertex3d> getVerticesList() {
      if (verticesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(vertices_);
      } else {
        return verticesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
     */
    public int getVerticesCount() {
      if (verticesBuilder_ == null) {
        return vertices_.size();
      } else {
        return verticesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Vertex3d getVertices(int index) {
      if (verticesBuilder_ == null) {
        return vertices_.get(index);
      } else {
        return verticesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
     */
    public Builder setVertices(
        int index, cn.edu.cug.cs.gtl.protos.Vertex3d value) {
      if (verticesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerticesIsMutable();
        vertices_.set(index, value);
        onChanged();
      } else {
        verticesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
     */
    public Builder setVertices(
        int index, cn.edu.cug.cs.gtl.protos.Vertex3d.Builder builderForValue) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        vertices_.set(index, builderForValue.build());
        onChanged();
      } else {
        verticesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
     */
    public Builder addVertices(cn.edu.cug.cs.gtl.protos.Vertex3d value) {
      if (verticesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerticesIsMutable();
        vertices_.add(value);
        onChanged();
      } else {
        verticesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
     */
    public Builder addVertices(
        int index, cn.edu.cug.cs.gtl.protos.Vertex3d value) {
      if (verticesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerticesIsMutable();
        vertices_.add(index, value);
        onChanged();
      } else {
        verticesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
     */
    public Builder addVertices(
        cn.edu.cug.cs.gtl.protos.Vertex3d.Builder builderForValue) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        vertices_.add(builderForValue.build());
        onChanged();
      } else {
        verticesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
     */
    public Builder addVertices(
        int index, cn.edu.cug.cs.gtl.protos.Vertex3d.Builder builderForValue) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        vertices_.add(index, builderForValue.build());
        onChanged();
      } else {
        verticesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
     */
    public Builder addAllVertices(
        java.lang.Iterable<? extends cn.edu.cug.cs.gtl.protos.Vertex3d> values) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, vertices_);
        onChanged();
      } else {
        verticesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
     */
    public Builder clearVertices() {
      if (verticesBuilder_ == null) {
        vertices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        verticesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
     */
    public Builder removeVertices(int index) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        vertices_.remove(index);
        onChanged();
      } else {
        verticesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Vertex3d.Builder getVerticesBuilder(
        int index) {
      return getVerticesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Vertex3dOrBuilder getVerticesOrBuilder(
        int index) {
      if (verticesBuilder_ == null) {
        return vertices_.get(index);  } else {
        return verticesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
     */
    public java.util.List<? extends cn.edu.cug.cs.gtl.protos.Vertex3dOrBuilder> 
         getVerticesOrBuilderList() {
      if (verticesBuilder_ != null) {
        return verticesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(vertices_);
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Vertex3d.Builder addVerticesBuilder() {
      return getVerticesFieldBuilder().addBuilder(
          cn.edu.cug.cs.gtl.protos.Vertex3d.getDefaultInstance());
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Vertex3d.Builder addVerticesBuilder(
        int index) {
      return getVerticesFieldBuilder().addBuilder(
          index, cn.edu.cug.cs.gtl.protos.Vertex3d.getDefaultInstance());
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Vertex3d vertices = 1;</code>
     */
    public java.util.List<cn.edu.cug.cs.gtl.protos.Vertex3d.Builder> 
         getVerticesBuilderList() {
      return getVerticesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cn.edu.cug.cs.gtl.protos.Vertex3d, cn.edu.cug.cs.gtl.protos.Vertex3d.Builder, cn.edu.cug.cs.gtl.protos.Vertex3dOrBuilder> 
        getVerticesFieldBuilder() {
      if (verticesBuilder_ == null) {
        verticesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cn.edu.cug.cs.gtl.protos.Vertex3d, cn.edu.cug.cs.gtl.protos.Vertex3d.Builder, cn.edu.cug.cs.gtl.protos.Vertex3dOrBuilder>(
                vertices_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        vertices_ = null;
      }
      return verticesBuilder_;
    }

    private com.google.protobuf.Internal.IntList indices_ = emptyIntList();
    private void ensureIndicesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        indices_ = mutableCopy(indices_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated uint32 indices = 2;</code>
     * @return A list containing the indices.
     */
    public java.util.List<java.lang.Integer>
        getIndicesList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(indices_) : indices_;
    }
    /**
     * <code>repeated uint32 indices = 2;</code>
     * @return The count of indices.
     */
    public int getIndicesCount() {
      return indices_.size();
    }
    /**
     * <code>repeated uint32 indices = 2;</code>
     * @param index The index of the element to return.
     * @return The indices at the given index.
     */
    public int getIndices(int index) {
      return indices_.getInt(index);
    }
    /**
     * <code>repeated uint32 indices = 2;</code>
     * @param index The index to set the value at.
     * @param value The indices to set.
     * @return This builder for chaining.
     */
    public Builder setIndices(
        int index, int value) {
      ensureIndicesIsMutable();
      indices_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 indices = 2;</code>
     * @param value The indices to add.
     * @return This builder for chaining.
     */
    public Builder addIndices(int value) {
      ensureIndicesIsMutable();
      indices_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 indices = 2;</code>
     * @param values The indices to add.
     * @return This builder for chaining.
     */
    public Builder addAllIndices(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureIndicesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, indices_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 indices = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIndices() {
      indices_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D)
  }

  // @@protoc_insertion_point(class_scope:cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D)
  private static final cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D();
  }

  public static cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TetrahedralMesh3D>
      PARSER = new com.google.protobuf.AbstractParser<TetrahedralMesh3D>() {
    @java.lang.Override
    public TetrahedralMesh3D parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TetrahedralMesh3D(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TetrahedralMesh3D> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TetrahedralMesh3D> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cn.edu.cug.cs.gtl.protos.TetrahedralMesh3D getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

