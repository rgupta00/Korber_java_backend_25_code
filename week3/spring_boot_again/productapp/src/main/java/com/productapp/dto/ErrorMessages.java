package com.productapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorMessages {
    private LocalDateTime timestamp;
    private int status;
    private String message;
    private String toContact;
}
