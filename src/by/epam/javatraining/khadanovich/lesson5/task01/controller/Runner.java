package by.epam.javatraining.khadanovich.lesson5.task01.controller;


import by.epam.javatraining.khadanovich.lesson5.task01.model.CalculateDragon;
import by.epam.javatraining.khadanovich.lesson5.task01.model.MyScan;
import by.epam.javatraining.khadanovich.lesson5.task01.view.Printer;


//Only for demonstrate
public class Runner {
    public static void main(String[] args) {
        double age = MyScan.scanAge();
        Printer.print("Count of heads: " + CalculateDragon.calculateHeadsDragon(age));
        Printer.print("Count of eyes: " + CalculateDragon.calculateEyesDragon(age));
    }
}
