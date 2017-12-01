package org.mrk.grpc.order;

import io.grpc.health.v1.HealthCheckResponse;


        import io.grpc.ManagedChannel;
        import io.grpc.ManagedChannelBuilder;
        import io.grpc.ServerInterceptor;
        import io.grpc.health.v1.HealthCheckRequest;
        import io.grpc.health.v1.HealthCheckResponse;
        import io.grpc.health.v1.HealthGrpc;
        import org.hamcrest.CoreMatchers;
        import org.junit.*;
        import org.junit.runner.RunWith;
import org.lognet.springboot.grpc.GRpcServerBuilderConfigurer;
        import org.mockito.Mockito;
import org.mrk.grpc.greeter.GreeterGrpc;
import org.mrk.grpc.greeter.GreeterOuterClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutionException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class,TestConfig.class}, webEnvironment = DEFINED_PORT)
public class ApplicationTest extends GrpcServerTestBase{



    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    @Autowired
    @Qualifier("globalInterceptor")
    private  ServerInterceptor globalInterceptor;





    @Test
    public void disabledServerTest() throws Throwable {
        assertNotNull(grpcServerRunner);
        assertNull(grpcInprocessServerRunner);

    }

    @Test
    public void interceptorsTest() throws ExecutionException, InterruptedException {

        GreeterGrpc.newFutureStub(channel)
                .sayHello(GreeterOuterClass.HelloRequest.newBuilder().setName("name").build())
                .get().getMessage();



        // global interceptor should be invoked once on each service
        Mockito.verify(globalInterceptor,Mockito.times(1)).interceptCall(Mockito.any(),Mockito.any(),Mockito.any());


        // log interceptor should be invoked
        outputCapture.expect(containsString(GreeterGrpc.getSayHelloMethod().getFullMethodName()));


        //outputCapture.expect(containsString("I'm not Spring bean interceptor and still being invoked..."));



    }

    @Test
    public void actuatorTest() throws ExecutionException, InterruptedException {
        final TestRestTemplate template = new TestRestTemplate();

        ResponseEntity<String> response = template.getForEntity("http://localhost:9090/env", String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }


    @Test
    public void testDefaultConfigurer(){
        Assert.assertEquals("Default configurer should be picked up",
                context.getBean(GRpcServerBuilderConfigurer.class).getClass(),
                GRpcServerBuilderConfigurer.class);
    }


    @Test
    public void testHealthCheck() throws ExecutionException, InterruptedException {
        final HealthCheckRequest healthCheckRequest = HealthCheckRequest.newBuilder().setService(GreeterGrpc.getServiceDescriptor().getName()).build();
        final HealthGrpc.HealthFutureStub healthFutureStub = HealthGrpc.newFutureStub(channel);
        final HealthCheckResponse.ServingStatus servingStatus = healthFutureStub.check(healthCheckRequest).get().getStatus();
        assertNotNull(servingStatus);
        assertEquals(servingStatus, HealthCheckResponse.ServingStatus.SERVING);
    }
}
