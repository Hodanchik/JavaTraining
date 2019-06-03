package by.epam.javatraining.khadanovich.lesson6.additional.task06.model;

public class MaxDigitOfANumber {

    public static int calculateMaxDigitOfANumber(int numberToCheck) {

        int maxNumber = 0;
        int digit;
        while (numberToCheck > 0) {
            digit = numberToCheck % 10;
            if (digit > maxNumber) {
                maxNumber = digit;
                if (digit == 9)
                    return digit;
            }
            numberToCheck /= 10;
        }
        return maxNumber;
    }
}