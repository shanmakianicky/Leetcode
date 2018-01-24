package Leetcode.FindTheDuplicateNumber;

public class attempt1 {
    public void fast(int[] nums){
        helper(nums,0,nums.length - 1);
    }
    private void helper(int[] nums, int left, int right){
        if (left >= right){
            return;
        }
        int leftIndex = left;
        int rightIndex = right;
        int pivot = nums[left];
        while (left < right){
            while(left < right && nums[right] > pivot){
                right--;
            }
            nums[left] = nums[right];

            while(left < right && nums[left] <= pivot){
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = pivot;
        helper(nums,leftIndex, left-1);
        helper(nums,left+1,rightIndex);
    }
    public int findDuplicate(int[] nums){
        if (nums == null || nums.length < 2){
            return 0;
        }
        fast(nums);
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i-1]){
                return nums[i];
            }
        }
        return 0;
    }

}
