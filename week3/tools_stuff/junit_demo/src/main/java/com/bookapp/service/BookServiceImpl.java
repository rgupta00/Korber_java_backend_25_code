package com.bookapp.service;

import com.bookapp.dao.BookDao;
import java.util.List;
//mockito : dependency injection :spring
public class BookServiceImpl implements BookService{

    private BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public List<String> getBooks(String subject) {
        return bookDao.getBooks().stream().filter(b->b.contains(subject)).toList();
    }
}
