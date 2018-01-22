package Leetcode.ASort.Insertion;

import java.util.Arrays;

public class attempt2 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,99,34,23,999,345};
        System.out.println(Arrays.toString(insertionSort(nums)));
    }
    public static int[] insertionSort(int[] nums){
        if (nums == null || nums.length < 2){
            return nums;
        }
        for (int i = 1; i < nums.length; i++){
            for (int j = i - 1; j >= 0; j--){
                if (nums[j + 1] < nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }else{
                    break;
                }
            }
        }
        return nums;
    }
}
