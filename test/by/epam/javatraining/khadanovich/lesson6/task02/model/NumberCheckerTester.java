package by.epam.javatraining.khadanovich.lesson6.task02.model;

import org.junit.Assert;
import org.junit.Test;

public class NumberCheckerTester {

    @Test
    public void checkIncreasingNumber() {
        int number = 12345;
        boolean expected = true;
        Assert.assertEquals(expected, NumberChecker.checkIncreasingNumber(number));
    }

    @Test
    public void checkDecreasingNumber() {
        int number = 554321;
        boolean expected = false;
        Assert.assertEquals(expected, NumberChecker.checkDecreasingNumber(number));
    }
}
