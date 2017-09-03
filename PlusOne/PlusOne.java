package Leetcode.PlusOne;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums = {8,9,9,9};
        System.out.print(Arrays.toString(plusOne(nums)));
    }
    public static int[] plusOne(int[] nums){
        int carry = 0;
        for (int i = nums.length - 1; i >= 0; i--){
            if (nums[i] == 9){
                carry++;
            }else {
                break;
            }
        }
        if (carry == 0){
            nums[nums.length-1] += 1;
            return nums;
        }else if (carry == nums.length){
            int[] result = new int[nums.length+1];
            result[0] = 1;
            for (int i = 1; i < nums.length+1; i++){
                result[i] = 0;
            }
            return result;
        }else{
            for(int i = carry - 1; i >= 0; i--){
                nums[nums.length - i -1] = 0;
            }
            nums[nums.length - carry - 1] += 1;
            return nums;
        }
    }
}
