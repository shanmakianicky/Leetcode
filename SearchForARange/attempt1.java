package Leetcode.SearchForARange;

import java.util.Arrays;

public class attempt1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2};
        System.out.println(Arrays.toString(search(nums,3)));
    }
    public static int[] search(int[] nums, int target){
        int[] fail = new int[]{-1,-1};
        if (nums == null || nums.length == -1){
            return fail;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int mid = (left + right)/2;
            if (nums[mid] == target){
                int i = mid, j = mid;
                while(i>0 && nums[i-1] == target){
                    i--;
                }
                while(j<nums.length-1 && nums[j+1] ==target){
                    j++;
                }
                int[] result = new int[]{i,j};
                return result;
            }else if (nums[mid] < target){
                left = mid;
            }else {
                right = mid;
            }
        }
        return fail;
    }
}
