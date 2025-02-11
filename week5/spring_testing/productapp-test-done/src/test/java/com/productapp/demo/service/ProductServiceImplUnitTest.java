package com.productapp.demo.service;

import com.productapp.demo.dao.ProductDao;
import com.productapp.demo.dao.ProductDaoImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class ProductServiceImplUnitTest {

    //@Mock
    @Spy
    private ProductDao productDao;

    @InjectMocks
    private ProductServiceImpl productService;


    @BeforeEach
    void setUp() {

    }

    @Test
    void TestGetAllProductContainingLaptop() {
        //given
        List<String> allProducts=List.of("laptop dell","laptop cover","rich dad poor dad");
        //when
        Mockito.when(productDao.getAll()).thenReturn(allProducts);
        //then
        Assertions.assertEquals(2, productService.getAll("laptop").size());
    }

    @AfterEach
    void tearDown() {
    }


}