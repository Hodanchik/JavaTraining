package by.epam.javatraining.khadanovich.lesson6.additional.task06.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxDigitOfANumberTest {

    @Test
    public void calculateMaxDigitOfANumberOneTest() {
        int numberOne = 13890;
        int expectedOne = 9;
        assertEquals(expectedOne, MaxDigitOfANumber.calculateMaxDigitOfANumber(numberOne));
    }

    @Test
    public void calculateMaxDigitOfANumberTwoTest() {
        int numberTwo = -36013;
        int expectedTwo = 6;
        assertEquals(expectedTwo, MaxDigitOfANumber.calculateMaxDigitOfANumber(numberTwo));
    }
}