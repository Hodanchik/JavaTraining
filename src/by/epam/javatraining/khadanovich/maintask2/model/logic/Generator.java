package by.epam.javatraining.khadanovich.maintask2.model.logic;

import by.epam.javatraining.khadanovich.maintask2.model.entity.*;

import java.util.Random;

/**
 * Generator class
 *
 * @author Tatsiana Khadanovich
 * @version 1.0
 * @createdate 18/06/19
 */

public class Generator {
    private static final Random RANDOM = new Random();

    public static Vegetable generateBroccoli() {
        int minWeight = 100;
        int maxWeight = 400;
        int currentWeight = RANDOM.nextInt(maxWeight - minWeight + 1) + minWeight;
        return new Broccoli(currentWeight);
    }

    public static Vegetable generateCabbage() {
        int minWeight = 100;
        int maxWeight = 500;
        int currentWeight = RANDOM.nextInt(maxWeight - minWeight + 1) + minWeight;
        return new Cabbage(currentWeight);
    }

    public static Vegetable generateCucumber() {
        int minWeight = 80;
        int maxWeight = 150;
        int currentWeight = RANDOM.nextInt(maxWeight - minWeight + 1) + minWeight;
        return new Cucumber(currentWeight);
    }

    public static Vegetable generateOnion() {
        int minWeight = 20;
        int maxWeight = 100;
        int currentWeight = RANDOM.nextInt(maxWeight - minWeight + 1) + minWeight;
        return new Onion(currentWeight);
    }

    public static Vegetable generatePepper() {
        int minWeight = 90;
        int maxWeight = 250;
        int currentWeight = RANDOM.nextInt(maxWeight - minWeight + 1) + minWeight;
        return new Pepper(currentWeight);
    }

    public static Vegetable generateTomato() {
        int minWeight = 70;
        int maxWeight = 150;
        int currentWeight = RANDOM.nextInt(maxWeight - minWeight + 1) + minWeight;
        return new Tomato(currentWeight);
    }

}
