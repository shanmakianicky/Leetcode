package Leetcode.Candy;

public class attempt1 {
    public int candy(int[] nums){
        if (nums == null || nums.length == 0){
            return 0;
        }
        int[] res = new int[]{nums.length};
        int result = 0;
        int i = 1;
        int mid = 0;
        int right = 0;
        while (i < nums.length){
            int up = 1;
            int down = 1;
            int top = 1;
            //爬坡
            while(i < nums.length && nums[i] > nums[i - 1]){
                result += up;
                up++;
            }
            mid = i - 1;
            while (i < nums.length && nums[i] < nums[i - 1]){
                i++;
            }
            right = i;
            for (int k = right - 1; k > mid; k--){
                result += down;
                down++;
            }
            result += Math.max(++down,++up);
        }
        return result;
    }
}
