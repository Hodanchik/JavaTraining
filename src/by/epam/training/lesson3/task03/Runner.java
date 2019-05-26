package by.epam.training.lesson3.task03;

import by.epam.training.util.Printer;

public class Runner {
    public static void main(String[] args) {
        int weight = 40000;
        Converter.convertToGram(weight);
        Converter.convertToMilligram(weight);
        Converter.convertToTon(weight);

//This code for demonstration of results

        Printer.print(weight + " kilogramm = " + Converter.convertToGram(weight) + " gram");
        Printer.print(weight + " kilogramm = " + Converter.convertToMilligram(weight) + " milligram");
        Printer.print(weight + " kilogramm = " + Converter.convertToTon(weight) + " ton");
    }
}
