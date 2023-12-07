package easy.plus_one;

import java.util.Arrays;

public class Solution {

    public static int[] plusOne(int[] digits) {
        int l = digits.length;

        for (int i = l - 1; i >= 0; i--) {
            digits[i]++;

            if (digits[i] < 10) {
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] newDigits = new int[l+1];
        newDigits[0] = 1;

        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

}
