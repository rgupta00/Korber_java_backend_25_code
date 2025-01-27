package com.busycoder.bookapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.busycoder.bookapp.dao.Book;
import com.busycoder.bookapp.service.BookService;

//Back controller BL
/*
 * @Controller+ @ResponseBody
 */
@RestController
public class BookRestController {
	
	private BookService bookService;

	@Autowired
	public BookRestController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping(path="books")
	public List<Book> getAll() {
		return bookService.getAllBooks();
	}
	


//	@GetMapping(path="hello")
//	public ModelAndView hello(ModelAndView mv) {
//		mv.setViewName("show");
//		mv.addObject("data", "You all are champs!");//it automatically goes to the req scope 
//		
//		return mv;
//	}
}
