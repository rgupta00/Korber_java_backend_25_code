package com.bookapp;

import com.bookapp.dto.BookSelectedData;
import com.bookapp.entities.Book;
import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class BookappApplication implements CommandLineRunner {

	@Autowired
	private BookRepo bookRepo;

	public static void main(String[] args) {
		SpringApplication.run(BookappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {



		//getting book by id
		//bookRepo.deleteAll();
		//insertAllRecords();
		//print all
//		List<Book> books=bookRepo.findAll();
//		books.forEach(System.out::println);

//		@Query("{id :?0}")
//		Optional<Book> getBookById(String id);

//		Optional<Book> bookOptional=bookRepo.getBookById("67b56005335fbd4e69bdc2c6");
//		System.out.println("--------------------------------");
//		Book book= bookOptional.orElseThrow(()-> new BookNotFoundException("book with "+bookOptional.get().getId()+" is not found"));
//
//		System.out.println(book);



//		// SELECT * FROM BOOK where pages<?
//		@Query("{pages : {$lt: ?0}}")
//		public List<Book> getBooksByPagesLessThan(Integer pages);

//		List<Book> books=bookRepo.getBooksByPagesLessThan(223);
//		books.forEach(System.out::println);

//
//		// SELECT * FROM BOOK where pages>=?
//		@Query("{ pages : { $gte: ?0 } }")
//		public List<Book> getBooksByPagesGreaterThanEqualTo(Integer pages);
//
//
//		// SELECT * FROM BOOK where pages=?
//		@Query("{ pages : ?0 }")
//		List<Book> getBooksByPages(Integer pages);
//
//		// SELECT * FROM BOOK where author = ?
//		@Query("{author : ?0}")
//		List<Book> getBooksByAuthor(String author);
//
//		//SELECT * FROM BOOK where author = ? and cost=?
//		//@Query("{author: ?0, cost: ?1}")
//		@Query("{$and :[{author: ?0},{cost: ?1}] }")
//		List<Book> getBooksByAuthorAndCost(String author, Double cost);

//		List<Book> books=bookRepo.getBooksByAuthorAndCost("ekta", 510.0);
//		books.forEach(System.out::println);

//
//		//select * from book where author=? or name=?
//		@Query("{$or :[{author: ?0},{name: ?1}]}")
//		List<Book> getBooksByAuthorOrName(String author, String name);

//		List<Book> books=bookRepo.getBooksByAuthorOrName("ekta", "spring boot");
//		books.forEach(System.out::println);


//		//select count(*) from book where author=?
//		@Query(value = "{author: ?0}", count = true)
//		Integer getBooksCountByAuthor(String author);

//		Integer result= bookRepo.getBooksCountByAuthor("ekta");
//		System.out.println(result);
//
//		//Sorting
//		@Query(value = "{author:?0}", sort = "{name:1}")
//		//ASC
//		//@Query(value = "{author=?0}", sort= "{name:-1}") //DESC
//		List<Book> getBooksByAuthorSortByName(String author);
//
//		//@Query with Projection
//		// only data of name & author properties will be displayed
//
//		@Query(value = "{pages: ?0}", fields = "{name:1, author:1}")
////@Query(value= "{pages: ?0}", fields="{name:1, author:1, cost:1, pages:1}") // will display all properties data
//		List<Book> getBookNameAndAuthorByPages(Integer pages);

		List<BookSelectedData> books=bookRepo.getBookNameAndAuthorByPages(300);
		books.forEach(System.out::println);

//
//		// SQL Equivalent : SELECT * FROM BOOK select * from books where author=?
//		@Query(value = "{author : ?0}")
//		List<Book> getAllBooksByAuthor(String author);
//
//		// MongoDB Regular Expressions
//		@Query("{ author : { $regex : ?0 } }")
//		List<Book> getBooksByAuthorRegEx(String author);

	}


	private void insertAllRecords() {
		bookRepo.save(new Book("core java", 270, "raj", 300.0));
		bookRepo.save(new Book("spring boot", 770, "raj", 550.0));
		bookRepo.save(new Book("algebra", 200, "gunika", 900.0));
		bookRepo.save(new Book("adv maths", 170, "ekta", 500.0));
		bookRepo.save(new Book("spring boot", 300, "raj", 700.0));
		bookRepo.save(new Book("python adv", 220, "keshav", 600.0));
	}
}
