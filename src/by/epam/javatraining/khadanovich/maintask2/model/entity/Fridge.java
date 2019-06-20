package by.epam.javatraining.khadanovich.maintask2.model.entity;

import org.apache.log4j.Logger;

public class Fridge {
    public static Logger logger = Logger.getLogger(Fridge.class);
    private Vegetable[] vegetableArray;
    // size of array
    private int size;
    private static final int DEFAULT_CAPACITY = 8;

    public Fridge() {
        vegetableArray = new Vegetable[DEFAULT_CAPACITY];
    }

    public Fridge(int capacity) {
        capacity = (capacity >= 0) ? capacity : -capacity;
        vegetableArray = new Vegetable[capacity];
        size = capacity;
    }

    public void add(Vegetable vegetable) {
if (vegetable == null ){
    logger.warn("attempt add vegetable value NULL");
    return;
}
        if (size == vegetableArray.length) {
            growArray();
        }
        vegetableArray[size] = vegetable;
        logger.trace("add new vegetable to fright");
        size++;
    }

    public void add(Vegetable... vegetable) {
        if (vegetable == null ){
            logger.warn("attempt add vegetable value NULL");
            return;
        }
        if (size == vegetableArray.length) {
            growArray();
        }
        for (int i = size, k = 0; i < vegetable.length; i++, k++) {
            vegetableArray[size] = vegetable[k];
            logger.trace("add new vegetables to fright");
            size++;
            if (size == vegetableArray.length) {
                growArray();
            }
        }
    }


    public Vegetable get(int index) {
        checkIndex(index);
        return vegetableArray[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            logger.error("check index - error");
            throw new IllegalArgumentException();
        }
    }
    // increase the array if it has reached its maximum size
    private void growArray() {
        Vegetable[] newVegetableArray = new Vegetable[vegetableArray.length * 2];
        for (int i = 0; i < size; i++) {
            newVegetableArray[i] = vegetableArray[i];
        }
        vegetableArray = newVegetableArray;
    }

    public boolean checkContainVegetable(Vegetable vegetable) {
        if (vegetable == null ){
            logger.warn("attempt check vegetable value NULL");
            return false;
        }
        for (Vegetable veg : vegetableArray) {
            if (veg.getClass() == vegetable.getClass()) {
                return true;
            }
        }
        return false;
    }

    public void remove(int index) {
        if (index <0 ){
            logger.warn("attempt remove vegetable negative index");
            return;
        }
        for (int i = index + 1; i < size; i++) {
            vegetableArray[i - 1] = vegetableArray[i];
        }
        size -= 1;
    }

    public int size() {
        return size;
    }

    public void swap(int index1, int index2) {
        logger.trace("Swap elements");
        Vegetable buffer = vegetableArray[index1];
        vegetableArray[index1] = vegetableArray[index2];
        vegetableArray[index2] = buffer;
    }


}
