package Leetcode.SearchForARange;

public class attempt2 {
    public static void main(String[] args) {
    }
    public int[] search(int[] nums, int target){
        int[] fail = new int[]{-1,-1};
        if (nums == null || nums.length == 0){
            return fail;
        }
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left) / 2;
        while(left < right && mid != left && mid != right){
            mid = left + (right - left) / 2;
            if (nums[mid] == target){
                left = mid; right = mid;
                while(left > 0 && nums[left - 1] == target){
                    left--;
                }
                while(right < nums.length - 1 && nums[right + 1] == target){
                    right++;
                }
                int[] result = new int[]{left,right};
            }else if (nums[mid] < target){
                left = mid;
            }else{
                right = mid;
            }
        }
        return fail;
    }
}
