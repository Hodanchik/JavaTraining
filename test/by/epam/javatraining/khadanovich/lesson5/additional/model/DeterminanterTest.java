package by.epam.javatraining.khadanovich.lesson5.additional.model;


import org.junit.Test;

import static org.junit.Assert.*;

public class DeterminanterTest {

    @Test
    public void determinateNextDay() {
        int day = 30;
        int month = 2;
        int year = 1892;
        String expected = "Incorrect Date";
        assertEquals(expected, Determinanter.determinateNextDay(day, month, year));
    }
}