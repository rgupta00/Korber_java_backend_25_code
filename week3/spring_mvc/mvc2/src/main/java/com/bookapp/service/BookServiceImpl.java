package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.repo.Book;
import com.bookapp.repo.BookRepo;
@Service
public class BookServiceImpl implements BookService{

	private BookRepo bookRepo;
	
	@Autowired
	public BookServiceImpl(BookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}

	@Override
	public List<Book> getAll() {
		return bookRepo.getAll();
	}

	@Override
	public Book getBookById(long bookId) {
		return bookRepo.getBookById(bookId);
	}

	@Override
	public Book addBook(Book book) {
		return null;
	}

	@Override
	public Book updateBook(long bookId, Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book removeBook(long bookId) {
		// TODO Auto-generated method stub
		return null;
	}

}
