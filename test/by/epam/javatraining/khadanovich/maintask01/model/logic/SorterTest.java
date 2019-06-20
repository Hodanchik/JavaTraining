package by.epam.javatraining.khadanovich.maintask01.model.logic;

import by.epam.javatraining.khadanovich.maintask01.model.date.MyArray;
import by.epam.javatraining.khadanovich.maintask01.model.exception.NullArrayException;
import org.junit.Test;

import static org.junit.Assert.*;

public class SorterTest {

    @Test
    public void sortBubbleIncreaseTest() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        Sorter.sortBubbleIncrease(array);
        MyArray expected = new MyArray();
        expected.add(1);
        expected.add(3);
        expected.add(23);
        expected.add(88);
        assertEquals(expected, array);
    }

    @Test
    public void sortBubbleDescreasTest() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        Sorter.sortBubbleDescreas(array);
        MyArray expected = new MyArray();
        expected.add(88);
        expected.add(23);
        expected.add(3);
        expected.add(1);
        assertEquals(expected, array);
    }

    @Test
    public void sortInsertiontIncreasTest() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        Sorter.sortInsertiontIncreas(array);
        MyArray expected = new MyArray();
        expected.add(1);
        expected.add(3);
        expected.add(23);
        expected.add(88);
        assertEquals(expected, array);
    }

    @Test
    public void sortInsertiontDiscreasTest() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        Sorter.sortInsertiontDiscreas(array);
        MyArray expected = new MyArray();
        expected.add(88);
        expected.add(23);
        expected.add(3);
        expected.add(1);
        assertEquals(expected, array);
    }

    @Test
    public void sortSelectionIncreasTest() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        Sorter.sortSelectionIncreas(array);
        MyArray expected = new MyArray();
        expected.add(1);
        expected.add(3);
        expected.add(23);
        expected.add(88);
        assertEquals(expected, array);
    }

    @Test
    public void sortSelectionDiscreasTest() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        Sorter.sortSelectionDiscreas(array);
        MyArray expected = new MyArray();
        expected.add(88);
        expected.add(23);
        expected.add(3);
        expected.add(1);
        assertEquals(expected, array);
    }

    @Test
    public void sortMergeIncreasTest() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        array = Sorter.sortMergeIncreas(array);
        MyArray expected = new MyArray();
        expected.add(1);
        expected.add(3);
        expected.add(23);
        expected.add(88);
        assertEquals(expected, array);
    }

    @Test
    public void sortMergeDiscreasTest() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        array = Sorter.sortMergeDiscreas(array);
        MyArray expected = new MyArray();
        expected.add(88);
        expected.add(23);
        expected.add(3);
        expected.add(1);
        assertEquals(expected, array);
    }

    @Test
    public void quicksortIncreasTest() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        Sorter.quicksortIncreas(array);
        MyArray expected = new MyArray();
        expected.add(1);
        expected.add(3);
        expected.add(23);
        expected.add(88);
        assertEquals(expected, array);
    }

    @Test
    public void quicksortDiscreasTest() throws NullArrayException {
        MyArray array = new MyArray();
        array.add(3);
        array.add(1);
        array.add(88);
        array.add(23);
        Sorter.quicksortDiscreas(array);
        MyArray expected = new MyArray();
        expected.add(88);
        expected.add(23);
        expected.add(3);
        expected.add(1);
        assertEquals(expected, array);
    }
}