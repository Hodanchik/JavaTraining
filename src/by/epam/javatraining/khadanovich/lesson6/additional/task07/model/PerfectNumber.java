package by.epam.javatraining.khadanovich.lesson6.additional.task07.model;

public class PerfectNumber {


    public static boolean isNumberPerfect(int numberToCheck) {
        int sum = 0;
        for (int i = 1; i < numberToCheck; i++) {
            if (numberToCheck % i == 0)
                sum += i;
        }
        return numberToCheck == sum;
    }
}

