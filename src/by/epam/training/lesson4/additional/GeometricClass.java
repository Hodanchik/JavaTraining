package by.epam.training.lesson4.additional;

public class GeometricClass {

    public static int chekCuuntQuadrateInRectangle(double sideQuadrate, double sideRectangleOne, double sideRectangleTwo) {
        return (int) ((sideRectangleOne / sideQuadrate) * (sideRectangleTwo / sideQuadrate));
    }

    public static double chekSquereWithoutQuadrateInRectangle(double sideQuadrate, double sideRectangleOne, double sideRectangleTwo) {
        double squereQuadrates = sideQuadrate * sideQuadrate * chekCuuntQuadrateInRectangle(sideQuadrate, sideRectangleOne, sideRectangleTwo);
        return sideRectangleOne * sideRectangleTwo - squereQuadrates;
    }

    public static double calculatePerimetrQuadrate(double sideQuadrate) {
        return 4 * sideQuadrate;
    }

    public static double calculateSquereQuadrate(double sideQuadrate) {
        return sideQuadrate * sideQuadrate;
    }

    public static double calculatePerimetrRectangle(double sideRectangleOne, double sideRectangleTwo) {
        return 2 * (sideRectangleOne + sideRectangleTwo);
    }

    public static double calculateSquereRectangle(double sideRectangleOne, double sideRectangleTwo) {
        return sideRectangleOne * sideRectangleTwo;
    }

    public static double calculateCircumference(double diametr) {
        return Math.PI * diametr;
    }

    public static double calculateSquereCircle(double diametr) {
        return Math.PI * (diametr / 2) * (diametr / 2);
    }


    public static double calculateSquareSuperficiesCube(double side) {
        return 6 * side * side;
    }

    public static double calculateSquareVolumeCube(double side) {
        return side * side * side;
    }

    public static double calculateHypotenuseRectangular(double a, double b) {
        return Math.sqrt((a * a) + (b + b));
    }

    public static double calculateSquareRectangular(double a, double b) {
        return a * b / 2;
    }

    public static double calculatePerimetrRectangular(double a, double b) {
        return calculateHypotenuseRectangular(a, b) + a + b;
    }

    
}
