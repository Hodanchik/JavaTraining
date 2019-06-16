package by.epam.javatraining.khadanovich.lesson6.additional.task01.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberCounterTest {

    @Test
    public void countEvenNumbersOneTest() {
        int numberOne = 245321;
        int expectedOne = 3;
        assertEquals(expectedOne, EvenNumberCounter.countEvenNumbers(numberOne));
    }

    @Test
    public void countEvenNumbersTwoTest() {
        int numberTwo = 0;
        int expectedTwo = 0;
        assertEquals(expectedTwo, EvenNumberCounter.countEvenNumbers(numberTwo));
    }

    @Test
    public void countEvenNumbersThreeTest() {
        int numberThree = 24532100;
        int expectedThree = 3;
        assertEquals(expectedThree, EvenNumberCounter.countEvenNumbers(numberThree));
    }

    @Test
    public void countOddNumbersOneTest() {
        int numberOne = 245321;
        int expectedOne = 3;
        assertEquals(expectedOne, EvenNumberCounter.countEvenNumbers(numberOne));
    }

    @Test
    public void countOddNumbersTwoTest() {
        int numberTwo = 0;
        int expectedTwo = 0;
        assertEquals(expectedTwo, EvenNumberCounter.countEvenNumbers(numberTwo));
    }

    @Test
    public void countOddNumbersThreeTest() {
        int numberThree = 24532100;
        int expectedThree = 3;
        assertEquals(expectedThree, EvenNumberCounter.countEvenNumbers(numberThree));
    }

}