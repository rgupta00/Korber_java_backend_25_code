package com.empapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableFeignClients("com.empapp.proxyservice")
@SpringBootApplication
public class EmpappconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpappconsumerApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
