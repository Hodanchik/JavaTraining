package by.epam.javatraining.khadanovich.lesson5.task01.model;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MyScan {
    private static Scanner scan = new Scanner(System.in);

   public static double scanAge() {

        System.out.println("Please, enter age of dragon");
        if (scan.hasNextDouble()) {
            double age = scan.nextDouble();
            if (age >= 0) {
                return age;
            }
        } else {
            System.out.println("Enter correct age at the next time");
            return -1;
        }
        return -1;
    }

}
