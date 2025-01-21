package com.bookapp.service;

import com.bookapp.dao.BookDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class) //integrate junit5 with mockito
class BookServiceImplTest {

    @Mock
    private BookDao bookDao;

    @InjectMocks
    private BookServiceImpl bookService;

    @BeforeEach
    public void before(){
        List<String> books= Arrays.asList("java","rich dad poor dad","adv java");
        Mockito.when(bookDao.getBooks()).thenReturn(books);
    }

    @Test
    public void testBook(){
        System.out.println(bookDao.getClass());
        assertEquals(2, bookService.getBooks("java").size());
    }

}