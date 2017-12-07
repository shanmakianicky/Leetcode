package Leetcode.SearchInRotatedSortedArray;

public class attempt1 {
    public int search(int[] nums, int target){
        if (nums.length == 0){
            return -1;
        }
        if (target <= nums[nums.length-1]){
            for (int i = nums.length -1; i >= 0;i--){
                if (nums[i] == target){
                    return i;
                }
                if (i-1 >= 0 && nums[i] < nums[i-1]){
                    return -1;
                }
            }
        }else if (target >= nums[0]){
            for (int i = 0; i < nums.length; i++){
                if (nums[i] == target){
                    return i;
                }
                if (i+1 < nums.length && nums[i] > nums[i+1]){
                    return -1;
                }
            }
        }
        return -1;

    }
}
