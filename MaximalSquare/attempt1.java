package Leetcode.MaximalSquare;

import java.util.Stack;

public class attempt1 {
    public static void main(String[] args) {
        char[][] matrix = new char[][]{{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        //int[][] matrix = new int[][]{{1,0,1,0,0},{2,0,2,1,1},{3,1,3,2,2},{4,0,0,3,0}};

        attempt1 a = new attempt1();
        /*for (int i = 0; i < 4; i++) {
            System.out.println(a.helper(matrix[i]));
        }*/

       System.out.println(a.maximalSquare(matrix));
    }
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i != 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] != '0') {
                        matrix[i][j] += matrix[i-1][j] - '0';
                    }
                }
            }
            max = Math.max(max, helper(matrix[i]));
        }
        return max;
    }

    private int helper(char[] nums) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int i = 0;
        for (; i < nums.length; i++) {
            while (!stack.empty() && nums[stack.peek()] >= (nums[i])) {
                int index = stack.pop();
                int width = stack.empty() ? i : (i - stack.peek() - 1);
                int height = nums[index] - '0';
                width = width > height ? height : width;
                height = height > width ? width : height;
                int area = width * height;
                max = Math.max(area, max);
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            int index = stack.pop();
            int width = stack.empty() ? i : (i - stack.peek() - 1);
            int height = nums[index] - '0';
            width = width > height ? height : width;
            height = height > width ? width : height;
            int area = width * height;
            max = Math.max(area, max);
        }
        return max;
    }
}
