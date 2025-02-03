package com.bookapp;

import com.bookapp.entities.Book;
import com.bookapp.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookappApplication implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//insertRecords();
		//printAll();
		//getById();
		//saveRecord();
		//updateRecord();
		//deleteRecord();
	}

	private void saveRecord() {
		Book book = new Book("elementry maths", 300, "gunika", 900.0);
		bookRepository.save(book);

	}

	private void getById() {
		bookRepository.findById("679e03dddf9d694f4539a733").ifPresent(System.out::println);
	}

	private void printAll() {
		bookRepository.findAll().forEach(System.out::println);
	}

	private void insertRecords() {
		bookRepository.save(new Book("algebra", 300, "gunika", 900.0));
		bookRepository.save(new Book("adv maths", 300, "ektga", 500.0));
		bookRepository.save(new Book("spring boot", 300, "raj", 700.0));
		bookRepository.save(new Book("python adv", 200, "raj", 600.0));
	}
}
