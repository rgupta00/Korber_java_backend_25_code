package com.bookapp.controller;

import com.bookapp.entities.Book;
import com.bookapp.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
//Spring boot 1.5: @RequestMapping vs @GetMapping vs
@RequestMapping(path = "api/v1/book")
public class BookController {
    private final BookService bookService;

    //get all
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    //get by id
    @GetMapping(path = "{id}")
    public ResponseEntity<Book> getBookById(@PathVariable String id) {
        return ResponseEntity.ok(bookService.getById(id));
    }

    //add
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        return ResponseEntity.status(HttpStatus.CREATED).body((bookService.addBook(book)));
    }

    //update by id
    @PutMapping(path = "{id}")
    public ResponseEntity<Book> updateBook(@PathVariable String id,   @RequestBody Book book) {
        return ResponseEntity.status(HttpStatus.OK).body((bookService.updateBook(id, book)));
    }
    //delete
    @DeleteMapping(path = "{id}")
    public ResponseEntity<Void> deleteById(@PathVariable String id) {
       bookService.deleteBook(id);
       return ResponseEntity.noContent().build();
    }

}
