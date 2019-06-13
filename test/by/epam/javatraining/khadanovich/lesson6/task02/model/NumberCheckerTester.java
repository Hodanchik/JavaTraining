package by.epam.javatraining.khadanovich.lesson6.task02.model;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberCheckerTester {

    @Test
    public void checkIncreasingNumber() {
        int numberOne = 12345;
        boolean expectedOne = true;
        int numberTwo = 2345749;
        boolean expectedTwo = false;
        assertEquals(expectedOne, NumberChecker.checkIncreasingNumber(numberOne));
        assertEquals(expectedTwo, NumberChecker.checkIncreasingNumber(numberTwo));
    }

    @Test
    public void checkDecreasingNumber() {
        int numberOne = 22345678;
        boolean expectedOne = false;
        int numberTwo = 764321;
        boolean expectedTwo = true;
        assertEquals(expectedOne, NumberChecker.checkDecreasingNumber(numberOne));
        assertEquals(expectedTwo, NumberChecker.checkDecreasingNumber(numberTwo));
    }
}
