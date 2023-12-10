package easy.find_the_index_of_the_first_occurrence_in_a_string;

public class Solution {

    public static int strstr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }


    public static void main(String[] args) {
        System.out.println(strstr("sadbutsad", "sad"));
        System.out.println(strstr("leetcode", "leeto"));
    }

}
