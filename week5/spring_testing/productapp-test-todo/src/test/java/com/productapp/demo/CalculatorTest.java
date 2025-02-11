//package com.productapp.demo;
//
//import org.junit.jupiter.api.AfterEach;
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//class CalculatorTest {
//
//    private Calculator calculator;
//
//    @BeforeEach
//    void setUp() {
//        calculator = new Calculator();
//    }
//
//    @DisplayName("add test")
//    @Test
//    void addTest() {
//        assertEquals(4, calculator.add(2,2));
//    }
//
//    @DisplayName("divide test")
//    @Test
//    void divideTest() {
//        assertEquals(2, calculator.divide(4,2));
//    }
//    //parameterized test
//    @DisplayName("divide with excception test")
//    @Test
//    void divideWithExcceptionTest() {
//        assertThrows(ArithmeticException.class,
//                () -> calculator.divide(9,0));
//    }
//
//    @AfterEach
//    void tearDown() {
//        calculator = null;
//    }
//
//
//}