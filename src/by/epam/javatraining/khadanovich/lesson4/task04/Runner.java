package by.epam.javatraining.khadanovich.lesson4.task04;

import by.epam.javatraining.khadanovich.util.Printer;

public class Runner {
    public static void main(String[] args) {
        int number = 442231;
        double arithmMean = Calculator.calculateArithmeticMean(number);
        double geometrMean = Calculator.calculateGeometricMean(number);

        //This code ONLY for demonstration of results

        Printer.print("Arithmetic Mean " + number + " = " + arithmMean);
        Printer.print("Geometric Mean " + number + " = " + geometrMean);
    }
}
