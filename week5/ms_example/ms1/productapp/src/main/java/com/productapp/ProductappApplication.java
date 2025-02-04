package com.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.math.BigDecimal;
@EnableDiscoveryClient
@EnableFeignClients("com.productapp.proxyservice")
@SpringBootApplication
public class ProductappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductappApplication.class, args);
	}

}
