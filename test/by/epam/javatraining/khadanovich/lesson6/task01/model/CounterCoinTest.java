package by.epam.javatraining.khadanovich.lesson6.task01.model;


import static org.junit.Assert.*;


import org.junit.Test;


public class CounterCoinTest {

    @Test
    public void throwCoin() {
        int expected = 1;
        assertEquals(expected, CounterCoin.throwCoin(), 1);
    }

    @Test
    public void countCoin() {
        int time = 50;
        int expected = 25;
        assertEquals(expected, CounterCoin.countCoinCountEagle(time), 10);
    }
}