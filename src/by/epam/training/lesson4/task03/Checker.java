package by.epam.training.lesson4.task03;

public class Checker {


    public static boolean checkNumber(int number) {
        int n4 = number % 10;
        int n3 = number / 10 % 10;
        int n2 = number / 100 % 10;
        int n1 = number / 1000 % 10;

        return (n1 > n2 && n2 > n3 && n3 > n4) || (n1 < n2 && n2 < n3 && n3 < n4);
    }
}
