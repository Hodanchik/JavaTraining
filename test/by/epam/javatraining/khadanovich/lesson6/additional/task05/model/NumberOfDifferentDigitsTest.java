package by.epam.javatraining.khadanovich.lesson6.additional.task05.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfDifferentDigitsTest {

    @Test
    public void checkIfNumberIsOfDifferentDigitsOneTest() {
        int numberOne = 123459;
        boolean expectedOne = true;
        assertEquals(expectedOne, NumberOfDifferentDigits.checkIfNumberIsOfDifferentDigits(numberOne));
    }

    @Test
    public void checkIfNumberIsOfDifferentDigitsTwoTest() {
        int numberTwo = 1159;
        boolean expectedTwo = false;
        assertEquals(expectedTwo, NumberOfDifferentDigits.checkIfNumberIsOfDifferentDigits(numberTwo));
    }

    @Test
    public void checkIfNumberIsOfSameDigitsOneTest() {
        int numberOne = 11111;
        boolean expectedOne = true;
        assertEquals(expectedOne, NumberOfDifferentDigits.checkIfNumberIsOfSameDigits(numberOne));
    }

    @Test
    public void checkIfNumberIsOfSameDigitsTwoTest() {
        int numberTwo = 1159;
        boolean expectedTwo = false;
        assertEquals(expectedTwo, NumberOfDifferentDigits.checkIfNumberIsOfSameDigits(numberTwo));
    }
}