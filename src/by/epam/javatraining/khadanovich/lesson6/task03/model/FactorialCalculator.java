package by.epam.javatraining.khadanovich.lesson6.task03.model;

public class FactorialCalculator {

    public static int factorialCalculator(int number) {

        int result = 1;
        if (number == 0 || number == 1) {
            return result;
        }

        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
