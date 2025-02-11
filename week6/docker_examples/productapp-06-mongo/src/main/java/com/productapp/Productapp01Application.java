package com.productapp;

import com.productapp.repo.Product;
import com.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.math.BigDecimal;
@SpringBootApplication
//@EnableCaching
@EnableScheduling
//@ComponentScan(basePackages = {"com.productapp"})
public class Productapp01Application implements CommandLineRunner {

	@Autowired
	private ProductService productService;

//	@Autowired
//	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(Productapp01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//productService.addProduct(new Product("laptop dell", BigDecimal.valueOf(42000)));
//		if(jdbcTemplate!=null){
//			System.out.println("jdbcTemplate is confired...");
//		}else{
//			System.out.println("not confi");
//		}
	}
}
