package by.epam.javatraining.khadanovich.lesson6.additional.task07.controller;

import by.epam.javatraining.khadanovich.lesson6.task03.view.Printer;
import by.epam.javatraining.khadanovich.lesson6.additional.task07.model.PerfectNumber;

public class Runner {

    public static void main(String[] args) {
        Printer.print(PerfectNumber.isNumberPerfect(496));
        Printer.print(PerfectNumber.isNumberPerfect(497));
    }
}
