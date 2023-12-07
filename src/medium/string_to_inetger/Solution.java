package medium.string_to_inetger;

public class Solution {

    public static int myAtoi(String s) {
        int index = 0;
        boolean isNegative = false;
        int result = 0;

        while (index < s.length() && Character.isWhitespace(s.charAt(index))) {
            index++;
        }

        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            isNegative = s.charAt(index) == '-';
            index++;
        }

        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (!isNegative) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return isNegative ? result * -1 : result;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("00000-42a1234"));
        System.out.println(myAtoi("   -42"));
        System.out.println(myAtoi("words and 987"));
    }
}
