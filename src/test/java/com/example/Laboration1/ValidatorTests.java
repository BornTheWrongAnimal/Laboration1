package com.example.Laboration1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("Calculator tests")
public class ValidatorTests {


    @Test
    @DisplayName("Correct Phone starts with 0")
    void PhoneStartsWith0() {
        String phoneNumber= "070382786";
        boolean result = Validator.isPhoneNumberValid(phoneNumber);
        boolean expectedResult = true;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Incorrect when phone starts with 7")
    void PhoneDoesNotStartsWith0() {
        String phoneNumber= "70382786";
        boolean result = Validator.isPhoneNumberValid(phoneNumber);
        boolean expectedResult = false;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Incorrect phone length 3 char")
    void PhoneLengthLessThan7() {
        String phoneNumber= "065";
        boolean result = Validator.isPhoneNumberValid(phoneNumber);
        boolean expectedResult = false;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Incorrect phone length 14 char")
    void PhoneLengthMoreThan10() {
        String phoneNumber= "05657542222434";
        boolean result = Validator.isPhoneNumberValid(phoneNumber);
        boolean expectedResult = false;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Correct phone length 10 char")
    void PhoneLengthOK() {
        String phoneNumber= "0703827286";
        boolean result = Validator.isPhoneNumberValid(phoneNumber);
        boolean expectedResult = true;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Correct email format")
    void EmailOk() {
        String email= "pelle.asd@gres.se";
        boolean result = Validator.isEmailValid(email);
        boolean expectedResult = true;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Incorrect email has no domain")
    void EmailNoTopDomain() {
        String email= "pelle.asd@gres.";
        boolean result = Validator.isEmailValid(email);
        boolean expectedResult = false;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Incorrect email has no address")
    void EmailNoDomain() {
        String email= "pelle";
        boolean result = Validator.isEmailValid(email);
        boolean expectedResult = false;
        Assertions.assertEquals(expectedResult, result);
    }
}
