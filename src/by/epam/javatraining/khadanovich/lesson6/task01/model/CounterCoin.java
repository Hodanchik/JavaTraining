package by.epam.javatraining.khadanovich.lesson6.task01.model;

import java.util.Random;

public class CounterCoin {


    public static int throwCoin() {
        Random random = new Random();
        return random.nextInt(2);
    }

    public static int countCoinCountEagle(int time) {
        int countEagle = 0;
        for (int i = 1; i <= time; i++) {
            if (throwCoin() == 0) {
                countEagle++;
            }
        }
        return countEagle;
    }
}
