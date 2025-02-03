package com.busycoder.accounts.dto;

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
}