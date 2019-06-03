package by.epam.javatraining.khadanovich.lesson6.task05.controller;

import by.epam.javatraining.khadanovich.lesson6.task03.view.Printer;

import by.epam.javatraining.khadanovich.lesson6.task05.model.PrimeNumber;

public class Runner {

    public static void main(String[] args) {

        Printer.print(PrimeNumber.isNumberPrime(1));
        Printer.print(PrimeNumber.isNumberPrime(2));


    }
}
