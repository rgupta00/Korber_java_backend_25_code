package com.productapp;

import com.productapp.entites.Product;
import com.productapp.repo.ProductRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@SpringBootApplication
public class Productapp01Application implements CommandLineRunner {

	@Autowired
	private ProductRepo productRepo;

	private Logger logger= LoggerFactory.getLogger(Productapp01Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Productapp01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		logger.info("product app is started");
//		productRepo.save(new Product("laptop",  BigDecimal.valueOf(10000.00)));
//		productRepo.save(new Product("table",  BigDecimal.valueOf(4000.00)));
//		System.out.println("----------product is added------");
	}
}
/*

	@Autowired
	private DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(Productapp01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if(dataSource!=null) {
			System.out.println("ds is configre :)");
		}
		if(jdbcTemplate!=null) {
			System.out.println("jdbcTemplate is configre :)");
		}
	}
 */