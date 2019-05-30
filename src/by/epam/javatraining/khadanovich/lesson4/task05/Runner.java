package by.epam.javatraining.khadanovich.lesson4.task05;

import by.epam.javatraining.khadanovich.util.Printer;

public class Runner {
    public static void main(String[] args) {
        int number = 9876543;
        int turnNumber = LogicTurn.turnNumber(number);

        //This code ONLY for demonstration of result
        Printer.print("Number: " + number + "\nTurn number: " + turnNumber);
    }
}
