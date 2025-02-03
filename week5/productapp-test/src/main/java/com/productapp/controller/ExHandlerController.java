package com.productapp.controller;

import com.productapp.dto.ErrorInfo;
import com.productapp.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ExHandlerController {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorInfo> handle404(ProductNotFoundException ex){
        ErrorInfo errorInfo=ErrorInfo.builder()
                .message(ex.getMessage())
                .statusCode(HttpStatus.NOT_FOUND.toString())
                .toContact("rgupta.mtech@gmail.com")
                .localDateTime(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorInfo);
    }
  //  @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorInfo> handle500(Exception ex){
        ErrorInfo errorInfo=ErrorInfo.builder()
                .message(ex.getMessage())
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.toString())
                .toContact("rgupta.mtech@gmail.com")
                .localDateTime(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorInfo);
    }
}
