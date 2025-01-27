package com.productapp.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
	@SpringBootConfiguration
	@EnableAutoConfiguration
	@ComponentScan
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.productapp"})
public class ProductappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductappApplication.class, args);
	}

}
