//package com.productapp.demo.service;
//
//import com.productapp.demo.dao.ProductDao;
//import com.productapp.demo.dao.ProductDaoImpl;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import static org.mockito.BDDMockito.*;
//
//import org.mockito.*;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//@ExtendWith(MockitoExtension.class)
//class ProductServiceImplTest {
//
////    @Spy
////    private ProductDaoImpl productDao;
//
//    @Mock
//    private ProductDao productDao;
//
//
//    @InjectMocks
//    private ProductServiceImpl productServiceImpl;
//
//    @BeforeEach
//    void setUp() {
//        List<String> products = List.of("laptop dell","laptop coolpad","rich dad poor dad");
//        given(productDao.getAll()).willReturn(products);
//    }
//
//    @Test
//    void getAll() {
//        assertEquals(2, productServiceImpl.getAll("laptop").size());
//    }
//
//    @AfterEach
//    void tearDown() {
//    }
//
//
//}