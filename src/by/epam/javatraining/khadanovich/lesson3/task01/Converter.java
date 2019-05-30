package by.epam.javatraining.khadanovich.lesson3.task01;

public class Converter {

    public static double convertFromCelsToFarengeit(int cels) {
        return cels * 1.8 + 32;
    }

    public static double convertFromFarengeitToCels(int fareng) {
        return (fareng - 32) / 1.8;
    }

}
