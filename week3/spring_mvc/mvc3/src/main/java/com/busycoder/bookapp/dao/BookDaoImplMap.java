package com.busycoder.bookapp.dao;

import java.util.*;

import org.springframework.stereotype.Repository;
@Repository
public class BookDaoImplMap implements BookDao {
	private static Map<Integer, Book> booksMap = new HashMap<Integer, Book>();
	private static int counter = 0;
	static {
		booksMap.put(++counter, new Book(counter,  "Head first Java", 600.00));
		booksMap.put(++counter,  new Book(counter,  "Servlet jsp Java", 700.00));
	}

	@Override
	public List<Book> getAllBooks() {
		return new ArrayList<Book>(booksMap.values());
	}

	@Override
	public Book addBook(Book book) {
		book.setId(++counter);
		booksMap.put(counter, book);
		return booksMap.get(counter);
	}

	@Override
	public void deleteBook(int id) {
		booksMap.remove(id);
	}

	@Override
	public void updateBook(int id, Book book) {
		booksMap.put(id, book);
	}

	@Override
	public Book getBookById(int id) {
		return booksMap.get(id);
	}

}
