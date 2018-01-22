package Leetcode.SearchA2DMatrixII;

public class attempt1 {
    public boolean searchMatrix(int[][] matrix, int target){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int y = matrix.length - 1;
        int x = 0;
        while (x < matrix[0].length && y >= 0){
            if (matrix[y][x] == target){
                return true;
            }else if (matrix[y][x] < target){
                x++;
                continue;
            }else {
                y--;
                continue;
            }
        }
        return false;

    }
}
