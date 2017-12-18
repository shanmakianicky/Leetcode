package Leetcode.UniquePaths;

import java.util.ArrayList;
import java.util.List;

public class attempt1 {
    public static void main(String[] args) {
        System.out.println(paths(20, 18));
    }

    public static int paths(int m, int n) {
        int y = 0, x = 0;
        List<Integer> list = new ArrayList<>();
        helper(1, 1, m, n, list);
        return list.size();
    }

    private static void helper(int x, int y, int m, int n, List<Integer> list) {
        if (y == m && x == n) {
            list.add(1);
        } else if (y > m || x > n) {
            return;
        }
        helper(x + 1, y, m, n, list);
        helper(x, y + 1, m, n, list);
    }

    // dp
    public static int path(int m, int n) {
        int[][] nums = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    nums[i][j] = 1;
                } else {
                    nums[i][j] = nums[i - 1][j] + nums[i][j - 1];
                }
            }
        }
        return nums[m-1][n-1];
    }

}
