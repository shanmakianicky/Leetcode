package Leetcode.TwoSum;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = {11, 15,2, 7};
        System.out.println(Arrays.toString(mostEfficient(a, 9)));
    }

    public static int[] repetition1(int[] nums, int target){
        HashMap<Integer,Integer> s = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++){
            if (s.containsKey(target - nums[i])){
                result[0] = s.get(target - nums[i]);
                result[1] = i;
                return result;
            }else{
                s.put(nums[i],i);
            }
        }
        return result;
    }

    public static int[] twoSum(int[] nums, int target) {
        // filter all elements which is larger than target
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }

        }
        return null;

    }
    public int[] two_Sum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }

    //看不懂这狗逼在写什么
    public static int[] mostEfficient(int[] nums, int target) {
        int[] map = new int[16027];
        for (int i = 0; i < nums.length; i++) {
            int diff=target-nums[i]+5;
            if (diff < 0) continue;
            if(map[diff]>0){
                return new int[] {map[diff]-1,i};
            }
            map[nums[i]+5]=i+1;
        }
        throw null;
    }
}
