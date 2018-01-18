package Leetcode.ASort.Bubble;

import java.util.Arrays;

public class attempt2 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,99,34,23,999,345};
        System.out.println(Arrays.toString(bubble(nums)));
    }
    public static int[] bubble(int[] nums){
        if (nums == null || nums.length == 0 || nums.length == 1){
            return nums;
        }
        for (int i = nums.length - 1; i > 0; i--){
            for (int j = 1; j <= i; j++){
                if (nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        return nums;
    }
}
