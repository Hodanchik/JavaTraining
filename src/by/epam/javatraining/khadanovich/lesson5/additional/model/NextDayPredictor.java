package by.epam.javatraining.khadanovich.lesson5.additional.model;

public class NextDayPredictor {

    public static String predictNextDay(int day, int month, int year) {
        final int MAX_DAY_FEBRUARY = 29;
        final int MIN_DAY_FEBRUARY = 28;
        final int MAX_DAY_STANDARD_MONTH = 31; // all months except February
        final int MIN_DAY_STANDARD_MONTH = 30; // all months except February
        final int MAX_MONTH = 12;
        final int JANUARY = 1;
        final int FEBRUARY = 2;
        final int MARCH = 3;
        final int APRIL = 4;
        final int MAY = 5;
        final int JUNE = 6;
        final int JULY = 7;
        final int AUGUST = 8;
        final int SEPTEMBER = 9;
        final int OCTOBER = 10;
        final int NOVEMBER = 11;
        final int DECEMBER = 12;
        final int DIVIDER_BIG_YEAR_400 = 400;
        final int DIVIDER_BIG_YEAR_100 = 100;
        final int DIVIDER_BIG_YEAR_4 = 4;

        String nextDayStr = "Incorrect Date";
        int nextDay = day + 1;
        int nextYear = year;
        int nextMonth = month;
        boolean isThirtyOneDayMonth = month == JANUARY || month == MARCH || month == MAY || month == JULY
                || month == AUGUST || month == OCTOBER;
        boolean isDecember = month == DECEMBER;
        boolean isFebruary = month == FEBRUARY;
        boolean isThirtyDayMonth = month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER;
        boolean isBigYear = (year % DIVIDER_BIG_YEAR_4 == 0 && year % DIVIDER_BIG_YEAR_100 == 0
                && year % DIVIDER_BIG_YEAR_400 == 0 || year % DIVIDER_BIG_YEAR_4 == 0
                && year % DIVIDER_BIG_YEAR_100 != 0);
        boolean isCorrectDay = day <= MAX_DAY_STANDARD_MONTH && day > 0;
        boolean isCorrectMonth = month <= MAX_MONTH && month > 0;
        boolean isCorrectYear = year >= 0;
        if (isCorrectDay && isCorrectMonth && isCorrectYear) {
            if (day == MAX_DAY_STANDARD_MONTH) {
                if (isThirtyOneDayMonth) {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                } else if (isDecember) {
                    nextDay = 1;
                    nextMonth = JANUARY;
                    nextYear = year + 1;
                } else {
                    return nextDayStr;
                }
            } else if (day == MIN_DAY_STANDARD_MONTH) {
                if (isThirtyDayMonth) {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                } else if (isFebruary) {
                    return nextDayStr;
                }
            } else if (day == MAX_DAY_FEBRUARY && isFebruary) {
                if (isBigYear) {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                } else {
                    return nextDayStr;
                }
            } else if (day == MIN_DAY_FEBRUARY && isFebruary) {
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