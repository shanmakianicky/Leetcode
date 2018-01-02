package Leetcode.HouseRobber;

public class attempt1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,1,1,2};
        System.out.println(dp(nums));
    }
    public static int rob(int[] nums) {
        return Math.max(helper(nums,0,0),helper(nums,1,0));
    }
    private static int helper(int[] nums, int index, int sum){
        if (index >= nums.length){
            return sum;
        }
        sum += nums[index];
        int sum1 = helper(nums,index+2,sum);
        sum -= nums[index];
        int sum2 = helper(nums,index+1,sum);
        sum = Math.max(sum1,sum2);
        return sum;
    }
   public static int dp(int[] nums){
        if (nums == null){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        int[][] dp = new int[nums.length][2];
        dp[nums.length - 1][1] = nums[nums.length - 1];
        dp[nums.length - 1][0] = 0;
        for (int i = nums.length - 2; i >= 0; i--){
            dp[i][0] = Math.max(dp[i + 1][0],dp[i+1][1]);
            dp[i][1] = dp[i+1][0] + nums[i];
        }
        return Math.max(dp[0][0],dp[0][1]);
   }

}
