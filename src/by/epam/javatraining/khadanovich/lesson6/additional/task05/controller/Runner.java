package by.epam.javatraining.khadanovich.lesson6.additional.task05.controller;

import by.epam.javatraining.khadanovich.lesson6.task03.view.Printer;
import by.epam.javatraining.khadanovich.lesson6.additional.task05.model.NumberOfDifferentDigits;

public class Runner {

    public static void main(String[] args) {

        Printer.print(NumberOfDifferentDigits.checkIfNumberIsOfDifferentDigits(135170));
        Printer.print(NumberOfDifferentDigits.checkIfNumberIsOfDifferentDigits(13570));


    }
}
