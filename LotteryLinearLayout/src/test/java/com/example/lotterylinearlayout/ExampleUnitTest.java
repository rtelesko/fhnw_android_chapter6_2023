package com.example.lotterylinearlayout;

import org.junit.Test;

import static org.junit.Assert.*;

import org.apache.commons.validator.routines.EmailValidator;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void validationMailOne() {
        assertEquals(true, EmailValidator.getInstance().isValid("michael.studer@gmail.com"));
    }

    @Test
    public void validationMailTwo() {
        assertEquals(false, EmailValidator.getInstance().isValid("michael.studer@gmail"));
    }

    @Test
    public void validationMailThree() {
        assertEquals(true, EmailValidator.getInstance().isValid("michael1@gmail.de"));
    }
}