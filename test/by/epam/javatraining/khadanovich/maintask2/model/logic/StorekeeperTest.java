package by.epam.javatraining.khadanovich.maintask2.model.logic;

import by.epam.javatraining.khadanovich.maintask2.model.entity.Fridge;
import org.junit.Test;

import static org.junit.Assert.*;

public class StorekeeperTest {

    @Test
    public void createNewFridgeTest() {
        Storekeeper storekeeper = new Storekeeper();
        Fridge fridge = new Fridge();
        assertEquals(fridge.getClass(), storekeeper.createNewFridge().getClass());
    }

    @Test
    public void fillFridgeTest() {
        Fridge fridge = new Fridge();
        int countDelivery = 5;
        Storekeeper storekeeper = new Storekeeper();
        storekeeper.fillFridge(fridge, countDelivery);
        int expectedSize = 30;
        assertEquals(expectedSize, fridge.size());
    }
}