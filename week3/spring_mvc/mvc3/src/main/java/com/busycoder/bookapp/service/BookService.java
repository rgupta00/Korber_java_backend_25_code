package com.busycoder.bookapp.service;

import java.util.List;

import com.busycoder.bookapp.dao.Book;

public interface BookService {
	public List<Book> getAllBooks();
	public Book addBook(Book book);
	public void deleteBook(int id);
	public void updateBook(int id, Book book);
	public Book getBookById(int id);

}
