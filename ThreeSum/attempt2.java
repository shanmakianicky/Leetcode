package Leetcode.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class attempt2 {
    public List<List<Integer>> sum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) { //精髓
                int low = i + 1, high = nums.length - 1;
                int sum = -nums[i];
                while (low < high) {
                    if (nums[low] + nums[high] == sum) {
                        ArrayList<Integer> aresult = new ArrayList<>();
                        aresult.add(nums[i]);
                        aresult.add(nums[low]);
                        aresult.add(nums[high]);
                        result.add(aresult);
                        while (nums[low] == nums[low + 1]) {
                            low++;
                        }
                        while (nums[high] == nums[high - 1]) {
                            high--;
                        }
                        low++;
                        high--;
                    } else if (nums[low] + nums[high] < sum) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
        return result;
    }
}
