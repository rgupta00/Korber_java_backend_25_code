package com.busycoder.accounts.servies;

import com.busycoder.accounts.dto.AccountDto;
import com.busycoder.accounts.dto.AccountInfoDto;

import java.util.List;

public interface AccountService {
    public List<AccountDto> getAll();
    public AccountDto getByMobile(String mobile);
    public AccountInfoDto getAccountDetails(String mobile);
    public String addAccount(AccountDto accountDto);
}