package by.epam.javatraining.khadanovich.lesson6.additional.task04.controller;

import by.epam.javatraining.khadanovich.lesson6.additional.task04.model.IsNumberPalindrom;
import by.epam.javatraining.khadanovich.lesson6.task03.view.Printer;

public class Runner {

    public static void main(String[] args) {

        Printer.print(IsNumberPalindrom.checkIfNumberPalindrom(135170));
        Printer.print(IsNumberPalindrom.checkIfNumberPalindrom(1351531));


    }
}
