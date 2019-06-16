package by.epam.javatraining.khadanovich.lesson6.additional.task06.model;

public class MaxDigitOfANumber {

    public static int calculateMaxDigitOfANumber(int numberToCheck) {
        numberToCheck = numberToCheck > 0 ? numberToCheck : -numberToCheck;
        int maxNumber = 0;
        int maxDigit = 9;
        int digit;
        while (numberToCheck > 0) {
            digit = numberToCheck % 10;
            if (digit > maxNumber) {
                maxNumber = digit;
                if (digit == maxDigit) {
                    return digit;
                }
            }
            numberToCheck /= 10;
        }
        return maxNumber;
    }
}