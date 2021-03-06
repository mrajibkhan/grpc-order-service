// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog.proto

package org.mrk.grpc.catalog;

public final class CatalogProto {
  private CatalogProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Bundle_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Bundle_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CatalogItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CatalogItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Catalog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Catalog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SearchRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SearchRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rcatalog.proto\"%\n\007Product\022\014\n\004name\030\001 \001(\t" +
      "\022\014\n\004code\030\002 \001(\t\")\n\006Bundle\022\020\n\010quantity\030\001 \001" +
      "(\003\022\r\n\005price\030\002 \001(\002\"B\n\013CatalogItem\022\031\n\007prod" +
      "uct\030\001 \001(\0132\010.Product\022\030\n\007bundles\030\002 \003(\0132\007.B" +
      "undle\"U\n\007Catalog\022\021\n\tcatalogId\030\001 \001(\t\022\023\n\013c" +
      "atalogName\030\002 \001(\t\022\"\n\014catalogItems\030\003 \003(\0132\014" +
      ".CatalogItem\"\007\n\005Empty\"9\n\rSearchRequest\022\023" +
      "\n\013catalogName\030\001 \001(\t\022\023\n\013productName\030\002 \001(\t" +
      "2\237\001\n\016CatalogService\022#\n\013GetCatalogs\022\006.Emp" +
      "ty\032\010.Catalog\"\0000\001\022.\n\020GetCatalogByName\022\016.S",
      "earchRequest\032\010.Catalog\"\000\0228\n\024GetCatalogIt" +
      "emByName\022\016.SearchRequest\032\014.CatalogItem\"\000" +
      "0\001B&\n\024org.mrk.grpc.catalogB\014CatalogProto" +
      "P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Product_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Product_descriptor,
        new java.lang.String[] { "Name", "Code", });
    internal_static_Bundle_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Bundle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Bundle_descriptor,
        new java.lang.String[] { "Quantity", "Price", });
    internal_static_CatalogItem_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_CatalogItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CatalogItem_descriptor,
        new java.lang.String[] { "Product", "Bundles", });
    internal_static_Catalog_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Catalog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Catalog_descriptor,
        new java.lang.String[] { "CatalogId", "CatalogName", "CatalogItems", });
    internal_static_Empty_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_SearchRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_SearchRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SearchRequest_descriptor,
        new java.lang.String[] { "CatalogName", "ProductName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
