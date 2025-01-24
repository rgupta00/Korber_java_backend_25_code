package com.bankapp.service;

import com.bankapp.dao.Account;
import com.bankapp.exceptions.BEx;

import java.util.List;

public interface AccountService {
    public Account getById(int id);
    public List<Account> getAllAccounts();
    public void transfer(int from, int to, double amount)throws BEx;
    public void deposit(int id, double amount);
    public void withdraw(int id, double amount);

    public void delete(int id);
    public void addAccount(Account account);

}
