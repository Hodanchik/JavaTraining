package by.epam.javatraining.khadanovich.lesson6.task02.model;

public class NumberChecker {

    public static boolean checkIncreasingNumber(int item) {

        if (item < 10) {
            return false;
        }

        while (item / 10 != 0) {

            int rightNum = item % 10;
            int leftNum = (item / 10) % 10;

            if (leftNum < rightNum) {
                item /= 10;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean checkDecreasingNumber(int item) {
        if (item < 10) {
            return false;
        }

        while (item / 10 != 0) {

            int rightNum = item % 10;
            int leftNum = (item / 10) % 10;

            if (leftNum > rightNum) {
                item /= 10;
            } else {
                return false;
            }
        }
        return true;
    }
}