package Leetcode.PerfectSquares;

import java.util.ArrayList;
import java.util.List;

public class attempt2 {
    public static void main(String[] args) {
        attempt2 a = new attempt2();
        System.out.println(a.numSquares(4));
    }
    public int numSquares(int n){
        if(n == 1){
            return 1;
        }
        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i <= n; i++){
            int min = Integer.MAX_VALUE;
            int number = 1;
            while(i - number*number >= 0){
                min = Math.min(min, nums[i-number*number]+1);
                number++;
            }
            nums[i] = min;
        }
        return nums[n];
    }

}
