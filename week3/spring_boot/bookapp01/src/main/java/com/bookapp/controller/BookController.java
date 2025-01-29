package com.bookapp.controller;

import com.bookapp.entities.Book;
import com.bookapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    //get all books
    @GetMapping(path="books")
    public List<Book> getAll(){
        return bookService.getAll();
    }
}
