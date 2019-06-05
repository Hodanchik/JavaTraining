package by.epam.javatraining.khadanovich.lesson5.task02.model;

import java.util.Scanner;

public class MyScan {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static char scanChar() {
        System.out.println("Please, enter one symbol");
        return SCANNER.next().charAt(0);
    }
}