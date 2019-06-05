package by.epam.javatraining.khadanovich.lesson5.additional.model;

public class NextDayPredictor {

    public static String predictNextDay(int day, int month, int year) {
        final int MAX_DAY_FEBRUARY = 29;
        final int MIN_DAY_FEBRUARY = 28;
        final int MAX_DAY_STANDARD_MONTH = 31; // all months except February
        final int MIN_DAY_STANDARD_MONTH = 30; // all months except February
        String nextDayStr = "Incorrect Date";
        int nextDay = day + 1;
        int nextYear = year;
        int nextMonth = month;
        boolean isThirtyOneDayMonth = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10;
        boolean isDecember = month == 12;
        boolean isFebruary = month == 2;
        boolean isThirtyDayMonth = month == 4 || month == 6 || month == 9 || month == 11;
        boolean isBigYear = (year % 4 == 0 && year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
        boolean isCorrectDay = day <= 31 && day > 0;
        boolean isCorrectMonth = month <= 12 && month > 0;
        boolean isCorrectYear = year >= 0;
        if (isCorrectDay && isCorrectMonth && isCorrectYear) {
            if (day == MAX_DAY_STANDARD_MONTH) {
                if (isThirtyOneDayMonth) {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                } else if (isDecember) {
                    nextDay = 1;
                    nextMonth = 1;
                    nextYear = year + 1;
                } else {
                    return nextDayStr;
                }
            }
            if (day == MIN_DAY_STANDARD_MONTH) {
                if (isThirtyDayMonth) {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                } else if (isFebruary) {
                    return nextDayStr;
                }
            }
            if (day == MAX_DAY_FEBRUARY && isFebruary) {
                if (isBigYear) {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                } else {
                    return nextDayStr;
                }
            }
            if (day == MIN_DAY_FEBRUARY && isFebruary) {
                if (!isBigYear) {
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