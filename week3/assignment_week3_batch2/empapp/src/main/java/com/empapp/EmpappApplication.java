package com.empapp;

import com.empapp.repo.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class EmpappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpappApplication.class, args);
	}
}
