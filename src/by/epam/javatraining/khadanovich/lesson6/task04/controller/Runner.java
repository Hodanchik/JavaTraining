package by.epam.javatraining.khadanovich.lesson6.task04.controller;
import by.epam.javatraining.khadanovich.lesson6.task03.view.Printer;
import by.epam.javatraining.khadanovich.lesson6.task04.model.NumberChecker;

public class Runner {

    public static void main(String[] args) {

        Printer.print(NumberChecker.checkEven(13570));
        Printer.print(NumberChecker.checkEven(13573));
        Printer.print(NumberChecker.checkEven(13572));
        Printer.print(NumberChecker.checkEven(13578));
        Printer.print(NumberChecker.checkEven(23573));
        Printer.print(NumberChecker.checkEven(848484));


    }
}
