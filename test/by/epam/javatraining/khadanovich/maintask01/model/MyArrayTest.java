package by.epam.javatraining.khadanovich.maintask01.model;

import by.epam.javatraining.khadanovich.maintask01.model.exception.NullArrayException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayTest {

    @Test
    public void add() {
        MyArray array = new MyArray();
        int sizeBeforeAdd = 0;
        assertEquals(sizeBeforeAdd, array.size());
        double num = 12;
        array.add(num);
        int sizeAfterAdd = 1;
        assertEquals(sizeAfterAdd, array.size());
    }

    @Test
    public void get() {
        MyArray array = new MyArray();
        double num = 12;
        array.add(num);
        double expected = 12;
        assertEquals(expected, array.get(0), 0);
    }

    @Test
    public void set() {
        MyArray array = new MyArray();
        double num = 12;
        array.add(num);
        double numSet = 122;
        array.set(0, numSet);
        double expected = 122;
        assertEquals(expected, array.get(0), 0);
    }

    @Test
    public void size() {
        MyArray array = new MyArray();
        double num = 12;
        array.add(num);
        double expected = 1;
        assertEquals(expected, array.size(), 0);
    }

    @Test
    public void findMaxElement() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(-29);
        array.add(-23);
        array.add(-80);
        array.add(-2333);
        array.add(-23);
        double expected = -23;
        assertEquals(expected, array.findMaxElement(), 0);
    }

    @Test(expected = NullArrayException.class)
    public void findMaxElementException() throws NullArrayException {
        MyArray array = new MyArray();
        array.findMaxElement();
    }

    @Test(expected = NullArrayException.class)
    public void findMinElementException() throws NullArrayException {
        MyArray array = new MyArray();
        array.findMinElement();
    }

    @Test
    public void findMinElement() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(23);
        array.add(223);
        array.add(-80);
        array.add(2333);
        array.add(23);
        double expected = -80;
        assertEquals(expected, array.findMinElement(), 0);

    }

    @Test(expected = NullArrayException.class)
    public void findArithmeticalMeanException() throws NullArrayException {
        MyArray array = new MyArray();
        array.findArithmeticalMean();
    }

    @Test
    public void findArithmeticalMean() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(2);
        array.add(3);
        array.add(8);
        array.add(23);
        array.add(23);
        double expected = 11.8;
        assertEquals(expected, array.findArithmeticalMean(), 0);
    }

    @Test(expected = NullArrayException.class)
    public void findGeometricMeanException() throws NullArrayException {
        MyArray array = new MyArray();
        array.findGeometricMean();
    }

    @Test
    public void findGeometricMean() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(2);
        array.add(3);
        array.add(8);
        array.add(23);
        array.add(23);
        double expected = 7.6022015924038495;
        assertEquals(expected, array.findGeometricMean(), 0);
    }

    @Test(expected = NullArrayException.class)
    public void checkIncreasingException() throws NullArrayException {
        MyArray array = new MyArray();
        array.checkIncreasing();
    }

    @Test
    public void checkIncreasing() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(2);
        array.add(3);
        array.add(8);
        array.add(23);
        array.add(324);
        MyArray arrayNoIncreasing = new MyArray();
        arrayNoIncreasing.add(2);
        arrayNoIncreasing.add(3);
        arrayNoIncreasing.add(8);
        arrayNoIncreasing.add(4);
        arrayNoIncreasing.add(-3);
        assertTrue(array.checkIncreasing());
        assertFalse(arrayNoIncreasing.checkIncreasing());
    }


    @Test(expected = NullArrayException.class)
    public void checkDescreasingException() throws NullArrayException {
        MyArray array = new MyArray();
        array.checkDescreasing();
    }

    @Test
    public void checkDescreasing() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(232);
        array.add(32);
        array.add(8);
        array.add(2);
        array.add(-324);
        MyArray arrayNoDescreasing = new MyArray();
        arrayNoDescreasing.add(2);
        arrayNoDescreasing.add(3);
        arrayNoDescreasing.add(8);
        arrayNoDescreasing.add(4);
        arrayNoDescreasing.add(-3);
        assertTrue(array.checkDescreasing());
        assertFalse(arrayNoDescreasing.checkDescreasing());
    }

    @Test(expected = NullArrayException.class)
    public void findLocalMinimumPositionException() throws NullArrayException {
        MyArray array = new MyArray();
        array.findLocalMinimumPosition();
    }

    @Test
    public void findLocalMinimumPosition() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(3);
        array.add(8);
        array.add(23);
        MyArray arrayTwo = new MyArray();
        arrayTwo.add(2);
        arrayTwo.add(2);
        arrayTwo.add(2);
        int expected = 1;
        int expectedTwo = -1;
        assertEquals(expected, array.findLocalMinimumPosition());
        assertEquals(expectedTwo, arrayTwo.findLocalMinimumPosition());
    }

    @Test(expected = NullArrayException.class)
    public void findLocalMaximumPositionException() throws NullArrayException {
        MyArray array = new MyArray();
        array.findLocalMaximumPosition();
    }

    @Test
    public void findLocalMaximumPosition() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(3);
        array.add(8);
        array.add(23);
        MyArray arrayTwo = new MyArray();
        arrayTwo.add(2);
        arrayTwo.add(2);
        arrayTwo.add(2);
        int expected = 2;
        int expectedTwo = -1;
        assertEquals(expected, array.findLocalMaximumPosition());
        assertEquals(expectedTwo, arrayTwo.findLocalMaximumPosition());
    }

    @Test(expected = NullArrayException.class)
    public void linearSearchException() throws NullArrayException {
        MyArray array = new MyArray();
        double searchDouble = 86;
        array.linearSearch(searchDouble);
    }

    @Test
    public void linearSearch() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(32);
        array.add(8);
        array.add(23);
        MyArray arrayTwo = new MyArray();
        arrayTwo.add(2);
        arrayTwo.add(245);
        arrayTwo.add(-203);
        double searchDoubleOne = 32;
        double searchDoubleTwo = -204;
        int expected = 1;
        int expectedTwo = -1;
        assertEquals(expected, array.linearSearch(searchDoubleOne));
        assertEquals(expectedTwo, arrayTwo.linearSearch(searchDoubleTwo));

    }

    @Test(expected = NullArrayException.class)
    public void binarySearchException() throws NullArrayException {
        MyArray array = new MyArray();
        double searchDouble = 86;
        array.binarySearch(searchDouble);
    }

    @Test
    public void binarySearch() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(32);
        array.add(88);
        array.add(230);
        MyArray arrayTwo = new MyArray();
        arrayTwo.add(2);
        arrayTwo.add(245);
        arrayTwo.add(-203);
        double searchDoubleOne = 32;
        double searchDoubleTwo = -203;
        int expected = 1;
        int expectedTwo = -1;
        assertEquals(expected, array.binarySearch(searchDoubleOne));
        assertEquals(expectedTwo, arrayTwo.binarySearch(searchDoubleTwo));

    }

    @Test(expected = NullArrayException.class)
    public void reversArrayException() throws NullArrayException {
        MyArray array = new MyArray();
        array.reversArray();
    }

    @Test
    public void reversArray() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(32);
        array.add(88);
        array.add(230);
        array.reversArray();
        double[] reversArray = new double[array.size()];
        for (int i = 0; i < array.size(); i++) {
            reversArray[i] = array.get(i);
        }
        double[] expected = new double[]{230, 88, 32, 3};

        Assert.assertArrayEquals(expected, reversArray, 0);

    }


    @Test(expected = NullArrayException.class)
    public void bubbleSortIncreaseException() throws NullArrayException {
        MyArray array = new MyArray();
        array.bubbleSortIncrease();
    }

    @Test
    public void bubbleSortIncrease() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        array.bubbleSortIncrease();
        double[] sortIncreaseArray = new double[array.size()];
        for (int i = 0; i < array.size(); i++) {
            sortIncreaseArray[i] = array.get(i);
        }
        double[] expected = new double[]{1, 3, 23, 88};

        Assert.assertArrayEquals(expected, sortIncreaseArray, 0);

    }

    @Test(expected = NullArrayException.class)
    public void bubbleSortDescreasException() throws NullArrayException {
        MyArray array = new MyArray();
        array.bubbleSortDescreas();
    }

    @Test
    public void bubbleSortDescreas() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        array.bubbleSortDescreas();
        double[] sortDescreasArray = new double[array.size()];
        for (int i = 0; i < array.size(); i++) {
            sortDescreasArray[i] = array.get(i);
        }
        double[] expected = new double[]{88, 23, 3, 1};

        Assert.assertArrayEquals(expected, sortDescreasArray, 0);

    }

    @Test(expected = NullArrayException.class)
    public void insertionSortIncreasException() throws NullArrayException {
        MyArray array = new MyArray();
        array.insertionSortIncreas();
    }

    @Test
    public void insertionSortIncreas() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        array.insertionSortIncreas();
        double[] sortIncreaseArray = new double[array.size()];
        for (int i = 0; i < array.size(); i++) {
            sortIncreaseArray[i] = array.get(i);
        }
        double[] expected = new double[]{1, 3, 23, 88};

        Assert.assertArrayEquals(expected, sortIncreaseArray, 0);
    }

    @Test(expected = NullArrayException.class)
    public void insertionSortDiscreasException() throws NullArrayException {
        MyArray array = new MyArray();
        array.insertionSortDiscreas();
    }

    @Test
    public void insertionSortDiscreas() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        array.insertionSortDiscreas();
        double[] sortDescreasArray = new double[array.size()];
        for (int i = 0; i < array.size(); i++) {
            sortDescreasArray[i] = array.get(i);
        }
        double[] expected = new double[]{88, 23, 3, 1};

        Assert.assertArrayEquals(expected, sortDescreasArray, 0);

    }

    @Test(expected = NullArrayException.class)
    public void selectionSortIncreasException() throws NullArrayException {
        MyArray array = new MyArray();
        array.selectionSortIncreas();
    }

    @Test
    public void selectionSortIncreas() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        array.selectionSortIncreas();
        double[] sortIncreaseArray = new double[array.size()];
        for (int i = 0; i < array.size(); i++) {
            sortIncreaseArray[i] = array.get(i);
        }
        double[] expected = new double[]{1, 3, 23, 88};

        Assert.assertArrayEquals(expected, sortIncreaseArray, 0);
    }

    @Test(expected = NullArrayException.class)
    public void selectionSortDiscreasException() throws NullArrayException {
        MyArray array = new MyArray();
        array.selectionSortDiscreas();
    }

    @Test
    public void selectionSortDiscreas() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        array.selectionSortDiscreas();
        double[] sortDescreasArray = new double[array.size()];
        for (int i = 0; i < array.size(); i++) {
            sortDescreasArray[i] = array.get(i);
        }
        double[] expected = new double[]{88, 23, 3, 1};

        Assert.assertArrayEquals(expected, sortDescreasArray, 0);
    }

    @Test(expected = NullArrayException.class)
    public void mergeSortIncreasException() throws NullArrayException {
        MyArray array = new MyArray();
        array.mergeSortIncreas();
    }

    @Test
    public void mergeSortIncreas() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        array.mergeSortIncreas();
        double[] sortIncreaseArray = new double[array.size()];
        for (int i = 0; i < array.size(); i++) {
            sortIncreaseArray[i] = array.get(i);
        }
        double[] expected = new double[]{1, 3, 23, 88};

        Assert.assertArrayEquals(expected, sortIncreaseArray, 0);

    }

    @Test(expected = NullArrayException.class)
    public void mergeSortDiscreasException() throws NullArrayException {
        MyArray array = new MyArray();
        array.mergeSortDiscreas();
    }

    @Test
    public void mergeSortDiscreas() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        array.mergeSortDiscreas();
        double[] sortDescreasArray = new double[array.size()];
        for (int i = 0; i < array.size(); i++) {
            sortDescreasArray[i] = array.get(i);
        }
        double[] expected = new double[]{88, 23, 3, 1};

        Assert.assertArrayEquals(expected, sortDescreasArray, 0);
    }

    @Test(expected = NullArrayException.class)
    public void quicksortIncreasException() throws NullArrayException {
        MyArray array = new MyArray();
        array.quicksortIncreas();
    }

    @Test
    public void quicksortIncreas() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        array.quicksortIncreas();
        double[] sortIncreaseArray = new double[array.size()];
        for (int i = 0; i < array.size(); i++) {
            sortIncreaseArray[i] = array.get(i);
        }
        double[] expected = new double[]{1, 3, 23, 88};

        Assert.assertArrayEquals(expected, sortIncreaseArray, 0);

    }

    @Test(expected = NullArrayException.class)
    public void quicksortDiscreasException() throws NullArrayException {
        MyArray array = new MyArray();
        array.quicksortDiscreas();
    }

    @Test
    public void quicksortDiscreas() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        array.quicksortDiscreas();
        double[] sortDescreasArray = new double[array.size()];
        for (int i = 0; i < array.size(); i++) {
            sortDescreasArray[i] = array.get(i);
        }
        double[] expected = new double[]{88, 23, 3, 1};

        Assert.assertArrayEquals(expected, sortDescreasArray, 0);
    }
}