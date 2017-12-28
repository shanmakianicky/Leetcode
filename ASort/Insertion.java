package Leetcode.ASort;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] nums = new int[]{10,20,15,0,6,7,2,1,-5,55};
        long start = System.nanoTime();
        System.out.println(Arrays.toString(Insert(nums)));
        long end = System.nanoTime();
        // 1215220 778454
        System.out.println(end - start);
    }
    public static int[] Insert(int[] nums){
        for (int i = 0; i < nums.length; i++){
            int j = i - 1;
            int temp = nums[i];
            for (;j >= 0 && temp < nums[j]; j--){
                nums[j + 1] = nums[j];
            }
            nums[j + 1] = temp;
        }
        return nums;
    }
}
