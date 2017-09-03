package Leetcode.RemoveElement;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.print(removeElement(nums,3));
        System.out.print(Arrays.toString(nums));
    }
    public static int removeElement(int[] nums, int val){
        ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                count.add(i);
            }
        }
        int countSize = count.size();
        for (int j = nums.length - 1; j>=0;j--){
            if (count.size() == 0){
                break;
            }
            if (!(count.contains(j))){
                nums[count.remove(0)] = nums[j];
            }
        }
        return nums.length - countSize;
    }
}
