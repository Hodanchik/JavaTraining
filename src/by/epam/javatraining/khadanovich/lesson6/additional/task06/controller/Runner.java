package by.epam.javatraining.khadanovich.lesson6.additional.task06.controller;

import by.epam.javatraining.khadanovich.lesson6.task03.view.Printer;
import by.epam.javatraining.khadanovich.lesson6.additional.task06.model.MaxDigitOfANumber;

public class Runner {

    public static void main(String[] args) {

        Printer.print(MaxDigitOfANumber.calculateMaxDigitOfANumber(13570));
        Printer.print(MaxDigitOfANumber.calculateMaxDigitOfANumber(13970));
    }
}
