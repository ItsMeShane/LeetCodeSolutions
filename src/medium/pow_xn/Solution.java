package medium.pow_xn;

public class Solution {

    public static double myPow(double x, double n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            x = 1 / x;
        }
        double result = 1;
        double currentProduct = x;
        if (n == Integer.MIN_VALUE) {
            result *= currentProduct;
            n++;
        }
        if (n < 0) {
            n = -n;
        }
        for (int i = (int) n; i > 0; i /= 2) {
            if (i % 2 == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
        System.out.println(myPow(-1.00000, -2147483648));
        System.out.println(myPow(5, 5));
    }

}
