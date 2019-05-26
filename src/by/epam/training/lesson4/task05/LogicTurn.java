package by.epam.training.lesson4.task05;

public class LogicTurn {
    public static int turnNumber(int number) {
        int n7 = number % 10 * 1000000;
        int n6 = number / 10 % 10 * 100000;
        int n5 = number / 100 % 10 * 10000;
        int n4 = number / 1000 % 10 * 1000;
        int n3 = number / 10000 % 10 * 100;
        int n2 = number / 100000 % 10 * 10;
        int n1 = number / 1000000 % 10;

        return n1 + n2 + n3 + n4 + n5 + n6 + n7;
    }
}
