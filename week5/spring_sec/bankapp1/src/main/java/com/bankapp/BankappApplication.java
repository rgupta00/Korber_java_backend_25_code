package com.bankapp;

import com.bankapp.repo.UserEntity;
import com.bankapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootApplication
public class BankappApplication implements CommandLineRunner {
//	@Autowired
//	private UserService userService;
//
//	@Autowired
//	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(BankappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		userService.addUserEntity(new UserEntity("raj",passwordEncoder.encode("raj123"), List.of("ROLE_ADMIN","ROLE_MGR","ROLE_CLERK")));
//		userService.addUserEntity(new UserEntity("ekta",passwordEncoder.encode("ekta123"), List.of("ROLE_MGR","ROLE_CLERK")));
//		userService.addUserEntity(new UserEntity("gun",passwordEncoder.encode("gun123"), List.of("ROLE_CLERK")));
//		System.out.println("-----------------");
	}
}
