package com.productapp.controller;

import com.productapp.dto.ErrorMessages;
import com.productapp.excetions.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

//AOP
@RestControllerAdvice //throws advice
public class AppExceptionController {
    //i want to write the code that will run if any ProductNotFoundException is thrown

    /// MethodArgumentNotValidException
    //

    @Value("${PRODUCT_APP_ERROR_500}")
    private String message500;

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorMessages> handleException400(MethodArgumentNotValidException ex) {
        //i want to get exact response
        String message=ex.getBindingResult()
                .getAllErrors()
                .stream()
                .map(error -> error.getDefaultMessage())
                .collect(Collectors.joining(" ,"));

        ErrorMessages errorMessages = ErrorMessages
                .builder().timestamp(LocalDateTime.now())
                .status(400).
                message(message)
                .toContact("ravi@abc.com")
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessages);
    }

    //@ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMessages> handleException500(Exception ex) {
        ErrorMessages errorMessages = ErrorMessages
                .builder().timestamp(LocalDateTime.now())
                .status(500).
                message(message500)
                .toContact("ravi@abc.com")
                .build();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessages);
    }


    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorMessages> handleProductNotFoundException(ProductNotFoundException ex) {
        ErrorMessages errorMessages = ErrorMessages
                .builder().timestamp(LocalDateTime.now())
                .status(404).
                message(ex.getMessage())
                .toContact("ravi@abc.com")
                .build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessages);
    }
}
