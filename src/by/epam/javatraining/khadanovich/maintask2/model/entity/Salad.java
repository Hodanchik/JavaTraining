package by.epam.javatraining.khadanovich.maintask2.model.entity;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Objects;

public class Salad {
    public static Logger logger = Logger.getLogger(Salad.class);
    private Vegetable[] vegetableArray;
    // size of array
    private int size;
    private static final int DEFAULT_CAPACITY = 4;

    public Salad() {
        vegetableArray = new Vegetable[DEFAULT_CAPACITY];
    }

    public Salad(int capacity) {
        capacity = (capacity >= 0) ? capacity : -capacity;
        vegetableArray = new Vegetable[capacity];
        size = capacity;
    }

    public void add(Vegetable vegetable) {
        if (vegetable == null) {
            logger.warn("attempt add vegetable value NULL");
            return;
        }
        if (size == vegetableArray.length) {
            growArray();
        }
        vegetableArray[size] = vegetable;
        size++;
    }

    public void add(Vegetable... vegetable) {
        if (vegetable == null) {
            logger.warn("attempt add vegetable value NULL");
            return;
        }
        if (size == vegetableArray.length) {
            growArray();
        }
        for (int i = size, k = 0; i < vegetable.length; i++, k++) {
            vegetableArray[size] = vegetable[k];
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

    public Vegetable[] getAll() {
        return vegetableArray;
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
        if (vegetable == null) {
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
        if (index < 0) {
            logger.warn("attempt remove vegetable negative index");
            return;
        }
        for (int i = index + 1; i < size; i++) {
            vegetableArray[i - 1] = vegetableArray[i];
        }
        size -= 1;
    }
//    }
//    public void remove(Vegetable vegetable) {
//        if (vegetable == null ){
//            logger.warn("attempt remove vegetable value NULL");
//            return;
//        }
//
//        for (int i = 0; i < size - 1; i++) {
//            if (checkContainVegetable(vegetableArray[i])) {
//                Vegetable[] newVegetableArray = new Vegetable[size];
//                for (int j = 0; j < i; j++) {
//                    newVegetableArray[j] = vegetableArray[j];
//                }
//                for (int j = i + 1, k = i; j < size - 1; j++, k++) {
//                    newVegetableArray[k] = vegetableArray[j];
//                }
//                vegetableArray = newVegetableArray;
//            }
//        }
//    }

    public int size() {
        return size;
    }

    public void swap(int index1, int index2) {
        logger.trace("Swap elements");
        Vegetable buffer = vegetableArray[index1];
        vegetableArray[index1] = vegetableArray[index2];
        vegetableArray[index2] = buffer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Salad)) return false;
        Salad salad = (Salad) o;
        return size == salad.size &&
                Arrays.equals(vegetableArray, salad.vegetableArray);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(vegetableArray);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Salad{");
        for (int i = 0; i < size; i++) {
            sb.append(vegetableArray[i].getClass().getSimpleName());
            sb.append(", ");
        }
        sb.append('}');
        return sb.toString();
    }
}
