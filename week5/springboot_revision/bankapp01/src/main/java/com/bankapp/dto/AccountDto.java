package com.bankapp.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AccountDto {
    private int id;
    private String name;
    private BigDecimal balance;

    public AccountDto(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }
}
