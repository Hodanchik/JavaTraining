package by.epam.training.lesson4.task02;

public class Calculator {

    public static double CalculateSquare(double radius) {
        return Math.PI * radius * radius;
    }

    public static double CalculateRingSquare(double radiusOne, double radiusTwo) {

        return CalculateSquare(radiusOne) - CalculateSquare(radiusTwo);
    }

}
