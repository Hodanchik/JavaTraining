package by.epam.javatraining.khadanovich.lesson6.additional.task04.model;

public class IsNumberPalindrom {

    public static boolean checkIfNumberPalindrom(int numberToCheck) {

        if (numberToCheck < 10)
            return true;

        int base = 0;
        int original = numberToCheck;

        while (original > 0) {
            base *= 10;
            base += original % 10;
            original /= 10;
        }
        return base == numberToCheck;
    }
}

