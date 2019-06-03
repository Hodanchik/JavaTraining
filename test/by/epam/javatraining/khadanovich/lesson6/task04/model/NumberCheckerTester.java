package by.epam.javatraining.khadanovich.lesson6.task04.model;

import org.junit.Assert;
import org.junit.Test;

public class NumberCheckerTester {

    @Test
    public void checkEven() throws Exception {
        int number = 12345;
        boolean expected = false;
        Assert.assertEquals(expected, NumberChecker.checkEven(number));
    }
}