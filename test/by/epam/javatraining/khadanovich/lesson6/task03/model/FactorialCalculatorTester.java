package by.epam.javatraining.khadanovich.lesson6.task03.model;

import org.junit.Assert;
import org.junit.Test;

public class FactorialCalculatorTester {

    @Test
    public void factorialCalculator() throws Exception {
        int number = 5;
        int expected = 120;
        Assert.assertEquals((long) expected, (long) FactorialCalculator.factorialCalculator(number));
    }
}
