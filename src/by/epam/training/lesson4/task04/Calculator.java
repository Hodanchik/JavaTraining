package by.epam.training.lesson4.task04;

public class Calculator {


    public static double calculateArithmeticMean(int number) {
        // count of digits in the number
        double count = 6;

        int n6 = number % 10;//it's the sixth digit of a number
        number /= 10;

        int n5 = number % 10;//it's the fifth digit of a number
        number /= 10;

        int n4 = number % 10; //it's the fourth digit of a number
        number /= 10;

        int n3 = number % 10;//it's the third digit of a number
        number /= 10;

        int n2 = number % 10;//it's the second digit of a number
        number /= 10;

        int n1 = number % 10;//it's the first digit of a number

        return (n1 + n2 + n3 + n4 + n5 + n6) / count;
    }

    public static double calculateGeometricMean(int number) {
        // count of digits in the number
        double count = 6;

        int n6 = number % 10;//it's the sixth digit of a number
        number /= 10;

        int n5 = number % 10;//it's the fifth digit of a number
        number /= 10;

        int n4 = number % 10; //it's the fourth digit of a number
        number /= 10;

        int n3 = number % 10;//it's the third digit of a number
        number /= 10;

        int n2 = number % 10;//it's the second digit of a number
        number /= 10;

        int n1 = number % 10;//it's the first digit of a number

        return Math.pow((n1 * n2 * n3 * n4 * n5 * n6), 1.0 / count);
    }
}
