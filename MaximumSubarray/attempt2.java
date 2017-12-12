package Leetcode.MaximumSubarray;

public class attempt2 {
    public int max(int[] nums){
        int current = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++){
            current += nums[i];
            if (nums[i] > current){
                current = nums[i];
            }
            if (current > max){
                max = current;
            }
        }
        return max;
    }
}
