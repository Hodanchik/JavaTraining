package by.epam.javatraining.khadanovich.lesson5.task03.model;

import static org.junit.Assert.*;

import org.junit.Test;


public class MoodSensorTest {

    @Test
    public void createRandomInt() {
        assertEquals(2.5, MoodSensor.createRandomInt(), 2.5);
    }

    @Test
    public void checkMood() {
        String expected = ":******( :*(:-| :-) :-D :-P";
        assertTrue(expected.contains(MoodSensor.checkMood()));
    }
}