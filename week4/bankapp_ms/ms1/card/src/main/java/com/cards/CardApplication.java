package com.cards;

import com.cards.dto.InfoDto;
import com.cards.entites.Card;
import com.cards.repo.CardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
@EnableConfigurationProperties(InfoDto.class)
public class CardApplication implements CommandLineRunner {

	@Autowired
	private CardRepo cardRepo;

	public static void main(String[] args) {
		SpringApplication.run(CardApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cardRepo.save(new Card(getCardNumber(), LocalDate.now(), 10000,"7088993300"));
		cardRepo.save(new Card(getCardNumber(), LocalDate.now(), 20000,"7988223300"));
	}
	private String getCardNumber(){
		long val=new Random().nextLong(1000_0000_0000_000L);
		Long value=1000_0000_0000_0000L+val;
		return value.toString();
	}
}
