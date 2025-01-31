package com.bankapp;

import com.bankapp.entities.Account;
import com.bankapp.repo.AccountRepo;
import com.bankapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class BankappAssignmentApplication implements CommandLineRunner {

	@Autowired
	private AccountRepo accountRepo;


	public static void main(String[] args) {
		SpringApplication.run(BankappAssignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		accountRepo.save(new Account("raj", new BigDecimal(1000)));
		accountRepo.save(new Account("ekta", new BigDecimal(1000)));
		System.out.println("-----------added-----");
	}
}
