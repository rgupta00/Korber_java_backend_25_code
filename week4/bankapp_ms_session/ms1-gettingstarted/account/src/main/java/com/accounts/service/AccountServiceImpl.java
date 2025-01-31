package com.accounts.service;

import com.accounts.dto.AccountDto;
import com.accounts.dto.AccountInfoDto;
import com.accounts.dto.CardDto;
import com.accounts.dto.LoanDto;
import com.accounts.repo.AccountRepo;
import com.accounts.serviceproxy.CardServiceProxy;
import com.accounts.serviceproxy.LoanServiceProxy;
import com.accounts.util.ConvertDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private  AccountRepo accountRepo;

    @Autowired
    private CardServiceProxy cardServiceProxy;

    @Autowired
    private LoanServiceProxy loanServiceProxy;

    @Override
    public List<AccountDto> getAll() {
        return accountRepo.findAll().stream().map(ConvertDto::toAccountDto).toList();
    }

    @Override
    public AccountDto getByMobile(String mobile) {
        return ConvertDto.toAccountDto(accountRepo.findByMobile(mobile));
    }

    @Override
    public AccountInfoDto getAccountDetails(String mobile) {
        // 1. get the loan for that mobile no
        //2. get the card for that mobile no
        //3. get the account for that mobile no
        //put all into AccountInfoDto and return to the user
        AccountInfoDto accountInfoDto=new AccountInfoDto();
        accountInfoDto.setAccountDto(getByMobile(mobile));
        CardDto carDto = cardServiceProxy.findByMobileNumber(mobile);
        LoanDto loanDto = loanServiceProxy.getByMobile(mobile);
        accountInfoDto.setCardDto(carDto);
        accountInfoDto.setLoanDto(loanDto);
        return accountInfoDto;
    }

    @Override
    public String addAccount(AccountDto accountDto) {
        accountRepo.save(ConvertDto.toAccount(accountDto));
        return "account is added";
    }
}
