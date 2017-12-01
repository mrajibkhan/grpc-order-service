package org.mrk.grpc.order;


import io.grpc.*;
import org.lognet.springboot.grpc.GRpcGlobalInterceptor;
import org.lognet.springboot.grpc.GRpcServerBuilderConfigurer;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import static org.mockito.Mockito.*;


@Configuration
public class TestConfig {


    public  static final String CUSTOM_EXECUTOR_MESSAGE="Hello from custom executor.";

    @Bean(name = "globalInterceptor")
    @GRpcGlobalInterceptor
    public ServerInterceptor globalInterceptor(){

        ServerInterceptor mock = mock(ServerInterceptor.class);
        when(mock.interceptCall(notNull(ServerCall.class),notNull(Metadata.class),notNull(ServerCallHandler.class))).thenAnswer(new Answer<ServerCall.Listener>() {
            @Override
            public ServerCall.Listener answer(InvocationOnMock invocation) throws Throwable {
                return invocation.getArgumentAt(2,ServerCallHandler.class).startCall(invocation.getArgumentAt(0,ServerCall.class),
                        invocation.getArgumentAt(1,Metadata.class)
                );
            }
        });
        return mock;
    }

    @Bean
    @Profile("customServerBuilder")
    public GRpcServerBuilderConfigurer customGrpcServerBuilderConfigurer(){
        return  new GRpcServerBuilderConfigurer(){
            @Override
            public void configure(ServerBuilder<?> serverBuilder){
                serverBuilder.executor(command -> {
                            System.out.println(CUSTOM_EXECUTOR_MESSAGE);
                            command.run();
                        }
                );

            }
        };
    }






}
