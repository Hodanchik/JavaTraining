package by.epam.javatraining.khadanovich.lesson3.task02;

import by.epam.javatraining.khadanovich.util.Printer;

public class Runner {
    public static void main(String[] args) {
        int a = 2;
        Integer b = 5;

        //This code for demonstration of results
        Printer.print("Initial variable before calling the method: a = " + a + ", b = " + b);
        ChangeVariable.changeVariable(a, b);


    }
}
