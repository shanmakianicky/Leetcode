package Leetcode.RemoveDuplicatesFromSortedArray;

public class Attempt1 {
    public static void main(String[] args) {

    }
    public static int remove(int[] nums){
        if(nums.length==0)
            return 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != nums[j]){
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }
}
