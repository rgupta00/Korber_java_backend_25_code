package com.accounts.controller;

import com.accounts.dto.AccountDto;
import com.accounts.dto.AccountInfoDto;
import com.accounts.dto.InfoDto;
import com.accounts.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "api")
@RestController
@AllArgsConstructor
public class AccountController {
    private  final AccountService accountService;
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
}
