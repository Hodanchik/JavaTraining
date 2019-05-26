package by.epam.training.lesson4.additional;

public class Checker {

    public static boolean checkEqualsMinTwo(double a, double b, double c) {
        return Math.abs(a) == Math.abs(b) || Math.abs(b) == Math.abs(c) || Math.abs(a) == Math.abs(c);
    }

    public static boolean checkPositive(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0;
    }

    public static boolean checkNegative(double a, double b, double c) {
        return a < 0 && b < 0 && c < 0;
    }

    public static boolean checkPositiveMinOne(double a, double b, double c) {
        return a > 0 || b > 0 || c > 0;
    }

    public static boolean checkNegativeMinOne(double a, double b, double c) {
        return a < 0 || b < 0 || c < 0;
    }

    public static boolean checkOnePositive(double a, double b, double c) {
        return (a > 0 && b <= 0 && c <= 0) || (a <= 0 && b > 0 && c <= 0) || (a <= 0 && b <= 0 && c > 0);
    }

    public static boolean checkOneNegative(double a, double b, double c) {
        return (a < 0 && b >= 0 && c >= 0) || (a >= 0 && b < 0 && c >= 0) || (a >= 0 && b >= 0 && c < 0);
    }

    public static boolean checkTwoPositive(double a, double b, double c) {
        return (a > 0 && b > 0 && c <= 0) || (a <= 0 && b > 0 && c > 0) || (a > 0 && b <= 0 && c > 0);
    }

    public static boolean checkTwoNegative(double a, double b, double c) {
        return (a < 0 && b < 0 && c >= 0) || (a >= 0 && b < 0 && c < 0) || (a < 0 && b >= 0 && c < 0);
    }


    public static boolean checkEven(double a, double b, double c) {
        return a % 10 == 0 && b % 10 == 0 && c % 10 == 0;
    }

    public static boolean checkUnevent(double a, double b, double c) {
        return a % 10 != 0 && b % 10 != 0 && c % 10 != 0;
    }

    public static boolean checkEvenMinOne(double a, double b, double c) {
        return a % 10 == 0 || b % 10 == 0 || c % 10 == 0;
    }

    public static boolean checkUnevenMinOne(double a, double b, double c) {
        return a % 10 != 0 || b % 10 != 0 || c % 10 != 0;
    }

    public static boolean checkOneEven(double a, double b, double c) {
        return (a % 10 == 0 && b % 10 != 0 && c % 10 != 0) || (a % 10 != 0 && b % 10 == 0 && c % 10 != 0) || (a % 10 != 0 && b % 10 != 0 && c % 10 == 0);
    }

    public static boolean checkOneUneven(double a, double b, double c) {
        return (a % 10 != 0 && b % 10 == 0 && c % 10 == 0) || (a % 10 == 0 && b % 10 != 0 && c % 10 == 0) || (a % 10 == 0 && b % 10 == 0 && c % 10 != 0);
    }

    public static boolean checkEqualsEven(double a, double b, double c) {
        return (a % 10 == 0 && b % 10 == 0 && c % 10 == 0) || (a % 10 != 0 && b % 10 != 0 && c % 10 != 0);
    }

    public static boolean checkTwoEven(double a, double b, double c) {
        return (a % 10 == 0 && b % 10 == 0 && c % 10 != 0) || (a % 10 != 0 && b % 10 == 0 && c % 10 == 0) || (a % 10 == 0 && b % 10 != 0 && c % 10 == 0);
    }

    public static boolean checkTwoUneven(double a, double b, double c) {
        return (a % 10 != 0 && b % 10 != 0 && c % 10 == 0) || (a % 10 == 0 && b % 10 != 0 && c % 10 != 0) || (a % 10 != 0 && b % 10 == 0 && c % 10 != 0);
    }


    public static boolean checkEquals(int number) {
        int n4 = number % 10 * 1000;
        int n3 = number / 10 % 10 * 100;
        int n2 = number / 100 % 10 * 10;
        int n1 = number / 1000 % 10;
        int newNumber = n1 + n2 + n3 + n4;
        return number == newNumber;
    }

    public static boolean checkFirstCoordinateQuarter(double x, double y) {
        return (x > 0 && y > 0);
    }

    public static boolean checkSecondCoordinateQuarter(double x, double y) {
        return x < 0 && y > 0;
    }

    public static boolean checkThirdCoordinateQuarter(double x, double y) {
        return x < 0 && y < 0;
    }

    public static boolean checkFourthCoordinateQuarter(double x, double y) {
        return x > 0 && y < 0;
    }

    public static boolean checkIsSideOfTriangle(double a, double b, double c) {
        return (a + b) < c && (a + c) < b && (b + c) < a;
    }

    public static boolean checkIsEquilateralTriangle(double a, double b, double c) {
        return (a == b) && (a == c);
    }

    public static boolean checkIsIsoscelesTriangle(double a, double b, double c) {
        return ((a == b) && (a != c)) || ((b == c) && (a != c)) || (a == c) && (b != c);
    }
    public static boolean checkIsRectangularTriangle(double a, double b, double c) {
        return (a*a == b*b + c*c)|| (b*b == a*a + c*c)||(c*c == a*a + b*b);
    }
    public static boolean checkIsRectangularEquilateralTriangle(double a, double b, double c) {
        return ((a*a == b*b + c*c)&&(b==c)) ||((b*b == a*a + c*c) && (a==c))||((c*c == a*a + b*b)&&(a==b));
    }

}
