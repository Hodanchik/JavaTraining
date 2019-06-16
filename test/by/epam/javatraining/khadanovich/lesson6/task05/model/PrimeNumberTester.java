package by.epam.javatraining.khadanovich.lesson6.task05.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeNumberTester {

    @Test
    public void isNumberPrimeOneTest() {
        int numberOne = 11;
        boolean expectedOne = true;
        assertEquals(expectedOne, PrimeNumber.isNumberPrime(numberOne));
    }

    @Test
    public void isNumberPrimeTwoTest() {
        int numberTwo = 1;
        boolean expectedTwo = false;
        assertEquals(expectedTwo, PrimeNumber.isNumberPrime(numberTwo));
    }

    @Test
    public void isNumberPrimeThreeTest() {
        int numberThree = -9;
        boolean expectedThree = false;
        assertEquals(expectedThree, PrimeNumber.isNumberPrime(numberThree));
    }

    @Test
    public void isNumberPrimeFourTest() {
        int numberFour = 18;
        boolean expectedFour = false;
        assertEquals(expectedFour, PrimeNumber.isNumberPrime(numberFour));
    }
}