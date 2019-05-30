package by.epam.javatraining.khadanovich.lesson3.task03;

public class Converter {
    private static final int MILLIGRAM_PARAM = 1000000;
    private static final int GRAM_PARAM = 1000;
    private static final double TON_PARAM = 0.001;

    public static long convertToMilligram(int weight) {

        return weight * MILLIGRAM_PARAM;
    }

    public static long convertToGram(int weight) {

        return weight * GRAM_PARAM;
    }

    public static double convertToTon(int weight) {

        return weight * TON_PARAM;
    }

}
