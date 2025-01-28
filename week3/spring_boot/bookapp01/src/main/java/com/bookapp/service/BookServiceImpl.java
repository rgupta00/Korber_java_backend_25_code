package com.bookapp.service;

import com.bookapp.entities.Book;
import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private BookRepo bookRepo;

    @Autowired
    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public List<Book> getAll() {
        return bookRepo.findAll();
    }

    @Override
    public Book getById(int id) {
        return bookRepo.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book not found"));
    }

    @Override
    public Book save(Book book) {
        bookRepo.save(book);
        return book;
    }

    @Override
    public void delete(int id) {
        Book bookToDelete = getById(id);
        bookRepo.delete(bookToDelete);
    }

    @Override
    public Book update(int id, Book book) {
        Book bookToUpdate = getById(id);
        bookToUpdate.setPrice(book.getPrice());
        bookRepo.save(bookToUpdate);

        return bookToUpdate;
    }
}
