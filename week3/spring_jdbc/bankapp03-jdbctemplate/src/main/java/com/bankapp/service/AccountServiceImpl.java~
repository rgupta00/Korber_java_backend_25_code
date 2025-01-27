package com.bankapp.service;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import com.bankapp.exceptions.AEx;
import com.bankapp.exceptions.AccountNotFoundException;
import com.bankapp.exceptions.BEx;
import com.bankapp.service.aspect.Loggable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service(value = "as")
//Service layer = BL + ccc(cross cutting concerns) NFR
@Transactional(readOnly = true, timeout = 1000)
public class AccountServiceImpl implements AccountService{
    private AccountDao accountDao;
    @Autowired
    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public Account getById(int id) {
        Account account=accountDao.getById(id);
        if(account!=null)
            return  account;
        else
            throw  new AccountNotFoundException("Account not found");

    }

    @Loggable
    @Override
    public List<Account> getAllAccounts() {
        List<Account> accounts= accountDao.getAllAccounts();
        return accounts;
    }

    @Loggable
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void transfer(int from, int to, double amount) throws BEx{
           Account fromAccount=accountDao.getById(from);
            Account toAccount=accountDao.getById(to);
            fromAccount.setBalance(fromAccount.getBalance()-amount);
            toAccount.setBalance(toAccount.getBalance()+amount);
            accountDao.update(fromAccount);
            accountDao.update(toAccount);
            foo();
    }

    @Transactional
    @Override
    public void deposit(int id, double amount) {
        Account account=accountDao.getById(id);
        account.setBalance(account.getBalance()+amount);
        accountDao.update(account);
    }

    @Transactional
    @Override
    public void withdraw(int id, double amount) {
        Account account=accountDao.getById(id);
        account.setBalance(account.getBalance()-amount);
        accountDao.update(account);
    }

    @Transactional
    @Override
    public void delete(int id) {
        accountDao.delete(id);
    }

    @Transactional
    @Override
    public void addAccount(Account account) {
        accountDao.addAccount(account);
    }
}
