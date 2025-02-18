package com.bookapp.service;

import com.bookapp.entities.Book;

import java.util.List;

public interface BookService {
    public Book addBook(Book book);
    public List<Book> getAllBooks();
    public Book getById(String id);
    public Book updateBook(String id,  Book book);
    public void deleteBook(String id);

}
