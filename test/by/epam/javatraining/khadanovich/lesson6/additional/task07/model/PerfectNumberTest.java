package by.epam.javatraining.khadanovich.lesson6.additional.task07.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PerfectNumberTest {

    @Test
    public void isNumberPerfect() {
        int numberOne = 496;
        boolean expectedOne = true;
        int numberTwo = 498;
        boolean expectedTwo = false;
        assertEquals(expectedOne, PerfectNumber.isNumberPerfect(numberOne));
        assertEquals(expectedTwo, PerfectNumber.isNumberPerfect(numberTwo));
    }
}