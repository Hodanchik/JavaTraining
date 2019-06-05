package by.epam.javatraining.khadanovich.lesson5.task02.model;

public class Checker {


    public static boolean checkSymbolByVowelOne(char ch) {

        Character[] vowelChar = {'e', 'E', 'u', 'U', 'i', 'I', 'o', 'O', 'a', 'A'};
        for (char vowel : vowelChar) {
            {
                if (vowel == ch)
                    return true;
            }
        }
        return false;
    }

    public static boolean checkSymbolByVowelTwo(char ch) {
        String vowelString = "EeUuOoAaIi";
        return vowelString.indexOf(ch) != -1;
    }

    public static boolean checkSymbolByVowelThree(char ch) {
        switch (ch) {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    public static boolean checkSymbolByVowelFour(char ch) {
        Character[] vowelChar = {'\u0041', '\u0045', '\u0049', '\u004F', '\u0055', '\u0061', '\u0065', '\u0069',
                '\u006F', '\u0075'};
        for (char vowel : vowelChar) {
            {
                if (vowel == ch)
                    return true;
            }
        }
        return false;
    }

    public static boolean checkSymbolByVowelFive(char ch) {
        return ch == 'A' || ch == 'a' || ch == 'e' || ch == 'E' || ch == 'u' || ch == 'U' || ch == 'i' || ch == 'I'
                || ch == 'o' || ch == 'O';
    }
}