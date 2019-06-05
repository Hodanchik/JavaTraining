package by.epam.javatraining.khadanovich.lesson5.task01.model;

import java.util.Scanner;

public class MyScan {

    private final static Scanner SCANNER = new Scanner(System.in);

    public static double scanAge() {

        System.out.println("Please, enter age of dragon");
        if (SCANNER.hasNextDouble()) {
            double age = SCANNER.nextDouble();
            if (age >= 0) {
                return age;
            }
        } else {
            System.out.println("Enter correct age at the next time");
        }
        return -1;
    }
}