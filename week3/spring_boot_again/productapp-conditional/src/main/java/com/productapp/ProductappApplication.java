package com.productapp;

import com.productapp.condition.DataSourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
	@SpringBootConfiguration
	@EnableAutoConfiguration
	@ComponentScan
 */
@SpringBootApplication
public class ProductappApplication implements CommandLineRunner {

	@Autowired
	private DataSourceConfig dataSourceConfig;

	public static void main(String[] args) {
		SpringApplication.run(ProductappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		dataSourceConfig.makeConnection();
	}
}
