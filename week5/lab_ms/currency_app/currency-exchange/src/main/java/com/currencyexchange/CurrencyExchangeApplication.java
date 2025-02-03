package com.currencyexchange;

import com.currencyexchange.repo.ExchangeValue;
import com.currencyexchange.repo.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class CurrencyExchangeApplication implements CommandLineRunner {

	@Autowired
	private ExchangeValueRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new ExchangeValue("USD", "INR", new BigDecimal(85)));
		repository.save(new ExchangeValue("EURO", "INR", new BigDecimal(95)));


		List<ExchangeValue> list=repository.findAll();
		list.forEach(System.out::println);
		System.out.println("----------------------");
	}
}
