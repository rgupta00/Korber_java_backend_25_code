package com.bankapp.service;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import com.bankapp.dao.impl.AccountDaoImplJdbc;
import com.bankapp.dao.impl.AccountDaoImplMap;
import com.bankapp.exceptions.AccountNotFoundException;
import com.bankapp.service.aspect.Loggable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "as")
//Service layer = BL + ccc(cross cutting concerns) NFR
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
    public void transfer(int from, int to, double amount) {
           Account fromAccount=accountDao.getById(from);
            Account toAccount=accountDao.getById(to);
            fromAccount.setBalance(fromAccount.getBalance()-amount);
            toAccount.setBalance(toAccount.getBalance()+amount);
            accountDao.update(fromAccount);
            accountDao.update(toAccount);
    }

    @Override
    public void deposit(int id, double amount) {
        Account account=accountDao.getById(id);
        account.setBalance(account.getBalance()+amount);
        accountDao.update(account);
    }

    @Override
    public void withdraw(int id, double amount) {
        Account account=accountDao.getById(id);
        account.setBalance(account.getBalance()-amount);
        accountDao.update(account);
    }
}
