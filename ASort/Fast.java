package Leetcode.ASort;

import java.util.Arrays;
import java.util.Random;

public class Fast {
    public static void main(String[] args) {
//        int[] nums = new int[]{2,3,1,99,34,23,999,345};
       // int[] nums = new int[]{10,20,15,0,15,7,2,1,-5,55};
        int [] nums = new int[]{5,2,4,1,3,6,0};
        long start = System.nanoTime();
        fast(nums);
        System.out.println(Arrays.toString(nums));
        long end = System.nanoTime();
        //305224 356784 319012 397624
        System.out.println(end - start);
    }
    public static void fast(int[] nums){
        helper(nums,0,nums.length - 1);
    }
    private static void helper(int[] nums, int left, int right){
        if (left >= right){
            return;
        }
        int leftIndex = left;
        int rightIndex = right;
        int pivot = nums[left];
        while (left < right){
            while(left < right && nums[right] > pivot){
                right--;
            }
            nums[left] = nums[right];

            while(left < right && nums[left] <= pivot){
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = pivot;
        helper(nums,leftIndex, left-1);
        helper(nums,left+1,rightIndex);
    }


}
