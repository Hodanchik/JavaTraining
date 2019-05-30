package by.epam.javatraining.khadanovich.lesson5.task03.model;

import java.util.Random;

public class MoodSensor {


    public static int createRandomInt() {
        int min = 0; //range for random
        int max = 5; //range for random
        int diff = max - min; //range random
        Random random = new Random();
        return random.nextInt(diff + 1);
    }

    public static String checkMood() {
        String mood = "Some exception";
        String badMood = ":******(";
        String cryMood = ":*(";
        String calmMood = ":-|";
        String happyMood = ":-)";
        String laughMood = ":-D";
        String playfulMood = ":-P";
        int randomInt = createRandomInt();
        switch (randomInt) {
            case 0:
                mood = badMood;
                break;
            case 1:
                mood = cryMood;
                break;
            case 2:
                mood = calmMood;
                break;
            case 3:
                mood = happyMood;
                break;
            case 4:
                mood = laughMood;
                break;
            case 5:
                mood = playfulMood;
                break;
        }
        return mood;
    }
}
