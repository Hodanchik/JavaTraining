package by.epam.javatraining.khadanovich.lesson6.additional.task02.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void calculateSumOneTest() {
        int numberOne = -123;
        int expectedOne = 6;
        assertEquals(expectedOne, Calculator.calculateSum(numberOne));
    }

    @Test
    public void calculateSumTwoTest() {
        int numberTwo = 123;
        int expectedTwo = 6;
        assertEquals(expectedTwo, Calculator.calculateSum(numberTwo));
    }

    @Test
    public void calculateSumThreeTest() {
        int numberThree = 3;
        int expectedThree = 3;
        assertEquals(expectedThree, Calculator.calculateSum(numberThree));
    }

    @Test
    public void calculateMultOneTest() {
        int numberOne = -13;
        int expectedOne = 3;
        assertEquals(expectedOne, Calculator.calculateMult(numberOne));
    }

    @Test
    public void calculateMultTwoTest() {
        int numberTwo = 123;
        int expectedTwo = 6;
        assertEquals(expectedTwo, Calculator.calculateMult(numberTwo));
    }

    @Test
    public void calculateMultThreeTest() {
        int numberThree = 3;
        int expectedThree = 3;
        assertEquals(expectedThree, Calculator.calculateMult(numberThree));
    }
}