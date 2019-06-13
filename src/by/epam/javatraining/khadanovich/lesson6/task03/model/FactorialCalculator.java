package by.epam.javatraining.khadanovich.lesson6.task03.model;

public class FactorialCalculator {

    public static int factorialCalculator(int number) {
        number = (number >= 0) ? number : -number;
        int result = 1;
        //if number = 0 or number = 1 factorial = 1;

        /* remove this line or this reduces readability?
          if(number !=0 || number !=1) */
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
