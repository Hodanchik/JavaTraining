package by.epam.javatraining.khadanovich.lesson5.additional.model;


import org.junit.Test;

import static org.junit.Assert.*;

public class DeterminanterTest {

    @Test
    public void determinateNextDay() {
        int day = 31;
        int month = 12;
        int year = 1892;
        String expected = "Next day: 1.1.1893";
        assertEquals(expected, Determinanter.determinateNextDay(day, month, year));
    }
}