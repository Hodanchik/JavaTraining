package by.epam.javatraining.khadanovich.lesson5.task02.model;

import static org.junit.Assert.*;

import org.junit.Test;


public class CheckerTest {

    @Test
    public void checkSymbolByVowelOne() {
        char ch = 'A';
        boolean expected = true;

        assertEquals(expected, Checker.checkSymbolByVowelOne(ch));
    }

    @Test
    public void checkSymbolByVowelTwo() {
        char ch = 's';
        boolean expected = false;
        assertEquals(expected, Checker.checkSymbolByVowelTwo(ch));
    }

    @Test
    public void checkSymbolByVowelThree() {
        char ch = 'Y';
        boolean expected = true;
        assertEquals(expected, Checker.checkSymbolByVowelThree(ch));
    }

    @Test
    public void checkSymbolByVowelFour() {
        char ch = 'Y';
        boolean expected = false;
        assertEquals(expected, Checker.checkSymbolByVowelFour(ch));
    }

    @Test
    public void checkSymbolByVowelFive() {
        char ch = 'Y';
        boolean expected = false;
        assertEquals(expected, Checker.checkSymbolByVowelFive(ch));
    }
}

