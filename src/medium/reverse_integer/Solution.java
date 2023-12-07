package medium.reverse_integer;

public class Solution {

    public static int reverse(int x) {
        try {
            String reStr = new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString();
            return Integer.parseInt(reStr) * (x < 0 ? -1 : 1);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-23));
        System.out.println(reverse(-121));
    }

}
