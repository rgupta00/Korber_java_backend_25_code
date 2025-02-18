package com.bookapp.repo;

import com.bookapp.entities.Book;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepo extends MongoRepository<Book, String> {
    public Book findByName(String name);

    public Book findByNameAndAuthor(String name, String author);

    public Book findByNameOrAuthor(String name, String author);

    /// SELECT * FROM BOOK WHERE ID=?
    @Query("{id :?0}")
    Optional<Book> getBookById(Integer id);

    // SELECT * FROM BOOK where pages<?
    //@Query("{pages : {$lt: ?0}}")

// SELECT * FROM BOOK where pages>=?

    // @Query("{ pages : { $gte: ?0 } }")

// SELECT * FROM BOOK where pages=?

    //@Query("{ pages : ?0 }")
    List<Book> getBooksByPages(Integer pages);

// SELECT * FROM BOOK where author = ?

    @Query("{author : ?0}")
    List<Book> getBooksByAuthor(String author);

    //SELECT * FROM BOOK where author = ? and cost=?

    @Query("{author: ?0, cost: ?1}")
//@Query("{$and :[{author: ?0},{cost: ?1}] }")
    List<Book> getBooksByAuthorAndCost(String author, Double cost);


    //select count(*) from book where author=? or name=?
    @Query("{$or :[{author: ?0},{name: ?1}]}")
    List<Book> getBooksByAuthorOrName(String author, String name);

    //select count(*) from book where author=?
    @Query(value = "{author: ?0}", count = true)
    Integer getBooksCountByAuthor(String author);


    //Sorting
    @Query(value = "{author:?0}", sort = "{name:1}")
    //ASC
//@Query(value = "{author=?0}", sort= "{name:-1}") //DESC
    List<Book> getBooksByAuthorSortByName(String author);

//@Query with Projection
    // only data of name & author properties will be displayed

    @Query(value = "{pages: ?0}", fields = "{name:1, author:1}")
//@Query(value= "{pages: ?0}", fields="{name:1, author:1, cost:1, pages:1}") // will display all properties data
    List<Book> getBookNameAndAuthorByPages(Integer pages);


    // SQL Equivalent : SELECT * FROM BOOK select * from books where author=?
    @Query(value = "{author : ?0}")
    List<Book> getAllBooksByAuthor(String author);

    // MongoDB Regular Expressions
    @Query("{ author : { $regex : ?0 } }")
    List<Book> getBooksByAuthorRegEx(String author);


}
