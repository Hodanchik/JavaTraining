package by.epam.javatraining.khadanovich.maintask01.model.date;

import by.epam.javatraining.khadanovich.maintask01.model.exception.NullArrayException;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Objects;

/**
 * dynamic array class
 *
 * @author Tatsiana Khadanovich
 * @version 1.1
 * @createdate 09/06/19
 * @updatedate 16/06/19
 */

public class MyArray {
    public static Logger logger = Logger.getRootLogger();
    // array of elements
    private double[] elementsArray;
    // size of array
    private int size;


    private static final int DEFAULT_CAPACITY = 16;

    public MyArray() {
        elementsArray = new double[DEFAULT_CAPACITY];
    }

    public MyArray(int capacity) {
        elementsArray = new double[capacity];
        size = capacity;
    }

    public void add(double value) {
        if (size == elementsArray.length) {
            growArray();
        }
        elementsArray[size] = value;
        size++;
    }

    // increase the array if it has reached its maximum size
    private void growArray() {
        double[] newMyArray = new double[elementsArray.length * 2];
        for (int i = 0; i < size - 1; i++) {
            newMyArray[i] = elementsArray[i];
        }
        elementsArray = newMyArray;
    }

    public double get(int index) {
        checkIndex(index);
        return elementsArray[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size)
            throw new IllegalArgumentException();
    }

    public void set(int index, double value) {
        checkIndex(index);
        elementsArray[index] = value;
    }

    public int size()  {
        return size;
    }

    /**
     * swap array numbers
     *
     * @param index1 Index first element.
     * @param index2 Index second element.
     */
    public void swap(int index1, int index2) {
        double buffer = elementsArray[index1];
        elementsArray[index1] = elementsArray[index2];
        elementsArray[index2] = buffer;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        MyArray newArray = (MyArray) obj;
        if (newArray.size != size ) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (newArray.get(i) != elementsArray[i]) {
                return false;
            }
        }
        return true;
    }


    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(elementsArray);
        return result;
    }
}

