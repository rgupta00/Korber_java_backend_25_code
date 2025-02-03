package com.bankapp.controller;

import com.bankapp.dto.ErrorResponeDto;
import com.bankapp.exceptions.BankAccountNotFoundException;
import com.bankapp.exceptions.NotSufficientFundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@RestControllerAdvice
public class BankAppExceptionHandlerController {

    @ExceptionHandler(BankAccountNotFoundException.class)
    public ResponseEntity<ErrorResponeDto> handleBankAccountNotFoundException(BankAccountNotFoundException ex) {
        ErrorResponeDto errorResponeDto=ErrorResponeDto
                .builder()
                .timeStamp(LocalDateTime.now())
                .errorCode(HttpStatus.NOT_FOUND.toString())
                .errorMessge(ex.getMessage())
                .toContact("nitish@gmail.com")
                .build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponeDto);
    }
    @ExceptionHandler(NotSufficientFundException.class)
    public ResponseEntity<ErrorResponeDto> handleNotSufficientException(NotSufficientFundException ex) {
        ErrorResponeDto errorResponeDto=ErrorResponeDto
                .builder()
                .timeStamp(LocalDateTime.now())
                .errorCode(HttpStatus.INTERNAL_SERVER_ERROR.toString())
                .errorMessge(ex.getMessage())
                .toContact("nitish@gmail.com")
                .build();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponeDto);
    }

    //MethodArgumentNotValidException
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponeDto> handle400(MethodArgumentNotValidException ex) {

        String errorMessage=ex.getBindingResult()
                .getAllErrors()
                .stream()
                .map(error->error.getDefaultMessage())
                .collect(Collectors.joining(", "));



        ErrorResponeDto errorResponeDto=ErrorResponeDto
                .builder()
                .timeStamp(LocalDateTime.now())
                .errorCode(HttpStatus.BAD_REQUEST.toString())
                .errorMessge(errorMessage)
                .toContact("nitish@gmail.com")
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponeDto);
    }
}
