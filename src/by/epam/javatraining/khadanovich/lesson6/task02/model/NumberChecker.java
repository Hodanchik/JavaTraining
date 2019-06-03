package by.epam.javatraining.khadanovich.lesson6.task02.model;

public class NumberChecker {

    public static boolean checkIncreasingNumber(int item) {
        boolean result = false;
        item = item > 0 ? item : -item;
        while (item / 10 != 0) {
            int rightNum = item % 10;
            item /= 10;
            int leftNum = item % 10;
            result = rightNum > leftNum;
            if (result) {
                continue;
            }
            return result;
        }
        return result;
    }


    public static boolean checkDecreasingNumber(int item) {
        boolean result = false;
        item = item > 0 ? item : -item;
        while (item / 10 != 0) {
            int rightNum = item % 10;
            item /= 10;
            int leftNum = item % 10;

            result = rightNum < leftNum;
            if (result) {
                continue;
            }
            return result;
        }
        return result;
    }
}
