package by.epam.javatraining.khadanovich.lesson6.task03.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialCalculatorTester {

    @Test
    public void factorialCalculatorOneTest() {
        int number = 5;
        int expected = 120;
        assertEquals(expected, FactorialCalculator.factorialCalculator(number));

    }

    @Test
    public void factorialCalculatoTwoTest() {
        int numberTwo = 0;
        int expectedTwo = 1;
        assertEquals(expectedTwo, FactorialCalculator.factorialCalculator(numberTwo));
    }
}
