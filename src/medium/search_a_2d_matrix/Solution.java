package medium.search_a_2d_matrix;

public class Solution {

    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{
                {1,3,5,7},{10,11,16,20},{23,30,34,60}
        }, 3));

        System.out.println(searchMatrix(new int[][]{
                {1,3,5,7},{10,11,16,20},{23,30,34,60}
        }, 13));
    }

}
