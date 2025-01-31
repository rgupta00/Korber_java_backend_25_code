package com.bankapp.service;

import com.bankapp.entities.Account;
import com.bankapp.exception.AccountNotFoundException;
import com.bankapp.repo.AccountRepo;

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
    public void transfer(int from, int to, BigDecimal amount) {
        Account fromAcc=findById(from);
        Account toAcc=findById(to);
        fromAcc.setBalance(fromAcc.getBalance().subtract(amount));
        toAcc.setBalance(toAcc.getBalance().add(amount));
        accountRepo.save(fromAcc);
        accountRepo.save(toAcc);
    }

    @Override
    public void deposit(int id, BigDecimal amount) {
        Account account=findById(id);
        account.setBalance(account.getBalance().add(amount));
        accountRepo.save(account);
    }

    @Override
    public void withdraw(int id, BigDecimal amount) {
        Account account=findById(id);
        account.setBalance(account.getBalance().subtract(amount));
        accountRepo.save(account);
    }

    @Override
    public Account findById(int id) {
        return accountRepo.findById(id)
                .orElseThrow(()-> new AccountNotFoundException("account with id "+ id+ " is not found"));
    }

    @Override
    public List<Account> getAll() {
        return accountRepo.findAll();
    }
}
