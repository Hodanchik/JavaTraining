package by.epam.javatraining.khadanovich.lesson4.additional;

public class Converter {

    private static final double METR_PARAM = 0.01;
    private static final double KILOMETR_PARAM = 0.00001;

    public static double convertSantimetrToMetr(double s) {
        return s * METR_PARAM;

    }

    public static double convertSantimetrToKilometr(double s) {
        return s * KILOMETR_PARAM;

    }

    public static double sizeFileConvertKilobytes(int size) {
        return size / 1024.00;

    }

    public static double sizeFileConvertMegabytes(int size) {
        return sizeFileConvertKilobytes(size) / 1024;
    }


    public static int hoursOfDay(int hours, int minutes, int seconds) {
        return hours;
    }

    public static int minutesOfDay(int hours, int minutes, int seconds) {
        return hours * 60 + minutes;

    }

    public static int secondsOfDay(int hours, int minutes, int seconds) {
        return hours * 3600 + minutes * 60 + seconds;
    }

}