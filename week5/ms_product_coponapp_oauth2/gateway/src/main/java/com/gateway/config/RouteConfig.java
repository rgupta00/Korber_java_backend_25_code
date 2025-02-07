package com.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import java.time.Duration;
import java.time.LocalDateTime;

@Configuration
public class RouteConfig {
    @Bean
    public RouteLocator busycoderRouteConfig(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route(p -> p
                        .path("/productstore/productsms/**")
                        .filters( f -> f.rewritePath("/productstore/productsms/(?<segment>.*)","/${segment}")
                                .addResponseHeader("X-Response-Time", LocalDateTime.now().toString())
                                .retry(config -> config.setRetries(3)
                                        .setMethods(HttpMethod.GET)
                                        .setBackoff(Duration.ofMillis(100),Duration.ofMillis(1000),2,true))
                                .circuitBreaker(config -> config.setName("mycircuitbreaker")
                                        .setFallbackUri("forward:/contactSupport")))
                        .uri("lb://PRODUCTS"))

                .route(p -> p
                        .path("/productstore/couponsms/**")
                        .filters( f -> f.rewritePath("/productstore/couponsms/(?<segment>.*)","/${segment}")
                                .addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
                        .uri("lb://COUPONS"))
               .build();
    }
}
