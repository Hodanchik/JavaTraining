package by.epam.javatraining.khadanovich.maintask2.model.logic;

import by.epam.javatraining.khadanovich.maintask2.model.entity.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaladAssistantTest {

    @Test
    public void calculateCaloriesOfSaladTest() {
        Salad salad = new Salad();
        int weight = 100;
        Vegetable tomatoForSalad = new Tomato(weight);
        Vegetable onionForSalad = new Onion(weight);
        Vegetable broccoliForSalad = new Broccoli(weight);
        salad.add(tomatoForSalad, onionForSalad, broccoliForSalad);
        int countCalories = (tomatoForSalad.getCalories() + onionForSalad.getCalories()
                + broccoliForSalad.getCalories()) * weight / 100;
        SaladAssistant assistant = new SaladAssistant();
        assistant.calculateCaloriesOfSalad(salad);
        int delta = 1; // error due to rounding and type conversions
        assertEquals(countCalories, assistant.calculateCaloriesOfSalad(salad), 1);
    }

    @Test
    public void calculateWeightOfSaladTest() {
        Salad salad = new Salad();
        int weight = 100;
        Vegetable tomatoForSalad = new Tomato(weight);
        Vegetable onionForSalad = new Onion(weight);
        Vegetable broccoliForSalad = new Broccoli(weight);
        salad.add(tomatoForSalad, onionForSalad, broccoliForSalad);
        int sumWeight = weight * 3;
        SaladAssistant assistant = new SaladAssistant();
        assertEquals(sumWeight, assistant.calculateWeightOfSalad(salad), 0);
    }

    @Test
    public void sortVegetableByWeightTest() {
        int tomatoWeight = 10;
        int onionWeight = 20;
        int pepperWeight = 100;
        Salad sortedSalad = new Salad();
        Vegetable tomatoForSalad = new Tomato(tomatoWeight);
        Vegetable onionForSalad = new Onion(onionWeight);
        Vegetable pepperForSalad = new Pepper(pepperWeight);
        sortedSalad.add(tomatoForSalad, onionForSalad, pepperForSalad);
        Salad saladTwo = new Salad();
        saladTwo.add(pepperForSalad, onionForSalad, tomatoForSalad);
        SaladAssistant assistant = new SaladAssistant();
        assistant.sortVegetableByWeight(saladTwo);
        assertEquals(sortedSalad, saladTwo);
    }

    @Test
    public void findByParametrCaloriesTest() {
        int tomatoWeight = 10;
        int onionWeight = 20;
        int pepperWeight = 100;
        Salad salad = new Salad();
        salad.add(new Tomato(tomatoWeight), new Onion(onionWeight), new Pepper(pepperWeight));
        Salad expectedSalad = new Salad();
        int minCalories = 20, maxCalories = 30;
        expectedSalad.add(new Tomato(tomatoWeight), new Pepper(pepperWeight));
        SaladAssistant assistant = new SaladAssistant();
        assertEquals(expectedSalad, assistant.findByParametrCalories(salad, minCalories, maxCalories));
    }

    @Test
    public void findVegetableByParametrQuantityProteinTest() {
        int tomatoWeight = 10;
        int onionWeight = 20;
        int pepperWeight = 100;
        Salad salad = new Salad();
        salad.add(new Tomato(tomatoWeight), new Onion(onionWeight), new Pepper(pepperWeight));
        Salad expectedSalad = new Salad();
        int minProtein = 2, maxProtein = 7;
        expectedSalad.add(new Tomato(tomatoWeight), new Onion(onionWeight));
        SaladAssistant assistant = new SaladAssistant();
        assertEquals(expectedSalad, assistant.findVegetableByParametrQuantityProtein(salad, minProtein, maxProtein));
    }

    @Test
    public void findTheHighVitCVegetableTest() {
        int tomatoWeight = 10;
        int onionWeight = 20;
        int pepperWeight = 100;
        Salad salad = new Salad();
        salad.add(new Tomato(tomatoWeight), new Onion(onionWeight), new Pepper(pepperWeight));
        Vegetable expectedVeg = new Pepper(pepperWeight);
        SaladAssistant assistant = new SaladAssistant();
        assertEquals(expectedVeg, assistant.findTheHighVitCVegetable(salad));
    }

    @Test
    public void findTheLowestVitCVegetableTest() {
    }

    @Test
    public void findTheHighCalorieVegetableTest() {
    }

    @Test
    public void findTheLowestCalorieVegetableTest() {
    }
}