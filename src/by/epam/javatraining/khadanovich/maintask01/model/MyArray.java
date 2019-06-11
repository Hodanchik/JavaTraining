package by.epam.javatraining.khadanovich.maintask01.model;

import by.epam.javatraining.khadanovich.maintask01.model.exception.NullArrayException;
import org.apache.log4j.Logger;

/**
 * dynamic array class
 *
 * @author Tatsiana Khadanovich
 * @version 1.0
 * @createdate 09/06/19
 */

public class MyArray {
    public static Logger logger = Logger.getRootLogger();
    // array of elements
    private double[] elementsArray;
    // size of array
    private int size;
    // index of new element
    private int index;

    private static final int DEFAULT_CAPACITY = 16;

    public MyArray() {
        elementsArray = new double[DEFAULT_CAPACITY];
    }

    public MyArray(int capacity) {
        elementsArray = new double[capacity];
    }

    public void add(double value) {
        if (index == elementsArray.length) {
            growArray();
        }
        elementsArray[index] = value;
        index++;
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
        if (index < 0 || index >= this.index)
            throw new IllegalArgumentException();
    }

    public void set(int index, double value) {
        checkIndex(index);
        elementsArray[index] = value;
    }

    public int size() {
        return index;
    }

    public double findMaxElement() throws NullArrayException {

        if (size != 0) {
            double max = elementsArray[0];
            for (int i = 1; i < size; i++) {
                if (elementsArray[i] > max) {
                    max = elementsArray[i];
                }
            }
            return max;
        } else throw new NullArrayException("You can't passed an array of zero length");
    }


    public double findMinElement() throws NullArrayException {
        if (size != 0) {
            double min = elementsArray[0];
            for (int i = 1; i < size; i++) {
                if (elementsArray[i] < min) {
                    min = elementsArray[i];
                }
            }
            return min;
        } else throw new NullArrayException("You can't passed an array of zero length");
    }


    public double findArithmeticalMean() throws NullArrayException {
        if (size != 0) {
            double arithmeticalSum = 0; // sum all elements
            for (double doubleNum : elementsArray) {
                arithmeticalSum += doubleNum;
            }
            return arithmeticalSum / size;
        } else throw new NullArrayException("You can't passed an array of zero length");
    }

    public double findGeometricMean() throws NullArrayException {
        if (size != 0) {
            double multiplicationNum = 1; // result of multiplication all elements
            for (int i = 0; i < size; i++) {
                multiplicationNum *= elementsArray[i];
            }
            return Math.pow(multiplicationNum, 1.0 / size);
        } else throw new NullArrayException("You can't passed an array of zero length");
    }

    public boolean checkIncreasing() throws NullArrayException {
        if (size != 0) {
            int lastIndex = index - 1;
            for (int index = 0; index < lastIndex; index++) {
                if (!(elementsArray[index] < elementsArray[index + 1])) {
                    return false;
                }
            }
            return true;
        } else throw new NullArrayException("You can't passed an array of zero length");
    }

    public boolean checkDescreasing() throws NullArrayException {
        if (size != 0) {
            int lastIndex = index - 1;
            for (int index = 0; index < lastIndex; index++) {
                if (!(elementsArray[index] > elementsArray[index + 1])) {
                    return false;
                }
            }
            return true;
        } else throw new NullArrayException("You can't passed an array of zero length");
    }

    public int findLocalMinimumPosition() throws NullArrayException {
        if (size != 0) {
            int position = -1;// position number of local minimum
            int lastIndex = index - 1; // last Position element
            int indexElement = 1; //first position element;
//check for 0 element
            if (elementsArray[0] < elementsArray[1]) {
                position = 0;
            }
            while (position == -1 && indexElement < lastIndex) {

                if (elementsArray[indexElement] < elementsArray[indexElement - 1]
                        || elementsArray[indexElement] < elementsArray[indexElement + 1]) {
                    position = indexElement;
                } else indexElement++;
            }
            //check for last element
            if (position == -1 && elementsArray[lastIndex] < elementsArray[lastIndex - 1]) {
                position = lastIndex;
            }
            return position;
        } else throw new NullArrayException("You can't passed an array of zero length");
    }

    public int findLocalMaximumPosition() throws NullArrayException {
        if (size != 0) {
            int position = -1;// position number of local maximum
            int lastIndex = index - 1; // last Position element
            int indexElement = 1; //first position element;
            //check for 0 element
            if (elementsArray[0] > elementsArray[1]) {
                position = 0;
            }
            while (position == -1 && indexElement < lastIndex) {
                if (elementsArray[indexElement] > elementsArray[indexElement - 1]
                        || elementsArray[indexElement] > elementsArray[indexElement + 1]) {
                    position = indexElement;
                } else indexElement++;
            }
            //check for last element
            if (position == -1 && elementsArray[lastIndex] > elementsArray[lastIndex - 1]) {
                position = lastIndex;
            }
            return position;
        } else throw new NullArrayException("You can't passed an array of zero length");
    }

