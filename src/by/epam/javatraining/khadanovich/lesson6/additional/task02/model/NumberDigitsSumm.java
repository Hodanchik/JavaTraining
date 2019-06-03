package by.epam.javatraining.khadanovich.lesson6.additional.task02.model;

public class NumberDigitsSumm {

    public static int calculateSum(int number) {

        if (number < 10) {
            return number;
        } else
            return number % 10 + summatron(number / 10);
    }

    public static int summatron(int number) {

        if (number < 10) {
            return number;
        } else
            return number % 10 + summatron(number / 10);
    }
}