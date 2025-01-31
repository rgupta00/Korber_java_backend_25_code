package com.busycoder.accounts.controller;

import com.busycoder.accounts.dto.AccountDto;
import com.busycoder.accounts.dto.AccountInfoDto;
import com.busycoder.accounts.dto.InfoDto;
import com.busycoder.accounts.serviceproxy.CardServiceProxy;
import com.busycoder.accounts.serviceproxy.LoanServiceProxy;
import com.busycoder.accounts.servies.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping(path = "api")
@RestController
@AllArgsConstructor
public class AccountController {
    private final AccountService accountService;
    private final InfoDto appInfoDto;


    @GetMapping("contact-info")
    public InfoDto appInfo(){
        return   appInfoDto;
    }

    @GetMapping("fetchall")
    public List<AccountDto> getAll(){
        return   accountService.getAll();
    }

    @GetMapping("fetch")
    public AccountDto getByMobile(@RequestParam(name="mobile") String mobile){
      return   accountService.getByMobile(mobile);
    }
	
    @GetMapping("accountsdetails")
    public AccountInfoDto getAccountDetails(@RequestParam(name = "mobile") String mobile){
        return accountService.getAccountDetails(mobile);
    }
    @PostMapping(path = "add")
    public String addAccount(@RequestBody AccountDto accountDto){
        return accountService.addAccount(accountDto);
    }
}
