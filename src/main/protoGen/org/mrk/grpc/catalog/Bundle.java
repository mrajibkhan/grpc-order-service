// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog.proto

package org.mrk.grpc.catalog;

/**
 * Protobuf type {@code Bundle}
 */
public  final class Bundle extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Bundle)
    BundleOrBuilder {
  // Use Bundle.newBuilder() to construct.
  private Bundle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Bundle() {
    quantity_ = 0L;
    price_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Bundle(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            quantity_ = input.readInt64();
            break;
          }
          case 21: {

            price_ = input.readFloat();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mrk.grpc.catalog.CatalogProto.internal_static_Bundle_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mrk.grpc.catalog.CatalogProto.internal_static_Bundle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mrk.grpc.catalog.Bundle.class, org.mrk.grpc.catalog.Bundle.Builder.class);
  }

  public static final int QUANTITY_FIELD_NUMBER = 1;
  private long quantity_;
  /**
   * <code>optional int64 quantity = 1;</code>
   */
  public long getQuantity() {
    return quantity_;
  }

  public static final int PRICE_FIELD_NUMBER = 2;
  private float price_;
  /**
   * <code>optional float price = 2;</code>
   */
  public float getPrice() {
    return price_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (quantity_ != 0L) {
      output.writeInt64(1, quantity_);
    }
    if (price_ != 0F) {
      output.writeFloat(2, price_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (quantity_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, quantity_);
    }
    if (price_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, price_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.mrk.grpc.catalog.Bundle)) {
      return super.equals(obj);
    }
    org.mrk.grpc.catalog.Bundle other = (org.mrk.grpc.catalog.Bundle) obj;

    boolean result = true;
    result = result && (getQuantity()
        == other.getQuantity());
    result = result && (
        java.lang.Float.floatToIntBits(getPrice())
        == java.lang.Float.floatToIntBits(
            other.getPrice()));
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getQuantity());
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getPrice());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mrk.grpc.catalog.Bundle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mrk.grpc.catalog.Bundle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mrk.grpc.catalog.Bundle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mrk.grpc.catalog.Bundle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mrk.grpc.catalog.Bundle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mrk.grpc.catalog.Bundle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mrk.grpc.catalog.Bundle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mrk.grpc.catalog.Bundle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mrk.grpc.catalog.Bundle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mrk.grpc.catalog.Bundle parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.mrk.grpc.catalog.Bundle prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code Bundle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Bundle)
      org.mrk.grpc.catalog.BundleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mrk.grpc.catalog.CatalogProto.internal_static_Bundle_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mrk.grpc.catalog.CatalogProto.internal_static_Bundle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mrk.grpc.catalog.Bundle.class, org.mrk.grpc.catalog.Bundle.Builder.class);
    }

    // Construct using org.mrk.grpc.catalog.Bundle.newBuilder()
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
    public Builder clear() {
      super.clear();
      quantity_ = 0L;

      price_ = 0F;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mrk.grpc.catalog.CatalogProto.internal_static_Bundle_descriptor;
    }

    public org.mrk.grpc.catalog.Bundle getDefaultInstanceForType() {
      return org.mrk.grpc.catalog.Bundle.getDefaultInstance();
    }

    public org.mrk.grpc.catalog.Bundle build() {
      org.mrk.grpc.catalog.Bundle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.mrk.grpc.catalog.Bundle buildPartial() {
      org.mrk.grpc.catalog.Bundle result = new org.mrk.grpc.catalog.Bundle(this);
      result.quantity_ = quantity_;
      result.price_ = price_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.mrk.grpc.catalog.Bundle) {
        return mergeFrom((org.mrk.grpc.catalog.Bundle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mrk.grpc.catalog.Bundle other) {
      if (other == org.mrk.grpc.catalog.Bundle.getDefaultInstance()) return this;
      if (other.getQuantity() != 0L) {
        setQuantity(other.getQuantity());
      }
      if (other.getPrice() != 0F) {
        setPrice(other.getPrice());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.mrk.grpc.catalog.Bundle parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mrk.grpc.catalog.Bundle) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long quantity_ ;
    /**
     * <code>optional int64 quantity = 1;</code>
     */
    public long getQuantity() {
      return quantity_;
    }
    /**
     * <code>optional int64 quantity = 1;</code>
     */
    public Builder setQuantity(long value) {
      
      quantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 quantity = 1;</code>
     */
    public Builder clearQuantity() {
      
      quantity_ = 0L;
      onChanged();
      return this;
    }

    private float price_ ;
    /**
     * <code>optional float price = 2;</code>
     */
    public float getPrice() {
      return price_;
    }
    /**
     * <code>optional float price = 2;</code>
     */
    public Builder setPrice(float value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional float price = 2;</code>
     */
    public Builder clearPrice() {
      
      price_ = 0F;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Bundle)
  }

  // @@protoc_insertion_point(class_scope:Bundle)
  private static final org.mrk.grpc.catalog.Bundle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mrk.grpc.catalog.Bundle();
  }

  public static org.mrk.grpc.catalog.Bundle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Bundle>
      PARSER = new com.google.protobuf.AbstractParser<Bundle>() {
    public Bundle parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Bundle(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Bundle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Bundle> getParserForType() {
    return PARSER;
  }

  public org.mrk.grpc.catalog.Bundle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
