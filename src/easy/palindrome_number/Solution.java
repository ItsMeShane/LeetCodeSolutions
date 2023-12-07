package easy.palindrome_number;

public class Solution {

    public static boolean isPalindrome(int x) {
        String string = String.valueOf(x);
        String reversed = new StringBuilder(string).reverse().toString();

        return string.equals(reversed);
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(313));
        System.out.println(isPalindrome(13));
        System.out.println(isPalindrome(76544567));

    }

}
