package by.epam.javatraining.khadanovich.lesson6.task05.model;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberTester {

    @Test
    public void isNumberPrime() throws Exception {
        int numberOne = 11;
        boolean expectedOne = true;
        int numberTwo = 1;
        boolean expectedTwo = false;
        int numberThree = -9;
        boolean expectedThree = false;
        int numberFour = 3;
        boolean expectedFour = true;
        Assert.assertEquals(expectedOne, PrimeNumber.isNumberPrime(numberOne));
        Assert.assertEquals(expectedTwo, PrimeNumber.isNumberPrime(numberTwo));
        Assert.assertEquals(expectedThree, PrimeNumber.isNumberPrime(numberThree));
        Assert.assertEquals(expectedFour, PrimeNumber.isNumberPrime(numberFour));
    }
}