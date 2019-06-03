package by.epam.javatraining.khadanovich.lesson6.task03.model;

public class FactorialCalculator {

    public static int factorialCalculator(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i < number; i++) {
            result *= i;
        }
        return result;
    }
}
