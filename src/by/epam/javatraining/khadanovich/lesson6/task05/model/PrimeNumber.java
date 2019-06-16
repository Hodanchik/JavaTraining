package by.epam.javatraining.khadanovich.lesson6.task05.model;

public class PrimeNumber {

    public static boolean isNumberPrime(int number) {
        //negative number, 0, 1 is not prime number
        if (number <= 1) {
            return false;
        }
        int halfSize = number / 2;
        for (int i = 2; i <= halfSize; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

