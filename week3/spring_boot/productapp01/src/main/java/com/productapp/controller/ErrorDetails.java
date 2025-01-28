package com.productapp.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorDetails {
    private String errorMessage;
    private LocalDateTime timestamp;
    private int errorCode;
    private String toContact;

}
