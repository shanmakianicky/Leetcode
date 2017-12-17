package Leetcode.SortColor;

import java.util.Arrays;

public class attempt1 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,1,0,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sort(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                count0++;
            }else if (nums[i] == 1){
                count1++;
            }else {
                count2++;
            }
        }
        for (int i = 0; i < nums.length; i++){
            if (count0 != 0){
                nums[i] = 0;
                count0--;
                continue;
            }
            if (count1 != 0){
                nums[i] = 1;
                count1--;
                continue;
            }
            if (count2 != 0){
                nums[i] = 2;
                count2--;
                continue;
            }
        }
    }
}
