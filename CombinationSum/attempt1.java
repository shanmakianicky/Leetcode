package Leetcode.CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class attempt1 {
    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        find(nums,7);
    }

    public static List<List<Integer>> find(int[] candidates, int target){
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        helper(list,new ArrayList<>(), target, candidates, 0);
        return list;
    }

    private static void helper(List<List<Integer>> result, List<Integer> temp, int remain, int[] nums, int i){
        if (i > nums.length -1){
            return;
        }
        if (remain == 0){
            result.add(temp);
            return;
        }else if (remain < 0){
            return;
        }else{
            for (int a = i; a < nums.length; a++){
                temp.add(nums[a]);
                helper(result,temp,remain - nums[a],nums, a);
                temp.remove(temp.size()-1);
            }
        }
    }
}
