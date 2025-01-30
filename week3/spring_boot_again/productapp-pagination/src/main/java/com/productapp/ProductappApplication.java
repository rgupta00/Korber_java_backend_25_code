package com.productapp;

import com.productapp.dto.InfoDto;
import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.math.BigDecimal;

//CommandLineRunner

@SpringBootApplication
@EnableConfigurationProperties(InfoDto.class)
@OpenAPIDefinition(info = @Info(title = "Productstore API", version = "2.0" , description = "XYZ productstore API"))
public class ProductappApplication implements CommandLineRunner {

	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(ProductappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		productRepo.save(new Product("laptop", BigDecimal.valueOf(50000.00)));
//		productRepo.save(new Product("mobile", BigDecimal.valueOf(5000.00)));
	//	System.out.println("-----------added----------------");
	}
}
