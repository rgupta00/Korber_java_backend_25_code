package com.bankapp.service;

import com.bankapp.entities.Account;

import java.math.BigDecimal;
import java.util.List;

public interface AccountService {
	public void transfer(int from, int to, BigDecimal amount);
	public void deposit(int id, BigDecimal amount);
	public void withdraw(int id, BigDecimal amount);
	public Account findById(int id);
	public List<Account> getAll();
}
