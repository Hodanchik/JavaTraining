package by.epam.javatraining.khadanovich.lesson6.additional.task01.controller;

import by.epam.javatraining.khadanovich.lesson6.additional.task01.model.EvenNumberCounter;

import by.epam.javatraining.khadanovich.lesson6.task03.view.Printer;

public class Runner {

    public static void main(String[] args) {

        Printer.print(EvenNumberCounter.countEvenNumbers(23456));
        Printer.print(EvenNumberCounter.countOddNumbers(12321));


    }
}
