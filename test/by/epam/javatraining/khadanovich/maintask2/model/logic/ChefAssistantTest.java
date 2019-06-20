package by.epam.javatraining.khadanovich.maintask2.model.logic;

import by.epam.javatraining.khadanovich.maintask2.model.entity.Fridge;
import by.epam.javatraining.khadanovich.maintask2.model.entity.Tomato;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChefAssistantTest {

    @Test
    public void findIngredientTest() {
        Fridge frige = new Fridge();
        int weight = 30;
        frige.add(new Tomato(weight));
        assertTrue(ChefAssistant.findIngredient(frige, new Tomato(weight)));
    }
}