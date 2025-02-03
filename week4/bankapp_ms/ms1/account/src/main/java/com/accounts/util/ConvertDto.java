package com.accounts.util;

import com.accounts.dto.AccountDto;
import com.accounts.entities.Account;

public class ConvertDto {

    public static AccountDto toAccountDto(Account account) {
        AccountDto accountDto = new AccountDto();
        accountDto.setAccId(account.getAccId());
        accountDto.setName(account.getName());
        accountDto.setBalance(account.getBalance());
        accountDto.setEmail(account.getEmail());
        accountDto.setMobile(account.getMobile());
        return accountDto;

    }
    public static Account toAccount(AccountDto accountDto) {
        Account account = new Account();
        account.setAccId(accountDto.getAccId());
        account.setName(accountDto.getName());
        account.setBalance(accountDto.getBalance());
        account.setEmail(accountDto.getEmail());
        account.setMobile(accountDto.getMobile());
        return account;

    }
}
