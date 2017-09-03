package Leetcode;
import java.util.Arrays;

public class Two_Sum_II {
    public static void main(String[] args) {
        int[] nums = {2,3,4};
        System.out.println(Arrays.toString(sum(nums,6)));
    }
    public static int[] sum(int[] nums, int target){
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    result[0] = nums[i];
                    result[1] = nums[j];
                }
            }
        }
        return result;
    }
    // Sample
    public int[] twoSum(int[] num, int target) {
        int[] indice = new int[2];
        if (num == null || num.length < 2) return indice;
        int left = 0, right = num.length - 1;
        while (left < right) {
            int v = num[left] + num[right];
            if (v == target) {
                indice[0] = left + 1;
                indice[1] = right + 1;
                break;
            } else if (v > target) {
                right --;
            } else {
                left ++;
            }
        }
        return indice;
    }
}
