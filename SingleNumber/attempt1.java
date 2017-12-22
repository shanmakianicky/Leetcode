package Leetcode.SingleNumber;

import java.util.HashMap;
import java.util.Map;

public class attempt1 {
    public int number(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],2);
            }else {
                map.put(nums[i],1);
            }
        }
        for (int number : map.keySet()){
            if (map.get(number) == 1){
                return number;
            }
        }
        return 0;
    }
}
