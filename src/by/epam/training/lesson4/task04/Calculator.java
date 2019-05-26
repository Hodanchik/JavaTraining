package by.epam.training.lesson4.task04;

public class Calculator {


    public static double calculateArithmeticMean(int number) {
        int n6 = number % 10;
        int n5 = number / 10 % 10;
        int n4 = number / 100 % 10;
        int n3 = number / 1000 % 10;
        int n2 = number / 10000 % 10;
        int n1 = number / 100000 % 10;

        return (n1 + n2 + n3 + n4 + n5 + n6) / 6.0;
    }

    public static double calculateGeometricMean(int number) {
        int n6 = number % 10;
        int n5 = number / 10 % 10;
        int n4 = number / 100 % 10;
        int n3 = number / 1000 % 10;
        int n2 = number / 10000 % 10;
        int n1 = number / 100000 % 10;

        return Math.pow((n1 * n2 * n3 * n4 * n5 * n6), 1.0 / 6);
    }
}
