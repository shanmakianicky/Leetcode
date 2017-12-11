package Leetcode.Permutations;

import java.util.ArrayList;
import java.util.List;

public class attemp1 {
    public List<List<Integer>> permutation(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        helper(list,new ArrayList<Integer>(), nums, 0 );
        return list;
    }
    private void helper(List<List<Integer>> list, List<Integer> temp, int[] nums, int start){
        if (start >= nums.length){
            return;
        }
        if (temp.size() == nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }else{
            for (int i = start; i < nums.length; i++){
                temp.add(nums[start]);
                helper(list,new ArrayList<Integer>(temp),nums,start+1);
            }
        }


    }
}
