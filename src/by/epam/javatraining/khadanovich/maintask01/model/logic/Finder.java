package by.epam.javatraining.khadanovich.maintask01.model.logic;

import by.epam.javatraining.khadanovich.maintask01.model.date.MyArray;
import by.epam.javatraining.khadanovich.maintask01.model.exception.NullArrayException;

public class Finder {

    public static int findIndexOfMaxElement(MyArray elementsArray) throws NullArrayException {
        if (elementsArray == null || elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }

        double max = elementsArray.get(0);
        int maxIndex = 0;
        for (int i = 1; i < elementsArray.size(); i++) {
            if (elementsArray.get(i) > max) {
                max = elementsArray.get(i);
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int findIndexOfMinElement(MyArray elementsArray) throws NullArrayException {
        if (elementsArray == null || elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }
        double min = elementsArray.get(0);
        int minIndex = 0;
        for (int i = 1; i < elementsArray.size(); i++) {
            if (elementsArray.get(i) < min) {
                min = elementsArray.get(i);
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static double findArithmeticalMean(MyArray elementsArray) throws NullArrayException {
        if (elementsArray == null || elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }
        double arithmeticalSum = 0; // sum all elements
        for (int i = 0; i < elementsArray.size(); i++) {
            arithmeticalSum += elementsArray.get(i);
        }
        return arithmeticalSum / elementsArray.size();
    }

    public static double findGeometricMean(MyArray elementsArray) throws NullArrayException {
        if (elementsArray == null || elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }

        double multiplicationNum = 1; // result of multiplication all positive elements
        int countPositiveNumber = 0; // count all positive elements
        for (int i = 0; i < elementsArray.size(); i++) {
            if (elementsArray.get(i) > 0) {
                multiplicationNum *= elementsArray.get(i);
                countPositiveNumber++;
            }
        }
        return Math.pow(multiplicationNum, 1.0 / countPositiveNumber);
    }


    public static int findLocalMinimumPosition(MyArray elementsArray) throws NullArrayException {
        if (elementsArray == null || elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }
        int size = elementsArray.size();
        int position = -1;// position number of local minimum
        int lastIndex = size - 1; // last Position element
        int indexElement = 0;//first position element;
//check for 0 element
        if (elementsArray.get(indexElement) < elementsArray.get(indexElement + 1)) {
            position = indexElement;
        } else {
            indexElement++;
        }
        while (position == -1 && indexElement < lastIndex) {

            if (elementsArray.get(indexElement) < elementsArray.get(indexElement + 1)
                    || elementsArray.get(indexElement) < elementsArray.get(indexElement + 1)) {
                position = indexElement;
            } else indexElement++;
        }
        //check for last element
        if (position == -1 && elementsArray.get(lastIndex) < elementsArray.get(lastIndex - 1)) {
            position = lastIndex;
        }
        return position;
    }


    public static int findLocalMaximumPosition(MyArray elementsArray) throws NullArrayException {
        if (elementsArray == null || elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }
        int size = elementsArray.size();
        int position = -1;// position number of local maximum
        int lastIndex = size - 1; // last Position element
        int indexElement = 0; //first position element;
        //check for 0 element
        if (elementsArray.get(indexElement) > elementsArray.get(indexElement + 1)) {
            position = indexElement;
        } else {
            indexElement++;
        }
        while (position == -1 && indexElement < lastIndex) {
            if (elementsArray.get(indexElement) > elementsArray.get(indexElement - 1)
                    || elementsArray.get(indexElement) > elementsArray.get(indexElement + 1)) {
                position = indexElement;
            } else indexElement++;
        }
        //check for last element
        if (position == -1 && elementsArray.get(lastIndex) > elementsArray.get(lastIndex - 1)) {
            position = lastIndex;
        }
        return position;
    }

    public static int linearSearch(MyArray elementsArray, double elementToSearch) throws NullArrayException {
        if (elementsArray == null || elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }
        int size = elementsArray.size();
        int positionSearchElement = -1;
        for (int position = 0; position < size && positionSearchElement == -1; position++) {
            if (elementsArray.get(position) == elementToSearch)
                positionSearchElement = position;
        }
        return positionSearchElement;
    }

    public static int binarySearch(MyArray elementsArray, double elementToSearch) throws NullArrayException {
        if (elementsArray == null || elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }
//binary search Only for sorted massive
        int size = elementsArray.size();
        int firstIndex = 0;
        int lastIndex = size - 1;
        int searchIndex = -1; //array has't element
        if (Checker.checkIncreasing(elementsArray)) {
            // termination conditions
            while (firstIndex < size && searchIndex == -1) {
                int middleIndex = (firstIndex + lastIndex) / 2;

                if (elementsArray.get(middleIndex) == elementToSearch) {
                    searchIndex = middleIndex;
                } else if (elementsArray.get(middleIndex) < elementToSearch) {
                    firstIndex = middleIndex + 1;
                } else {
                    lastIndex = middleIndex - 1;
                }
            }
            return searchIndex;
        } else if (Checker.checkDescreasing(elementsArray)) {

            // termination conditions
            while (firstIndex < size && searchIndex == -1) {
                int middleIndex = (firstIndex + lastIndex) / 2;

                if (elementsArray.get(middleIndex) == elementToSearch) {
                    searchIndex = middleIndex;
                } else if (elementsArray.get(middleIndex) > elementToSearch) {
                    firstIndex = middleIndex + 1;
                } else {
                    lastIndex = middleIndex - 1;
                }
            }
            return searchIndex;
        }
        return searchIndex;
    }

}
