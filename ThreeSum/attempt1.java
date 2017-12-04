package Leetcode.ThreeSum;

import java.util.*;

public class attempt1 {
    public List<List<Integer>> sum(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Set<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length;j++){
                if (map.containsKey(- nums[i] - nums[j])){
                    Set<Integer> aResult = new HashSet<>();
                    aResult.add(nums[i]);
                    aResult.add(nums[j]);
                    aResult.add(nums[map.get(-nums[i]-nums[j])]);
                    if (!(result.contains(aResult))){
                        result.add(aResult);
                    }
                }else{
                    map.put(nums[i],i);
                }
            }
        }
        List<List<Integer>> realResult = new ArrayList<>();
        for (Set s:result){
            realResult.add(new ArrayList<Integer>(s));
        }

        return realResult;
    }
}
