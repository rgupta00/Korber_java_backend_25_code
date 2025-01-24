package com.bankapp.dao;

import java.util.List;

public interface AccountDao {
    public Account getById(int id);
    public List<Account> getAllAccounts();
    public void update(Account account);

    public void delete(int id);
    public void addAccount(Account account);
}
