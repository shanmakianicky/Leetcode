package Leetcode.MaximalRectangle;

import java.util.Arrays;
import java.util.Stack;

public class attempt1 {
    public static int max(char[][] chars){
        if (chars == null || chars.length == 0 || chars[0].length == 0){
            return 0;
        }
        int[][] nums = new int[chars.length][chars[0].length];
        for (int i = 0 ; i < nums.length; i++){
            for (int j = 0; j < nums[0].length; j++){
                if (chars[i][j] == '0'){
                    nums[i][j] = 0;
                }else{
                    nums[i][j] = 1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            if (i != 0){
                for (int j = 0; j < nums[0].length; j++){
                    if (nums[i][j] != 0) {
                        nums[i][j] += nums[i - 1][j];
                    }
                }
            }
            max = Math.max(largest(nums[i]), max);
        }
        return max;
    }
    public static int largest(int[] nums){
        if (nums == null){
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int max = 0;
        while(i < nums.length){
            while(!stack.isEmpty() && nums[stack.peek()] >= nums[i]){
                int index = stack.pop();
                int height = nums[index];
                int width;
                width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area = width * height;
                max = Math.max(area, max);
            }
            stack.push(i++);
        }

        while(!stack.isEmpty()){
            int index = stack.pop();
            int height = nums[index];
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            int area = height * width;
            max = Math.max(area,max);
        }
        return max;
    }
}
