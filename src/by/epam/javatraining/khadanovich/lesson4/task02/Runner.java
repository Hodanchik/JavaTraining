package by.epam.javatraining.khadanovich.lesson4.task02;

import by.epam.javatraining.khadanovich.lesson5.task03.view.Printer;

public class Runner {
    public static void main(String[] args) {

        double r1 = 23.8, r2 = 12.2;
        double ringSquare = Calculator.CalculateRingSquare(r1, r2);

        //This code ONLY for demonstration of results
        Printer.print("Ring square result: " + ringSquare);
    }
}