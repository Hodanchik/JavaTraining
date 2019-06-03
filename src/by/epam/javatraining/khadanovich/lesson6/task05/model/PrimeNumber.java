package by.epam.javatraining.khadanovich.lesson6.task05.model;

public class PrimeNumber {

    public static boolean isNumberPrime(int number) {

        if (number == 0 || number == 1)
            return false;
        if (number == 3 || number == 2)
            return true;

        int halfSize = number / 2;

        for (int i = 2; i <= halfSize; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}

