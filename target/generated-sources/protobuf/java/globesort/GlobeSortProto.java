// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: globesort.proto

package globesort;

public final class GlobeSortProto {
  private GlobeSortProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IntArray_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IntArray_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SortResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SortResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017globesort.proto\"\007\n\005Empty\"\032\n\010IntArray\022\016" +
      "\n\006values\030\001 \003(\005\"@\n\014SortResponse\022\020\n\010sortTi" +
      "me\030\001 \001(\004\022\036\n\013sortedArray\030\002 \001(\0132\t.IntArray" +
      "2Q\n\tGlobeSort\022\030\n\004Ping\022\006.Empty\032\006.Empty\"\000\022" +
      "*\n\014SortIntegers\022\t.IntArray\032\r.SortRespons" +
      "e\"\000B\035\n\tglobesortB\016GlobeSortProtoP\001b\006prot" +
      "o3"
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
    internal_static_Empty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_IntArray_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_IntArray_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IntArray_descriptor,
        new java.lang.String[] { "Values", });
    internal_static_SortResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SortResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SortResponse_descriptor,
        new java.lang.String[] { "SortTime", "SortedArray", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
