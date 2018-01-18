package Leetcode.ProductOfArrayExceptSelf;

public class attempt1 {
    public int[] productExceptSelf(int[] nums){
        int left = 1;
        int[] result = new int[nums.length];
        result[0] = left;
        for (int i = 1; i < nums.length; i++){
            result[i] = result[i-1] * nums[i-1];
        }
        int right = nums[nums.length - 1];
        for (int j = nums.length - 1; j > 0; j--){
            result[j - 1] *= right;
            right *= nums[j - 1];
        }
        return result;
    }
}
