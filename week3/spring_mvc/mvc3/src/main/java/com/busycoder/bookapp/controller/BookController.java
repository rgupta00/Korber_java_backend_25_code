package com.busycoder.bookapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.busycoder.bookapp.service.BookService;

//Back controller BL
@Controller
public class BookController {
	
	private BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping(path="getall")
	public ModelAndView getAll(ModelAndView mv) {
		mv.setViewName("show");
		mv.addObject("books", bookService.getAllBooks());//it automatically goes to the req scope 
		
		return mv;
	}
	
	

//	@GetMapping(path="hello")
//	public ModelAndView hello(ModelAndView mv) {
//		mv.setViewName("show");
//		mv.addObject("data", "You all are champs!");//it automatically goes to the req scope 
//		
//		return mv;
//	}
}
