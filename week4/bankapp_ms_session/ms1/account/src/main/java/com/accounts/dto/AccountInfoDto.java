package com.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountInfoDto {
    private CardDto cardDto;
    private LoanDto loanDto;
    private AccountDto accountDto;
}
