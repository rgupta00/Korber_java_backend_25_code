package com.bookapp.repo;

import java.util.List;

public interface BookRepo {
	public List<Book> getAll();
	public Book getBookById(long bookId);
	public Book addBook(Book book);
	public Book updateBook(long bookId, Book book);
	public Book removeBook(long bookId);
	
}