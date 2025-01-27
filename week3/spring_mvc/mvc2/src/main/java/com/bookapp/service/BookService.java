package com.bookapp.service;

import java.util.List;

import com.bookapp.repo.Book;

public interface BookService {
	public List<Book> getAll();
	public Book getBookById(long bookId);
	public Book addBook(Book book);
	public Book updateBook(long bookId, Book book);
	public Book removeBook(long bookId);
}
