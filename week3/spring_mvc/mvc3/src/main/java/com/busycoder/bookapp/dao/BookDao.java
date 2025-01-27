package com.busycoder.bookapp.dao;

import java.util.List;

public interface BookDao {
	public List<Book> getAllBooks();
	public Book addBook(Book book);
	public void deleteBook(int id);
	public void updateBook(int id, Book book);
	public Book getBookById(int id);

}
