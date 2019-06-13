package by.epam.javatraining.khadanovich.lesson6.additional.task04.controller;

import by.epam.javatraining.khadanovich.lesson6.additional.task04.model.PalindromChecker;
import by.epam.javatraining.khadanovich.lesson6.task03.view.Printer;

public class Runner {

    public static void main(String[] args) {

        Printer.print(PalindromChecker.checkIsNumberPalindrom(135170));
        Printer.print(PalindromChecker.checkIsNumberPalindrom(1351531));


    }
}
