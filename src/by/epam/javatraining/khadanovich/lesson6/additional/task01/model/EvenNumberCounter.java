package by.epam.javatraining.khadanovich.lesson6.additional.task01.model;

public class EvenNumberCounter {

    public static int countEvenNumbers(int numberToCount) {
        int count = 0;
        while (numberToCount > 0) {
            int numeric = numberToCount % 10;
            if (numeric % 2 == 0 && numeric != 0) {
                count += 1;
            }
            numberToCount /= 10;
        }
        return count;
    }
    public static int countOddNumbers(int numberToCount) {

        int count = 0;
        while (numberToCount > 0) {
            int numeric = numberToCount % 10;
            if (numeric % 2 != 0) {
                count += 1;
            }
            numberToCount /= 10;

        }
        return count;
    }
}