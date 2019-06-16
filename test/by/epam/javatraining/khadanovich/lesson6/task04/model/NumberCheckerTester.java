package by.epam.javatraining.khadanovich.lesson6.task04.model;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberCheckerTester {

    @Test
    public void checkEvenOneTest() {
        int numberOne = 12345;
        boolean expectedOne = false;
        assertEquals(expectedOne, NumberChecker.checkEven(numberOne));
    }

    @Test
    public void checkEvenTwoTest() {
        int numberTwo = 24642;
        boolean expectedTwo = true;
        assertEquals(expectedTwo, NumberChecker.checkEven(numberTwo));

    }

    @Test
    public void checkEvenThreeTest() {
        int numberThree = 17593;
        boolean expectedThree = true;
        assertEquals(expectedThree, NumberChecker.checkEven(numberThree));
    }

}