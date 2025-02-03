package com.customer_service;

import com.customer_service.model.Customer;
import com.customer_service.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerServiceApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//public Customer(String name, String email, String phone, String address, String city, String state, String country)
		customerRepository.save(new Customer("raj", "raj@gmail.com", "123456789",
				"A 31 Krishnanagar", "Delhi", "Delhi", "India"));
		customerRepository.save(new Customer("ekta", "ekta@gmail.com", "193456789",
				"M 20", "MahadevPura", "Karnataka", "India"));
		System.out.println("--------------");
	}
}
