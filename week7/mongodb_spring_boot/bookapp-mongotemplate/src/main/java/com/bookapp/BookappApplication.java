package com.bookapp;

import com.bookapp.entities.Book;
import com.bookapp.exceptions.BookNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

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


//	private void saveData() {
//		mongoTemplate.save(new Book("Core Java", 200, "Kathy Sierra", 1065.5));
//		mongoTemplate.save(new Book("JSP & Servlets", 350, "Kathy Sierra", 1749.0));
//		// mt.save(new Book(501, "JSP & Servlets", 350, "Kathy Sierra", 1749.0),"Book"); // save () with collection name 'Book'
//		mongoTemplate.save(new Book( "Spring in Action", 480, "Craig Walls", 940.75));
//		mongoTemplate.save(new Book("Pro Angular", 260, "Freeman", 1949.25));
//		mongoTemplate.save(new Book("HTML CSS", 100, "Thomas Powell", 2317.09));
//		mongoTemplate.save(new Book("Hibernate in Action", 180, "Gavin King", 889.25));
//		mongoTemplate.save(new Book( "Practical MongoDB", 180, "Shakuntala Gupta", 785.0));
//		mongoTemplate.save(new Book("Pro Spring Boot", 850, "Felipe Gutierrez", 2167.99));
//		mongoTemplate.save(new Book("Beginning jQuery", 180, "Franklin", 1500.00));
//		mongoTemplate.save(new Book("Java Design Patterns", 114, "Devendra Singh", 919.99));
//	}
}
