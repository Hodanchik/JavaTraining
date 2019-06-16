package by.epam.javatraining.khadanovich.lesson6.additional.task07.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PerfectNumberTest {

    @Test
    public void isNumberPerfectOneTest() {
        int numberOne = 496;
        boolean expectedOne = true;
        assertEquals(expectedOne, PerfectNumber.isNumberPerfect(numberOne));
    }

    @Test
    public void isNumberPerfectTwoTest() {
        int numberTwo = 498;
        boolean expectedTwo = false;
        assertEquals(expectedTwo, PerfectNumber.isNumberPerfect(numberTwo));
    }
}