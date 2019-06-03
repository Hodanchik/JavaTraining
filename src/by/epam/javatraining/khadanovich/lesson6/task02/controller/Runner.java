package by.epam.javatraining.khadanovich.lesson6.task02.controller;


import by.epam.javatraining.khadanovich.lesson6.task02.model.CkeckerNumbers;
import by.epam.javatraining.khadanovich.lesson6.task03.model.FactorialCalculator;

public class Runner {

    public static void main(String[] args) {

        int result = FactorialCalculator.factorialCalculator(11111);
       // System.out.println(Printer.print(CkeckerNumbers.checkIncreasingNumber(123)));
        System.out.println(CkeckerNumbers.checkDecreasingNumber(234));

    }
}
