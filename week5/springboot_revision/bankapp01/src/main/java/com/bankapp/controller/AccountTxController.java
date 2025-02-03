package com.bankapp.controller;

import com.bankapp.dto.DepositDto;
import com.bankapp.dto.TransferDto;
import com.bankapp.dto.WithdrawDto;
import com.bankapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class AccountTxController {
    private AccountService accountService;

    @Autowired
    public AccountTxController(AccountService accountService) {
        this.accountService = accountService;
    }
    @PostMapping("transfer")
    public String transfer( @RequestBody TransferDto transferDto){
        return accountService.transfer(transferDto);
    }
    @PostMapping("deposit")
    public String deposit(@RequestBody DepositDto depositDto) {
        return accountService.deposit(depositDto);
    }
    @PostMapping("withdraw")
    public String withdraw(@RequestBody WithdrawDto withdrawDto) {
        return accountService.withdraw(withdrawDto);
    }
}
