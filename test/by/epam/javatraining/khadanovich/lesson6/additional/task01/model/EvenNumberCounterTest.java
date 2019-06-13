package by.epam.javatraining.khadanovich.lesson6.additional.task01.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberCounterTest {

    @Test
    public void countEvenNumbers() {
        int numberOne = 245321;
        int expectedOne = 3;
        int numberTwo = 0;
        int expectedTwo = 0;
        int numberThree = 24532100;
        int expectedThree = 3;
        assertEquals(expectedOne, EvenNumberCounter.countEvenNumbers(numberOne));
        assertEquals(expectedTwo, EvenNumberCounter.countEvenNumbers(numberTwo));
        assertEquals(expectedThree, EvenNumberCounter.countEvenNumbers(numberThree));
    }

    @Test
    public void countOddNumbers() {
        int numberOne = 245321;
        int expectedOne = 3;
        int numberTwo = 0;
        int expectedTwo = 0;
        int numberThree = 24532100;
        int expectedThree = 3;
        assertEquals(expectedOne, EvenNumberCounter.countEvenNumbers(numberOne));
        assertEquals(expectedTwo, EvenNumberCounter.countEvenNumbers(numberTwo));
        assertEquals(expectedThree, EvenNumberCounter.countEvenNumbers(numberThree));
    }
}