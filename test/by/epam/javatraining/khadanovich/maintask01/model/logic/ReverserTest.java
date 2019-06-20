package by.epam.javatraining.khadanovich.maintask01.model.logic;

import by.epam.javatraining.khadanovich.maintask01.model.date.MyArray;
import by.epam.javatraining.khadanovich.maintask01.model.exception.NullArrayException;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverserTest {

    @Test
    public void reversArrayTest() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(32);
        array.add(88);
        array.add(230);
        Reverser.reversArray(array);
        MyArray expected = new MyArray(array.size());
        expected.add(230);
        expected.add(88);
        expected.add(32);
        expected.add(3);
        assertEquals(expected, array);
    }


}