package by.epam.javatraining.khadanovich.lesson6.task05.model;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberTester {

    @Test
    public void isNumberPrime() throws Exception {
        int number = 11;
        boolean expected = true;
        Assert.assertEquals(expected, PrimeNumber.isNumberPrime(number));
    }
}