package by.epam.javatraining.khadanovich.maintask01.model.logic;

import by.epam.javatraining.khadanovich.maintask01.model.date.MyArray;
import by.epam.javatraining.khadanovich.maintask01.model.exception.NullArrayException;

public class Sorter {


    public static void sortBubbleIncrease(MyArray elementsArray) throws NullArrayException {
        if (elementsArray == null || elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }
        int size = elementsArray.size();
        boolean isSorted = false;
        int lastIndex = size - 1; // last element index

        while (!isSorted) {
            isSorted = true;// assume the array is sorted
            for (int i = 0; i < lastIndex; i++) {
                if (elementsArray.get(i) > elementsArray.get(i + 1)) {
                    isSorted = false;
                    elementsArray.swap(i, i + 1);
                }
            }
        }
    }

    public static void sortBubbleDescreas(MyArray elementsArray) throws NullArrayException {
        if (elementsArray == null || elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }
        int size = elementsArray.size();
        boolean isSorted = false;
        int lastIndex = size - 1; // last element index

        while (!isSorted) {
            isSorted = true;// assume the array is sorted
            for (int i = 0; i < lastIndex; i++) {
                if (elementsArray.get(i) < elementsArray.get(i + 1)) {
                    isSorted = false;
                    elementsArray.swap(i, i + 1);
                }
            }
        }
    }

    public static void sortInsertiontIncreas(MyArray elementsArray) throws NullArrayException {
        if (elementsArray == null || elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }
        double element; // element unsortet array;
        int size = elementsArray.size();
        for (int i = 1; i < size; i++) {
            element = elementsArray.get(i);
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && elementsArray.get(j) > element) {
                elementsArray.set(j + 1, elementsArray.get(j));
                j = j - 1;
            }
            elementsArray.set(j + 1, element);
        }
    }

    public static void sortInsertiontDiscreas(MyArray elementsArray) throws NullArrayException {
        if (elementsArray == null || elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }
        double element; // element unsortet array;
        int size = elementsArray.size();
        for (int i = 1; i < size; i++) {
            element = elementsArray.get(i);
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               less than key, to one position ahead
               of their current position */
            while (j >= 0 && elementsArray.get(j) < element) {
                elementsArray.set(j + 1, elementsArray.get(j));
                j = j - 1;
            }
            elementsArray.set(j + 1, element);
        }
    }


    public static void sortSelectionIncreas(MyArray elementsArray) throws NullArrayException {
        if (elementsArray == null || elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }
        int size = elementsArray.size();
        double minElement; // min  element;
        int lastIndex = size - 1; // last element index

        for (int indexOne = 0; indexOne < lastIndex; indexOne++) {
            minElement = elementsArray.get(indexOne);
            for (int indexTwo = indexOne + 1; indexTwo <= lastIndex; indexTwo++) {
                if (elementsArray.get(indexTwo) < minElement) {
                    minElement = elementsArray.get(indexTwo);
                    elementsArray.swap(indexOne, indexTwo);
                }
            }
        }
    }


    public static void sortSelectionDiscreas(MyArray elementsArray) throws NullArrayException {
        if (elementsArray == null || elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }
        double maxElement; // max  element;
        int size = elementsArray.size();
        int lastIndex = size - 1; // last element index
        for (int indexOne = 0; indexOne < lastIndex; indexOne++) {
            maxElement = elementsArray.get(indexOne);
            for (int indexTwo = indexOne + 1; indexTwo <= lastIndex; indexTwo++) {
                if (elementsArray.get(indexTwo) > maxElement) {
                    maxElement = elementsArray.get(indexTwo);
                    elementsArray.swap(indexOne, indexTwo);
                }
            }
        }
    }


    private static MyArray copyArrayRange(MyArray elementsArray, int startIndex, int endIndex) {
        int newLength = endIndex - startIndex;

        MyArray copy = new MyArray(newLength);
        int baseIndex = 0;
        for (int x = startIndex; x < endIndex; x++) {
            copy.set(baseIndex++, elementsArray.get(x));
        }
        return copy;
    }
