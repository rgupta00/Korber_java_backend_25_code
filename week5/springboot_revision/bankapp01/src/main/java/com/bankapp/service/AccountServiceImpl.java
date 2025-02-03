package com.bankapp.service;

import com.bankapp.dto.AccountDto;
import com.bankapp.dto.DepositDto;
import com.bankapp.dto.TransferDto;
import com.bankapp.dto.WithdrawDto;
import com.bankapp.entities.Account;
import com.bankapp.exceptions.BankAccountNotFoundException;
import com.bankapp.repo.AccountRepo;
import com.bankapp.util.ConvertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
@Service
@Transactional
public class AccountServiceImpl implements AccountService{

    private AccountRepo accountRepo;

    @Autowired
    public AccountServiceImpl(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    @Override
    public List<AccountDto> getAllAccounts() {
        return accountRepo.findAll()
                .stream()
                .map(ConvertUtil::convertToAccountDto).toList();
    }

    @Override
    public AccountDto getAccount(int id) {
        return accountRepo
                .findById(id)
                .map(ConvertUtil::convertToAccountDto)
                .orElseThrow(()-> new BankAccountNotFoundException("account with id "+ id + " not found"));
    }

    @Override
    public String transfer(TransferDto transferDto) {
        //get both the accounts.
        Account fromAcc=ConvertUtil.convertToAccount(getAccount(transferDto.getFromAccountId()));

        Account toAcc=ConvertUtil.convertToAccount(getAccount(transferDto.getToAccountId()));

        fromAcc.setBalance(fromAcc.getBalance().subtract(transferDto.getAmount()));
        toAcc.setBalance(toAcc.getBalance().add(transferDto.getAmount()));

        accountRepo.save(fromAcc);
        accountRepo.save(toAcc);

        return "fund is transferred successfully";
    }

    @Override
    public String deposit(DepositDto depositDto) {
        Account acc=ConvertUtil.convertToAccount(getAccount(depositDto.getAccountId()));
        acc.setBalance(acc.getBalance().add(depositDto.getAmount()));
        accountRepo.save(acc);
        return "deposit done successfully";
    }

    @Override
    public String withdraw(WithdrawDto withdrawDto) {
        Account acc=ConvertUtil.convertToAccount(getAccount(withdrawDto.getAccountId()));
        acc.setBalance(acc.getBalance().subtract(withdrawDto.getAmount()));
        accountRepo.save(acc);
        return "withdraw done successfully";
    }
}
