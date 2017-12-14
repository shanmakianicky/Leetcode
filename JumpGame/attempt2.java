package Leetcode.JumpGame;

public class attempt2 {
    public static void main(String[] args) {
        System.out.println(bottomUp(new int[]{2, 0, 6, 9, 8, 4, 5, 0, 8, 9, 1, 2, 9, 6, 8, 8, 0, 6, 3, 1, 2, 2, 1, 2,
                6, 5, 3, 1, 2, 2, 6, 4, 2, 4, 3, 0, 0, 0, 3, 8, 2, 4, 0, 1, 2, 0, 1, 4, 6, 5, 8, 0, 7, 9, 3, 4, 6, 6,
                5, 8, 9, 3, 4, 3, 7, 0, 4, 9, 0, 9, 8, 4, 3, 0, 7, 7, 1, 9, 1, 9, 4, 9, 0, 1, 9, 5, 7, 7, 1, 5, 8, 2,
                8, 2, 6, 8, 2, 2, 7, 5, 1, 7, 9, 6}));
    }

    static int[] can;

    // backtracking
    public static boolean canJump(int[] nums) {
        can = new int[nums.length];
        for (int i = 0; i < can.length; i++) {
            can[i] = 2;
        }
        can[can.length - 1] = 0;
        int index = 0;
        return helper(nums, index);
    }

    private static boolean helper(int[] nums, int index) {
        if (index == nums.length - 1) {
            return true;
        }
        int next = Math.min(nums.length - 1, nums[index] + index);
        for (int i = index + 1; i <= next; i++) {
            if (helper(nums, i)) {
                return true;
            }
        }
        return false;
    }

    // dynamic programming, top-down approach.
    public static boolean topDown(int[] nums) {
        can = new int[nums.length];
        for (int i = 0; i < can.length; i++) {
            can[i] = 2;
        }
        can[can.length - 1] = 0;
        return topDownHelper(nums, 0);

    }

    private static boolean topDownHelper(int[] nums, int index) {
        if (can[index] == 0 || can[index] == 1) {
            return can[index] == 0 ? true : false;
        }
        int min = Math.min(nums.length - 1, index + nums[index]);
        for (int i = index; i <= min; i++) {
            if (helper(nums, i)) {
                can[index] = 0;
                break;
            }
            can[index] = 1;
        }
        return can[index] == 0 ? true : false;
    }

    // dynamic programming, improved top-down approach.
    public static boolean topDownImproved(int[] nums) {
        can = new int[nums.length];
        for (int i = 0; i < can.length; i++) {
            can[i] = 2;
        }
        can[can.length - 1] = 0;
        return topDownHelperImproved(nums, 0);

    }

    private static boolean topDownHelperImproved(int[] nums, int index) {
        if (can[index] == 0 || can[index] == 1) {
            return can[index] == 0 ? true : false;
        }
        int min = Math.min(nums.length - 1, index + nums[index]);
        for (int i = min; i >= 0; i--) {
            if (helper(nums, i)) {
                can[index] = 0;
                break;
            }
            can[index] = 1;
        }
        return can[index] == 0 ? true : false;
    }

    //dynamic programming, bottom-up approach.
    public static boolean bottomUp(int[] nums) {
        can = new int[nums.length];
        for (int i = 0; i < can.length; i++) {
            can[i] = 2;
        }
        can[can.length - 1] = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            int min = Math.min(nums.length - 1, i + nums[i]);
            for (int j = min; j > i; j--) {
                if (can[j] == 0) {
                    can[i] = 0;
                    break;
                }
                can[i] = 1;
            }

        }
        return can[0] == 0;
    }

    // greed
    public static boolean greed(int[] nums) {
        int last = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (last <= i + nums[i]){
                last = i;
            }
        }
        return last == 0;


    }


}
