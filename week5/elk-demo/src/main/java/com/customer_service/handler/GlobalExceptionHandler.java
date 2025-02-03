package com.customer_service.handler;

import com.customer_service.model.ExceptionResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
  @ExceptionHandler(RuntimeException.class)
  public ResponseEntity<ExceptionResponse> handleException(RuntimeException ex) {
    log.info("START - handleException, exception: {}", ex.getMessage());

    var exceptionResponse = ExceptionResponse.builder().message(ex.getMessage()).build();

    log.info("END - handleException");

    return ResponseEntity
        .internalServerError()
        .body(exceptionResponse);
  }
}
