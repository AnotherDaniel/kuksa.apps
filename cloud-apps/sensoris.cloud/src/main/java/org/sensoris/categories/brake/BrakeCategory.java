// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/brake.proto

package org.sensoris.categories.brake;

/**
 * <pre>
 * Brake category.
 * </pre>
 *
 * Protobuf type {@code sensoris.protobuf.categories.brake.BrakeCategory}
 */
public  final class BrakeCategory extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensoris.protobuf.categories.brake.BrakeCategory)
    BrakeCategoryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BrakeCategory.newBuilder() to construct.
  private BrakeCategory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BrakeCategory() {
    brakeSystemsStatus_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BrakeCategory(
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
            org.sensoris.types.base.CategoryEnvelope.Builder subBuilder = null;
            if (envelope_ != null) {
              subBuilder = envelope_.toBuilder();
            }
            envelope_ = input.readMessage(org.sensoris.types.base.CategoryEnvelope.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(envelope_);
              envelope_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              brakeSystemsStatus_ = new java.util.ArrayList<org.sensoris.categories.brake.BrakeSystemsStatus>();
              mutable_bitField0_ |= 0x00000002;
            }
            brakeSystemsStatus_.add(
                input.readMessage(org.sensoris.categories.brake.BrakeSystemsStatus.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        brakeSystemsStatus_ = java.util.Collections.unmodifiableList(brakeSystemsStatus_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.sensoris.categories.brake.SensorisBrakeCategory.internal_static_sensoris_protobuf_categories_brake_BrakeCategory_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.sensoris.categories.brake.SensorisBrakeCategory.internal_static_sensoris_protobuf_categories_brake_BrakeCategory_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.sensoris.categories.brake.BrakeCategory.class, org.sensoris.categories.brake.BrakeCategory.Builder.class);
  }

  private int bitField0_;
  public static final int ENVELOPE_FIELD_NUMBER = 1;
  private org.sensoris.types.base.CategoryEnvelope envelope_;
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   */
  public boolean hasEnvelope() {
    return envelope_ != null;
  }
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   */
  public org.sensoris.types.base.CategoryEnvelope getEnvelope() {
    return envelope_ == null ? org.sensoris.types.base.CategoryEnvelope.getDefaultInstance() : envelope_;
  }
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   */
  public org.sensoris.types.base.CategoryEnvelopeOrBuilder getEnvelopeOrBuilder() {
    return getEnvelope();
  }

  public static final int BRAKE_SYSTEMS_STATUS_FIELD_NUMBER = 2;
  private java.util.List<org.sensoris.categories.brake.BrakeSystemsStatus> brakeSystemsStatus_;
  /**
   * <pre>
   * Status of brake systems.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
   */
  public java.util.List<org.sensoris.categories.brake.BrakeSystemsStatus> getBrakeSystemsStatusList() {
    return brakeSystemsStatus_;
  }
  /**
   * <pre>
   * Status of brake systems.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
   */
  public java.util.List<? extends org.sensoris.categories.brake.BrakeSystemsStatusOrBuilder> 
      getBrakeSystemsStatusOrBuilderList() {
    return brakeSystemsStatus_;
  }
  /**
   * <pre>
   * Status of brake systems.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
   */
  public int getBrakeSystemsStatusCount() {
    return brakeSystemsStatus_.size();
  }
  /**
   * <pre>
   * Status of brake systems.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
   */
  public org.sensoris.categories.brake.BrakeSystemsStatus getBrakeSystemsStatus(int index) {
    return brakeSystemsStatus_.get(index);
  }
  /**
   * <pre>
   * Status of brake systems.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
   */
  public org.sensoris.categories.brake.BrakeSystemsStatusOrBuilder getBrakeSystemsStatusOrBuilder(
      int index) {
    return brakeSystemsStatus_.get(index);
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
    if (envelope_ != null) {
      output.writeMessage(1, getEnvelope());
    }
    for (int i = 0; i < brakeSystemsStatus_.size(); i++) {
      output.writeMessage(2, brakeSystemsStatus_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (envelope_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEnvelope());
    }
    for (int i = 0; i < brakeSystemsStatus_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, brakeSystemsStatus_.get(i));
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
    if (!(obj instanceof org.sensoris.categories.brake.BrakeCategory)) {
      return super.equals(obj);
    }
    org.sensoris.categories.brake.BrakeCategory other = (org.sensoris.categories.brake.BrakeCategory) obj;

    boolean result = true;
    result = result && (hasEnvelope() == other.hasEnvelope());
    if (hasEnvelope()) {
      result = result && getEnvelope()
          .equals(other.getEnvelope());
    }
    result = result && getBrakeSystemsStatusList()
        .equals(other.getBrakeSystemsStatusList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasEnvelope()) {
      hash = (37 * hash) + ENVELOPE_FIELD_NUMBER;
      hash = (53 * hash) + getEnvelope().hashCode();
    }
    if (getBrakeSystemsStatusCount() > 0) {
      hash = (37 * hash) + BRAKE_SYSTEMS_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getBrakeSystemsStatusList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.sensoris.categories.brake.BrakeCategory parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.categories.brake.BrakeCategory parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.categories.brake.BrakeCategory parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.categories.brake.BrakeCategory parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.categories.brake.BrakeCategory parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.categories.brake.BrakeCategory parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.categories.brake.BrakeCategory parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.categories.brake.BrakeCategory parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.categories.brake.BrakeCategory parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.sensoris.categories.brake.BrakeCategory parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.categories.brake.BrakeCategory parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.categories.brake.BrakeCategory parseFrom(
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
  public static Builder newBuilder(org.sensoris.categories.brake.BrakeCategory prototype) {
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
   * <pre>
   * Brake category.
   * </pre>
   *
   * Protobuf type {@code sensoris.protobuf.categories.brake.BrakeCategory}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensoris.protobuf.categories.brake.BrakeCategory)
      org.sensoris.categories.brake.BrakeCategoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sensoris.categories.brake.SensorisBrakeCategory.internal_static_sensoris_protobuf_categories_brake_BrakeCategory_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sensoris.categories.brake.SensorisBrakeCategory.internal_static_sensoris_protobuf_categories_brake_BrakeCategory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sensoris.categories.brake.BrakeCategory.class, org.sensoris.categories.brake.BrakeCategory.Builder.class);
    }

    // Construct using org.sensoris.categories.brake.BrakeCategory.newBuilder()
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
        getBrakeSystemsStatusFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (envelopeBuilder_ == null) {
        envelope_ = null;
      } else {
        envelope_ = null;
        envelopeBuilder_ = null;
      }
      if (brakeSystemsStatusBuilder_ == null) {
        brakeSystemsStatus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        brakeSystemsStatusBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.sensoris.categories.brake.SensorisBrakeCategory.internal_static_sensoris_protobuf_categories_brake_BrakeCategory_descriptor;
    }

    @java.lang.Override
    public org.sensoris.categories.brake.BrakeCategory getDefaultInstanceForType() {
      return org.sensoris.categories.brake.BrakeCategory.getDefaultInstance();
    }

    @java.lang.Override
    public org.sensoris.categories.brake.BrakeCategory build() {
      org.sensoris.categories.brake.BrakeCategory result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.sensoris.categories.brake.BrakeCategory buildPartial() {
      org.sensoris.categories.brake.BrakeCategory result = new org.sensoris.categories.brake.BrakeCategory(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (envelopeBuilder_ == null) {
        result.envelope_ = envelope_;
      } else {
        result.envelope_ = envelopeBuilder_.build();
      }
      if (brakeSystemsStatusBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          brakeSystemsStatus_ = java.util.Collections.unmodifiableList(brakeSystemsStatus_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.brakeSystemsStatus_ = brakeSystemsStatus_;
      } else {
        result.brakeSystemsStatus_ = brakeSystemsStatusBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.sensoris.categories.brake.BrakeCategory) {
        return mergeFrom((org.sensoris.categories.brake.BrakeCategory)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.sensoris.categories.brake.BrakeCategory other) {
      if (other == org.sensoris.categories.brake.BrakeCategory.getDefaultInstance()) return this;
      if (other.hasEnvelope()) {
        mergeEnvelope(other.getEnvelope());
      }
      if (brakeSystemsStatusBuilder_ == null) {
        if (!other.brakeSystemsStatus_.isEmpty()) {
          if (brakeSystemsStatus_.isEmpty()) {
            brakeSystemsStatus_ = other.brakeSystemsStatus_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureBrakeSystemsStatusIsMutable();
            brakeSystemsStatus_.addAll(other.brakeSystemsStatus_);
          }
          onChanged();
        }
      } else {
        if (!other.brakeSystemsStatus_.isEmpty()) {
          if (brakeSystemsStatusBuilder_.isEmpty()) {
            brakeSystemsStatusBuilder_.dispose();
            brakeSystemsStatusBuilder_ = null;
            brakeSystemsStatus_ = other.brakeSystemsStatus_;
            bitField0_ = (bitField0_ & ~0x00000002);
            brakeSystemsStatusBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBrakeSystemsStatusFieldBuilder() : null;
          } else {
            brakeSystemsStatusBuilder_.addAllMessages(other.brakeSystemsStatus_);
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
      org.sensoris.categories.brake.BrakeCategory parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.sensoris.categories.brake.BrakeCategory) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.sensoris.types.base.CategoryEnvelope envelope_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.CategoryEnvelope, org.sensoris.types.base.CategoryEnvelope.Builder, org.sensoris.types.base.CategoryEnvelopeOrBuilder> envelopeBuilder_;
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public boolean hasEnvelope() {
      return envelopeBuilder_ != null || envelope_ != null;
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public org.sensoris.types.base.CategoryEnvelope getEnvelope() {
      if (envelopeBuilder_ == null) {
        return envelope_ == null ? org.sensoris.types.base.CategoryEnvelope.getDefaultInstance() : envelope_;
      } else {
        return envelopeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public Builder setEnvelope(org.sensoris.types.base.CategoryEnvelope value) {
      if (envelopeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        envelope_ = value;
        onChanged();
      } else {
        envelopeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public Builder setEnvelope(
        org.sensoris.types.base.CategoryEnvelope.Builder builderForValue) {
      if (envelopeBuilder_ == null) {
        envelope_ = builderForValue.build();
        onChanged();
      } else {
        envelopeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public Builder mergeEnvelope(org.sensoris.types.base.CategoryEnvelope value) {
      if (envelopeBuilder_ == null) {
        if (envelope_ != null) {
          envelope_ =
            org.sensoris.types.base.CategoryEnvelope.newBuilder(envelope_).mergeFrom(value).buildPartial();
        } else {
          envelope_ = value;
        }
        onChanged();
      } else {
        envelopeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public Builder clearEnvelope() {
      if (envelopeBuilder_ == null) {
        envelope_ = null;
        onChanged();
      } else {
        envelope_ = null;
        envelopeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public org.sensoris.types.base.CategoryEnvelope.Builder getEnvelopeBuilder() {
      
      onChanged();
      return getEnvelopeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    public org.sensoris.types.base.CategoryEnvelopeOrBuilder getEnvelopeOrBuilder() {
      if (envelopeBuilder_ != null) {
        return envelopeBuilder_.getMessageOrBuilder();
      } else {
        return envelope_ == null ?
            org.sensoris.types.base.CategoryEnvelope.getDefaultInstance() : envelope_;
      }
    }
    /**
     * <pre>
     * Envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.CategoryEnvelope, org.sensoris.types.base.CategoryEnvelope.Builder, org.sensoris.types.base.CategoryEnvelopeOrBuilder> 
        getEnvelopeFieldBuilder() {
      if (envelopeBuilder_ == null) {
        envelopeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.sensoris.types.base.CategoryEnvelope, org.sensoris.types.base.CategoryEnvelope.Builder, org.sensoris.types.base.CategoryEnvelopeOrBuilder>(
                getEnvelope(),
                getParentForChildren(),
                isClean());
        envelope_ = null;
      }
      return envelopeBuilder_;
    }

    private java.util.List<org.sensoris.categories.brake.BrakeSystemsStatus> brakeSystemsStatus_ =
      java.util.Collections.emptyList();
    private void ensureBrakeSystemsStatusIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        brakeSystemsStatus_ = new java.util.ArrayList<org.sensoris.categories.brake.BrakeSystemsStatus>(brakeSystemsStatus_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.sensoris.categories.brake.BrakeSystemsStatus, org.sensoris.categories.brake.BrakeSystemsStatus.Builder, org.sensoris.categories.brake.BrakeSystemsStatusOrBuilder> brakeSystemsStatusBuilder_;

    /**
     * <pre>
     * Status of brake systems.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
     */
    public java.util.List<org.sensoris.categories.brake.BrakeSystemsStatus> getBrakeSystemsStatusList() {
      if (brakeSystemsStatusBuilder_ == null) {
        return java.util.Collections.unmodifiableList(brakeSystemsStatus_);
      } else {
        return brakeSystemsStatusBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Status of brake systems.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
     */
    public int getBrakeSystemsStatusCount() {
      if (brakeSystemsStatusBuilder_ == null) {
        return brakeSystemsStatus_.size();
      } else {
        return brakeSystemsStatusBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Status of brake systems.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
     */
    public org.sensoris.categories.brake.BrakeSystemsStatus getBrakeSystemsStatus(int index) {
      if (brakeSystemsStatusBuilder_ == null) {
        return brakeSystemsStatus_.get(index);
      } else {
        return brakeSystemsStatusBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Status of brake systems.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
     */
    public Builder setBrakeSystemsStatus(
        int index, org.sensoris.categories.brake.BrakeSystemsStatus value) {
      if (brakeSystemsStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBrakeSystemsStatusIsMutable();
        brakeSystemsStatus_.set(index, value);
        onChanged();
      } else {
        brakeSystemsStatusBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Status of brake systems.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
     */
    public Builder setBrakeSystemsStatus(
        int index, org.sensoris.categories.brake.BrakeSystemsStatus.Builder builderForValue) {
      if (brakeSystemsStatusBuilder_ == null) {
        ensureBrakeSystemsStatusIsMutable();
        brakeSystemsStatus_.set(index, builderForValue.build());
        onChanged();
      } else {
        brakeSystemsStatusBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Status of brake systems.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
     */
    public Builder addBrakeSystemsStatus(org.sensoris.categories.brake.BrakeSystemsStatus value) {
      if (brakeSystemsStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBrakeSystemsStatusIsMutable();
        brakeSystemsStatus_.add(value);
        onChanged();
      } else {
        brakeSystemsStatusBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Status of brake systems.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
     */
    public Builder addBrakeSystemsStatus(
        int index, org.sensoris.categories.brake.BrakeSystemsStatus value) {
      if (brakeSystemsStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBrakeSystemsStatusIsMutable();
        brakeSystemsStatus_.add(index, value);
        onChanged();
      } else {
        brakeSystemsStatusBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Status of brake systems.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
     */
    public Builder addBrakeSystemsStatus(
        org.sensoris.categories.brake.BrakeSystemsStatus.Builder builderForValue) {
      if (brakeSystemsStatusBuilder_ == null) {
        ensureBrakeSystemsStatusIsMutable();
        brakeSystemsStatus_.add(builderForValue.build());
        onChanged();
      } else {
        brakeSystemsStatusBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Status of brake systems.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
     */
    public Builder addBrakeSystemsStatus(
        int index, org.sensoris.categories.brake.BrakeSystemsStatus.Builder builderForValue) {
      if (brakeSystemsStatusBuilder_ == null) {
        ensureBrakeSystemsStatusIsMutable();
        brakeSystemsStatus_.add(index, builderForValue.build());
        onChanged();
      } else {
        brakeSystemsStatusBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Status of brake systems.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
     */
    public Builder addAllBrakeSystemsStatus(
        java.lang.Iterable<? extends org.sensoris.categories.brake.BrakeSystemsStatus> values) {
      if (brakeSystemsStatusBuilder_ == null) {
        ensureBrakeSystemsStatusIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, brakeSystemsStatus_);
        onChanged();
      } else {
        brakeSystemsStatusBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Status of brake systems.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
     */
    public Builder clearBrakeSystemsStatus() {
      if (brakeSystemsStatusBuilder_ == null) {
        brakeSystemsStatus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        brakeSystemsStatusBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Status of brake systems.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
     */
    public Builder removeBrakeSystemsStatus(int index) {
      if (brakeSystemsStatusBuilder_ == null) {
        ensureBrakeSystemsStatusIsMutable();
        brakeSystemsStatus_.remove(index);
        onChanged();
      } else {
        brakeSystemsStatusBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Status of brake systems.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
     */
    public org.sensoris.categories.brake.BrakeSystemsStatus.Builder getBrakeSystemsStatusBuilder(
        int index) {
      return getBrakeSystemsStatusFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Status of brake systems.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
     */
    public org.sensoris.categories.brake.BrakeSystemsStatusOrBuilder getBrakeSystemsStatusOrBuilder(
        int index) {
      if (brakeSystemsStatusBuilder_ == null) {
        return brakeSystemsStatus_.get(index);  } else {
        return brakeSystemsStatusBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Status of brake systems.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
     */
    public java.util.List<? extends org.sensoris.categories.brake.BrakeSystemsStatusOrBuilder> 
         getBrakeSystemsStatusOrBuilderList() {
      if (brakeSystemsStatusBuilder_ != null) {
        return brakeSystemsStatusBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(brakeSystemsStatus_);
      }
    }
    /**
     * <pre>
     * Status of brake systems.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
     */
    public org.sensoris.categories.brake.BrakeSystemsStatus.Builder addBrakeSystemsStatusBuilder() {
      return getBrakeSystemsStatusFieldBuilder().addBuilder(
          org.sensoris.categories.brake.BrakeSystemsStatus.getDefaultInstance());
    }
    /**
     * <pre>
     * Status of brake systems.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
     */
    public org.sensoris.categories.brake.BrakeSystemsStatus.Builder addBrakeSystemsStatusBuilder(
        int index) {
      return getBrakeSystemsStatusFieldBuilder().addBuilder(
          index, org.sensoris.categories.brake.BrakeSystemsStatus.getDefaultInstance());
    }
    /**
     * <pre>
     * Status of brake systems.
     * </pre>
     *
     * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
     */
    public java.util.List<org.sensoris.categories.brake.BrakeSystemsStatus.Builder> 
         getBrakeSystemsStatusBuilderList() {
      return getBrakeSystemsStatusFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.sensoris.categories.brake.BrakeSystemsStatus, org.sensoris.categories.brake.BrakeSystemsStatus.Builder, org.sensoris.categories.brake.BrakeSystemsStatusOrBuilder> 
        getBrakeSystemsStatusFieldBuilder() {
      if (brakeSystemsStatusBuilder_ == null) {
        brakeSystemsStatusBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.sensoris.categories.brake.BrakeSystemsStatus, org.sensoris.categories.brake.BrakeSystemsStatus.Builder, org.sensoris.categories.brake.BrakeSystemsStatusOrBuilder>(
                brakeSystemsStatus_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        brakeSystemsStatus_ = null;
      }
      return brakeSystemsStatusBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sensoris.protobuf.categories.brake.BrakeCategory)
  }

  // @@protoc_insertion_point(class_scope:sensoris.protobuf.categories.brake.BrakeCategory)
  private static final org.sensoris.categories.brake.BrakeCategory DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.sensoris.categories.brake.BrakeCategory();
  }

  public static org.sensoris.categories.brake.BrakeCategory getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BrakeCategory>
      PARSER = new com.google.protobuf.AbstractParser<BrakeCategory>() {
    @java.lang.Override
    public BrakeCategory parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BrakeCategory(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BrakeCategory> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BrakeCategory> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.sensoris.categories.brake.BrakeCategory getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

