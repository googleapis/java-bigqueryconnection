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
    internal_static_google_cloud_bigquery_connection_v1_AzureProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_connection_v1_AzureProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_connection_v1_CloudResourceProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_connection_v1_CloudResourceProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_connection_v1_MetastoreServiceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_connection_v1_MetastoreServiceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_connection_v1_SparkHistoryServerConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_connection_v1_SparkHistoryServerConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_connection_v1_SparkProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_connection_v1_SparkProperties_fieldAccessorTable;

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
      "eapis.com/Connection\"\360\005\n\nConnection\022\014\n\004n" +
      "ame\030\001 \001(\t\022\025\n\rfriendly_name\030\002 \001(\t\022\023\n\013desc" +
      "ription\030\003 \001(\t\022L\n\tcloud_sql\030\004 \001(\01327.googl" +
      "e.cloud.bigquery.connection.v1.CloudSqlP" +
      "ropertiesH\000\022A\n\003aws\030\010 \001(\01322.google.cloud." +
      "bigquery.connection.v1.AwsPropertiesH\000\022E" +
      "\n\005azure\030\013 \001(\01324.google.cloud.bigquery.co" +
      "nnection.v1.AzurePropertiesH\000\022T\n\rcloud_s" +
      "panner\030\025 \001(\0132;.google.cloud.bigquery.con" +
      "nection.v1.CloudSpannerPropertiesH\000\022V\n\016c" +
      "loud_resource\030\026 \001(\0132<.google.cloud.bigqu" +
      "ery.connection.v1.CloudResourcePropertie" +
      "sH\000\022E\n\005spark\030\027 \001(\01324.google.cloud.bigque" +
      "ry.connection.v1.SparkPropertiesH\000\022\032\n\rcr" +
      "eation_time\030\005 \001(\003B\003\340A\003\022\037\n\022last_modified_" +
      "time\030\006 \001(\003B\003\340A\003\022\033\n\016has_credential\030\007 \001(\010B" +
      "\003\340A\003:s\352Ap\n,bigqueryconnection.googleapis" +
      ".com/Connection\022@projects/{project}/loca" +
      "tions/{location}/connections/{connection" +
      "}B\014\n\nproperties\"\312\002\n\022CloudSqlProperties\022\023" +
      "\n\013instance_id\030\001 \001(\t\022\020\n\010database\030\002 \001(\t\022R\n" +
      "\004type\030\003 \001(\0162D.google.cloud.bigquery.conn" +
      "ection.v1.CloudSqlProperties.DatabaseTyp" +
      "e\022P\n\ncredential\030\004 \001(\01327.google.cloud.big" +
      "query.connection.v1.CloudSqlCredentialB\003" +
      "\340A\004\022\037\n\022service_account_id\030\005 \001(\tB\003\340A\003\"F\n\014" +
      "DatabaseType\022\035\n\031DATABASE_TYPE_UNSPECIFIE" +
      "D\020\000\022\014\n\010POSTGRES\020\001\022\t\n\005MYSQL\020\002\"8\n\022CloudSql" +
      "Credential\022\020\n\010username\030\001 \001(\t\022\020\n\010password" +
      "\030\002 \001(\t\"\201\001\n\026CloudSpannerProperties\022\020\n\010dat" +
      "abase\030\001 \001(\t\022\027\n\017use_parallelism\030\002 \001(\010\022 \n\030" +
      "use_serverless_analytics\030\003 \001(\010\022\032\n\rdataba" +
      "se_role\030\004 \001(\tB\003\340A\001\"\317\001\n\rAwsProperties\022Z\n\022" +
      "cross_account_role\030\002 \001(\01328.google.cloud." +
      "bigquery.connection.v1.AwsCrossAccountRo" +
      "leB\002\030\001H\000\022I\n\013access_role\030\003 \001(\01322.google.c" +
      "loud.bigquery.connection.v1.AwsAccessRol" +
      "eH\000B\027\n\025authentication_method\"^\n\023AwsCross" +
      "AccountRole\022\023\n\013iam_role_id\030\001 \001(\t\022\030\n\013iam_" +
      "user_id\030\002 \001(\tB\003\340A\003\022\030\n\013external_id\030\003 \001(\tB" +
      "\003\340A\003\"6\n\rAwsAccessRole\022\023\n\013iam_role_id\030\001 \001" +
      "(\t\022\020\n\010identity\030\002 \001(\t\"\315\001\n\017AzureProperties" +
      "\022\030\n\013application\030\001 \001(\tB\003\340A\003\022\026\n\tclient_id\030" +
      "\002 \001(\tB\003\340A\003\022\026\n\tobject_id\030\003 \001(\tB\003\340A\003\022\032\n\022cu" +
      "stomer_tenant_id\030\004 \001(\t\022\024\n\014redirect_uri\030\005" +
      " \001(\t\022\'\n\037federated_application_client_id\030" +
      "\006 \001(\t\022\025\n\010identity\030\007 \001(\tB\003\340A\003\":\n\027CloudRes" +
      "ourceProperties\022\037\n\022service_account_id\030\001 " +
      "\001(\tB\003\340A\003\"]\n\026MetastoreServiceConfig\022C\n\021me" +
      "tastore_service\030\001 \001(\tB(\340A\001\372A\"\n metastore" +
      ".googleapis.com/Service\"]\n\030SparkHistoryS" +
      "erverConfig\022A\n\020dataproc_cluster\030\001 \001(\tB\'\340" +
      "A\001\372A!\n\037dataproc.googleapis.com/Cluster\"\377" +
      "\001\n\017SparkProperties\022\037\n\022service_account_id" +
      "\030\001 \001(\tB\003\340A\003\022b\n\030metastore_service_config\030" +
      "\003 \001(\0132;.google.cloud.bigquery.connection" +
      ".v1.MetastoreServiceConfigB\003\340A\001\022g\n\033spark" +
      "_history_server_config\030\004 \001(\0132=.google.cl" +
      "oud.bigquery.connection.v1.SparkHistoryS" +
      "erverConfigB\003\340A\0012\314\r\n\021ConnectionService\022\350" +
      "\001\n\020CreateConnection\022<.google.cloud.bigqu" +
      "ery.connection.v1.CreateConnectionReques" +
      "t\032/.google.cloud.bigquery.connection.v1." +
      "Connection\"e\202\323\344\223\002=\"//v1/{parent=projects" +
      "/*/locations/*}/connections:\nconnection\332" +
      "A\037parent,connection,connection_id\022\273\001\n\rGe" +
      "tConnection\0229.google.cloud.bigquery.conn" +
      "ection.v1.GetConnectionRequest\032/.google." +
      "cloud.bigquery.connection.v1.Connection\"" +
      ">\202\323\344\223\0021\022//v1/{name=projects/*/locations/" +
      "*/connections/*}\332A\004name\022\316\001\n\017ListConnecti" +
      "ons\022;.google.cloud.bigquery.connection.v" +
      "1.ListConnectionsRequest\032<.google.cloud." +
      "bigquery.connection.v1.ListConnectionsRe" +
      "sponse\"@\202\323\344\223\0021\022//v1/{parent=projects/*/l" +
      "ocations/*}/connections\332A\006parent\022\344\001\n\020Upd" +
      "ateConnection\022<.google.cloud.bigquery.co" +
      "nnection.v1.UpdateConnectionRequest\032/.go" +
      "ogle.cloud.bigquery.connection.v1.Connec" +
      "tion\"a\202\323\344\223\002=2//v1/{name=projects/*/locat" +
      "ions/*/connections/*}:\nconnection\332A\033name" +
      ",connection,update_mask\022\250\001\n\020DeleteConnec" +
      "tion\022<.google.cloud.bigquery.connection." +
      "v1.DeleteConnectionRequest\032\026.google.prot" +
      "obuf.Empty\">\202\323\344\223\0021*//v1/{name=projects/*" +
      "/locations/*/connections/*}\332A\004name\022\251\001\n\014G" +
      "etIamPolicy\022\".google.iam.v1.GetIamPolicy" +
      "Request\032\025.google.iam.v1.Policy\"^\202\323\344\223\002E\"@" +
      "/v1/{resource=projects/*/locations/*/con" +
      "nections/*}:getIamPolicy:\001*\332A\020resource,o" +
      "ptions\022\250\001\n\014SetIamPolicy\022\".google.iam.v1." +
      "SetIamPolicyRequest\032\025.google.iam.v1.Poli" +
      "cy\"]\202\323\344\223\002E\"@/v1/{resource=projects/*/loc" +
      "ations/*/connections/*}:setIamPolicy:\001*\332" +
      "A\017resource,policy\022\323\001\n\022TestIamPermissions" +
      "\022(.google.iam.v1.TestIamPermissionsReque" +
      "st\032).google.iam.v1.TestIamPermissionsRes" +
      "ponse\"h\202\323\344\223\002K\"F/v1/{resource=projects/*/" +
      "locations/*/connections/*}:testIamPermis" +
      "sions:\001*\332A\024resource,permissions\032~\312A!bigq" +
      "ueryconnection.googleapis.com\322AWhttps://" +
      "www.googleapis.com/auth/bigquery,https:/" +
      "/www.googleapis.com/auth/cloud-platformB" +
      "\375\002\n\'com.google.cloud.bigquery.connection" +
      ".v1P\001ZGcloud.google.com/go/bigquery/conn" +
      "ection/apiv1/connectionpb;connectionpb\252\002" +
      "#Google.Cloud.BigQuery.Connection.V1\312\002#G" +
      "oogle\\Cloud\\BigQuery\\Connection\\V1\352AY\n\037d" +
      "ataproc.googleapis.com/Cluster\0226projects" +
      "/{project}/regions/{region}/clusters/{cl" +
      "uster}\352A^\n metastore.googleapis.com/Serv" +
      "ice\022:projects/{project}/locations/{locat" +
      "ion}/services/{service}b\006proto3"
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
        new java.lang.String[] { "Name", "FriendlyName", "Description", "CloudSql", "Aws", "Azure", "CloudSpanner", "CloudResource", "Spark", "CreationTime", "LastModifiedTime", "HasCredential", "Properties", });
    internal_static_google_cloud_bigquery_connection_v1_CloudSqlProperties_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_bigquery_connection_v1_CloudSqlProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_CloudSqlProperties_descriptor,
        new java.lang.String[] { "InstanceId", "Database", "Type", "Credential", "ServiceAccountId", });
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
        new java.lang.String[] { "Database", "UseParallelism", "UseServerlessAnalytics", "DatabaseRole", });
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
    internal_static_google_cloud_bigquery_connection_v1_AzureProperties_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_bigquery_connection_v1_AzureProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_AzureProperties_descriptor,
        new java.lang.String[] { "Application", "ClientId", "ObjectId", "CustomerTenantId", "RedirectUri", "FederatedApplicationClientId", "Identity", });
    internal_static_google_cloud_bigquery_connection_v1_CloudResourceProperties_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_bigquery_connection_v1_CloudResourceProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_CloudResourceProperties_descriptor,
        new java.lang.String[] { "ServiceAccountId", });
    internal_static_google_cloud_bigquery_connection_v1_MetastoreServiceConfig_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_bigquery_connection_v1_MetastoreServiceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_MetastoreServiceConfig_descriptor,
        new java.lang.String[] { "MetastoreService", });
    internal_static_google_cloud_bigquery_connection_v1_SparkHistoryServerConfig_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_bigquery_connection_v1_SparkHistoryServerConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_SparkHistoryServerConfig_descriptor,
        new java.lang.String[] { "DataprocCluster", });
    internal_static_google_cloud_bigquery_connection_v1_SparkProperties_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_bigquery_connection_v1_SparkProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_connection_v1_SparkProperties_descriptor,
        new java.lang.String[] { "ServiceAccountId", "MetastoreServiceConfig", "SparkHistoryServerConfig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
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