    public int linearSearch(double elementToSearch) throws NullArrayException {
        if (size != 0) {
            int lastIndex = index - 1; // last Position element
            for (int index = 0; index <= lastIndex; index++) {
                if (elementsArray[index] == elementToSearch)
                    return index;
            }
            return -1;
        } else throw new NullArrayException("You can't passed an array of zero length");
    }


    //this method  Only for sorted massive
    public int binarySearch(double elementToSearch) throws NullArrayException {
//binary search Only for sorted massive
        if (checkIncreasing()) {
            int firstIndex = 0;
            int lastIndex = size - 1;
            // termination conditions
            while (firstIndex <= lastIndex) {
                int middleIndex = (firstIndex + lastIndex) / 2;

                if (elementsArray[middleIndex] == elementToSearch) {
                    return middleIndex;
                } else if (elementsArray[middleIndex] < elementToSearch) {
                    firstIndex = middleIndex + 1;
                } else if (elementsArray[middleIndex] > elementToSearch) {
                    lastIndex = middleIndex - 1;
                }
            }
            return -1;
        } else if (checkDescreasing()) {
            int firstIndex = 0;
            int lastIndex = size - 1;
            // termination conditions
            while (firstIndex <= lastIndex) {
                int middleIndex = (firstIndex + lastIndex) / 2;

                if (elementsArray[middleIndex] == elementToSearch) {
                    return middleIndex;
                } else if (elementsArray[middleIndex] > elementToSearch) {
                    firstIndex = middleIndex + 1;
                } else if (elementsArray[middleIndex] < elementToSearch) {
                    lastIndex = middleIndex - 1;
                }
            }
            return -1;
        }
        return -1;
    }

    public double[] reversArray() throws NullArrayException {
        if (size != 0) {
            int lastIndex = index - 1; // last element index
            double temp; // temporary number
            for (int index = 0; index <= lastIndex / 2; index++) {
                swap(elementsArray, index, lastIndex - index);

            }
            return elementsArray;
        } else throw new NullArrayException("You can't passed an array of zero length");
    }

    public void bubbleSortIncrease() throws NullArrayException {
        if (size != 0) {
            boolean isSorted = false;
            double temp; // temporary number
            int lastIndex = index - 1; // last element index

            while (!isSorted) {
                isSorted = true;// assume the array is sorted
                for (int i = 0; i < lastIndex; i++) {
                    if (elementsArray[i] > elementsArray[i + 1]) {
                        isSorted = false;
                        swap(elementsArray, i, i + 1);
                    }
                }
            }
        } else throw new NullArrayException("You can't passed an array of zero length");
    }

    public void bubbleSortDescreas() throws NullArrayException {
        if (size != 0) {
            boolean isSorted = false;
            double temp; // temporary number
            int lastIndex = index - 1; // last element index

            while (!isSorted) {
                isSorted = true;// assume the array is sorted
                for (int i = 0; i < lastIndex; i++) {
                    if (elementsArray[i] < elementsArray[i + 1]) {
                        isSorted = false;
                        swap(elementsArray, i, i + 1);
                    }
                }
            }
        } else throw new NullArrayException("You can't passed an array of zero length");
    }

    // Time Complexity: O(n*2)
//
//Auxiliary Space: O(1)
    public void insertionSortIncreas() throws NullArrayException {
        if (size != 0) {
            double element; // element unsortet array;

            for (int i = 1; i < size; i++) {
                element = elementsArray[i];
                int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
                while (j >= 0 && elementsArray[j] > element) {
                    elementsArray[j + 1] = elementsArray[j];
                    j = j - 1;
                }
                elementsArray[j + 1] = element;
            }
        } else throw new NullArrayException("You can't passed an array of zero length");

    }

    public void insertionSortDiscreas() throws NullArrayException {
        if (size != 0) {

            double element; // element unsortet array;

            for (int i = 1; i < size; i++) {
                element = elementsArray[i];
                int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               less than key, to one position ahead
               of their current position */
                while (j >= 0 && elementsArray[j] < element) {
                    elementsArray[j + 1] = elementsArray[j];
                    j = j - 1;
                }
                elementsArray[j + 1] = element;
            }
        } else throw new NullArrayException("You can't passed an array of zero length");

    }

    public void selectionSortIncreas() throws NullArrayException {
        if (size != 0) {
            double minElement; // min  element;

            int lastIndex = index - 1; // last element index
            for (int indexOne = 0; indexOne <= lastIndex; indexOne++) {
                minElement = elementsArray[indexOne];
                for (int indexTwo = indexOne + 1; indexTwo < size; indexTwo++) {
                    if (elementsArray[indexTwo] < minElement) {
                        minElement = elementsArray[indexTwo];
                        if (minElement != elementsArray[indexOne]) {
                            swap(elementsArray, indexOne, indexTwo);
                        }
                    }
                }
            }
        } else throw new NullArrayException("You can't passed an array of zero length");
    }

