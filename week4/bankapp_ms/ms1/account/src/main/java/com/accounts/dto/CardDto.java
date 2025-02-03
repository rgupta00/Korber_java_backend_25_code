package com.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CardDto {

    private int cardId;
    private String cardNumber;
    private LocalDate issueDate;
    private int totalLimit;
    private String mobile;
}
