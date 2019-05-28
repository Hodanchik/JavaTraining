package by.epam.training.lesson4.task05;

public class LogicTurn {
    public static int turnNumber(int number) {
        int exponent = 1000000; //exponent for changing the position of a number

        int n7 = number % 10 * exponent;// the seventh digit of a number
        number /= 10;
        exponent /= 10;

        int n6 = number % 10 * exponent;// the sixth digit of a number
        number /= 10;
        exponent /= 10;

        int n5 = number % 10 * exponent;// the fifth digit of a number
        number /= 10;
        exponent /= 10;

        int n4 = number % 10 * exponent; // the fourth digit of a number
        number /= 10;
        exponent /= 10;

        int n3 = number % 10 * exponent;// the third digit of a number
        number /= 10;
        exponent /= 10;

        int n2 = number % 10 * exponent;// the second digit of a number
        number /= 10;
        exponent /= 10;

        int n1 = number % 10 * exponent;// the first digit of a number

        return n1 + n2 + n3 + n4 + n5 + n6 + n7;
    }
}
