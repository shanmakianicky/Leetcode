package Leetcode.FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class attempt1 {
    public static void main(String[] args) {
        int[] nums = new int[6];
        nums[0] = 1;
        nums[1] = 0;
        nums[2] = -1;
        nums[3] = 0;
        nums[4] = -2;
        nums[5] = 2;
        System.out.println(sum(nums,0));
    }
    public static List<List<Integer>> sum(int[] nums, int target){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length-3; i++){
            for (int j = i + 1; j < nums.length - 2; j++) {
                int low = j + 1, high = nums.length - 1;
                while (low < high) {
                    if (nums[i] + nums[j] + nums[low] + nums[high] == target) {
                        ArrayList<Integer> re = new ArrayList<>();
                        re.add(nums[i]);
                        re.add(nums[j]);
                        re.add(nums[low]);
                        re.add(nums[high]);
                        if(!(result.contains(re))){
                            result.add(re);
                        }
                    }else if(nums[i] + nums[j] + nums[low] + nums[high] < target){
                        low++;
                        continue;
                    }else{
                        high--;
                        continue;
                    }
                    low++;
                    high--;

                }


            }
        }
        return result;
    }
}
