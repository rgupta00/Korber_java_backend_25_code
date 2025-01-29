package com.busycoder.accounts.dto;

import lombok.Data;

@Data
public class AccountInfoDto {
    private AccountDto accountDto;
    private CardDto cardDto;
    private LoanDto loanDto;
}
