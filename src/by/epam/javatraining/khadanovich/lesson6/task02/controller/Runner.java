package by.epam.javatraining.khadanovich.lesson6.task02.controller;


import by.epam.javatraining.khadanovich.lesson6.task02.model.NumberChecker;

public class Runner {

    public static void main(String[] args) {

        System.out.println(NumberChecker.checkDecreasingNumber(234));
        System.out.println(NumberChecker.checkDecreasingNumber(8765));
        System.out.println(NumberChecker.checkDecreasingNumber(98));
        System.out.println(NumberChecker.checkDecreasingNumber(5));

    }
}
