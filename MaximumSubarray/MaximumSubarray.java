package Leetcode.MaximumSubarray;

import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {0,-2,0};
        System.out.print(divideAndConquer(nums));
    }
    public static int find(int[] nums){
        int maxCurrent = nums[0], maxTotal = nums[0];
        for (int i = 1; i < nums.length; i++){
            maxCurrent = Math.max(nums[i],maxCurrent+nums[i]);
            maxTotal = Math.max(maxCurrent,maxTotal);
        }
        return maxTotal;
    }
    public static int divideAndConquer(int[] nums){
        // base case
        if (nums.length == 1){
            return nums[0];
        }else {
            // find mid
            int mid;
            if ((nums.length & 1) != 1) {
                mid = nums.length / 2;
            } else {
                mid = (nums.length - 1) / 2;
            }
            // find the max subarray crossing mid
            int leftMax = nums[mid];
            int leftSum = nums[mid];
            for (int i = mid - 1; i >= 0; i--) {
                leftSum += nums[i];
                leftMax = Math.max(leftMax, leftSum);
            }
            int rightMax = nums[mid];
            int rightSum = nums[mid];
            for (int i = mid + 1; i < nums.length; i++) {
                rightSum += nums[i];
                rightMax = Math.max(rightMax, rightSum);
            }
            // max crossing sum
            int maxCrossing = rightMax + leftMax - nums[mid];

            // divide array
            int[] leftArray = new int[mid];
            int[] rightArray = new int[nums.length - mid - 1];
            System.arraycopy(nums,0,leftArray,0,mid);
            System.arraycopy(nums,mid + 1,rightArray,0,nums.length - mid - 1);
            int leftSumMax = divideAndConquer(leftArray);
            int rightSumMax = divideAndConquer(rightArray);
            if (leftSumMax >= rightSumMax && leftSumMax >= maxCrossing) {
                return leftSumMax;
            } else if (rightSumMax >= leftSumMax && rightSumMax >= maxCrossing) {
                return rightSumMax;
            } else {
                return maxCrossing;
            }
        }
    }
}
