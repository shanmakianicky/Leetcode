package Leetcode.Subsets;

import java.util.ArrayList;
import java.util.List;

public class attempt2 {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        return helper(result,new ArrayList<>(), 0 , nums);
    }
    private List<List<Integer>> helper(List<List<Integer>> result,
                                       List<Integer> list,
                                       int index,
                                       int[] nums){
        if (index >= nums.length){
            return result;
        }
        result.add(new ArrayList<>(list));
        for (int i = index; i < nums.length; i++){
            list.add(nums[i]);
            helper(result, list, i+1, nums);
            list.remove(list.size()-1);
        }
        return result;

    }
}
