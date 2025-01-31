package com.busycoder.cards;

import com.busycoder.cards.dto.InfoDto;
import com.busycoder.cards.entities.Card;
import com.busycoder.cards.repo.CardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
@EnableConfigurationProperties(InfoDto.class)
public class CardsApplication implements CommandLineRunner {

	@Autowired
	private CardRepo cardRepo;


	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		//Card(String cardNumber, LocalDate issueDate, int totalLimit, String mobile)
		cardRepo.save(new Card(getCardNumber(), LocalDate.now(), 10000,"7088993300"));
		cardRepo.save(new Card(getCardNumber(), LocalDate.now(), 20000,"7988223300"));
	}
	private String getCardNumber(){
		long val=new Random().nextLong(1000_0000_0000_000L);
		Long value=1000_0000_0000_0000L+val;
		return value.toString();
	}
}
