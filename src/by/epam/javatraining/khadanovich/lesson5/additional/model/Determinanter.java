package by.epam.javatraining.khadanovich.lesson5.additional.model;

public class Determinanter {

    public static String determinateNextDay(int day, int month, int year) {
        int nextDay = day + 1;
        int nextYear = year;
        int nextMonth = month;
        boolean thirtyOneDayMonth = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10;
        boolean decemberMonth = month == 12;
        boolean februaryMonth = month == 2;
        boolean thirtyDayMonth = month == 4 || month == 6 || month == 9 || month == 11;
        boolean bigYear = (year % 4 == 0 && year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
        boolean correctDay = day <= 31 && day > 0;
        boolean correctMonth = month <= 12 && month > 0;
        boolean correctYear = year >= 0;
        if (correctDay && correctMonth && correctYear) {
            if (day == 31) {
                if (thirtyOneDayMonth) {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                } else if (decemberMonth) {
                    nextDay = 1;
                    nextMonth = 1;
                    nextYear = year + 1;
                } else {
                    return "Incorrect Date";
                }
            }
            if (day == 30) {
                if (thirtyDayMonth) {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                } else if (month == 2) {
                    return "Incorrect date";
                }
            }
            if (day == 29 && februaryMonth) {
                if (bigYear) {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                } else {
                    return "Incorrect date";
                }
            }
            if (day == 28 && februaryMonth) {
                if (!bigYear) {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                }
            }
            return "Next day: " + nextDay + "." + nextMonth + "." + nextYear;
        } else {
            return "Incorrect date";
        }
    }
}

