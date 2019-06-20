package by.epam.javatraining.khadanovich.maintask01.model.logic;

import by.epam.javatraining.khadanovich.maintask01.model.date.MyArray;
import by.epam.javatraining.khadanovich.maintask01.model.exception.NullArrayException;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckerTest {

    @Test
    public void checkIncreasingOneTest() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(2);
        array.add(3);
        array.add(8);
        array.add(23);
        array.add(324);
        assertTrue(Checker.checkIncreasing(array));
    }

    @Test
    public void checkIncreasingTwoTest() throws NullArrayException {
        MyArray arrayNoIncreasing = new MyArray();
        arrayNoIncreasing.add(2);
        arrayNoIncreasing.add(3);
        arrayNoIncreasing.add(8);
        arrayNoIncreasing.add(4);
        arrayNoIncreasing.add(-3);
        assertFalse(Checker.checkIncreasing(arrayNoIncreasing));
    }
    @Test
    public void checkDescreasingOneTest() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(232);
        array.add(32);
        array.add(8);
        array.add(2);
        array.add(-324);
        assertTrue(Checker.checkDescreasing(array));
    }

    @Test
    public void checkDescreasingTwoTest() throws NullArrayException {
        MyArray arrayNoDescreasing = new MyArray();
        arrayNoDescreasing.add(2);
        arrayNoDescreasing.add(3);
        arrayNoDescreasing.add(8);
        arrayNoDescreasing.add(4);
        arrayNoDescreasing.add(-3);
        assertFalse(Checker.checkDescreasing(arrayNoDescreasing));
    }

}