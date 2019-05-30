package by.epam.javatraining.khadanovich.lesson5.additional.controller;


import by.epam.javatraining.khadanovich.lesson5.additional.model.Determinanter;
import by.epam.javatraining.khadanovich.lesson5.additional.view.Printer;
import by.epam.javatraining.khadanovich.lesson5.task03.model.MoodSensor;

import javax.swing.tree.DefaultTreeCellEditor;

public class Runner {
    public static void main(String[] args) {
       Printer.print(Determinanter.determinateNextDay(31,12,10));
            }
}
