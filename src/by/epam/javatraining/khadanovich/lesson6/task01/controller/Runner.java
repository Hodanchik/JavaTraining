package by.epam.javatraining.khadanovich.lesson6.task01.controller;


import by.epam.javatraining.khadanovich.lesson6.task01.view.Printer;
import by.epam.javatraining.khadanovich.lesson6.task01.model.CounterCoin;


//Only for demonstrate
public class Runner {
    public static void main(String[] args) {
        int time = 1000;
        int countEagle = CounterCoin.countCoinCountEagle(time);
        int countTails = time - countEagle;
        Printer.print("Cont throw: " + time + " count eager: " + countEagle + " count tails: " + countTails);
    }
}
