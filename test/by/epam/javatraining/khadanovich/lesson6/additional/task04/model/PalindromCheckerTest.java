package by.epam.javatraining.khadanovich.lesson6.additional.task04.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromCheckerTest {

    @Test
    public void checkIsNumberPalindromOneTest() {
        int numberOne = 1234321;
        boolean expectedOne = true;
        assertEquals(expectedOne, PalindromChecker.checkIsNumberPalindrom(numberOne));
    }

    @Test
    public void checkIsNumberPalindromTwoTest() {
        int numberTwo = 1;
        boolean expectedTwo = true;
        assertEquals(expectedTwo, PalindromChecker.checkIsNumberPalindrom(numberTwo));
    }

    @Test
    public void checkIsNumberPalindromThreeTest() {
        int numberThree = 15450;
        boolean expectedThree = false;
        assertEquals(expectedThree, PalindromChecker.checkIsNumberPalindrom(numberThree));
    }
}