package Leetcode.LargestRecInHistogram;

import java.util.Stack;

public class attempt1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,1,5,6,2,3};
        System.out.println(largest(nums));
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
                int height;
                height = nums[index];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area = width * height;
                max = Math.max(area, max);
            }
            stack.push(i++);
        }

        while(!stack.isEmpty()){
            int index = stack.pop();
            int height = nums[index];
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            int area;
            area = height * width;
            max = Math.max(area,max);
        }
        return max;
    }
}
