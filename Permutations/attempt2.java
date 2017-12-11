package Leetcode.Permutations;

import java.util.ArrayList;
import java.util.List;

public class attempt2 {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        helper(list,new ArrayList<Integer>(), nums, 0 );
        return list;
    }
    private void helper(List<List<Integer>> result, List<Integer> list, int[] nums, int index){
        if (list.size() == nums.length){
            result.add(new ArrayList<>(list));
        }
        for (int i = index; i < nums.length; i++){
            list.add(nums[i]);
            helper(result,list,nums,i+1);
            list.remove(list.size()-1);
        }

    }
}
