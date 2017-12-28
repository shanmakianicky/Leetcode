package Leetcode.ASort;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] numbers = {10,20,15,0,6,7,2,1,-5,55};
        System.out.println(Arrays.toString(selection(numbers)));
    }
    public static int[] selection(int[] nums){
        for (int i = 0; i < nums.length; i++){
            int min = nums[i];
            int minIndex = i;
            for (int j = i; j < nums.length; j++){
                if (nums[j] < min){
                    minIndex = j;
                    min = nums[j];
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        return nums;
    }
}
