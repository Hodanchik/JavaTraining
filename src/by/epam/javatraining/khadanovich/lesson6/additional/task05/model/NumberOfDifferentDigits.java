package by.epam.javatraining.khadanovich.lesson6.additional.task05.model;

public class NumberOfDifferentDigits {

    public static boolean checkIfNumberIsOfDifferentDigits(int numberToCheck) {

        String stringNumberToCheck = Integer.toString(numberToCheck);
        int length = stringNumberToCheck.length() - 1;

        for (int i = 0; i < length; i++) {
            if (stringNumberToCheck.substring(i + 1)
                    .contains(String.valueOf(stringNumberToCheck.charAt(i))))
                return false;
        }
        return true;
    }

    public static boolean checkIfNumberIsOfSameDigits(int numberToCheck) {

        String stringNumberToCheck = Integer.toString(numberToCheck);
        int length = stringNumberToCheck.length() - 1;

        for (int i = 0; i < length; i++) {
            if (!stringNumberToCheck.substring(i + 1)
                    .contains(String.valueOf(stringNumberToCheck.charAt(i))))
                return false;
        }
        return true;
    }
}

