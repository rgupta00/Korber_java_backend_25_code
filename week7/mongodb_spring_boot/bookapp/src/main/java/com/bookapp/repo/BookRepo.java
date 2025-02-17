package com.bookapp.repo;

import com.bookapp.entities.Book;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends MongoRepository<Book, String> {
    public Book findByName(String name);
    public Book findByNameAndAuthor(String name, String author);
    public Book findByNameOrAuthor(String name, String author);

    ///SELECT * FROM BOOK WHERE ID=?
    @Query("{id:?0}")
    public Book getBookByIdQuery(String id);

    // SELECT * FROM BOOK where pages<?
    @Query("{pages:{$lt:?0}}")
    public List<Book> getBookByPagesLessThenQuery(int pages);






}
