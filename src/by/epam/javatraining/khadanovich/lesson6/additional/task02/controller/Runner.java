package by.epam.javatraining.khadanovich.lesson6.additional.task02.controller;

import by.epam.javatraining.khadanovich.lesson6.additional.task02.model.Calculator;
import by.epam.javatraining.khadanovich.lesson6.task03.view.Printer;

public class Runner {

    public static void main(String[] args) {

        Printer.print(Calculator.calculateSum(23456));

    }
}
