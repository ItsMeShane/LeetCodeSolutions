package easy.single_number;

public class Solution {

    public static int singleNumber(int[] nums) {
        start:
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1)return nums[i];
            int num = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if (num == nums[j])continue start;
            }
            return nums[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(singleNumber(new int[]{1}));
    }

}
