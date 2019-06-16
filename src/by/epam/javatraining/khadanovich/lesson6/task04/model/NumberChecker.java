package by.epam.javatraining.khadanovich.lesson6.task04.model;

public class NumberChecker {

    public static boolean checkEven(int number) {
        if (number < 10) {
            return false;
        }
        while (number / 10 != 0) {

            int rightNum = number % 10;
            int leftNum = (number / 10) % 10;

            if (rightNum % 2 == leftNum % 2 || rightNum % 2 > 0 && leftNum % 2 > 0) {
                number /= 10;
            } else {
                return false;
            }
        }
        return true;
    }
}

