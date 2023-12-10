package easy.remove_duplicates_from_sorted_array;

import java.util.Arrays;

public class Solution {


    public static int removeDuplicates(int[] nums) {
        int[] distinct = Arrays.stream(nums).distinct().toArray();
        for (int i = 0; i < nums.length; i++) {
            if (i >= distinct.length) {
                nums[i] = 0;
                continue;
            }
            nums[i] = distinct[i];
        }

        return distinct.length;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

}
