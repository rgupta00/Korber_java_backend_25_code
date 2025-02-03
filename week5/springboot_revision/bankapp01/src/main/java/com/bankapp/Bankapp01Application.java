package com.bankapp;

import com.bankapp.entities.Account;
import com.bankapp.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class Bankapp01Application implements CommandLineRunner {

	@Autowired
	private AccountRepo accountRepo;

	public static void main(String[] args) {
		SpringApplication.run(Bankapp01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//i have this method to be used to init the db
		accountRepo.save(new Account("raj", new BigDecimal("1000")));
		accountRepo.save(new Account("ekta", new BigDecimal("2000")));
	}
}
