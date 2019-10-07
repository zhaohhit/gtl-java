// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cn/edu/cug/cs/gtl/protos/value.proto

package cn.edu.cug.cs.gtl.protos;

/**
 * Protobuf type {@code cn.edu.cug.cs.gtl.protos.Table}
 */
public  final class Table extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cn.edu.cug.cs.gtl.protos.Table)
    TableOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Table.newBuilder() to construct.
  private Table(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Table() {
    column_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Table();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Table(
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
            cn.edu.cug.cs.gtl.protos.TableInfo.Builder subBuilder = null;
            if (info_ != null) {
              subBuilder = info_.toBuilder();
            }
            info_ = input.readMessage(cn.edu.cug.cs.gtl.protos.TableInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(info_);
              info_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              column_ = new java.util.ArrayList<cn.edu.cug.cs.gtl.protos.Column>();
              mutable_bitField0_ |= 0x00000001;
            }
            column_.add(
                input.readMessage(cn.edu.cug.cs.gtl.protos.Column.parser(), extensionRegistry));
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
        column_ = java.util.Collections.unmodifiableList(column_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn.edu.cug.cs.gtl.protos.Values.internal_static_cn_edu_cug_cs_gtl_protos_Table_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.edu.cug.cs.gtl.protos.Values.internal_static_cn_edu_cug_cs_gtl_protos_Table_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.edu.cug.cs.gtl.protos.Table.class, cn.edu.cug.cs.gtl.protos.Table.Builder.class);
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

  public static final int INFO_FIELD_NUMBER = 2;
  private cn.edu.cug.cs.gtl.protos.TableInfo info_;
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.TableInfo info = 2;</code>
   * @return Whether the info field is set.
   */
  public boolean hasInfo() {
    return info_ != null;
  }
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.TableInfo info = 2;</code>
   * @return The info.
   */
  public cn.edu.cug.cs.gtl.protos.TableInfo getInfo() {
    return info_ == null ? cn.edu.cug.cs.gtl.protos.TableInfo.getDefaultInstance() : info_;
  }
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.TableInfo info = 2;</code>
   */
  public cn.edu.cug.cs.gtl.protos.TableInfoOrBuilder getInfoOrBuilder() {
    return getInfo();
  }

  public static final int COLUMN_FIELD_NUMBER = 3;
  private java.util.List<cn.edu.cug.cs.gtl.protos.Column> column_;
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
   */
  public java.util.List<cn.edu.cug.cs.gtl.protos.Column> getColumnList() {
    return column_;
  }
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
   */
  public java.util.List<? extends cn.edu.cug.cs.gtl.protos.ColumnOrBuilder> 
      getColumnOrBuilderList() {
    return column_;
  }
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
   */
  public int getColumnCount() {
    return column_.size();
  }
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
   */
  public cn.edu.cug.cs.gtl.protos.Column getColumn(int index) {
    return column_.get(index);
  }
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
   */
  public cn.edu.cug.cs.gtl.protos.ColumnOrBuilder getColumnOrBuilder(
      int index) {
    return column_.get(index);
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
    if (info_ != null) {
      output.writeMessage(2, getInfo());
    }
    for (int i = 0; i < column_.size(); i++) {
      output.writeMessage(3, column_.get(i));
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
    if (info_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInfo());
    }
    for (int i = 0; i < column_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, column_.get(i));
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
    if (!(obj instanceof cn.edu.cug.cs.gtl.protos.Table)) {
      return super.equals(obj);
    }
    cn.edu.cug.cs.gtl.protos.Table other = (cn.edu.cug.cs.gtl.protos.Table) obj;

    if (hasIdentifier() != other.hasIdentifier()) return false;
    if (hasIdentifier()) {
      if (!getIdentifier()
          .equals(other.getIdentifier())) return false;
    }
    if (hasInfo() != other.hasInfo()) return false;
    if (hasInfo()) {
      if (!getInfo()
          .equals(other.getInfo())) return false;
    }
    if (!getColumnList()
        .equals(other.getColumnList())) return false;
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
    if (hasInfo()) {
      hash = (37 * hash) + INFO_FIELD_NUMBER;
      hash = (53 * hash) + getInfo().hashCode();
    }
    if (getColumnCount() > 0) {
      hash = (37 * hash) + COLUMN_FIELD_NUMBER;
      hash = (53 * hash) + getColumnList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.edu.cug.cs.gtl.protos.Table parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.Table parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Table parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.Table parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Table parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.Table parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Table parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.Table parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Table parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.Table parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Table parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.Table parseFrom(
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
  public static Builder newBuilder(cn.edu.cug.cs.gtl.protos.Table prototype) {
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
   * Protobuf type {@code cn.edu.cug.cs.gtl.protos.Table}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cn.edu.cug.cs.gtl.protos.Table)
      cn.edu.cug.cs.gtl.protos.TableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.edu.cug.cs.gtl.protos.Values.internal_static_cn_edu_cug_cs_gtl_protos_Table_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.edu.cug.cs.gtl.protos.Values.internal_static_cn_edu_cug_cs_gtl_protos_Table_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.edu.cug.cs.gtl.protos.Table.class, cn.edu.cug.cs.gtl.protos.Table.Builder.class);
    }

    // Construct using cn.edu.cug.cs.gtl.protos.Table.newBuilder()
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
        getColumnFieldBuilder();
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
      if (infoBuilder_ == null) {
        info_ = null;
      } else {
        info_ = null;
        infoBuilder_ = null;
      }
      if (columnBuilder_ == null) {
        column_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        columnBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.edu.cug.cs.gtl.protos.Values.internal_static_cn_edu_cug_cs_gtl_protos_Table_descriptor;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.Table getDefaultInstanceForType() {
      return cn.edu.cug.cs.gtl.protos.Table.getDefaultInstance();
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.Table build() {
      cn.edu.cug.cs.gtl.protos.Table result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.Table buildPartial() {
      cn.edu.cug.cs.gtl.protos.Table result = new cn.edu.cug.cs.gtl.protos.Table(this);
      int from_bitField0_ = bitField0_;
      if (identifierBuilder_ == null) {
        result.identifier_ = identifier_;
      } else {
        result.identifier_ = identifierBuilder_.build();
      }
      if (infoBuilder_ == null) {
        result.info_ = info_;
      } else {
        result.info_ = infoBuilder_.build();
      }
      if (columnBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          column_ = java.util.Collections.unmodifiableList(column_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.column_ = column_;
      } else {
        result.column_ = columnBuilder_.build();
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
      if (other instanceof cn.edu.cug.cs.gtl.protos.Table) {
        return mergeFrom((cn.edu.cug.cs.gtl.protos.Table)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.edu.cug.cs.gtl.protos.Table other) {
      if (other == cn.edu.cug.cs.gtl.protos.Table.getDefaultInstance()) return this;
      if (other.hasIdentifier()) {
        mergeIdentifier(other.getIdentifier());
      }
      if (other.hasInfo()) {
        mergeInfo(other.getInfo());
      }
      if (columnBuilder_ == null) {
        if (!other.column_.isEmpty()) {
          if (column_.isEmpty()) {
            column_ = other.column_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureColumnIsMutable();
            column_.addAll(other.column_);
          }
          onChanged();
        }
      } else {
        if (!other.column_.isEmpty()) {
          if (columnBuilder_.isEmpty()) {
            columnBuilder_.dispose();
            columnBuilder_ = null;
            column_ = other.column_;
            bitField0_ = (bitField0_ & ~0x00000001);
            columnBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getColumnFieldBuilder() : null;
          } else {
            columnBuilder_.addAllMessages(other.column_);
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
      cn.edu.cug.cs.gtl.protos.Table parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.edu.cug.cs.gtl.protos.Table) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private cn.edu.cug.cs.gtl.protos.TableInfo info_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.edu.cug.cs.gtl.protos.TableInfo, cn.edu.cug.cs.gtl.protos.TableInfo.Builder, cn.edu.cug.cs.gtl.protos.TableInfoOrBuilder> infoBuilder_;
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.TableInfo info = 2;</code>
     * @return Whether the info field is set.
     */
    public boolean hasInfo() {
      return infoBuilder_ != null || info_ != null;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.TableInfo info = 2;</code>
     * @return The info.
     */
    public cn.edu.cug.cs.gtl.protos.TableInfo getInfo() {
      if (infoBuilder_ == null) {
        return info_ == null ? cn.edu.cug.cs.gtl.protos.TableInfo.getDefaultInstance() : info_;
      } else {
        return infoBuilder_.getMessage();
      }
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.TableInfo info = 2;</code>
     */
    public Builder setInfo(cn.edu.cug.cs.gtl.protos.TableInfo value) {
      if (infoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        info_ = value;
        onChanged();
      } else {
        infoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.TableInfo info = 2;</code>
     */
    public Builder setInfo(
        cn.edu.cug.cs.gtl.protos.TableInfo.Builder builderForValue) {
      if (infoBuilder_ == null) {
        info_ = builderForValue.build();
        onChanged();
      } else {
        infoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.TableInfo info = 2;</code>
     */
    public Builder mergeInfo(cn.edu.cug.cs.gtl.protos.TableInfo value) {
      if (infoBuilder_ == null) {
        if (info_ != null) {
          info_ =
            cn.edu.cug.cs.gtl.protos.TableInfo.newBuilder(info_).mergeFrom(value).buildPartial();
        } else {
          info_ = value;
        }
        onChanged();
      } else {
        infoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.TableInfo info = 2;</code>
     */
    public Builder clearInfo() {
      if (infoBuilder_ == null) {
        info_ = null;
        onChanged();
      } else {
        info_ = null;
        infoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.TableInfo info = 2;</code>
     */
    public cn.edu.cug.cs.gtl.protos.TableInfo.Builder getInfoBuilder() {
      
      onChanged();
      return getInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.TableInfo info = 2;</code>
     */
    public cn.edu.cug.cs.gtl.protos.TableInfoOrBuilder getInfoOrBuilder() {
      if (infoBuilder_ != null) {
        return infoBuilder_.getMessageOrBuilder();
      } else {
        return info_ == null ?
            cn.edu.cug.cs.gtl.protos.TableInfo.getDefaultInstance() : info_;
      }
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.TableInfo info = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.edu.cug.cs.gtl.protos.TableInfo, cn.edu.cug.cs.gtl.protos.TableInfo.Builder, cn.edu.cug.cs.gtl.protos.TableInfoOrBuilder> 
        getInfoFieldBuilder() {
      if (infoBuilder_ == null) {
        infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cn.edu.cug.cs.gtl.protos.TableInfo, cn.edu.cug.cs.gtl.protos.TableInfo.Builder, cn.edu.cug.cs.gtl.protos.TableInfoOrBuilder>(
                getInfo(),
                getParentForChildren(),
                isClean());
        info_ = null;
      }
      return infoBuilder_;
    }

    private java.util.List<cn.edu.cug.cs.gtl.protos.Column> column_ =
      java.util.Collections.emptyList();
    private void ensureColumnIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        column_ = new java.util.ArrayList<cn.edu.cug.cs.gtl.protos.Column>(column_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cn.edu.cug.cs.gtl.protos.Column, cn.edu.cug.cs.gtl.protos.Column.Builder, cn.edu.cug.cs.gtl.protos.ColumnOrBuilder> columnBuilder_;

    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
     */
    public java.util.List<cn.edu.cug.cs.gtl.protos.Column> getColumnList() {
      if (columnBuilder_ == null) {
        return java.util.Collections.unmodifiableList(column_);
      } else {
        return columnBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
     */
    public int getColumnCount() {
      if (columnBuilder_ == null) {
        return column_.size();
      } else {
        return columnBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Column getColumn(int index) {
      if (columnBuilder_ == null) {
        return column_.get(index);
      } else {
        return columnBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
     */
    public Builder setColumn(
        int index, cn.edu.cug.cs.gtl.protos.Column value) {
      if (columnBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnIsMutable();
        column_.set(index, value);
        onChanged();
      } else {
        columnBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
     */
    public Builder setColumn(
        int index, cn.edu.cug.cs.gtl.protos.Column.Builder builderForValue) {
      if (columnBuilder_ == null) {
        ensureColumnIsMutable();
        column_.set(index, builderForValue.build());
        onChanged();
      } else {
        columnBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
     */
    public Builder addColumn(cn.edu.cug.cs.gtl.protos.Column value) {
      if (columnBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnIsMutable();
        column_.add(value);
        onChanged();
      } else {
        columnBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
     */
    public Builder addColumn(
        int index, cn.edu.cug.cs.gtl.protos.Column value) {
      if (columnBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnIsMutable();
        column_.add(index, value);
        onChanged();
      } else {
        columnBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
     */
    public Builder addColumn(
        cn.edu.cug.cs.gtl.protos.Column.Builder builderForValue) {
      if (columnBuilder_ == null) {
        ensureColumnIsMutable();
        column_.add(builderForValue.build());
        onChanged();
      } else {
        columnBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
     */
    public Builder addColumn(
        int index, cn.edu.cug.cs.gtl.protos.Column.Builder builderForValue) {
      if (columnBuilder_ == null) {
        ensureColumnIsMutable();
        column_.add(index, builderForValue.build());
        onChanged();
      } else {
        columnBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
     */
    public Builder addAllColumn(
        java.lang.Iterable<? extends cn.edu.cug.cs.gtl.protos.Column> values) {
      if (columnBuilder_ == null) {
        ensureColumnIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, column_);
        onChanged();
      } else {
        columnBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
     */
    public Builder clearColumn() {
      if (columnBuilder_ == null) {
        column_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        columnBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
     */
    public Builder removeColumn(int index) {
      if (columnBuilder_ == null) {
        ensureColumnIsMutable();
        column_.remove(index);
        onChanged();
      } else {
        columnBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Column.Builder getColumnBuilder(
        int index) {
      return getColumnFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
     */
    public cn.edu.cug.cs.gtl.protos.ColumnOrBuilder getColumnOrBuilder(
        int index) {
      if (columnBuilder_ == null) {
        return column_.get(index);  } else {
        return columnBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
     */
    public java.util.List<? extends cn.edu.cug.cs.gtl.protos.ColumnOrBuilder> 
         getColumnOrBuilderList() {
      if (columnBuilder_ != null) {
        return columnBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(column_);
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Column.Builder addColumnBuilder() {
      return getColumnFieldBuilder().addBuilder(
          cn.edu.cug.cs.gtl.protos.Column.getDefaultInstance());
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Column.Builder addColumnBuilder(
        int index) {
      return getColumnFieldBuilder().addBuilder(
          index, cn.edu.cug.cs.gtl.protos.Column.getDefaultInstance());
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Column column = 3;</code>
     */
    public java.util.List<cn.edu.cug.cs.gtl.protos.Column.Builder> 
         getColumnBuilderList() {
      return getColumnFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cn.edu.cug.cs.gtl.protos.Column, cn.edu.cug.cs.gtl.protos.Column.Builder, cn.edu.cug.cs.gtl.protos.ColumnOrBuilder> 
        getColumnFieldBuilder() {
      if (columnBuilder_ == null) {
        columnBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cn.edu.cug.cs.gtl.protos.Column, cn.edu.cug.cs.gtl.protos.Column.Builder, cn.edu.cug.cs.gtl.protos.ColumnOrBuilder>(
                column_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        column_ = null;
      }
      return columnBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cn.edu.cug.cs.gtl.protos.Table)
  }

  // @@protoc_insertion_point(class_scope:cn.edu.cug.cs.gtl.protos.Table)
  private static final cn.edu.cug.cs.gtl.protos.Table DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.edu.cug.cs.gtl.protos.Table();
  }

  public static cn.edu.cug.cs.gtl.protos.Table getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Table>
      PARSER = new com.google.protobuf.AbstractParser<Table>() {
    @java.lang.Override
    public Table parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Table(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Table> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Table> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cn.edu.cug.cs.gtl.protos.Table getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
