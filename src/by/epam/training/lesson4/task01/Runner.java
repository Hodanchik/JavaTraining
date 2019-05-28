package by.epam.training.lesson4.task01;

import by.epam.training.util.Printer;


public class Runner {
    public static void main(String[] args) {
        double a = 1, b = 4, c = 8;
        boolean resultEquals = ComparatorNumber.compareThreeNumbersEquals(a, b, c);
        boolean resultDifferent = ComparatorNumber.compareThreeNumbersDifferent(a, b, c);
        //This code ONLY for demonstration of results
        String stringOfResult = resultEquals ? " are equals" : " are different";
        String stringOfResultTwo = resultDifferent ? " are different" : " are equals";
        Printer.print("Numbers " + a + ", " + b + ", " + c + stringOfResult);
        Printer.print("Numbers " + a + ", " + b + ", " + c + stringOfResultTwo);
    }

}
