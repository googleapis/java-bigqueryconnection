// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/connection/v1/connection.proto

package com.google.cloud.bigquery.connection.v1;

public final class ConnectionOuterClass {
  private ConnectionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_connection_v1_CreateConnectionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_connection_v1_CreateConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_connection_v1_GetConnectionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_connection_v1_GetConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_connection_v1_ListConnectionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_connection_v1_ListConnectionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_connection_v1_ListConnectionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_connection_v1_ListConnectionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_connection_v1_UpdateConnectionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_connection_v1_UpdateConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_connection_v1_DeleteConnectionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_connection_v1_DeleteConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_connection_v1_Connection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_connection_v1_Connection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_connection_v1_CloudSqlProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_connection_v1_CloudSqlProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_connection_v1_CloudSqlCredential_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_connection_v1_CloudSqlCredential_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_connection_v1_CloudSpannerProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_connection_v1_CloudSpannerProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_connection_v1_AwsProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_connection_v1_AwsProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_connection_v1_AwsCrossAccountRole_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_connection_v1_AwsCrossAccountRole_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_connection_v1_AwsAccessRole_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_connection_v1_AwsAccessRole_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_connection_v1_CloudResourceProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_connection_v1_CloudResourceProperties_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/bigquery/connection/v1/co" +
      "nnection.proto\022#google.cloud.bigquery.co" +
      "nnection.v1\032\034google/api/annotations.prot" +
      "o\032\027google/api/client.proto\032\037google/api/f" +
      "ield_behavior.proto\032\031google/api/resource" +
      ".proto\032\036google/iam/v1/iam_policy.proto\032\032" +
      "google/iam/v1/policy.proto\032\033google/proto" +
      "buf/empty.proto\032 google/protobuf/field_m" +
      "ask.proto\"\272\001\n\027CreateConnectionRequest\0229\n" +
      "\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations.googlea" +
      "pis.com/Location\022\032\n\rconnection_id\030\002 \001(\tB" +
      "\003\340A\001\022H\n\nconnection\030\003 \001(\0132/.google.cloud." +
      "bigquery.connection.v1.ConnectionB\003\340A\002\"Z" +
      "\n\024GetConnectionRequest\022B\n\004name\030\001 \001(\tB4\340A" +
      "\002\372A.\n,bigqueryconnection.googleapis.com/" +
      "Connection\"\177\n\026ListConnectionsRequest\0229\n\006" +
      "parent\030\001 \001(\tB)\340A\002\372A#\n!locations.googleap" +
      "is.com/Location\022\026\n\tpage_size\030\004 \001(\005B\003\340A\002\022" +
      "\022\n\npage_token\030\003 \001(\t\"x\n\027ListConnectionsRe" +
      "sponse\022\027\n\017next_page_token\030\001 \001(\t\022D\n\013conne" +
      "ctions\030\002 \003(\0132/.google.cloud.bigquery.con" +
      "nection.v1.Connection\"\335\001\n\027UpdateConnecti" +
      "onRequest\022B\n\004name\030\001 \001(\tB4\340A\002\372A.\n,bigquer" +
      "yconnection.googleapis.com/Connection\022H\n" +
      "\nconnection\030\002 \001(\0132/.google.cloud.bigquer" +
      "y.connection.v1.ConnectionB\003\340A\002\0224\n\013updat" +
      "e_mask\030\003 \001(\0132\032.google.protobuf.FieldMask" +
      "B\003\340A\002\"]\n\027DeleteConnectionRequest\022B\n\004name" +
      "\030\001 \001(\tB4\340A\002\372A.\n,bigqueryconnection.googl" +
      "eapis.com/Connection\"\342\004\n\nConnection\022\014\n\004n" +
      "ame\030\001 \001(\t\022\025\n\rfriendly_name\030\002 \001(\t\022\023\n\013desc" +
      "ription\030\003 \001(\t\022L\n\tcloud_sql\030\004 \001(\01327.googl" +
      "e.cloud.bigquery.connection.v1.CloudSqlP" +
      "ropertiesH\000\022A\n\003aws\030\010 \001(\01322.google.cloud." +
      "bigquery.connection.v1.AwsPropertiesH\000\022T" +
      "\n\rcloud_spanner\030\025 \001(\0132;.google.cloud.big" +
      "query.connection.v1.CloudSpannerProperti" +
      "esH\000\022V\n\016cloud_resource\030\026 \001(\0132<.google.cl" +
      "oud.bigquery.connection.v1.CloudResource" +
      "PropertiesH\000\022\032\n\rcreation_time\030\005 \001(\003B\003\340A\003" +
      "\022\037\n\022last_modified_time\030\006 \001(\003B\003\340A\003\022\033\n\016has" +
      "_credential\030\007 \001(\010B\003\340A\003:s\352Ap\n,bigquerycon" +
      "nection.googleapis.com/Connection\022@proje" +
      "cts/{project}/locations/{location}/conne" +
      "ctions/{connection}B\014\n\nproperties\"\251\002\n\022Cl" +
      "oudSqlProperties\022\023\n\013instance_id\030\001 \001(\t\022\020\n" +
      "\010database\030\002 \001(\t\022R\n\004type\030\003 \001(\0162D.google.c" +
      "loud.bigquery.connection.v1.CloudSqlProp" +
      "erties.DatabaseType\022P\n\ncredential\030\004 \001(\0132" +
      "7.google.cloud.bigquery.connection.v1.Cl" +
      "oudSqlCredentialB\003\340A\004\"F\n\014DatabaseType\022\035\n" +
      "\031DATABASE_TYPE_UNSPECIFIED\020\000\022\014\n\010POSTGRES" +
      "\020\001\022\t\n\005MYSQL\020\002\"8\n\022CloudSqlCredential\022\020\n\010u" +
      "sername\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\"C\n\026Cloud" +
      "SpannerProperties\022\020\n\010database\030\001 \001(\t\022\027\n\017u" +
      "se_parallelism\030\002 \001(\010\"\313\001\n\rAwsProperties\022V" +
      "\n\022cross_account_role\030\002 \001(\01328.google.clou" +
      "d.bigquery.connection.v1.AwsCrossAccount" +
      "RoleH\000\022I\n\013access_role\030\003 \001(\01322.google.clo" +
      "ud.bigquery.connection.v1.AwsAccessRoleH" +
      "\000B\027\n\025authentication_method\"^\n\023AwsCrossAc" +
      "countRole\022\023\n\013iam_role_id\030\001 \001(\t\022\030\n\013iam_us" +
      "er_id\030\002 \001(\tB\003\340A\003\022\030\n\013external_id\030\003 \001(\tB\003\340" +
      "A\003\"6\n\rAwsAccessRole\022\023\n\013iam_role_id\030\001 \001(\t" +
      "\022\020\n\010identity\030\002 \001(\t\":\n\027CloudResourcePrope" +
      "rties\022\037\n\022service_account_id\030\001 \001(\tB\003\340A\0032\314" +
      "\r\n\021ConnectionService\022\350\001\n\020CreateConnectio" +
      "n\022<.google.cloud.bigquery.connection.v1." +
      "CreateConnectionRequest\032/.google.cloud.b" +
      "igquery.connection.v1.Connection\"e\202\323\344\223\002=" +
      "\"//v1/{parent=projects/*/locations/*}/co" +
      "nnections:\nconnection\332A\037parent,connectio" +
      "n,connection_id\022\273\001\n\rGetConnection\0229.goog" +
      "le.cloud.bigquery.connection.v1.GetConne" +
      "ctionRequest\032/.google.cloud.bigquery.con" +
      "nection.v1.Connection\">\202\323\344\223\0021\022//v1/{name" +
      "=projects/*/locations/*/connections/*}\332A" +
      "\004name\022\316\001\n\017ListConnections\022;.google.cloud" +
      ".bigquery.connection.v1.ListConnectionsR" +
      "equest\032<.google.cloud.bigquery.connectio" +
      "n.v1.ListConnectionsResponse\"@\202\323\344\223\0021\022//v" +
      "1/{parent=projects/*/locations/*}/connec" +
      "tions\332A\006parent\022\344\001\n\020UpdateConnection\022<.go" +
      "ogle.cloud.bigquery.connection.v1.Update" +
      "ConnectionRequest\032/.google.cloud.bigquer" +
      "y.connection.v1.Connection\"a\202\323\344\223\002=2//v1/" +
      "{name=projects/*/locations/*/connections" +
      "/*}:\nconnection\332A\033name,connection,update" +
      "_mask\022\250\001\n\020DeleteConnection\022<.google.clou" +
      "d.bigquery.connection.v1.DeleteConnectio" +
      "nRequest\032\026.google.protobuf.Empty\">\202\323\344\223\0021" +
      "*//v1/{name=projects/*/locations/*/conne" +
      "ctions/*}\332A\004name\022\251\001\n\014GetIamPolicy\022\".goog" +
      "le.iam.v1.GetIamPolicyRequest\032\025.google.i" +
      "am.v1.Policy\"^\202\323\344\223\002E\"@/v1/{resource=proj" +
      "ects/*/locations/*/connections/*}:getIam" +
      "Policy:\001*\332A\020resource,options\022\250\001\n\014SetIamP" +
      "olicy\022\".google.iam.v1.SetIamPolicyReques" +
      "t\032\025.google.iam.v1.Policy\"]\202\323\344\223\002E\"@/v1/{r" +
      "esource=projects/*/locations/*/connectio" +
      "ns/*}:setIamPolicy:\001*\332A\017resource,policy\022" +
      "\323\001\n\022TestIamPermissions\022(.google.iam.v1.T" +
      "estIamPermissionsRequest\032).google.iam.v1" +
      ".TestIamPermissionsResponse\"h\202\323\344\223\002K\"F/v1" +
      "/{resource=projects/*/locations/*/connec" +
      "tions/*}:testIamPermissions:\001*\332A\024resourc" +
      "e,permissions\032~\312A!bigqueryconnection.goo" +
      "gleapis.com\322AWhttps://www.googleapis.com" +
      "/auth/bigquery,https://www.googleapis.co" +
      "m/auth/cloud-platformB\306\001\n\'com.google.clo" +
      "ud.bigquery.connection.v1P\001ZMgoogle.gola" +
      "ng.org/genproto/googleapis/cloud/bigquer" +
      "y/connection/v1;connection\252\002#Google.Clou" +
      "d.BigQuery.Connection.V1\312\002#Google\\Cloud\\" +
      "BigQuery\\Connection\\V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.iam.v1.IamPolicyProto.getDescriptor(),
          com.google.iam.v1.PolicyProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_bigquery_connection_v1_CreateConnectionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_connection_v1_CreateConnectionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_CreateConnectionRequest_descriptor,
        new java.lang.String[] { "Parent", "ConnectionId", "Connection", });
    internal_static_google_cloud_bigquery_connection_v1_GetConnectionRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_connection_v1_GetConnectionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_GetConnectionRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_bigquery_connection_v1_ListConnectionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_connection_v1_ListConnectionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_ListConnectionsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_bigquery_connection_v1_ListConnectionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_bigquery_connection_v1_ListConnectionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_ListConnectionsResponse_descriptor,
        new java.lang.String[] { "NextPageToken", "Connections", });
    internal_static_google_cloud_bigquery_connection_v1_UpdateConnectionRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_bigquery_connection_v1_UpdateConnectionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_UpdateConnectionRequest_descriptor,
        new java.lang.String[] { "Name", "Connection", "UpdateMask", });
    internal_static_google_cloud_bigquery_connection_v1_DeleteConnectionRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_bigquery_connection_v1_DeleteConnectionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_DeleteConnectionRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_bigquery_connection_v1_Connection_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_bigquery_connection_v1_Connection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_Connection_descriptor,
        new java.lang.String[] { "Name", "FriendlyName", "Description", "CloudSql", "Aws", "CloudSpanner", "CloudResource", "CreationTime", "LastModifiedTime", "HasCredential", "Properties", });
    internal_static_google_cloud_bigquery_connection_v1_CloudSqlProperties_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_bigquery_connection_v1_CloudSqlProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_CloudSqlProperties_descriptor,
        new java.lang.String[] { "InstanceId", "Database", "Type", "Credential", });
    internal_static_google_cloud_bigquery_connection_v1_CloudSqlCredential_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_bigquery_connection_v1_CloudSqlCredential_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_CloudSqlCredential_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_google_cloud_bigquery_connection_v1_CloudSpannerProperties_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_bigquery_connection_v1_CloudSpannerProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_CloudSpannerProperties_descriptor,
        new java.lang.String[] { "Database", "UseParallelism", });
    internal_static_google_cloud_bigquery_connection_v1_AwsProperties_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_bigquery_connection_v1_AwsProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_AwsProperties_descriptor,
        new java.lang.String[] { "CrossAccountRole", "AccessRole", "AuthenticationMethod", });
    internal_static_google_cloud_bigquery_connection_v1_AwsCrossAccountRole_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_bigquery_connection_v1_AwsCrossAccountRole_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_AwsCrossAccountRole_descriptor,
        new java.lang.String[] { "IamRoleId", "IamUserId", "ExternalId", });
    internal_static_google_cloud_bigquery_connection_v1_AwsAccessRole_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_bigquery_connection_v1_AwsAccessRole_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_AwsAccessRole_descriptor,
        new java.lang.String[] { "IamRoleId", "Identity", });
    internal_static_google_cloud_bigquery_connection_v1_CloudResourceProperties_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_bigquery_connection_v1_CloudResourceProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_CloudResourceProperties_descriptor,
        new java.lang.String[] { "ServiceAccountId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}