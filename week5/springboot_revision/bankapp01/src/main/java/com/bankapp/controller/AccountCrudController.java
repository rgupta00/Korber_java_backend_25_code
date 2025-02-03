package com.bankapp.controller;

import com.bankapp.dto.AccountDto;
import com.bankapp.dto.DepositDto;
import com.bankapp.dto.TransferDto;
import com.bankapp.dto.WithdrawDto;
import com.bankapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class AccountCrudController {

    private AccountService accountService;

    @Autowired
    public AccountCrudController(AccountService accountService) {
        this.accountService = accountService;
    }
    //get All account
    @GetMapping("accounts")
    public ResponseEntity<List<AccountDto>> getAllAccounts() {
        return ResponseEntity.ok(accountService.getAllAccounts());
    }
    //get by id
    @GetMapping("accounts/{id}")
    public ResponseEntity<AccountDto> getAccount(@PathVariable int id) {
        return ResponseEntity.ok(accountService.getAccount(id));
    }

    //add

    //update

    //delete
}



