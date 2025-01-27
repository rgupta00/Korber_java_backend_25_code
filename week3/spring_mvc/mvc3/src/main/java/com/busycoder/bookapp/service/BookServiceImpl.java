package com.busycoder.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.busycoder.bookapp.dao.Book;
import com.busycoder.bookapp.dao.BookDao;
import com.busycoder.bookapp.dao.BookDaoImplMap;
import com.busycoder.bookapp.exceptions.BookNotFoundException;

@Service
public class BookServiceImpl implements BookService{
	
	private BookDao bookDao;
	
	@Autowired
	public BookServiceImpl(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Override
	public Book addBook(Book book) {
		return bookDao.addBook(book);
	}

	@Override
	public void deleteBook(int id) {
		bookDao.deleteBook(id);
	}

	@Override
	public void updateBook(int id, Book book) {
		bookDao.updateBook(id, book);
	}

	@Override
	public Book getBookById(int id) {
		Book book= bookDao.getBookById(id);
		if(book==null)
			throw new BookNotFoundException("book with id "+ id +" not found");
		return book;
	}

}
