package com.busycoder.accounts.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class CardDto {
    private int cardId;
    private String cardNumber;
    private LocalDate issueDate;
    private int totalLimit;
    private String mobile;

    public CardDto(String cardNumber, LocalDate issueDate, int totalLimit, String mobile) {
        this.cardNumber = cardNumber;
        this.issueDate = issueDate;
        this.totalLimit = totalLimit;
        this.mobile = mobile;
    }
}