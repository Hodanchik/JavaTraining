package by.epam.javatraining.khadanovich.lesson6.additional.task04.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromCheckerTest {

    @Test
    public void checkIsNumberPalindrom() {
        int numberOne = 1234321;
        boolean expectedOne = true;
        int numberTwo = 1;
        boolean expectedTwo = true;
        int numberThree = 15450;
        boolean expectedThree = false;
        assertEquals(expectedOne, PalindromChecker.checkIsNumberPalindrom(numberOne));
        assertEquals(expectedTwo, PalindromChecker.checkIsNumberPalindrom(numberTwo));
        assertEquals(expectedThree, PalindromChecker.checkIsNumberPalindrom(numberThree));
    }
}