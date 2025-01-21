package com.demo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator=null;

    @BeforeEach
    public void before(){
        calculator=new Calculator();
    }
    @DisplayName("test for add two number")
    @Test
    public void addTest(){
        assertEquals(4, calculator.add(3,1));
    }
    @DisplayName("test for dividing two number without exception")
    @Test
    public void divideSuccessTest(TestInfo testInfo){
        System.out.println(testInfo.getTestMethod()+": "+ testInfo.getDisplayName());
        assertEquals(2, calculator.divide(4,2));
    }

    @Test
    public void divideWithExceptionTest(){
        assertThrows(ArithmeticException.class,
                ()-> calculator.divide(4,0),
                "divide by zero");
    }


    @Test
    public void multiplyTest(){
        assertEquals(6, calculator.multiply(2,3));
    }
    @AfterEach
    public void after(){
        calculator=null;
    }

}