package Leetcode.RotateImage;

public class attempt2 {
    public void rotate(int[][] nums){
        if (nums.length < 2){
            return;
        }
        for (int i = 0; i < nums.length/2; i++){
            int[] temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        for (int i = 0; i < nums.length; i++){
            for (int j = i; j < nums.length; j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
    }
}
