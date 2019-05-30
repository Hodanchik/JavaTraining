package by.epam.javatraining.khadanovich.lesson5.task01.model;


import org.junit.Test;

import static org.junit.Assert.*;


public class CalculateDragonTest {

    @Test
    public void calculateHeadsDragon() {
        double age = 301;
        int expected = 804;
        assertEquals(expected, CalculateDragon.calculateHeadsDragon(age));
    }

    @Test
    public void calculateEyesDragon() {
        double age = 301;
        int expected = 1608;
        assertEquals(expected, CalculateDragon.calculateEyesDragon(age));
    }
}