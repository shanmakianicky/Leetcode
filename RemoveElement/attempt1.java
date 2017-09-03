package Leetcode.RemoveElement;

import java.util.Arrays;

public class attempt1 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.print(remove(nums,3));
        System.out.print(Arrays.toString(nums));
    }
    public static int remove(int[] nums, int val){
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
