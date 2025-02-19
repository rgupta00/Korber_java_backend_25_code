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
import java.util.Objects;

@SpringBootApplication
public class BookappApplication implements CommandLineRunner {

	@Autowired
	private MongoTemplate mongoTemplate;



	public static void main(String[] args) {
		SpringApplication.run(BookappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//use MongoTemplate to insert many records
			//saveData();
		//saveBulkData();
		//find all books
		//printAllBooks();


		//find by Id
//		Book book=mongoTemplate.findById("67b56a41cdd80b20cef4b7b4", Book.class);
//		System.out.println(book);

		//update
		//67b56a41cdd80b20cef4b7b4
//		Query query=new Query();
//		query.addCriteria(Criteria.where("id").is("67b56a41cdd80b20cef4b7b4"));
//
//		Update update=new Update();
//		update.set("cost",2000.00);
//		mongoTemplate.updateFirst(query,update,Book.class);
//		System.out.println("------------------------------");
//		printAllBooks();


//		Query query= new Query();
//		query.addCriteria(Criteria.where("pages").lte(190));
//		Update update = new Update();
//		update.set("cost", 600.0);
//		mongoTemplate.updateMulti(query, update, Book.class);


		//upsert: update or insert
//		Query query= new Query();
//		query.addCriteria(Criteria.where("id").is(510));
//		Update update = new Update();
//		update.set("cost", 1065.25);
//		update.set("name", "Core Java");
//		mongoTemplate.upsert(query, update, Book.class);

		//delete
		Query query= new Query();
		query.addCriteria(Criteria.where("id").is(510));
		mongoTemplate.findAndRemove(query, Book.class);


	}

	private void printAllBooks() {
		List<Book> books=mongoTemplate.findAll(Book.class);
		books.forEach(System.out::println);
	}

	private void saveBulkData(){
			List<Book> booksCollections=List.of(
					new Book("Core Java", 200, "Kathy Sierra", 1065.5),
					new Book("JSP & Servlets", 350, "Kathy Sierra", 1749.0),
					new Book( "Spring in Action", 480, "Craig Walls", 940.75),
					new Book("Pro Angular", 260, "Freeman", 1949.25),
					new Book("HTML CSS", 100, "Thomas Powell", 2317.09),
					new Book("Hibernate in Action", 180, "Gavin King", 889.25),
					new Book( "Practical MongoDB", 180, "Shakuntala Gupta", 785.0),
					new Book("Pro Spring Boot", 850, "Felipe Gutierrez", 2167.99),
					new Book("Beginning jQuery", 180, "Franklin", 1500.00));
				mongoTemplate.insert(booksCollections,"my_collection3");
	}

	private void saveData() {
		mongoTemplate.save(new Book("Core Java", 200, "Kathy Sierra", 1065.5));
		mongoTemplate.save(new Book("JSP & Servlets", 350, "Kathy Sierra", 1749.0));
		// mt.save(new Book(501, "JSP & Servlets", 350, "Kathy Sierra", 1749.0),"Book"); // save () with collection name 'Book'
		mongoTemplate.save(new Book( "Spring in Action", 480, "Craig Walls", 940.75));
		mongoTemplate.save(new Book("Pro Angular", 260, "Freeman", 1949.25));
		mongoTemplate.save(new Book("HTML CSS", 100, "Thomas Powell", 2317.09));
		mongoTemplate.save(new Book("Hibernate in Action", 180, "Gavin King", 889.25));
		mongoTemplate.save(new Book( "Practical MongoDB", 180, "Shakuntala Gupta", 785.0));
		mongoTemplate.save(new Book("Pro Spring Boot", 850, "Felipe Gutierrez", 2167.99));
		mongoTemplate.save(new Book("Beginning jQuery", 180, "Franklin", 1500.00));
		mongoTemplate.save(new Book("Java Design Patterns", 114, "Devendra Singh", 919.99));



	}
}
