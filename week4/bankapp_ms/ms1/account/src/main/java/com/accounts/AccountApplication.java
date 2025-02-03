package com.accounts;

import com.accounts.dto.InfoDto;
import com.accounts.entities.Account;
import com.accounts.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("com.accounts.serviceproxy")
@EnableConfigurationProperties(InfoDto.class)
@SpringBootApplication
public class AccountApplication implements CommandLineRunner {

	@Autowired
	private AccountRepo accountRepo;

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		accountRepo.save(new Account("raj",1000,"raj@gmail.com",
				"7088993300"));

		accountRepo.save(new Account("ekta",1000,"ekta@gmail.com",
				"7788223300"));
	}
}
