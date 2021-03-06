package by.epam.javatraining.khadanovich.lesson4.task03;

public class Checker {


    public static boolean checkIncreasingNumber(int number) {

        int n4 = number % 10; //it's the fourth digit of a number
        number /= 10;

        int n3 = number % 10;//it's the third digit of a number
        number /= 10;

        int n2 = number % 10;//it's the second digit of a number
        number /= 10;

        int n1 = number % 10;//it's the first digit of a number


        return n1 < n2 && n2 < n3 && n3 < n4;
    }

    public static boolean checkDecreasingNumber(int number) {

        int n4 = number % 10; //it's the fourth digit of a number
        number /= 10;

        int n3 = number % 10;//it's the third digit of a number
        number /= 10;

        int n2 = number % 10;//it's the second digit of a number
        number /= 10;

        int n1 = number % 10;//it's the first digit of a number


        return n1 > n2 && n2 > n3 && n3 > n4;
    }
}
