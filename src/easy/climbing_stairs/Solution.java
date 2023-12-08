package easy.climbing_stairs;

public class Solution {

    public static int climbStairs(int n) {
        if (n == 1) {
            return n;
        }

        int a = 1;
        int b = 1;
        int c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(45));
    }

}
