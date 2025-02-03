package com.accounts.service;

import com.accounts.dto.AccountDto;
import com.accounts.dto.AccountInfoDto;

import java.util.List;

public interface AccountService {
    public List<AccountDto> getAll();
    public AccountDto getByMobile(String mobile);
    public AccountInfoDto getAccountDetails(String mobile);
    public String addAccount(AccountDto accountDto);
}