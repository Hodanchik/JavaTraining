package by.epam.javatraining.khadanovich.lesson5.additional.model;

public class Determinanter {

    public static String determinateNextDay(int day, int month, int year) {
        final int MAX_DAY_FEBRUARY = 29;
        final int MIN_DAY_FEBRUARY = 28;
        final int MAX_DAY_MONTH = 31;
        final int MIN_DAY_MONTH = 30;
        String nextDayStr = "Incorrect Date";
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
            if (day == MAX_DAY_MONTH) {
                if (thirtyOneDayMonth) {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                } else if (decemberMonth) {
                    nextDay = 1;
                    nextMonth = 1;
                    nextYear = year + 1;
                } else {
                    return nextDayStr;
                }
            }
            if (day == MIN_DAY_MONTH) {
                if (thirtyDayMonth) {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                } else if (februaryMonth) {
                    return nextDayStr;
                }
            }
            if (day == MAX_DAY_FEBRUARY && februaryMonth) {
                if (bigYear) {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                } else {
                    return nextDayStr;
                }
            }
            if (day == MIN_DAY_FEBRUARY && februaryMonth) {
                if (!bigYear) {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                }
            }
            nextDayStr = "Next day: " + nextDay + "." + nextMonth + "." + nextYear;
        } else {
            return nextDayStr;
        }
        return nextDayStr;
    }
}

