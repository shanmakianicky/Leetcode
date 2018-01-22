package Leetcode.SearchA2DMatrix;

public class attempt1 {
    public boolean searchMatrix(int[][] matrix, int target){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int top = -1;
        int down = -1;
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][0] > target){
                top = i - 1;
                down = i;
                break;
            }
        }
        top = (top < 0) ? matrix.length - 1 : top;
        for (int j = 0; j < matrix[0].length; j++){
            if (matrix[top][j] == target){
                return true;
            }
        }
        return false;
    }
}
