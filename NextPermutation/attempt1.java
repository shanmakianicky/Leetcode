package Leetcode.NextPermutation;

import java.util.Arrays;

public class attempt1 {
    public static void main(String[] args) {
        int[] nums = {1,5,1};
        next(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void next(int[] nums){
        if (nums.length < 2){
            return;
        }
        int i = nums.length - 2;
        while(i >= 0 && nums[i] > nums[i + 1]){
            i--;
        }
        if(i<0){
            Arrays.sort(nums);
            return;
        }
        int j = nums.length - 1;
        while(j > i && nums[j] <= nums[i]){
            j--;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        int k = nums.length - 1;
        i += 1;
        while(i < k){
            temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;
            i++;
            k--;
        }

    }
}
