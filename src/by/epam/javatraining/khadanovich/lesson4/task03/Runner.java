package by.epam.javatraining.khadanovich.lesson4.task03;

import by.epam.javatraining.khadanovich.util.Printer;

public class Runner {
    public static void main(String[] args) {
        int number = 2345;
        boolean resultIncreasing = Checker.checkIncreasingNumber(number);
        boolean resultDecreasing = Checker.checkDecreasingNumber(number);

        //This code ONLY for demonstration of results
        String resultIncrString = resultIncreasing ? " have " : " haven't ";
        Printer.print("This number " + number + resultIncrString + "an increasing sequence");
        String resultDecString = resultDecreasing ? " have " : " haven't ";
        Printer.print("This number " + number + resultDecString + "a descreasing sequence");
    }
}
