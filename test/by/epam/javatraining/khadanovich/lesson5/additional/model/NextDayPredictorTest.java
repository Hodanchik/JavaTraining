package by.epam.javatraining.khadanovich.lesson5.additional.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NextDayPredictorTest {

    @Test
    public void determinateNextDayOneTest() {
        int day = 30;
        int month = 2;
        int year = 1892;
        String expected = "Incorrect Date";
        assertEquals(expected, NextDayPredictor.predictNextDay(day, month, year));
    }

    @Test
    public void determinateNextDayTwoTest() {
        int day = 18;
        int month = 3;
        int year = 1998;
        String expected = "Next day: 19.3.1998";
        assertEquals(expected, NextDayPredictor.predictNextDay(day, month, year));
    }

    @Test
    public void determinateNextDayThreeTest() {
        int day = 31;
        int month = 3;
        int year = 1892;
        String expected = "Next day: 1.4.1892";
        assertEquals(expected, NextDayPredictor.predictNextDay(day, month, year));
    }

    @Test
    public void determinateNextDayFourTest() {
        int day = 31;
        int month = 12;
        int year = 1899;
        String expected = "Next day: 1.1.1900";
        assertEquals(expected, NextDayPredictor.predictNextDay(day, month, year));
    }

    @Test
    public void determinateNextDayFiveTest() {
        int day = 31;
        int month = 4;
        int year = 1893;
        String expected = "Incorrect Date";
        assertEquals(expected, NextDayPredictor.predictNextDay(day, month, year));
    }
}