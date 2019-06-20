package by.epam.javatraining.khadanovich.maintask01.model.logic;

import by.epam.javatraining.khadanovich.maintask01.model.date.MyArray;
import by.epam.javatraining.khadanovich.maintask01.model.exception.NullArrayException;
import org.junit.Test;

import static org.junit.Assert.*;

public class FinderTest {

    @Test
    public void findIndexOfMaxElementTest() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(-29);
        array.add(-23);
        array.add(-80);
        array.add(-2333);
        array.add(-23);
        int expected = 1;
        assertEquals(expected, Finder.findIndexOfMaxElement(array), 0);
    }

    @Test(expected = Exception.class)
    public void findIndexOfMaxElementTestException() throws NullArrayException {
        MyArray array = new MyArray();
        Finder.findIndexOfMaxElement(array);
    }

    @Test(expected = Exception.class)
    public void findIndexOfMinElementTestException() throws NullArrayException {
        MyArray array = new MyArray();
        Finder.findIndexOfMinElement(array);
    }

    @Test
    public void findIndexOfMinElementTest() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(23);
        array.add(223);
        array.add(-80);
        array.add(2333);
        array.add(23);
        double expected = 2;
        assertEquals(expected, Finder.findIndexOfMinElement(array), 0);
    }

    @Test
    public void findArithmeticalMeanTest() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(2);
        array.add(3);
        array.add(8);
        array.add(23);
        array.add(23);
        double expected = 11.8;
        assertEquals(expected, Finder.findArithmeticalMean(array), 0);
    }

    @Test
    public void findGeometricMeanTest() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(2);
        array.add(3);
        array.add(8);
        array.add(23);
        array.add(23);
        double expected = 7.6022015924038495;
        assertEquals(expected, Finder.findGeometricMean(array), 0);
    }


    @Test(expected = Exception.class)
    public void findLocalMinimumPositionTestException() throws NullArrayException {
        MyArray array = new MyArray();
        Finder.findLocalMinimumPosition(array);
    }

    @Test
    public void findLocalMinimumPositionTestOne() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(3);
        array.add(8);
        array.add(23);
        int expected = 1;
        assertEquals(expected, Finder.findLocalMinimumPosition(array));
    }

    @Test
    public void findLocalMinimumPositionTestTwo() throws NullArrayException {
        MyArray arrayTwo = new MyArray();
        arrayTwo.add(2);
        arrayTwo.add(2);
        arrayTwo.add(2);
        int expectedTwo = -1;
        assertEquals(expectedTwo, Finder.findLocalMinimumPosition(arrayTwo));
    }

    @Test(expected = Exception.class)
    public void findLocalMaximumPositioTestException() throws NullArrayException {
        MyArray array = new MyArray();
        Finder.findLocalMaximumPosition(array);
    }

    @Test
    public void findLocalMaximumPositionTestOne() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(3);
        array.add(8);
        array.add(23);
        int expected = 2;
        assertEquals(expected, Finder.findLocalMaximumPosition(array));
    }

    @Test
    public void findLocalMaximumPositionTestTwo() throws NullArrayException {
        MyArray arrayTwo = new MyArray();
        arrayTwo.add(2);
        arrayTwo.add(2);
        arrayTwo.add(2);
        int expectedTwo = -1;
        assertEquals(expectedTwo, Finder.findLocalMaximumPosition(arrayTwo));
    }
    @Test
    public void linearSearchOneTest() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(32);
        array.add(8);
        array.add(23);
        double searchDoubleOne = 32;
        int expected = 1;
        assertEquals(expected, Finder.linearSearch(array, searchDoubleOne));
    }

    @Test
    public void linearSearchTwoTest() throws NullArrayException {
        MyArray arrayTwo = new MyArray();
        arrayTwo.add(2);
        arrayTwo.add(245);
        arrayTwo.add(-203);
        double searchDoubleTwo = -204;
        int expectedTwo = -1;
        assertEquals(expectedTwo, Finder.linearSearch(arrayTwo, searchDoubleTwo));
    }

    @Test
    public void binarySearchOneTest() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(32);
        array.add(88);
        array.add(230);
        double searchDoubleOne = 32;
        int expected = 1;
        assertEquals(expected, Finder.binarySearch(array, searchDoubleOne));
    }

    @Test
    public void binarySearchTwoTest() throws NullArrayException {
        MyArray arrayTwo = new MyArray();
        arrayTwo.add(2);
        arrayTwo.add(245);
        arrayTwo.add(-203);
        double searchDoubleTwo = -203;
        int expectedTwo = -1;
        assertEquals(expectedTwo, Finder.binarySearch(arrayTwo, searchDoubleTwo));
    }
}