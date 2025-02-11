//package com.productapp.demo;
//
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvFileSource;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class DemoParamerzsedTest {
//
//    @ParameterizedTest
//    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
//    void toUpperCase_ShouldGenerateTheExpectedUppercaseValueCSVFile(String input, String expected) {
//        String actualValue = input.toUpperCase();
//        assertEquals(expected, actualValue);
//    }
//}
