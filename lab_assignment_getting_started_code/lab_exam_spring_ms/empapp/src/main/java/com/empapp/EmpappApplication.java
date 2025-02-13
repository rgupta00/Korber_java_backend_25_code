package com.empapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@EnableFeignClients("com.empapp.serviceproxy")
@SpringBootApplication
public class EmpappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpappApplication.class, args);
	}

}
