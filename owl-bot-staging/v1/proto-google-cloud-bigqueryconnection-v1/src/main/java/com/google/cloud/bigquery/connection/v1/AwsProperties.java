// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/connection/v1/connection.proto

package com.google.cloud.bigquery.connection.v1;

/**
 * <pre>
 * Connection properties specific to Amazon Web Services (AWS).
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.connection.v1.AwsProperties}
 */
public final class AwsProperties extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.connection.v1.AwsProperties)
    AwsPropertiesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AwsProperties.newBuilder() to construct.
  private AwsProperties(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AwsProperties() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AwsProperties();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass.internal_static_google_cloud_bigquery_connection_v1_AwsProperties_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass.internal_static_google_cloud_bigquery_connection_v1_AwsProperties_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.connection.v1.AwsProperties.class, com.google.cloud.bigquery.connection.v1.AwsProperties.Builder.class);
  }

  private int authenticationMethodCase_ = 0;
  private java.lang.Object authenticationMethod_;
  public enum AuthenticationMethodCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    @java.lang.Deprecated CROSS_ACCOUNT_ROLE(2),
    ACCESS_ROLE(3),
    AUTHENTICATIONMETHOD_NOT_SET(0);
    private final int value;
    private AuthenticationMethodCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AuthenticationMethodCase valueOf(int value) {
      return forNumber(value);
    }

    public static AuthenticationMethodCase forNumber(int value) {
      switch (value) {
        case 2: return CROSS_ACCOUNT_ROLE;
        case 3: return ACCESS_ROLE;
        case 0: return AUTHENTICATIONMETHOD_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public AuthenticationMethodCase
  getAuthenticationMethodCase() {
    return AuthenticationMethodCase.forNumber(
        authenticationMethodCase_);
  }

  public static final int CROSS_ACCOUNT_ROLE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Authentication using Google owned AWS IAM user's access key to assume
   * into customer's AWS IAM Role.
   * Deprecated, do not use.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.AwsCrossAccountRole cross_account_role = 2 [deprecated = true];</code>
   * @deprecated google.cloud.bigquery.connection.v1.AwsProperties.cross_account_role is deprecated.
   *     See google/cloud/bigquery/connection/v1/connection.proto;l=314
   * @return Whether the crossAccountRole field is set.
   */
  @java.lang.Override
  @java.lang.Deprecated public boolean hasCrossAccountRole() {
    return authenticationMethodCase_ == 2;
  }
  /**
   * <pre>
   * Authentication using Google owned AWS IAM user's access key to assume
   * into customer's AWS IAM Role.
   * Deprecated, do not use.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.AwsCrossAccountRole cross_account_role = 2 [deprecated = true];</code>
   * @deprecated google.cloud.bigquery.connection.v1.AwsProperties.cross_account_role is deprecated.
   *     See google/cloud/bigquery/connection/v1/connection.proto;l=314
   * @return The crossAccountRole.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole getCrossAccountRole() {
    if (authenticationMethodCase_ == 2) {
       return (com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole) authenticationMethod_;
    }
    return com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.getDefaultInstance();
  }
  /**
   * <pre>
   * Authentication using Google owned AWS IAM user's access key to assume
   * into customer's AWS IAM Role.
   * Deprecated, do not use.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.AwsCrossAccountRole cross_account_role = 2 [deprecated = true];</code>
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.cloud.bigquery.connection.v1.AwsCrossAccountRoleOrBuilder getCrossAccountRoleOrBuilder() {
    if (authenticationMethodCase_ == 2) {
       return (com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole) authenticationMethod_;
    }
    return com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.getDefaultInstance();
  }

  public static final int ACCESS_ROLE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Authentication using Google owned service account to assume into
   * customer's AWS IAM Role.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.AwsAccessRole access_role = 3;</code>
   * @return Whether the accessRole field is set.
   */
  @java.lang.Override
  public boolean hasAccessRole() {
    return authenticationMethodCase_ == 3;
  }
  /**
   * <pre>
   * Authentication using Google owned service account to assume into
   * customer's AWS IAM Role.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.AwsAccessRole access_role = 3;</code>
   * @return The accessRole.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.connection.v1.AwsAccessRole getAccessRole() {
    if (authenticationMethodCase_ == 3) {
       return (com.google.cloud.bigquery.connection.v1.AwsAccessRole) authenticationMethod_;
    }
    return com.google.cloud.bigquery.connection.v1.AwsAccessRole.getDefaultInstance();
  }
  /**
   * <pre>
   * Authentication using Google owned service account to assume into
   * customer's AWS IAM Role.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.AwsAccessRole access_role = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.connection.v1.AwsAccessRoleOrBuilder getAccessRoleOrBuilder() {
    if (authenticationMethodCase_ == 3) {
       return (com.google.cloud.bigquery.connection.v1.AwsAccessRole) authenticationMethod_;
    }
    return com.google.cloud.bigquery.connection.v1.AwsAccessRole.getDefaultInstance();
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
    if (authenticationMethodCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole) authenticationMethod_);
    }
    if (authenticationMethodCase_ == 3) {
      output.writeMessage(3, (com.google.cloud.bigquery.connection.v1.AwsAccessRole) authenticationMethod_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (authenticationMethodCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole) authenticationMethod_);
    }
    if (authenticationMethodCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.google.cloud.bigquery.connection.v1.AwsAccessRole) authenticationMethod_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.bigquery.connection.v1.AwsProperties)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.connection.v1.AwsProperties other = (com.google.cloud.bigquery.connection.v1.AwsProperties) obj;

    if (!getAuthenticationMethodCase().equals(other.getAuthenticationMethodCase())) return false;
    switch (authenticationMethodCase_) {
      case 2:
        if (!getCrossAccountRole()
            .equals(other.getCrossAccountRole())) return false;
        break;
      case 3:
        if (!getAccessRole()
            .equals(other.getAccessRole())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (authenticationMethodCase_) {
      case 2:
        hash = (37 * hash) + CROSS_ACCOUNT_ROLE_FIELD_NUMBER;
        hash = (53 * hash) + getCrossAccountRole().hashCode();
        break;
      case 3:
        hash = (37 * hash) + ACCESS_ROLE_FIELD_NUMBER;
        hash = (53 * hash) + getAccessRole().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.connection.v1.AwsProperties parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsProperties parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsProperties parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsProperties parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsProperties parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsProperties parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsProperties parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsProperties parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsProperties parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsProperties parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsProperties parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.connection.v1.AwsProperties parseFrom(
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
  public static Builder newBuilder(com.google.cloud.bigquery.connection.v1.AwsProperties prototype) {
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
   * Connection properties specific to Amazon Web Services (AWS).
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.connection.v1.AwsProperties}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.connection.v1.AwsProperties)
      com.google.cloud.bigquery.connection.v1.AwsPropertiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass.internal_static_google_cloud_bigquery_connection_v1_AwsProperties_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass.internal_static_google_cloud_bigquery_connection_v1_AwsProperties_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.connection.v1.AwsProperties.class, com.google.cloud.bigquery.connection.v1.AwsProperties.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.connection.v1.AwsProperties.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (crossAccountRoleBuilder_ != null) {
        crossAccountRoleBuilder_.clear();
      }
      if (accessRoleBuilder_ != null) {
        accessRoleBuilder_.clear();
      }
      authenticationMethodCase_ = 0;
      authenticationMethod_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass.internal_static_google_cloud_bigquery_connection_v1_AwsProperties_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.AwsProperties getDefaultInstanceForType() {
      return com.google.cloud.bigquery.connection.v1.AwsProperties.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.AwsProperties build() {
      com.google.cloud.bigquery.connection.v1.AwsProperties result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.AwsProperties buildPartial() {
      com.google.cloud.bigquery.connection.v1.AwsProperties result = new com.google.cloud.bigquery.connection.v1.AwsProperties(this);
      if (authenticationMethodCase_ == 2) {
        if (crossAccountRoleBuilder_ == null) {
          result.authenticationMethod_ = authenticationMethod_;
        } else {
          result.authenticationMethod_ = crossAccountRoleBuilder_.build();
        }
      }
      if (authenticationMethodCase_ == 3) {
        if (accessRoleBuilder_ == null) {
          result.authenticationMethod_ = authenticationMethod_;
        } else {
          result.authenticationMethod_ = accessRoleBuilder_.build();
        }
      }
      result.authenticationMethodCase_ = authenticationMethodCase_;
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
      if (other instanceof com.google.cloud.bigquery.connection.v1.AwsProperties) {
        return mergeFrom((com.google.cloud.bigquery.connection.v1.AwsProperties)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.connection.v1.AwsProperties other) {
      if (other == com.google.cloud.bigquery.connection.v1.AwsProperties.getDefaultInstance()) return this;
      switch (other.getAuthenticationMethodCase()) {
        case CROSS_ACCOUNT_ROLE: {
          mergeCrossAccountRole(other.getCrossAccountRole());
          break;
        }
        case ACCESS_ROLE: {
          mergeAccessRole(other.getAccessRole());
          break;
        }
        case AUTHENTICATIONMETHOD_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 18: {
              input.readMessage(
                  getCrossAccountRoleFieldBuilder().getBuilder(),
                  extensionRegistry);
              authenticationMethodCase_ = 2;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getAccessRoleFieldBuilder().getBuilder(),
                  extensionRegistry);
              authenticationMethodCase_ = 3;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int authenticationMethodCase_ = 0;
    private java.lang.Object authenticationMethod_;
    public AuthenticationMethodCase
        getAuthenticationMethodCase() {
      return AuthenticationMethodCase.forNumber(
          authenticationMethodCase_);
    }

    public Builder clearAuthenticationMethod() {
      authenticationMethodCase_ = 0;
      authenticationMethod_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole, com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.Builder, com.google.cloud.bigquery.connection.v1.AwsCrossAccountRoleOrBuilder> crossAccountRoleBuilder_;
    /**
     * <pre>
     * Authentication using Google owned AWS IAM user's access key to assume
     * into customer's AWS IAM Role.
     * Deprecated, do not use.
     * </pre>
     *
     * <code>.google.cloud.bigquery.connection.v1.AwsCrossAccountRole cross_account_role = 2 [deprecated = true];</code>
     * @deprecated google.cloud.bigquery.connection.v1.AwsProperties.cross_account_role is deprecated.
     *     See google/cloud/bigquery/connection/v1/connection.proto;l=314
     * @return Whether the crossAccountRole field is set.
     */
    @java.lang.Override
    @java.lang.Deprecated public boolean hasCrossAccountRole() {
      return authenticationMethodCase_ == 2;
    }
    /**
     * <pre>
     * Authentication using Google owned AWS IAM user's access key to assume
     * into customer's AWS IAM Role.
     * Deprecated, do not use.
     * </pre>
     *
     * <code>.google.cloud.bigquery.connection.v1.AwsCrossAccountRole cross_account_role = 2 [deprecated = true];</code>
     * @deprecated google.cloud.bigquery.connection.v1.AwsProperties.cross_account_role is deprecated.
     *     See google/cloud/bigquery/connection/v1/connection.proto;l=314
     * @return The crossAccountRole.
     */
    @java.lang.Override
    @java.lang.Deprecated public com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole getCrossAccountRole() {
      if (crossAccountRoleBuilder_ == null) {
        if (authenticationMethodCase_ == 2) {
          return (com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole) authenticationMethod_;
        }
        return com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.getDefaultInstance();
      } else {
        if (authenticationMethodCase_ == 2) {
          return crossAccountRoleBuilder_.getMessage();
        }
        return com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Authentication using Google owned AWS IAM user's access key to assume
     * into customer's AWS IAM Role.
     * Deprecated, do not use.
     * </pre>
     *
     * <code>.google.cloud.bigquery.connection.v1.AwsCrossAccountRole cross_account_role = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder setCrossAccountRole(com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole value) {
      if (crossAccountRoleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        authenticationMethod_ = value;
        onChanged();
      } else {
        crossAccountRoleBuilder_.setMessage(value);
      }
      authenticationMethodCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Authentication using Google owned AWS IAM user's access key to assume
     * into customer's AWS IAM Role.
     * Deprecated, do not use.
     * </pre>
     *
     * <code>.google.cloud.bigquery.connection.v1.AwsCrossAccountRole cross_account_role = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder setCrossAccountRole(
        com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.Builder builderForValue) {
      if (crossAccountRoleBuilder_ == null) {
        authenticationMethod_ = builderForValue.build();
        onChanged();
      } else {
        crossAccountRoleBuilder_.setMessage(builderForValue.build());
      }
      authenticationMethodCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Authentication using Google owned AWS IAM user's access key to assume
     * into customer's AWS IAM Role.
     * Deprecated, do not use.
     * </pre>
     *
     * <code>.google.cloud.bigquery.connection.v1.AwsCrossAccountRole cross_account_role = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder mergeCrossAccountRole(com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole value) {
      if (crossAccountRoleBuilder_ == null) {
        if (authenticationMethodCase_ == 2 &&
            authenticationMethod_ != com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.getDefaultInstance()) {
          authenticationMethod_ = com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.newBuilder((com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole) authenticationMethod_)
              .mergeFrom(value).buildPartial();
        } else {
          authenticationMethod_ = value;
        }
        onChanged();
      } else {
        if (authenticationMethodCase_ == 2) {
          crossAccountRoleBuilder_.mergeFrom(value);
        } else {
          crossAccountRoleBuilder_.setMessage(value);
        }
      }
      authenticationMethodCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Authentication using Google owned AWS IAM user's access key to assume
     * into customer's AWS IAM Role.
     * Deprecated, do not use.
     * </pre>
     *
     * <code>.google.cloud.bigquery.connection.v1.AwsCrossAccountRole cross_account_role = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder clearCrossAccountRole() {
      if (crossAccountRoleBuilder_ == null) {
        if (authenticationMethodCase_ == 2) {
          authenticationMethodCase_ = 0;
          authenticationMethod_ = null;
          onChanged();
        }
      } else {
        if (authenticationMethodCase_ == 2) {
          authenticationMethodCase_ = 0;
          authenticationMethod_ = null;
        }
        crossAccountRoleBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Authentication using Google owned AWS IAM user's access key to assume
     * into customer's AWS IAM Role.
     * Deprecated, do not use.
     * </pre>
     *
     * <code>.google.cloud.bigquery.connection.v1.AwsCrossAccountRole cross_account_role = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.Builder getCrossAccountRoleBuilder() {
      return getCrossAccountRoleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Authentication using Google owned AWS IAM user's access key to assume
     * into customer's AWS IAM Role.
     * Deprecated, do not use.
     * </pre>
     *
     * <code>.google.cloud.bigquery.connection.v1.AwsCrossAccountRole cross_account_role = 2 [deprecated = true];</code>
     */
    @java.lang.Override
    @java.lang.Deprecated public com.google.cloud.bigquery.connection.v1.AwsCrossAccountRoleOrBuilder getCrossAccountRoleOrBuilder() {
      if ((authenticationMethodCase_ == 2) && (crossAccountRoleBuilder_ != null)) {
        return crossAccountRoleBuilder_.getMessageOrBuilder();
      } else {
        if (authenticationMethodCase_ == 2) {
          return (com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole) authenticationMethod_;
        }
        return com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Authentication using Google owned AWS IAM user's access key to assume
     * into customer's AWS IAM Role.
     * Deprecated, do not use.
     * </pre>
     *
     * <code>.google.cloud.bigquery.connection.v1.AwsCrossAccountRole cross_account_role = 2 [deprecated = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole, com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.Builder, com.google.cloud.bigquery.connection.v1.AwsCrossAccountRoleOrBuilder> 
        getCrossAccountRoleFieldBuilder() {
      if (crossAccountRoleBuilder_ == null) {
        if (!(authenticationMethodCase_ == 2)) {
          authenticationMethod_ = com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.getDefaultInstance();
        }
        crossAccountRoleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole, com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole.Builder, com.google.cloud.bigquery.connection.v1.AwsCrossAccountRoleOrBuilder>(
                (com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole) authenticationMethod_,
                getParentForChildren(),
                isClean());
        authenticationMethod_ = null;
      }
      authenticationMethodCase_ = 2;
      onChanged();;
      return crossAccountRoleBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.connection.v1.AwsAccessRole, com.google.cloud.bigquery.connection.v1.AwsAccessRole.Builder, com.google.cloud.bigquery.connection.v1.AwsAccessRoleOrBuilder> accessRoleBuilder_;
    /**
     * <pre>
     * Authentication using Google owned service account to assume into
     * customer's AWS IAM Role.
     * </pre>
     *
     * <code>.google.cloud.bigquery.connection.v1.AwsAccessRole access_role = 3;</code>
     * @return Whether the accessRole field is set.
     */
    @java.lang.Override
    public boolean hasAccessRole() {
      return authenticationMethodCase_ == 3;
    }
    /**
     * <pre>
     * Authentication using Google owned service account to assume into
     * customer's AWS IAM Role.
     * </pre>
     *
     * <code>.google.cloud.bigquery.connection.v1.AwsAccessRole access_role = 3;</code>
     * @return The accessRole.
     */
    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.AwsAccessRole getAccessRole() {
      if (accessRoleBuilder_ == null) {
        if (authenticationMethodCase_ == 3) {
          return (com.google.cloud.bigquery.connection.v1.AwsAccessRole) authenticationMethod_;
        }
        return com.google.cloud.bigquery.connection.v1.AwsAccessRole.getDefaultInstance();
      } else {
        if (authenticationMethodCase_ == 3) {
          return accessRoleBuilder_.getMessage();
        }
        return com.google.cloud.bigquery.connection.v1.AwsAccessRole.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Authentication using Google owned service account to assume into
     * customer's AWS IAM Role.
     * </pre>
     *
     * <code>.google.cloud.bigquery.connection.v1.AwsAccessRole access_role = 3;</code>
     */
    public Builder setAccessRole(com.google.cloud.bigquery.connection.v1.AwsAccessRole value) {
      if (accessRoleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        authenticationMethod_ = value;
        onChanged();
      } else {
        accessRoleBuilder_.setMessage(value);
      }
      authenticationMethodCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Authentication using Google owned service account to assume into
     * customer's AWS IAM Role.
     * </pre>
     *
     * <code>.google.cloud.bigquery.connection.v1.AwsAccessRole access_role = 3;</code>
     */
    public Builder setAccessRole(
        com.google.cloud.bigquery.connection.v1.AwsAccessRole.Builder builderForValue) {
      if (accessRoleBuilder_ == null) {
        authenticationMethod_ = builderForValue.build();
        onChanged();
      } else {
        accessRoleBuilder_.setMessage(builderForValue.build());
      }
      authenticationMethodCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Authentication using Google owned service account to assume into
     * customer's AWS IAM Role.
     * </pre>
     *
     * <code>.google.cloud.bigquery.connection.v1.AwsAccessRole access_role = 3;</code>
     */
    public Builder mergeAccessRole(com.google.cloud.bigquery.connection.v1.AwsAccessRole value) {
      if (accessRoleBuilder_ == null) {
        if (authenticationMethodCase_ == 3 &&
            authenticationMethod_ != com.google.cloud.bigquery.connection.v1.AwsAccessRole.getDefaultInstance()) {
          authenticationMethod_ = com.google.cloud.bigquery.connection.v1.AwsAccessRole.newBuilder((com.google.cloud.bigquery.connection.v1.AwsAccessRole) authenticationMethod_)
              .mergeFrom(value).buildPartial();
        } else {
          authenticationMethod_ = value;
        }
        onChanged();
      } else {
        if (authenticationMethodCase_ == 3) {
          accessRoleBuilder_.mergeFrom(value);
        } else {
          accessRoleBuilder_.setMessage(value);
        }
      }
      authenticationMethodCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Authentication using Google owned service account to assume into
     * customer's AWS IAM Role.
     * </pre>
     *
     * <code>.google.cloud.bigquery.connection.v1.AwsAccessRole access_role = 3;</code>
     */
    public Builder clearAccessRole() {
      if (accessRoleBuilder_ == null) {
        if (authenticationMethodCase_ == 3) {
          authenticationMethodCase_ = 0;
          authenticationMethod_ = null;
          onChanged();
        }
      } else {
        if (authenticationMethodCase_ == 3) {
          authenticationMethodCase_ = 0;
          authenticationMethod_ = null;
        }
        accessRoleBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Authentication using Google owned service account to assume into
     * customer's AWS IAM Role.
     * </pre>
     *
     * <code>.google.cloud.bigquery.connection.v1.AwsAccessRole access_role = 3;</code>
     */
    public com.google.cloud.bigquery.connection.v1.AwsAccessRole.Builder getAccessRoleBuilder() {
      return getAccessRoleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Authentication using Google owned service account to assume into
     * customer's AWS IAM Role.
     * </pre>
     *
     * <code>.google.cloud.bigquery.connection.v1.AwsAccessRole access_role = 3;</code>
     */
    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.AwsAccessRoleOrBuilder getAccessRoleOrBuilder() {
      if ((authenticationMethodCase_ == 3) && (accessRoleBuilder_ != null)) {
        return accessRoleBuilder_.getMessageOrBuilder();
      } else {
        if (authenticationMethodCase_ == 3) {
          return (com.google.cloud.bigquery.connection.v1.AwsAccessRole) authenticationMethod_;
        }
        return com.google.cloud.bigquery.connection.v1.AwsAccessRole.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Authentication using Google owned service account to assume into
     * customer's AWS IAM Role.
     * </pre>
     *
     * <code>.google.cloud.bigquery.connection.v1.AwsAccessRole access_role = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.connection.v1.AwsAccessRole, com.google.cloud.bigquery.connection.v1.AwsAccessRole.Builder, com.google.cloud.bigquery.connection.v1.AwsAccessRoleOrBuilder> 
        getAccessRoleFieldBuilder() {
      if (accessRoleBuilder_ == null) {
        if (!(authenticationMethodCase_ == 3)) {
          authenticationMethod_ = com.google.cloud.bigquery.connection.v1.AwsAccessRole.getDefaultInstance();
        }
        accessRoleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.connection.v1.AwsAccessRole, com.google.cloud.bigquery.connection.v1.AwsAccessRole.Builder, com.google.cloud.bigquery.connection.v1.AwsAccessRoleOrBuilder>(
                (com.google.cloud.bigquery.connection.v1.AwsAccessRole) authenticationMethod_,
                getParentForChildren(),
                isClean());
        authenticationMethod_ = null;
      }
      authenticationMethodCase_ = 3;
      onChanged();;
      return accessRoleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.connection.v1.AwsProperties)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.connection.v1.AwsProperties)
  private static final com.google.cloud.bigquery.connection.v1.AwsProperties DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.connection.v1.AwsProperties();
  }

  public static com.google.cloud.bigquery.connection.v1.AwsProperties getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AwsProperties>
      PARSER = new com.google.protobuf.AbstractParser<AwsProperties>() {
    @java.lang.Override
    public AwsProperties parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AwsProperties> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AwsProperties> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.connection.v1.AwsProperties getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