    public void selectionSortDiscreas() throws NullArrayException {
        if (size != 0) {
            double maxElement; // max  element;

            int lastIndex = index - 1; // last element index
            for (int indexOne = 0; indexOne <= lastIndex; indexOne++) {
                maxElement = elementsArray[indexOne];
                for (int indexTwo = indexOne + 1; indexTwo < size; indexTwo++) {
                    if (elementsArray[indexTwo] > maxElement) {
                        maxElement = elementsArray[indexTwo];
                        if (maxElement != elementsArray[indexOne]) {
                            swap(elementsArray, indexOne, indexTwo);
                        }
                    }
                }
            }
        } else throw new NullArrayException("You can't passed an array of zero length");
    }


    private static double[] copyArrayRange(double[] array, int startIndex, int endIndex) {
        int newLength = endIndex - startIndex;
        double[] copy = new double[newLength];
        for (int index = 0, indexVector = startIndex; index < newLength; index++, indexVector++) {
            copy[index] = array[indexVector];
        }
        return copy;

    }


    public void mergeSortIncreas() throws NullArrayException {
        if (size != 0) {
            if (size > 2) {
                elementsArray = mergeSortIncreasPrivate(elementsArray, size);
            }
        } else throw new NullArrayException("You can't passed an array of zero length");
    }

    private double[] mergeSortIncreasPrivate(double[] array, int size) {

        if (size < 2) return array;
        int m = size / 2;
        double[] arr1 = copyArrayRange(array, 0, m);
        double[] arr2 = copyArrayRange(array, m, size);
        return mergeIncreas(mergeSortIncreasPrivate(arr1, arr1.length), mergeSortIncreasPrivate(arr2, arr2.length));

    }

    public void mergeSortDiscreas() throws NullArrayException {
        if (size != 0) {
            if (size > 2) {
                elementsArray = mergeSortDiscreasPrivate(elementsArray, size);
            }
        } else throw new NullArrayException("You can't passed an array of zero length");
    }

    private double[] mergeSortDiscreasPrivate(double[] array, int size) {

        if (size < 2) return array;
        int m = size / 2;
        double[] arr1 = copyArrayRange(array, 0, m);
        double[] arr2 = copyArrayRange(array, m, size);
        return mergeDiscreas(mergeSortDiscreasPrivate(arr1, arr1.length), mergeSortDiscreasPrivate(arr2, arr2.length));
    }

    private static double[] mergeDiscreas(double[] arr1, double[] arr2) {
        int n = arr1.length + arr2.length;
        double[] arr = new double[n];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < n; i++) {
            if (i1 == arr1.length) {
                arr[i] = arr2[i2++];
            } else if (i2 == arr2.length) {
                arr[i] = arr1[i1++];
            } else {
                if (arr1[i1] > arr2[i2]) {
                    arr[i] = arr1[i1++];
                } else {
                    arr[i] = arr2[i2++];
                }
            }
        }
        return arr;
    }

    private static double[] mergeIncreas(double[] arr1, double[] arr2) {
        int n = arr1.length + arr2.length;
        double[] arr = new double[n];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < n; i++) {
            if (i1 == arr1.length) {
                arr[i] = arr2[i2++];
            } else if (i2 == arr2.length) {
                arr[i] = arr1[i1++];
            } else {
                if (arr1[i1] < arr2[i2]) {
                    arr[i] = arr1[i1++];
                } else {
                    arr[i] = arr2[i2++];
                }
            }
        }
        return arr;
    }

    public double[] quicksortIncreas() throws NullArrayException {
        if (size != 0) {
            quickSortIncreasLocal(elementsArray, 0, size - 1);
            return elementsArray;
        } else throw new NullArrayException("You can't passed an array of zero length");

    }

    public double[] quicksortDiscreas() throws NullArrayException {
        if (size != 0) {
            quickSortDiscreasLocal(elementsArray, 0, size - 1);
            return elementsArray;
        } else throw new NullArrayException("You can't passed an array of zero length");
    }

    private static void quickSortIncreasLocal(double[] array, int leftBorder, int rightBorder) {

        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        double pivot = array[(leftMarker + rightMarker) / 2];
        do {

            while (array[leftMarker] < pivot) {
                leftMarker++;
            }

            while (array[rightMarker] > pivot) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {

                if (leftMarker < rightMarker) {
                    swap(array, leftMarker, rightMarker);
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);


        if (leftMarker < rightBorder) {
            quickSortIncreasLocal(array, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSortIncreasLocal(array, leftBorder, rightMarker);
        }
    }


    private static void quickSortDiscreasLocal(double[] array, int leftBorder, int rightBorder) {

        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        double pivot = array[(leftMarker + rightMarker) / 2];
        do {

            while (array[leftMarker] > pivot) {
                leftMarker++;
            }

            while (array[rightMarker] < pivot) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {

                if (leftMarker < rightMarker) {
                    swap(array, leftMarker, rightMarker);
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);


        if (leftMarker < rightBorder) {
            quickSortDiscreasLocal(array, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSortDiscreasLocal(array, leftBorder, rightMarker);
        }
    }


    /**
     * swap array numbers
     *
     * @param vector Array
     * @param index1 Index first element.
     * @param index2 Index second element.
     */
    private static void swap(double[] vector, int index1, int index2) {
        double buffer = vector[index1];
        vector[index1] = vector[index2];
        vector[index2] = buffer;
    }

}

