package Leetcode.Subsets;

import java.util.ArrayList;
import java.util.List;

public class attempt1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(subsets(nums).toString());
    }
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++){
            helper(result,new ArrayList<>(),nums,i);
        }
        return result;

    }
    private static void helper(List<List<Integer>> result, List<Integer> list, int[] nums, int index){
        if (index < nums.length){
            list.add(nums[index]);
            result.add(new ArrayList<>(list));
        }else{
            return;
        }
        for (int i = index+1; i < nums.length; i++){
            helper(result,list,nums,i);
            list.remove(list.size()-1);
        }
    }
}
