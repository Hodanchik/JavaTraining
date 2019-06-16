package by.epam.javatraining.khadanovich.lesson6.task02.model;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberCheckerTester {

    @Test
    public void checkIncreasingNumberOneTest() {
        int numberOne = 12345;
        boolean expectedOne = true;
        assertEquals(expectedOne, NumberChecker.checkIncreasingNumber(numberOne));

    }

    @Test
    public void checkIncreasingNumberTwoTest() {
        int numberTwo = 2345749;
        boolean expectedTwo = false;
        assertEquals(expectedTwo, NumberChecker.checkIncreasingNumber(numberTwo));
    }

    @Test
    public void checkDecreasingNumberOneTest() {
        int numberOne = 22345678;
        boolean expectedOne = false;
        assertEquals(expectedOne, NumberChecker.checkDecreasingNumber(numberOne));

    }

    @Test
    public void checkDecreasingNumberTwoTest() {
        int numberTwo = 764321;
        boolean expectedTwo = true;
        assertEquals(expectedTwo, NumberChecker.checkDecreasingNumber(numberTwo));
    }
}
