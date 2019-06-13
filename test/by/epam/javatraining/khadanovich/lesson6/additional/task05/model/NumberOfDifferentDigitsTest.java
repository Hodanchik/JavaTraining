package by.epam.javatraining.khadanovich.lesson6.additional.task05.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfDifferentDigitsTest {

    @Test
    public void checkIfNumberIsOfDifferentDigits() {
        int numberOne = 123459;
        boolean expectedOne = true;
        int numberTwo = 1159;
        boolean expectedTwo = false;
        assertEquals(expectedOne, NumberOfDifferentDigits.checkIfNumberIsOfDifferentDigits(numberOne));
        assertEquals(expectedTwo, NumberOfDifferentDigits.checkIfNumberIsOfDifferentDigits(numberTwo));
    }

    @Test
    public void checkIfNumberIsOfSameDigits() {
        int numberOne = 11111;
        boolean expectedOne = true;
        int numberTwo = 1159;
        boolean expectedTwo = false;
        assertEquals(expectedOne, NumberOfDifferentDigits.checkIfNumberIsOfSameDigits(numberOne));
        assertEquals(expectedTwo, NumberOfDifferentDigits.checkIfNumberIsOfSameDigits(numberTwo));
    }
}