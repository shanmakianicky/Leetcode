package Leetcode.RotateImage;

public class attempt1 {
    public void rotate(int[][] nums){

    }
    public void helper(int[][] nums, int startX, int endX, int startY, int endY){
        if (endX - startX < 2){
            return;
        }else if (endX - startX == 2){
            int temp0 = nums[startX][startY];
            int temp1 = nums[startX][endY];
            int temp2 = nums[endX][startY];
            int temp3 = nums[endX][endY];
            nums[startX][startY] = temp2;
            nums[startX][endY] = temp0;
            nums[endX][endY] = temp1;
            nums[endX][startY] = temp3;
            return;

        }
        if (nums.length % 2 == 0){

        }else{

        }
    }
}
