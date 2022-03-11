package normalJava.SEMINARS_1;

import java.util.Arrays;
import java.util.Random;

public class Exercise_4 {
    public static void main(String[] args) {
        double[][] numbers = generateMatrix(2);
        // print 2-D array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }
        int row = 0, col = 1;
        System.out.printf("Product of %d row and %d column: %.2f", row, col, getProduct(numbers, row, col));

    }

    /**
     * Generates a NxN square matrix if N > 1
     * 
     * @param matrix
     * @param N
     * @return a NxN square matrix, but if N <= 1, then returns empty 2D array
     */
    public static double[][] generateMatrix(int N) {
        if (N <= 1) {
            return new double[0][0];
        }

        double[][] result = new double[N][N];
        Random rand = new Random();
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                // katrs elements ir random intervālā [1, 100)
                result[i][j] = rand.nextDouble() * 99 + 1;
            }
        }
        return result;
    }

    /**
     * Gets the dot-product of row i and column j from 2-D matrix if i and j are valid indexes of
     * matrix
     * 
     * @param matrix
     * @param N
     * @return the dot product (katra elementa reizinājuma summa), if matrix is a reference to a 2D
     *         array and i and j are valid indexes of matrix
     */
    public static double getProduct(double[][] matrix, int i, int j) {
        if (matrix == null || i >= 0 && i < matrix.length || j >= 0 && j < matrix[i].length) {
            return 0;
        }

        double[] row = matrix[i];
        double[] column = new double[matrix[i].length];

        // fill up column vector with column j from 2D matrix
        for (int k = 0; k < matrix.length; k++) {
            column[k] = matrix[k][j];
        }

        double sum = 0;

        for (int k = 0; k < matrix.length; k++) {
            sum += row[k] * column[k];
        }

        return sum;
    }

}
