package com.bookapp;

import com.bookapp.entities.Book;
import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

@SpringBootApplication
public class BookappApplication implements CommandLineRunner {

	//jdbc => jdbcTemplate vs mongodb => mongoTemplate
	//jpa => JpaRepository	vs mongoRepository
	@Autowired
	private BookRepo bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		insertAllRecords();
		//get all records
		//printAll();

		//get by id
		//getById();

		//update by id
		//updateAnBookById();

		//deleteById();
		//getByIdQuery();
		//getBookByPagesLessThenQuery
		//List<Book> getBookByPagesLessThenQuery=bookRepository.getBookByPagesLessThenQuery(310);
		//getBookByPagesLessThenQuery.forEach(System.out::println);

	}

	private void getByIdQuery() {
		Book book=bookRepository.getBookByIdQuery("67b2dc6c23010e2dd3e32204");
		System.out.println(book);
	}


	private void deleteById() {
		Book book = bookRepository.findById("67b2d50b88254a44fd25fb4a")
				.orElseThrow(()-> new BookNotFoundException("book with id is not found"));
		bookRepository.delete(book);
	}

	private void updateAnBookById() {
		Book book = bookRepository.findById("67b2d50b88254a44fd25fb4a")
				.orElseThrow(()-> new BookNotFoundException("book with id is not found"));
		book.setCost(book.getCost()*1.1);
		bookRepository.save(book);
	}

	private void getById() {
		Book book = bookRepository.findById("67b2d50b88254a44fd25fb4a")
				.orElseThrow(()-> new BookNotFoundException("book with id is not found"));
		System.out.println(book);
	}

	private void printAll() {
		List<Book> getAll = bookRepository.findAll();
		getAll.forEach(System.out::println);
	}

	private void insertAllRecords() {
		bookRepository.save(new Book("algebra", 300, "gunika", 900.0));
		bookRepository.save(new Book("adv maths", 300, "ektga", 500.0));
		bookRepository.save(new Book("spring boot", 300, "raj", 700.0));
		bookRepository.save(new Book("python adv", 200, "raj", 600.0));
	}
}
