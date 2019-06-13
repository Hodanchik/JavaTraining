package by.epam.javatraining.khadanovich.lesson6.additional.task02.model;

public class Calculator {

    public static int calculateSum(int number) {
        number = number > 0 ? number : -number;
        if (number < 10) {
            return number;
        } else
            return number % 10 + summatron(number / 10);
    }

    public static int calculateMult(int number) {
        number = number > 0 ? number : -number;
        if (number < 10) {
            return number;
        } else
            return number % 10 * multitron(number / 10);
    }

    private static int multitron(int number) {

        if (number < 10) {
            return number;
        } else
            return number % 10 * multitron(number / 10);
    }


    private static int summatron(int number) {

        if (number < 10) {
            return number;
        } else
            return number % 10 + summatron(number / 10);
    }
}