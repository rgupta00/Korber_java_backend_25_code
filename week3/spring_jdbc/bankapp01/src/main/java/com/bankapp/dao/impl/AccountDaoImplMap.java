package com.bankapp.dao.impl;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
@Repository(value = "mapAccountDao")
public class AccountDaoImplMap implements AccountDao {
    private Map<Integer, Account> accounts; // <id, account>
    private int counter;
    public AccountDaoImplMap(){
        counter=0;
        accounts=new HashMap<>();
        accounts.put(++counter, new Account(counter, "raj", 2000));
        accounts.put(++counter, new Account(counter, "ekta", 2000));
    }
    @Override
    public Account getById(int id) {
        return accounts.get(id);
    }

    @Override
    public List<Account> getAllAccounts() {
        System.out.println("---it is a map imp---");
        return new LinkedList<>(accounts.values());
    }

    @Override
    public void update(Account account) {
        accounts.put(account.getId(), account);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void addAccount(Account account) {

    }
}
