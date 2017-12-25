package Leetcode.ThreeSum;

import java.util.*;

public class attempt3 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums).toString());
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3){
            return result;
        }
        int left = 0;
        int right = nums.length - 1;
        for (int i = 1; i < nums.length; i++) {
            int size = result.size();
            while (i > left && i < right && left < nums.length - 2 && right > 1) {
                if (nums[i] + nums[left] + nums[right] == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[left]);
                    temp.add(nums[i]);
                    temp.add(nums[right]);
                    result.add(temp);
                    while(left < i && nums[left] == nums[left+1]){left++;}
                    while(right > i && nums[right] == nums[right - 1]){right--;}
                    left++;
                    right--;
                }else if (nums[i] + nums[left] + nums[right] < 0){
                    left++;
                    continue;
                }else {
                    right--;
                    continue;
                }
            }
                left = 0;
                right = nums.length - 1;

        }
        return result;
    }

}
