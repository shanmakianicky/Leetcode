package Leetcode.RemoveDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,1,1,2,4,5,5,7};
        System.out.println(mostEfficient(nums));
    }

    public static int revision1(int[] nums){
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > nums[j]){
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }
    public static int removeDuplicates(int[] nums){
        int length = nums.length;
        for(int i = 0; i < length - 1; i++){
            if (nums[i] == nums[i + 1]){
                for (int j = i; j < length - 1; j++){
                    nums[j] = nums[j+1];
                }
                length--;
                i--;
            }
        }
        return length;
    }
    //这个人真tm聪明啊
    public static int mostEfficient(int[] nums){
        if(nums.length==0)
            return 0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[j])
                nums[++j]=nums[i];
        }
        return j+1;
    }

}
