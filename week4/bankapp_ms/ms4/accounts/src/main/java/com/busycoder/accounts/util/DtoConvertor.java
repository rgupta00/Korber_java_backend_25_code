package com.busycoder.accounts.util;

import com.busycoder.accounts.dto.AccountDto;
import com.busycoder.accounts.entities.Account;

public class DtoConvertor {
    private AccountDto accountDto;

    public static  AccountDto entityToDto(Account account){
        AccountDto accountDto = new AccountDto();
        accountDto.setAccId(account.getAccId());
        accountDto.setName(account.getName());
        accountDto.setBalance(account.getBalance());
        accountDto.setEmail(account.getEmail());
        accountDto.setMobile(account.getMobile());
        return accountDto;
    }

    public static Account dtoToEntity(AccountDto accountDto){
        Account account = new Account();
        account.setAccId(accountDto.getAccId());
        account.setName(accountDto.getName());
        account.setBalance(accountDto.getBalance());
        account.setEmail(accountDto.getEmail());
        account.setMobile(accountDto.getMobile());
        return account;
    }
}
