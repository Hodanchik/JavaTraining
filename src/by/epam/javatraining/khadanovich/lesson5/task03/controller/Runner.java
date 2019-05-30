package by.epam.javatraining.khadanovich.lesson5.task03.controller;


import by.epam.javatraining.khadanovich.lesson5.task03.model.MoodSensor;
import by.epam.javatraining.khadanovich.lesson5.task03.view.Printer;

public class Runner {
    public static void main(String[] args) {
        Printer.print("Your mood: " + MoodSensor.checkMood());
    }
}
