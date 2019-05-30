package by.epam.javatraining.khadanovich.lesson5.task01.model;

public class CalculateDragon {

    public static int calculateHeadsDragon(double age) {
        int headsAtBirth = 3;
        int headsAtChildhoodYear = 3; //grows heads in one year
        int headsAtYouthYear = 2;     //grows heads in one year
        int headsAtOldYear = 1;       //grows heads in one year
        int childhoodPeriod = 200;
        int youthPeriod = 300;
        int headsAtTheEndChildhood = headsAtBirth
                + childhoodPeriod * headsAtChildhoodYear;
        int headsAtTheEndYouth = headsAtTheEndChildhood
                + (youthPeriod - childhoodPeriod) * headsAtYouthYear;
        if (age <= childhoodPeriod) {
            if (age == 0) {
                return headsAtBirth;
            }
            return headsAtBirth + (int) age * headsAtChildhoodYear;
        } else if (age <= youthPeriod) {
            return headsAtTheEndChildhood + (int) (age - childhoodPeriod) * headsAtYouthYear;
        } else {
            return headsAtTheEndYouth + (int) (age - youthPeriod)
                    * headsAtOldYear;
        }

    }


    public static int calculateEyesDragon(double age) {
        int countEyesAtHead = 2;
        return calculateHeadsDragon(age) * countEyesAtHead;
    }
}
