package com.productapp.demo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator=new Calculator();
    }
    @EnabledOnOs(OS.WINDOWS)
    @EnabledOnJre(JRE.JAVA_17)
    @DisplayName("add two numbers")
   // @RepeatedTest(value = 2)
    @Test
    void testAdd() {
        Assertions.assertEquals(4, calculator.add(2,2));
    }
    @DisplayName("divide two numbers")
    @Test
    void testDivideWithSuccess() {
        Assertions.assertEquals(4, calculator.divide(8,2));
    }
    @DisplayName("divide two numbers with exception")
    @Test
    void testDivideWithZeroFaildWithException() {
        Assertions.assertThrows(ArithmeticException.class, ()-> calculator.divide(4,0),"divide by zero");
    }
    @AfterEach
    void tearDown() {
        calculator=null;
    }
}