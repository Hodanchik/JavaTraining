package by.epam.javatraining.khadanovich.lesson6.task05.model;

public class PrimeNumber {

    public static boolean isNumberPrime(int number) {
        boolean result = false;
        if (number > 3) {
            int halfSize = number / 2;
            for (int i = 2; i <= halfSize; i++) {
                if (number % i == 0)
                    return result;
            }
            result = true;
        } else if ((number == 2 || number == 3)) {
            result = true;
            //negative number, 0, 1 is not prime number
        } else {
            result = false;
        }
        return result;
    }
}

