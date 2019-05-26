package by.epam.training.lesson4.task03;

import by.epam.training.util.Printer;

public class Runner {
    public static void main(String[] args) {
        int number = 6543;
        boolean result = Checker.checkNumber(number);

        //This code ONLY for demonstration of results
        String resultString = result ? " have " : " haven't ";
        Printer.print("This number " + number + resultString + "a sequence");
    }
}
