package com.bankapp.util;

import com.bankapp.dto.AccountDto;
import com.bankapp.entities.Account;

public class ConvertUtil {

    public static AccountDto convertToAccountDto(Account account) {
        AccountDto accountDto = new AccountDto();
        accountDto.setId(account.getId());
        accountDto.setName(account.getName());
        accountDto.setBalance(account.getBalance());
        return accountDto;
    }


    public static Account convertToAccount(AccountDto accountDto) {
        Account account = new Account();
        account.setId(accountDto.getId());
        account.setName(accountDto.getName());
        account.setBalance(accountDto.getBalance());
        return account;
    }
}
