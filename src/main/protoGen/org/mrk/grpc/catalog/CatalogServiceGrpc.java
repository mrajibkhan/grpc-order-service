package org.mrk.grpc.catalog;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.8.0)",
    comments = "Source: catalog.proto")
public final class CatalogServiceGrpc {

  private CatalogServiceGrpc() {}

  public static final String SERVICE_NAME = "CatalogService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCatalogsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.mrk.grpc.catalog.Empty,
      org.mrk.grpc.catalog.Catalog> METHOD_GET_CATALOGS = getGetCatalogsMethod();

  private static volatile io.grpc.MethodDescriptor<org.mrk.grpc.catalog.Empty,
      org.mrk.grpc.catalog.Catalog> getGetCatalogsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.mrk.grpc.catalog.Empty,
      org.mrk.grpc.catalog.Catalog> getGetCatalogsMethod() {
    io.grpc.MethodDescriptor<org.mrk.grpc.catalog.Empty, org.mrk.grpc.catalog.Catalog> getGetCatalogsMethod;
    if ((getGetCatalogsMethod = CatalogServiceGrpc.getGetCatalogsMethod) == null) {
      synchronized (CatalogServiceGrpc.class) {
        if ((getGetCatalogsMethod = CatalogServiceGrpc.getGetCatalogsMethod) == null) {
          CatalogServiceGrpc.getGetCatalogsMethod = getGetCatalogsMethod = 
              io.grpc.MethodDescriptor.<org.mrk.grpc.catalog.Empty, org.mrk.grpc.catalog.Catalog>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CatalogService", "GetCatalogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mrk.grpc.catalog.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mrk.grpc.catalog.Catalog.getDefaultInstance()))
                  .setSchemaDescriptor(new CatalogServiceMethodDescriptorSupplier("GetCatalogs"))
                  .build();
          }
        }
     }
     return getGetCatalogsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCatalogByNameMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.mrk.grpc.catalog.SearchRequest,
      org.mrk.grpc.catalog.Catalog> METHOD_GET_CATALOG_BY_NAME = getGetCatalogByNameMethod();

  private static volatile io.grpc.MethodDescriptor<org.mrk.grpc.catalog.SearchRequest,
      org.mrk.grpc.catalog.Catalog> getGetCatalogByNameMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.mrk.grpc.catalog.SearchRequest,
      org.mrk.grpc.catalog.Catalog> getGetCatalogByNameMethod() {
    io.grpc.MethodDescriptor<org.mrk.grpc.catalog.SearchRequest, org.mrk.grpc.catalog.Catalog> getGetCatalogByNameMethod;
    if ((getGetCatalogByNameMethod = CatalogServiceGrpc.getGetCatalogByNameMethod) == null) {
      synchronized (CatalogServiceGrpc.class) {
        if ((getGetCatalogByNameMethod = CatalogServiceGrpc.getGetCatalogByNameMethod) == null) {
          CatalogServiceGrpc.getGetCatalogByNameMethod = getGetCatalogByNameMethod = 
              io.grpc.MethodDescriptor.<org.mrk.grpc.catalog.SearchRequest, org.mrk.grpc.catalog.Catalog>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CatalogService", "GetCatalogByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mrk.grpc.catalog.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mrk.grpc.catalog.Catalog.getDefaultInstance()))
                  .setSchemaDescriptor(new CatalogServiceMethodDescriptorSupplier("GetCatalogByName"))
                  .build();
          }
        }
     }
     return getGetCatalogByNameMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCatalogItemByNameMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.mrk.grpc.catalog.SearchRequest,
      org.mrk.grpc.catalog.CatalogItem> METHOD_GET_CATALOG_ITEM_BY_NAME = getGetCatalogItemByNameMethod();

  private static volatile io.grpc.MethodDescriptor<org.mrk.grpc.catalog.SearchRequest,
      org.mrk.grpc.catalog.CatalogItem> getGetCatalogItemByNameMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.mrk.grpc.catalog.SearchRequest,
      org.mrk.grpc.catalog.CatalogItem> getGetCatalogItemByNameMethod() {
    io.grpc.MethodDescriptor<org.mrk.grpc.catalog.SearchRequest, org.mrk.grpc.catalog.CatalogItem> getGetCatalogItemByNameMethod;
    if ((getGetCatalogItemByNameMethod = CatalogServiceGrpc.getGetCatalogItemByNameMethod) == null) {
      synchronized (CatalogServiceGrpc.class) {
        if ((getGetCatalogItemByNameMethod = CatalogServiceGrpc.getGetCatalogItemByNameMethod) == null) {
          CatalogServiceGrpc.getGetCatalogItemByNameMethod = getGetCatalogItemByNameMethod = 
              io.grpc.MethodDescriptor.<org.mrk.grpc.catalog.SearchRequest, org.mrk.grpc.catalog.CatalogItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CatalogService", "GetCatalogItemByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mrk.grpc.catalog.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.mrk.grpc.catalog.CatalogItem.getDefaultInstance()))
                  .setSchemaDescriptor(new CatalogServiceMethodDescriptorSupplier("GetCatalogItemByName"))
                  .build();
          }
        }
     }
     return getGetCatalogItemByNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CatalogServiceStub newStub(io.grpc.Channel channel) {
    return new CatalogServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CatalogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CatalogServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CatalogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CatalogServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CatalogServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCatalogs(org.mrk.grpc.catalog.Empty request,
        io.grpc.stub.StreamObserver<org.mrk.grpc.catalog.Catalog> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCatalogsMethod(), responseObserver);
    }

    /**
     */
    public void getCatalogByName(org.mrk.grpc.catalog.SearchRequest request,
        io.grpc.stub.StreamObserver<org.mrk.grpc.catalog.Catalog> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCatalogByNameMethod(), responseObserver);
    }

    /**
     */
    public void getCatalogItemByName(org.mrk.grpc.catalog.SearchRequest request,
        io.grpc.stub.StreamObserver<org.mrk.grpc.catalog.CatalogItem> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCatalogItemByNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCatalogsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.mrk.grpc.catalog.Empty,
                org.mrk.grpc.catalog.Catalog>(
                  this, METHODID_GET_CATALOGS)))
          .addMethod(
            getGetCatalogByNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.mrk.grpc.catalog.SearchRequest,
                org.mrk.grpc.catalog.Catalog>(
                  this, METHODID_GET_CATALOG_BY_NAME)))
          .addMethod(
            getGetCatalogItemByNameMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.mrk.grpc.catalog.SearchRequest,
                org.mrk.grpc.catalog.CatalogItem>(
                  this, METHODID_GET_CATALOG_ITEM_BY_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class CatalogServiceStub extends io.grpc.stub.AbstractStub<CatalogServiceStub> {
    private CatalogServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CatalogServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CatalogServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CatalogServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCatalogs(org.mrk.grpc.catalog.Empty request,
        io.grpc.stub.StreamObserver<org.mrk.grpc.catalog.Catalog> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetCatalogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCatalogByName(org.mrk.grpc.catalog.SearchRequest request,
        io.grpc.stub.StreamObserver<org.mrk.grpc.catalog.Catalog> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCatalogByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCatalogItemByName(org.mrk.grpc.catalog.SearchRequest request,
        io.grpc.stub.StreamObserver<org.mrk.grpc.catalog.CatalogItem> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetCatalogItemByNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CatalogServiceBlockingStub extends io.grpc.stub.AbstractStub<CatalogServiceBlockingStub> {
    private CatalogServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CatalogServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CatalogServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CatalogServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<org.mrk.grpc.catalog.Catalog> getCatalogs(
        org.mrk.grpc.catalog.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetCatalogsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.mrk.grpc.catalog.Catalog getCatalogByName(org.mrk.grpc.catalog.SearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCatalogByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.mrk.grpc.catalog.CatalogItem> getCatalogItemByName(
        org.mrk.grpc.catalog.SearchRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetCatalogItemByNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CatalogServiceFutureStub extends io.grpc.stub.AbstractStub<CatalogServiceFutureStub> {
    private CatalogServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CatalogServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CatalogServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CatalogServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.mrk.grpc.catalog.Catalog> getCatalogByName(
        org.mrk.grpc.catalog.SearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCatalogByNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CATALOGS = 0;
  private static final int METHODID_GET_CATALOG_BY_NAME = 1;
  private static final int METHODID_GET_CATALOG_ITEM_BY_NAME = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CatalogServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CatalogServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CATALOGS:
          serviceImpl.getCatalogs((org.mrk.grpc.catalog.Empty) request,
              (io.grpc.stub.StreamObserver<org.mrk.grpc.catalog.Catalog>) responseObserver);
          break;
        case METHODID_GET_CATALOG_BY_NAME:
          serviceImpl.getCatalogByName((org.mrk.grpc.catalog.SearchRequest) request,
              (io.grpc.stub.StreamObserver<org.mrk.grpc.catalog.Catalog>) responseObserver);
          break;
        case METHODID_GET_CATALOG_ITEM_BY_NAME:
          serviceImpl.getCatalogItemByName((org.mrk.grpc.catalog.SearchRequest) request,
              (io.grpc.stub.StreamObserver<org.mrk.grpc.catalog.CatalogItem>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CatalogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CatalogServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.mrk.grpc.catalog.CatalogProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CatalogService");
    }
  }

  private static final class CatalogServiceFileDescriptorSupplier
      extends CatalogServiceBaseDescriptorSupplier {
    CatalogServiceFileDescriptorSupplier() {}
  }

  private static final class CatalogServiceMethodDescriptorSupplier
      extends CatalogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CatalogServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CatalogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CatalogServiceFileDescriptorSupplier())
              .addMethod(getGetCatalogsMethod())
              .addMethod(getGetCatalogByNameMethod())
              .addMethod(getGetCatalogItemByNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
