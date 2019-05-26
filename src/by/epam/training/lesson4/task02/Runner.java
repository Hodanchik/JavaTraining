package by.epam.training.lesson4.task02;

import by.epam.training.util.Printer;

public class Runner {
    public static void main(String[] args) {

        double r1 = 23.8, r2 = 12.2;
        double square1 = Calculator.CalculateSquare(r1);
        double square2 = Calculator.CalculateSquare(r2);
        double square3 = Calculator.CalculateRingSquare(square1, square2);

        //This code ONLY for demonstration of results
        Printer.print("Ring square result: " + square3);
    }
}