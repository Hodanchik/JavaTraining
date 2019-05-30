package by.epam.javatraining.khadanovich.lesson5.task02.controller;

import by.epam.javatraining.khadanovich.lesson5.task02.model.Checker;
import by.epam.javatraining.khadanovich.lesson5.task02.model.MyScan;

//Only for demonstration

public class Runner {
    public static void main(String[] args) {
        char ch = MyScan.scanChar();
        System.out.println(Checker.checkSymbolByVowelTwo(ch) ? "Your symbol is vowel" : "Your symbol is't vowel");
    }
}
