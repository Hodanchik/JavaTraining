package by.epam.training.lesson4.task01;

public class ComparatorNumber {

    public static boolean compareThreeNumbersEquals(double a, double b, double c) {
        return a == b && a == c;
    }

    public static boolean compareThreeNumbersDifferent(double a, double b, double c) {
        return a != b && b != c && a != c;
    }

}
