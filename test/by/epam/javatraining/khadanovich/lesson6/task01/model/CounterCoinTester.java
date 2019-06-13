package by.epam.javatraining.khadanovich.lesson6.task01.model;


import static org.junit.Assert.*;


import org.junit.Test;


public class CounterCoinTester {

    @Test
    public void countCoinCountEagle() {
        int time = 50;
        int expected = 25;
        assertEquals(expected, CounterCoin.countCoinCountEagle(time), 10);
    }
}