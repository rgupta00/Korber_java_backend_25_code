package com.bankapp.controller;

import com.bankapp.dto.DepositDto;
import com.bankapp.dto.TransferDto;
import com.bankapp.dto.WithdrawDto;
import com.bankapp.entities.Account;
import com.bankapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api")
public class AccountController {

    private AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    //transfer

    @PostMapping(path="transfer")
    public String transfer(@RequestBody TransferDto transferDto) {
        accountService.transfer(transferDto.getFromAccountId(), transferDto.getToAccountId(), transferDto.getAmount());
        return "fund is transfered successfully";
    }

    @PostMapping(path="deposit")
    public String deposit(@RequestBody DepositDto depositDto) {
        accountService.deposit(depositDto.getAccId(), depositDto.getAmount());
        return "fund is deposit successfully";
    }

    @PostMapping(path="withdraw")
    public String withdraw(@RequestBody WithdrawDto withdrawDto) {
        accountService.withdraw(withdrawDto.getAccId(), withdrawDto.getAmount());
        return "fund is withdraw successfully";
    }


    //get all
    @GetMapping(path="accounts")
    public List<Account> getAllAccounts() {
        return accountService.getAll();
    }

    //get by id
    @GetMapping(path="accounts/{id}")
    public Account getAccountById(@PathVariable int id) {
        return accountService.findById(id);
    }

    //deposit

    //withdraw


}
