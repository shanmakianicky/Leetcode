package Leetcode.ASort;

import java.util.Arrays;

public class Shell {
    public static void main(String[] args) {
        int[] nums = new int[]{10,20,15,0,6,7,2,1,-5,55};
        long start = System.nanoTime();
        System.out.println(Arrays.toString(shell(nums)));
        long end = System.nanoTime();
        //305224 356784 319012 397624
        System.out.println(end - start);
    }
    public static int[] shell(int[] nums){
        int gap = nums.length/2;
        while(gap > 0) {
            for (int i = 0; i < nums.length; i += gap){
                int j = i - 1;
                int temp = nums[i];
                for (; j >= 0 && nums[j] > temp; j--){
                    nums[j + 1] = nums[j];
                }
                nums[j + 1] = temp;
            }
            gap = gap/2;
        }
        return nums;
    }
}
