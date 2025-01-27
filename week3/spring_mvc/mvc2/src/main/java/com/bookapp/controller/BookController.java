package com.bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.repo.Book;
import com.bookapp.service.BookService;

@RestController
public class BookController {
	
	private BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	//i want to return json data of all the books
	
	@GetMapping(path="books")
	public List<Book> getAll(){
		return bookService.getAll();
	}

}
