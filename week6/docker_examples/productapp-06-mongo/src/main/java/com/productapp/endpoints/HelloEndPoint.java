package com.productapp.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="myhelloendpoint")
public class HelloEndPoint {
    @Bean
    @ReadOperation
    public String hello(){
        return "hello endpoint";
    }
}
