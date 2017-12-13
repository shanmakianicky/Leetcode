package Leetcode.JumpGame;

public class attempt1 {
    public static void main(String[] args) {
        System.out.println(greed(new int[]{2,0,6,9,8,4,5,0,8,9,1,2,9,6,8,8,0,6,3,1,2,2,1,2,6,5,3,1,2,2,6,4,2,4,3,0,0,0,3,8,2,4,0,1,2,0,1,4,6,5,8,0,7,9,3,4,6,6,5,8,9,3,4,3,7,0,4,9,0,9,8,4,3,0,7,7,1,9,1,9,4,9,0,1,9,5,7,7,1,5,8,2,8,2,6,8,2,2,7,5,1,7,9,6}));
    }
    //backtrack，不能通过测试
    public static boolean jump(int[] nums){
        return canJunp(0,nums);
    }
    public static boolean canJunp(int index, int[] nums){
        if (index == nums.length - 1){
            return true;
        }
        int min = Math.min(index+nums[index],nums.length - 1);
        for (int i = min; i > index; i--){
            if (canJunp(i,nums)){
                return true;
            }
        }
        return false;

    }

    //top-down dynamic programming, StackOverFlow.
    static int[] can;
    public static boolean can(int[] nums){
        can = new int[nums.length];
        for (int i = 0; i < can.length; i++){
            can[i] = 3;
        }
        can[nums.length - 1] = 0;
        return helper(0,nums);
    }
    public static boolean helper(int index, int[] nums){
        if (can[index] == 0 || can[index] == 1){
            return can[index]==1?false:true;
        }
        int min = Math.min(index+nums[index], nums.length - 1);
        for (int i = index + 1; i <= min; i++){
            if (helper(i,nums) == true){
                can[i] = 0;
                return true;
            }
        }
        can[index] = 1;
        return false;
    }

    // bottom-up dp, n^2
    public static boolean bottomUp(int[] nums){
        can = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            can[i] = 3;
        }
        can[nums.length - 1] = 0;
        for (int j = nums.length - 2; j>= 0 ;j--){
            int min = Math.min(j+nums[j], nums.length - 1);
            for (int i = j; i <= min; i++){
                if (can[i] == 0){
                    can[j] = 0;
                    break;
                }
            }
            can[j] = 1;
        }
        return can[0] == 0;
    }
    // greed
    public static boolean greed(int[] nums){
        int lastIndex = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--){
            if (nums[i]+i>=lastIndex){
                lastIndex = i;
            }
        }
        return lastIndex == 0;
    }

}
