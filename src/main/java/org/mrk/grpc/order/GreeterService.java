package org.mrk.grpc.order;

import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;

import org.mrk.grpc.greeter.GreeterGrpc;
import org.mrk.grpc.greeter.GreeterOuterClass;

import io.grpc.stub.StreamObserver;
@Slf4j
@GRpcService(interceptors = { LogInterceptor.class })
public class GreeterService extends GreeterGrpc.GreeterImplBase {
    @Override
    public void sayHello(GreeterOuterClass.HelloRequest request, StreamObserver<GreeterOuterClass.HelloReply> responseObserver) {
        String message = "Hello " + request.getName();
        final GreeterOuterClass.HelloReply.Builder replyBuilder = GreeterOuterClass.HelloReply.newBuilder().setMessage(message);
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
        log.info("Returning " +message);
    }
}
