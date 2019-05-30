package by.epam.javatraining.khadanovich.lesson3.task02;

import by.epam.javatraining.khadanovich.util.Printer;

public class ChangeVariable {
    public static void changeVariable(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
       Printer.print("Numbers after calling changeVariable: a = " + a + ", b = " + b);
    }
}
