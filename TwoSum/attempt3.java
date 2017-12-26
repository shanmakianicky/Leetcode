package Leetcode.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class attempt3 {
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target - nums[i])){
                return new int[]{nums[i],map.get(i)};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
