package by.epam.javatraining.khadanovich.lesson5.task03.model;

import java.util.Random;

public class MoodSensor {
    private static final Random RND = new Random();
    public static final int MOOD_COUNT = 6;

    public static final String BAD_MOOD = ":******(";
    public static final String CRY_MOOD = ":*(";
    public static final String CALM_MOOD = ":-|";
    public static final String HAPPY_MOOD = ":-)";
    public static final String LAUGH_MOOD = ":-D";
    public static final String PLAYFUL_MOOD = ":-P";

    public static String checkMood() {
        String mood = CALM_MOOD;
        switch (RND.nextInt(MOOD_COUNT)) {
            case 0:
                mood = BAD_MOOD;
                break;
            case 1:
                mood = CRY_MOOD;
                break;
            case 3:
                mood = HAPPY_MOOD;
                break;
            case 4:
                mood = LAUGH_MOOD;
                break;
            case 5:
                mood = PLAYFUL_MOOD;
                break;
        }
        return mood;
    }
}
