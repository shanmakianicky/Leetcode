package Leetcode.TwoSum;
import java.util.Arrays;
import java.util.HashMap;

public class attempt1 {
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length; i++){
            if (map.containsKey(nums[i])){
                int[] result = {map.get(nums[i]),i};
                return result;
            }
            map.put(target - nums[i],i);
        }
        return null;
    }
}
