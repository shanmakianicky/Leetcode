package Leetcode.ASort;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,99,34,23,999,345};
        System.out.println(Arrays.toString(bubble(nums)));
    }
    /* Travese from end of the array, compare each adjacent number till reach the head,
    * which ensures after each iteration, the ith number is the largest from nums[i, end] */
    public static int[] bubble(int[] nums){
        for (int i = nums.length - 1; i > 0; i--){
            for (int j = i; j > 0; j--){
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
