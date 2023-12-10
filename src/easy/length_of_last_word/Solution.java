package easy.length_of_last_word;

public class Solution {


    public static int lengthOfLastWord(String s) {
        return s.split(" ")[s.split(" ").length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("    fly me   to   the moon"));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}
