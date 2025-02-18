package com.bookapp.service;

import com.bookapp.entities.Book;
import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.repo.BookRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepo bookRepository;

    @Override
    public Book addBook(Book book) {
         bookRepository.save(book);
         return book;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getById(String id) {
        Book book= bookRepository.findById(id).orElseThrow(()-> new BookNotFoundException("book with "+id+" is not found"));
        return book;
    }

    @Override
    public Book updateBook(String id, Book book) {
        Book toUpdate=getById(id);
        toUpdate.setCost(book.getCost());
        bookRepository.save(toUpdate);
        return toUpdate;
    }

    @Override
    public void deleteBook(String id) {
        Book toDelete=getById(id);
        bookRepository.delete(toDelete);
    }
}
