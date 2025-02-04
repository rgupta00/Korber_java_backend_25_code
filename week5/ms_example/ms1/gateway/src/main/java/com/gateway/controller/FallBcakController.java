package com.gateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallBcakController {
    //fallback
    @GetMapping("/fallback")
    public ResponseEntity<Mono<String>> contactSupport() {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(Mono.just("An error occurred. Please try after some time or contact support team!!!"));
    }
}
