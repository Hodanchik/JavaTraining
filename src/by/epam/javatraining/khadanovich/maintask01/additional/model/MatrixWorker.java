package by.epam.javatraining.khadanovich.maintask01.additional.model;

public class MatrixWorker {

    //method find max number in matrix
    public static double findMaxValue(double[][] matrix) {
        double maxValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }

    //method find mix number in matrix
    public static double findMinValue(double[][] matrix) {
        double minValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > minValue) {
                    minValue = matrix[i][j];
                }
            }
        }
        return minValue;
    }

    //private method check matrix is square.
    private static boolean isMatrixSquare(double[][] matrix) {
        int matrixWidth = matrix.length;
        int matrixLong = matrix[0].length;
        return matrixWidth == matrixLong;
    }

    //private method check matrix is rectangle.
    private static boolean isMatrixRectangle(double[][] matrix) {

        for (int i = 0, j = i + 1; i < matrix.length - 1; i++, j++) {
            if (matrix[i].length != matrix[j].length) {
                return false;
            }
        }
        return true;
    }

    //method chech matrix for symmetric for main diagonal
    public static boolean isSymmetricMainDiagonalMatrix(double[][] matrix) {
        //Main diagonal has ONLY Rectangle matrix
        if (isMatrixRectangle(matrix)) {
            int matrixWidth = matrix.length; // width Rectangle
            int lastIndexWidth = matrixWidth - 1;
            int matrixLong = matrix[0].length; // long Rectangle
            int lastIndexLong = matrixLong - 1;
            // check for square matrix if matrixWidth = matrixLong
            if (isMatrixSquare(matrix)) {
                for (int i = 0; i < matrixWidth; i++) {
                    for (int j = i + 1; j < matrixLong; j++) {
                        if (matrix[i][j] != matrix[j][i]) {
                            return false;
                        }
                    }
                }
                return true;


            }  /*The main diagonal is a straight line that runs from the upper left corner to the right.
                 and  the rectangle "divides" into a square
                  */ else {
                if (matrixWidth > matrixLong) {

                    for (int i = 0; i < matrixLong; i++) {
                        for (int j = i + 1; j < lastIndexLong; j++) {

                            if (matrix[i][j] != matrix[j][i]) {

                                return false;
                            }
                        }
                    }

                } else {
                    int delta = matrixLong - matrixWidth;
                    for (int i = 0; i < matrixWidth; i++) {
                        for (int j = 0; j < matrixWidth; j++) {
                            if (matrix[i][j] != matrix[j][i]) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            }
            return true;

        }
        return false; // no rectangle or this rectangle not symmetrical incidental diagonal
    }


    // method check matrix for symmetric for incidental diagonal
    public static boolean isSymmetricIncidentalDiagonalMatrix(double[][] matrix) {
        //Incidental diagonal has ONLY Rectangle matrix
        if (isMatrixRectangle(matrix)) {
            int matrixWidth = matrix.length; // width Rectangle
            int lastIndexWidth = matrixWidth - 1;
            int matrixLong = matrix[0].length; // long Rectangle
            int lastIndexLong = matrixLong - 1;
            // check for square matrix if matrixWidth = matrixLong
            if (isMatrixSquare(matrix)) {

                for (int i = 0; i < matrixWidth; i++) {
                    for (int j = 0; j < lastIndexWidth - i; j++) {

                        if (matrix[lastIndexWidth - i][lastIndexWidth - j] != matrix[i][j]) {
                            return false;
                        }
                    }
                }
                return true;

            }  /*The incidental diagonal is a straight line that runs from the lower left corner to the right.
                 and  the rectangle "divides" into a square
                  */ else {
                if (matrixWidth > matrixLong) {
                    int delta = matrixWidth - matrixLong;
                    for (int i = 0; i < matrixLong; i++) {
                        for (int j = 0; j < lastIndexLong - i; j++) {

                            if (matrix[lastIndexWidth - i][lastIndexLong - j] != matrix[i + delta][j]) {

                                return false;
                            }
                        }
                    }

                } else {
                    int delta = matrixLong - matrixWidth;
                    for (int i = 0; i < matrixWidth; i++) {
                        for (int j = 0; j < lastIndexWidth - i; j++) {
                            if (matrix[lastIndexWidth - i][lastIndexLong - j - delta] != matrix[i][j]) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            }
            return true;

        }
        return false; // no rectangle or this rectangle not symmetrical incidental diagonal
    }

    public static void transposeMatrix(double[][] matrix) {
        int matrixWidth = matrix.length;
        if (matrixWidth == 0) {
            // add Logger   null matrix length
        }
        else if (isMatrixSquare(matrix)) {
            for (int i = 0; i < matrixWidth; i++) {
                for (int j = 0; j < matrixWidth; j++) {
                    matrix[i][j] += matrix[j][i];
                    matrix[j][i] = matrix[i][j] - matrix[j][i];
                    matrix[i][j] -= matrix[j][i];
                }
            }

        } else  {
            // add Logger  matrix is't square

        }
    }


}