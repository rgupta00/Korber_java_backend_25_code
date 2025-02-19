package com.bookapp.service;

import com.bookapp.entities.Book;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{

    private MongoTemplate mongoTemplate;

    public BookServiceImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Book addBook(Book book) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return List.of();
    }

    @Override
    public Book getById(String id) {
        return null;
    }

    @Override
    public Book updateBook(String id, Book book) {
        return null;
    }

    @Override
    public void deleteBook(String id) {

    }
}
