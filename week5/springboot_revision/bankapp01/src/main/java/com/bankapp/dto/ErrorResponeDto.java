package com.bankapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorResponeDto {
    private String errorMessge;
    private String errorCode;
    private String toContact;;
    private LocalDateTime timeStamp;

}
