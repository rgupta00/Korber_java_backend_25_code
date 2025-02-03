package com.bankapp.controller;

import com.bankapp.dto.DepositDto;
import com.bankapp.dto.TransferDto;
import com.bankapp.dto.WithdrawDto;
import com.bankapp.service.AccountService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> transfer( @Valid @RequestBody TransferDto transferDto){
        return ResponseEntity.ok(accountService.transfer(transferDto));
    }
    @PostMapping("deposit")
    public ResponseEntity<String> deposit(@RequestBody DepositDto depositDto) {
        return ResponseEntity.ok(accountService.deposit(depositDto));
    }
    @PostMapping("withdraw")
    public ResponseEntity<String> withdraw(@RequestBody WithdrawDto withdrawDto) {
        return ResponseEntity.ok(accountService.withdraw(withdrawDto));
    }

}
