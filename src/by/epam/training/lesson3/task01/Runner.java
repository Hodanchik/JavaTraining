package by.epam.training.lesson3.task01;


import by.epam.training.util.Printer;

public class Runner {
    public static void main(String[] args) {
        int celsiusDegree = 40;
        int farengeitDegree = 34;
        //This code for demonstration of results

        Printer.print(celsiusDegree + " Celsius Degree  = " + Converter.convertFromCelsToFarengeit(celsiusDegree) + " Farengeit Degree");
        Printer.print(farengeitDegree + " Farengeit Degree  = " + Converter.convertFromFarengeitToCels(farengeitDegree) + " Celsius Degree");
    }
}
