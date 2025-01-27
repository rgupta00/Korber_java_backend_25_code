package com.bookapp.repo;

import java.util.*;

import org.springframework.stereotype.Repository;
@Repository
public class BookRepoMapImpl implements BookRepo {
	
	private static Map<Long, Book> books=new HashMap<Long, Book>();
	private static int counter;
	static {
		books.put(1L, new Book(1L, "ABC123", "head first", "katthy", 500.00));
		books.put(2L, new Book(2L, "ABU123", "thinking in java", "amit", 400.00));
		counter=2;
	}
	
	@Override
	public List<Book> getAll() {	
		return new ArrayList<Book>(books.values());
	}

	@Override
	public Book getBookById(long bookId) {
		Book book= books.get(bookId);
		if(book==null)
			throw new BookNotFoundException("book with id "+ bookId +" is not found");
		
		return book;
	}

	@Override
	public Book addBook(Book book) {
		book.setId(++counter);
		books.put(book.getId(), book);
		return book;
	}

	@Override
	public Book updateBook(long bookId, Book book) {
		Book bookToUpdate= getBookById(bookId);
		bookToUpdate.setPrice(book.getPrice());
		books.put(bookId, bookToUpdate);
		
		return bookToUpdate;
	}

	@Override
	public Book removeBook(long bookId) {
		Book bookToRemove=getBookById(bookId);
		books.remove(bookId);
		return bookToRemove;
	}

}
