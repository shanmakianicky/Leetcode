package Leetcode.MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class attempt1 {
    public int major(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int max = nums[0];
        int maxTime = 0;
        for (int i:map.keySet()){
            if (map.get(i) > maxTime){
                maxTime = map.get(i);
                max = i;
            }
        }
        return max;
    }
}
