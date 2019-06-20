package by.epam.javatraining.khadanovich.maintask01.model.date;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayTest {

    @Test
    public void addTest() {
        MyArray array = new MyArray();
        double num = 12;
        array.add(num);
        int sizeAfterAdd = 1;
        assertEquals(sizeAfterAdd, array.size());
    }

    @Test
    public void getTest() {
        MyArray array = new MyArray();
        double num = 12;
        array.add(num);
        double expected = 12;
        assertEquals(expected, array.get(0), 0);
    }

    @Test
    public void setTest() {
        MyArray array = new MyArray();
        double num = 12;
        array.add(num);
        double numSet = 122;
        array.set(0, numSet);
        double expected = 122;
        assertEquals(expected, array.get(0), 0);
    }

    @Test
    public void sizeTest() {
        MyArray array = new MyArray();
        double num = 12;
        array.add(num);
        double expected = 1;
        assertEquals(expected, array.size(), 0);
    }
}