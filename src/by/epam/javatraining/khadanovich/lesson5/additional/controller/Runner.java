package by.epam.javatraining.khadanovich.lesson5.additional.controller;


import by.epam.javatraining.khadanovich.lesson5.additional.model.NextDayPredictor;
import by.epam.javatraining.khadanovich.lesson5.additional.view.Printer;

public class Runner {
    public static void main(String[] args) {
       Printer.print(NextDayPredictor.predictNextDay(31,12,10));
            }
}
