package com.accounts.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AccountDto {
    private int accId;
    private String name;
    private double balance;
    private String email;
    private String mobile;

    public AccountDto(String name, double balance, String email, String mobile) {
        this.name = name;
        this.balance = balance;
        this.email = email;
        this.mobile = mobile;
    }
}
