package medium.set_matrix_zeroes;

public class Solution {


    public static void setZeroes(int[][] matrix) {
        int[][] locations = new int[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 0) {
                    locations[row][col] = 1;
                }
            }
        }

        for (int row = 0; row < locations.length; row++) {
            for (int col = 0; col < locations[row].length; col++) {
                if (locations[row][col] == 1) {
                    for (int i = row+1; i < locations.length; i++) {
                        matrix[i][col] = 0;
                    }
                    for (int i = row-1; i >= 0; i--) {
                        matrix[i][col] = 0;
                    }
                    for (int i = col+1; i < locations[row].length; i++) {
                        matrix[row][i] = 0;
                    }
                    for (int i = col-1; i >= 0; i--) {
                        matrix[row][i] = 0;
                    }
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] test1 = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(test1);
        printMatrix(test1);

        int[][] test2 = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(test2);
        printMatrix(test2);


    }
}
