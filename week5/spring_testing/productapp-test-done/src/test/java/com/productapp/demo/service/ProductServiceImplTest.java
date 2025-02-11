//package com.productapp.demo.service;
//
//import com.productapp.demo.dao.ProductDao;
//import com.productapp.demo.dao.ProductDaoImpl;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class ProductServiceImplTest {
//
//    private ProductDao productDao;
//    private ProductService productService;
//
//
//    @BeforeEach
//    void setUp() {
//        productDao=new ProductDaoImpl();
//        productService=new ProductServiceImpl(productDao);
//    }
//
//    @Test
//    void TestGetAllProductContainingLaptop() {
//        Assertions.assertEquals(2, productService.getAll("laptop").size());
//    }
//
//    @AfterEach
//    void tearDown() {
//    }
//
//
//}