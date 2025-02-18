package com.bookapp;

import com.bookapp.entities.Book;
import com.bookapp.exceptions.BookNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

@SpringBootApplication
public class BookappApplication implements CommandLineRunner {

	@Autowired
	private MongoTemplate mongoTemplate;


	public static void main(String[] args) {
		SpringApplication.run(BookappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	}


	private void insertAllRecords() {

//		bookRepository.save(new Book("algebra", 300, "gunika", 900.0));
//		bookRepository.save(new Book("adv maths", 300, "ektga", 500.0));
//		bookRepository.save(new Book("spring boot", 300, "raj", 700.0));
//		bookRepository.save(new Book("python adv", 200, "raj", 600.0));
	}
}
