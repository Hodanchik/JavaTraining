package by.epam.javatraining.khadanovich.lesson6.additional.task02.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void calculateSum() {
        int numberOne = -123;
        int expectedOne = 6;
        int numberTwo = 123;
        int expectedTwo = 6;
        int numberThree = 3;
        int expectedThree = 3;
        assertEquals(expectedOne, Calculator.calculateSum(numberOne));
        assertEquals(expectedTwo, Calculator.calculateSum(numberTwo));
        assertEquals(expectedThree, Calculator.calculateSum(numberThree));
    }

    @Test
    public void calculateMult() {
        int numberOne = -13;
        int expectedOne = 3;
        int numberTwo = 123;
        int expectedTwo = 6;
        int numberThree = 3;
        int expectedThree = 3;
        assertEquals(expectedOne, Calculator.calculateMult(numberOne));
        assertEquals(expectedTwo, Calculator.calculateMult(numberTwo));
        assertEquals(expectedThree, Calculator.calculateMult(numberThree));
    }
}