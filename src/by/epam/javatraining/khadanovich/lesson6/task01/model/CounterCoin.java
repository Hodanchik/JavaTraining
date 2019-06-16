package by.epam.javatraining.khadanovich.lesson6.task01.model;

import java.util.Random;

public class CounterCoin {
    static Random random = new Random();

    public static int countCoinCountEagle(int time) {
        int countEagle = 0;
        for (int i = 1; i <= time; i++) {
            if (random.nextBoolean()) {
                countEagle++;
            }
        }
        return countEagle;
    }
}
