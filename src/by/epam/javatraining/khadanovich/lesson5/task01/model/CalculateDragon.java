package by.epam.javatraining.khadanovich.lesson5.task01.model;

public class CalculateDragon {

    public static int calculateHeadsDragon(double age) {
        final int HEADS_AT_BIRTH = 3;
        final int HEADS_AT_CHILDHOOD_YEAR = 3; //grows heads in one year
        final int HEADS_AT_YOUTH_YEAR = 2;     //grows heads in one year
        final int HEADS_AT_OLD_YEAR = 1;       //grows heads in one year
        final int CHILDHOOD_PERIOD = 200;
        final int YOUTH_PERIOD = 300;
        final int HEADS_At_THE_END_CHILDHOOD = HEADS_AT_BIRTH
                + CHILDHOOD_PERIOD * HEADS_AT_CHILDHOOD_YEAR;
        final int HEADS_AT_THE_END_YOUTH = HEADS_At_THE_END_CHILDHOOD
                + (YOUTH_PERIOD - CHILDHOOD_PERIOD) * HEADS_AT_YOUTH_YEAR;
        int headCounter;

        if (age <= CHILDHOOD_PERIOD) {
            if (age == 0) {
                headCounter = HEADS_AT_BIRTH;
            } else {
                headCounter = HEADS_AT_BIRTH + (int) age * HEADS_AT_CHILDHOOD_YEAR;
            }
        } else if (age <= YOUTH_PERIOD) {
            headCounter = HEADS_At_THE_END_CHILDHOOD +
                    (int) (age - CHILDHOOD_PERIOD) * HEADS_AT_YOUTH_YEAR;
        } else {
            headCounter = HEADS_AT_THE_END_YOUTH + (int) (age - YOUTH_PERIOD)
                    * HEADS_AT_OLD_YEAR;
        }
        return headCounter;
    }

    public static int calculateEyesDragon(double age) {
        final int COUNT_EYES_AT_HEAD = 2;
        return calculateHeadsDragon(age) * COUNT_EYES_AT_HEAD;
    }
}

