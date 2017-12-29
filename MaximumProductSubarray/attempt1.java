package Leetcode.MaximumProductSubarray;

public class attempt1 {
    public static void main(String[] args) {
        int[] nums = new int[]{-4, -3, -2};
        System.out.println(max(nums));
    }

    public static int max(int[] nums) {
        int result = nums[0];
        int maxNum = nums[0];
        int minNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int max = maxNum;
            int min = minNum;
            if (nums[i] > 0) {
                maxNum = Math.max(nums[i], nums[i] * max);
                minNum = Math.min(nums[i], nums[i] * min);
            }else {
                maxNum = Math.max(nums[i], nums[i] * min);
                minNum = Math.min(nums[i], nums[i] * max);
            }
            result = Math.max(result, maxNum);
        }
        return result;
    }
}
