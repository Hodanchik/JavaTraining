package by.epam.javatraining.khadanovich.lesson6.additional.task04.model;

public class PalindromChecker {

    public static boolean checkIsNumberPalindrom(int numberToCheck) {
        numberToCheck = numberToCheck > 0 ? numberToCheck : -numberToCheck;
        boolean result;
        int base = 0;
        int original = numberToCheck;

        if (numberToCheck < 10) {
            return true;
        }

        while (original > 0) {
            base *= 10;
            base += original % 10;
            original /= 10;
        }
        return base == numberToCheck;
    }
}


