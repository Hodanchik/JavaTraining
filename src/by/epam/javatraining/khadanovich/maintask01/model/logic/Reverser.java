package by.epam.javatraining.khadanovich.maintask01.model.logic;

import by.epam.javatraining.khadanovich.maintask01.model.date.MyArray;
import by.epam.javatraining.khadanovich.maintask01.model.exception.NullArrayException;


public class Reverser {

    public static void reversArray(MyArray elementsArray) throws NullArrayException {
        if (elementsArray == null || elementsArray.size() == 0) {
            throw new NullArrayException("You can't passed an array of zero length");
        }
        int size = elementsArray.size();
        int lastIndex = size - 1; // last element index

        for (int index = 0; index <= lastIndex / 2; index++) {
            elementsArray.swap(index, lastIndex - index);
        }
    }
}