//this method sort array  increase and return NEW sorted Array
    public static MyArray sortMergeIncreas(MyArray elementsArray) throws NullArrayException {
        MyArray copyArray = new MyArray();

        if (elementsArray == null && elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }

        if (elementsArray.size() > 2) {
            copyArray = sortMergeBreaker(elementsArray);
        }
        return copyArray;
    }

    private static MyArray sortMergeBreaker(MyArray array) {

        int size = array.size();
        int halfSize = size / 2;

        if (size < 2) {
            return array;
        }

        MyArray array1 = copyArrayRange(array, 0, halfSize);
        MyArray array2 = copyArrayRange(array, halfSize, size);
        return sortMergeCollector(sortMergeBreaker(array1), sortMergeBreaker(array2));
    }


    private static MyArray sortMergeCollector(MyArray array1, MyArray array2) {

        int n = array1.size() + array2.size();
        MyArray arrayResult = new MyArray(n);
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < n; i++) {
            if (index1 < array1.size() && index2 < array2.size()) {
                if (array1.get(index1) < array2.get(index2)) {
                    double v = array1.get(index1++);
                    arrayResult.set(i, v);
                } else {
                    arrayResult.set(i, array2.get(index2++));
                }
            } else if (index1 == array1.size()) {
                arrayResult.set(i, array2.get(index2++));
            } else if (index2 == array2.size()) {
                arrayResult.set(i, array1.get(index1++));
            }
        }
        return arrayResult;
    }
    //this method sort array  descrease and return NEW sorted Array
    public static MyArray sortMergeDiscreas(MyArray elementsArray) throws NullArrayException {
        MyArray copyArray = new MyArray();

        if (elementsArray == null && elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }

        if (elementsArray.size() > 2) {
            copyArray = sortMergeBreakerDiscreas(elementsArray);
        }
        return copyArray;
    }
    private static MyArray sortMergeBreakerDiscreas(MyArray array) {

        int size = array.size();
        int halfSize = size / 2;

        if (size < 2) {
            return array;
        }

        MyArray array1 = copyArrayRange(array, 0, halfSize);
        MyArray array2 = copyArrayRange(array, halfSize, size);
        return sortMergeCollectorDiscreas(sortMergeBreakerDiscreas(array1), sortMergeBreakerDiscreas(array2));
    }

    private static MyArray sortMergeCollectorDiscreas(MyArray array1, MyArray array2) {

        int n = array1.size() + array2.size();
        MyArray arrayResult = new MyArray(n);
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < n; i++) {
            if (index1 < array1.size() && index2 < array2.size()) {
                if (array1.get(index1) > array2.get(index2)) {
                    double v = array1.get(index1++);
                    arrayResult.set(i, v);
                } else {
                    arrayResult.set(i, array2.get(index2++));
                }
            } else if (index1 == array1.size()) {
                arrayResult.set(i, array2.get(index2++));
            } else if (index2 == array2.size()) {
                arrayResult.set(i, array1.get(index1++));
            }
        }
        return arrayResult;
    }

    public static void quicksortIncreas(MyArray elementsArray) throws NullArrayException {
        if (elementsArray == null && elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }
        int size = elementsArray.size();
        quickSortIncreasLocal(elementsArray, 0, size - 1);

    }

    public static void quicksortDiscreas(MyArray elementsArray) throws NullArrayException {
        if (elementsArray == null && elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }
        int size = elementsArray.size();
        quickSortDiscreasLocal(elementsArray, 0, size - 1);

    }

    private static void quickSortIncreasLocal(MyArray elementsArray, int leftBorder, int rightBorder) {

        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        double pivot = elementsArray.get((leftMarker + rightMarker) / 2);
        do {

            while (elementsArray.get(leftMarker) < pivot) {
                leftMarker++;
            }

            while (elementsArray.get(rightMarker) > pivot) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {

                if (leftMarker < rightMarker) {
                    elementsArray.swap(leftMarker, rightMarker);
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);


        if (leftMarker < rightBorder) {
            quickSortIncreasLocal(elementsArray, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSortIncreasLocal(elementsArray, leftBorder, rightMarker);
        }
    }


    private static void quickSortDiscreasLocal(MyArray elementsArray, int leftBorder, int rightBorder) {

        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        double pivot = elementsArray.get((leftMarker + rightMarker) / 2);
        do {

            while (elementsArray.get(leftMarker) > pivot) {
                leftMarker++;
            }

            while (elementsArray.get(rightMarker) < pivot) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {

                if (leftMarker < rightMarker) {
                    elementsArray.swap(leftMarker, rightMarker);
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);


        if (leftMarker < rightBorder) {
            quickSortDiscreasLocal(elementsArray, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSortDiscreasLocal(elementsArray, leftBorder, rightMarker);
        }
    }


}
