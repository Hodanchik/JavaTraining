package by.epam.training.lesson4.task01;

import by.epam.training.util.Printer;


public class Runner {
    public static void main(String[] args) {
        double a = 1, b = 4, c = 8;
        boolean result = ComparatorNumber.compareThreeNumber(a, b, c);

        //This code ONLY for demonstration of results
        String stringOfResult = (result == true) ? " are equals" : " are different";
        Printer.print("Numbers " + a + ", " + b + ", " + c + stringOfResult);
    }

}
