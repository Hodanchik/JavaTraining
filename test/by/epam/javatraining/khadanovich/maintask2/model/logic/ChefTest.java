package by.epam.javatraining.khadanovich.maintask2.model.logic;

import by.epam.javatraining.khadanovich.maintask2.model.entity.*;
import org.junit.Test;

import static org.junit.Assert.*;


public class ChefTest {

    @Test
    public void makeSaladTest() {
        Salad salad = new Salad();
        int weight = 12;
        Vegetable tomatoForSalad = new Tomato(weight);
        Vegetable onionForSalad = new Onion(weight);
        Vegetable broccoliForSalad = new Broccoli(weight);
        salad.add(tomatoForSalad, onionForSalad,broccoliForSalad );
        Chef chef = new Chef();
        Salad saladExpected;
        saladExpected = chef.makeSalad(tomatoForSalad, onionForSalad,broccoliForSalad);
        assertEquals(saladExpected, salad);
    }

    @Test
    public void makeSaladTomatoParadiseTest() {
        int tomatoWeight = 100;
        int onionWeight = 20;
        int pepperWeight = 10;
        Salad salad = new Salad();
        Vegetable tomatoForSalad = new Tomato(tomatoWeight);
        Vegetable onionForSalad = new Onion(onionWeight);
        Vegetable pepperForSalad = new Pepper(pepperWeight);
        salad.add(tomatoForSalad, onionForSalad, pepperForSalad);
        Chef chef = new Chef();
        Salad saladExpected;
        Fridge fridge = new Fridge();
        fridge.add(tomatoForSalad, onionForSalad, pepperForSalad);
        saladExpected = chef.makeSaladTomatoParadise(fridge);
     assertEquals(saladExpected, salad);
    }

    @Test
    public void makeSaladMixTest() {
        int tomatoWeight = 60;
        int broccoliWeight = 90;
        int cabbageWeight = 20;
        int onionWeight = 50;
        int pepperWeight = 50;
        int cucumberWeight = 50;
        Salad salad = new Salad();
        Vegetable tomatoForSalad = new Tomato(tomatoWeight);
        Vegetable onionForSalad = new Onion(onionWeight);
        Vegetable pepperForSalad = new Pepper(pepperWeight);
        Vegetable broccoliForSalad = new Broccoli(broccoliWeight);
        Vegetable cabbageForSalad = new Cabbage(cabbageWeight);
        Vegetable cucumberForSalad = new Cucumber(cucumberWeight);
        salad.add(tomatoForSalad, onionForSalad, pepperForSalad, broccoliForSalad ,cabbageForSalad
                ,cucumberForSalad);
        Chef chef = new Chef();
        Salad saladExpected;
        Fridge fridge = new Fridge();
        fridge.add(tomatoForSalad, onionForSalad, pepperForSalad, broccoliForSalad ,cabbageForSalad
                ,cucumberForSalad);
        saladExpected = chef.makeSaladMix(fridge);
        assertEquals(saladExpected, salad);
    }
}