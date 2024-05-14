package com.example.Laboration1;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("Calculator tests")
public class CalculatorTests {

    Calculator calculator;

    @BeforeEach //This will run before each test
    void beforeTest(){
        System.out.println("Run Test");
        calculator = new Calculator ();
    }

    @Test
    @DisplayName("Addition a+b")
    void addition() {
        int a= 2;
        int b= 3;
        int result = calculator.add(a,b);
        int expectedResult = 5;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Subtraction a-b")
    void subtraction() {
        int a= 4;
        int b= 2;
        int result = calculator.subtract(a,b);
        int expectedResult = 2;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Multiplication a*b")
    void multiplication () {
        int a= 4;
        int b= 2;
        int result = calculator.multiply(a,b);
        int expectedResult = 8;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Division a/b")
    void division () {
        int a= 4;
        int b= 2;
        int result = (int) calculator.divide(a,b);
        int expectedResult = 2;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Square root of a")
    void squareRootOf () {
        int a= 4;
        int result = (int) calculator.squareRootOf(a);
        int expectedResult = 2;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Area of a")
    void Area () {
        int a= 4;
        int result = (int) calculator.getArea(a);
        int expectedResult =50;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Circunference of a")
    void circumference () {
        int a= 4;
        int result = (int) calculator.getCircumference(a);
        int expectedResult = 2; /*25*/
        Assertions.assertEquals(expectedResult, result);
    }

    @AfterEach
    void afterTest() { //This will run before each test
        System.out.println("Test completed");
    }

}