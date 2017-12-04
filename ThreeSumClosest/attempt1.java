package Leetcode.ThreeSumClosest;

import java.util.Arrays;

public class attempt1 {
    public static void main(String[] args) {
        int[] a = new int[4];
        a[0] = 1;
        a[1] = 1;
        a[2] = 1;
        a[3] = 0;
        System.out.println(sum(a, 100));
    }

    public static int sum(int[] nums, int target) {
        Arrays.sort(nums);
        int min = nums[0] + nums[1] + nums[2] - target;
        int minSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int high = nums.length - 1, low = i + 1;
            while (high > low) {
                if (Math.abs(nums[high] + nums[low] + nums[i] - target) < Math.abs(min)) {
                    min = nums[high] + nums[low] + nums[i] - target;
                    minSum = min + target;
                }
                if (nums[high] + nums[low] + nums[i] > target) {
                    high--;
                } else if (nums[high] + nums[low] + nums[i] < target) {
                    low++;
                } else {
                    return target;
                }
            }
        }

        return minSum;
    }
}
