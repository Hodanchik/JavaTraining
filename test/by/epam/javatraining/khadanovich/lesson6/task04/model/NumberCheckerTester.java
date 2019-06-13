package by.epam.javatraining.khadanovich.lesson6.task04.model;

import org.junit.Assert;
import org.junit.Test;

public class NumberCheckerTester {

    @Test
    public void checkEven() {
        int numberOne = 12345;
        boolean expectedOne = false;
        int numberTwo = 24642;
        boolean expectedTwo = true;
        int numberThree = 17593;
        boolean expectedThree = true;

        Assert.assertEquals(expectedOne, NumberChecker.checkEven(numberOne));
        Assert.assertEquals(expectedTwo, NumberChecker.checkEven(numberTwo));
        Assert.assertEquals(expectedThree, NumberChecker.checkEven(numberThree));
    }
}