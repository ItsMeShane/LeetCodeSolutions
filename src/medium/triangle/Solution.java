package medium.triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {


/*    public static int minimumTotal(List<List<Integer>> triangle) {
        return searchTriangle(triangle, 0, 0);
    }

    public static int searchTriangle(List<List<Integer>> triangle, int row, int col) {
        if (triangle.size() - 1 == row) {
            return triangle.get(row).get(col);
        }

        int leftSum = searchTriangle(triangle, row + 1, col);
        int rightSum = searchTriangle(triangle, row + 1, col + 1);

        return Math.min(leftSum, rightSum) + triangle.get(row).get(col);
    }*/

    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        int n = triangle.size();
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n - 1).get(i);
        }
        for (int row = n - 2; row >= 0; row--) {
            for (int i = 0; i <= row; i++) {
                dp[i] = Math.min(dp[i], dp[i + 1]) + triangle.get(row).get(i);
            }
        }
        return dp[0];
    }


    public static void main(String[] args) {

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(2));
        triangle.add(List.of(3, 4));
        triangle.add(List.of(6, 5, 7));
        triangle.add(List.of(4, 1, 8, 3));

        System.out.println(minimumTotal(triangle));

    }

}
