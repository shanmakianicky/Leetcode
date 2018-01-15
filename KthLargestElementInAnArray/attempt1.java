package Leetcode.KthLargestElementInAnArray;
public class attempt1 {
    public static void main(String[] args) {
        attempt1 a = new attempt1();
        int[] nums = new int[]{5,2,4,1,3,6,0};
        System.out.println(a.findKthLargest(nums,2));
    }
    public int findKthLargest(int[] nums, int k){
        quick(nums);
        return nums[nums.length - k];
    }
    private int[] quick(int[] nums){
        return helper(nums,0,nums.length-1);
    }
    private int[] helper(int[] nums, int left, int right){
        if (left >= nums.length || right < 0 || left > right){
            return nums;
        }
        if (left == right){
            if (nums[left] > nums[right]){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
            }
        }
        int pivot = nums[(left+right)/2];
        int leftIndex = left;
        int rightIndex = right;
        while (left < right) {
            while (right > left && nums[right] > pivot){
                right--;
            }
            nums[left] = nums[right];
            while (left < right && nums[left] <= pivot) {
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = pivot;
        helper(nums,leftIndex,left-1);
        helper(nums,right+1,rightIndex);
        return nums;
    }
}
