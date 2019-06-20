package by.epam.javatraining.khadanovich.maintask01.model.logic;

import by.epam.javatraining.khadanovich.maintask01.model.date.MyArray;
import by.epam.javatraining.khadanovich.maintask01.model.exception.NullArrayException;

public class Checker {

    public static boolean checkIncreasing(MyArray elementsArray) throws NullArrayException {
        if (elementsArray == null && elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }
        int size = elementsArray.size();
        int lastIndex = size - 1;
        for (int index = 0; index < lastIndex; index++) {
            if (!(elementsArray.get(index) < elementsArray.get(index + 1))) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkDescreasing(MyArray elementsArray) throws NullArrayException {
        if (elementsArray == null && elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }
        int size = elementsArray.size();
        int lastIndex = size - 1;
        for (int index = 0; index < lastIndex; index++) {
            if (!(elementsArray.get(index) > elementsArray.get(index + 1))) {
                return false;
            }
        }
        return true;
    }
}
