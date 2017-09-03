package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by SJB on 7/8/17.
 */
// how to print array:
// https://stackoverflow.com/questions/409784/whats-the-simplest-way-to-print-a-java-array
// bad runtime
public class Reshape_The_Matrix {
    public static void main(String[] args) {
        int[][] nums = {{1,2},{3,4}};
        int r = 2;
        int c = 4;
        System.out.println(Arrays.deepToString(reshape(nums,r,c)));
    }
    public static int[][] reshape(int[][] matrix, int r, int c){
        int[][] reshaped = new int[r][c];
        int row = matrix.length;
        int column = matrix[0].length;
        if (r * c != row * column){
            return matrix;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                temp.add(matrix[i][j]);
            }
        }
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                if (temp.size()==0){
                    return reshaped;
                }
                reshaped[i][j] = temp.get(0);
                temp.remove(0);
            }
        }
        return reshaped;

    }
}
