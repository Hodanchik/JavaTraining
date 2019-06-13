package by.epam.javatraining.khadanovich.lesson6.task04.model;

public class NumberChecker {

    public static boolean checkEven(int number) {
        boolean result = false;
       //remove?  number = number > 0 ? number : -number;
        while (number / 10 != 0) {
            int rightNum = number % 10;
            number /= 10;
            int leftNum = number % 10;

            result = (rightNum % 2 == leftNum % 2) || (rightNum % 2 > 0 && leftNum % 2 > 0);
            if (result) {
                continue;
            }
            return result;
        }
        return result;
    }
}

