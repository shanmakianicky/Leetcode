package Leetcode.RemoveElement;

public class attempt2 {
    public static void main(String[] args) {

    }
    public static int remove(int[] nums, int val){
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i]!= val){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
