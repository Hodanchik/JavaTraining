package by.epam.javatraining.khadanovich.lesson6.task01.model;

import java.util.Random;

public class CounterCoin {


    private static boolean throwCoin() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public static int countCoinCountEagle(int time) {
        int countEagle = 0;
        for (int i = 1; i <= time; i++) {
            if (throwCoin() == true) {
                countEagle++;
            }
        }
        return countEagle;
    }
}
