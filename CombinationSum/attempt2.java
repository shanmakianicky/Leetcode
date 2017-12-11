package Leetcode.CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class attempt2 {
    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        sum(nums,7);
    }
    public static List<List<Integer>> sum(int[] candidates, int target){
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        helper(result,new ArrayList<>(),target,0,candidates);
        return result;

    }
    private static void helper(List<List<Integer>> result, List<Integer> list, int target, int index, int[] nums){
        if (index >= nums.length){
            return;
        }
        if (0 == target){  //**
            result.add(new ArrayList<>(list));
            return;
        }else if(nums[index] < target){
            for (int i = index; i < nums.length; i++){
                list.add(nums[i]);
                helper(result,list,target - nums[i],i,nums);
                list.remove(list.size()-1);
            }
        }else{
           return;
        }
    }
}
