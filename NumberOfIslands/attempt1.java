package Leetcode.NumberOfIslands;

import java.util.LinkedList;
import java.util.Queue;

public class attempt1 {
    public static void main(String[] args) {
        char[][] grid = new char[][]{{'1','1','1'},{'0','1','0'},{'1','1','1'}};
        System.out.println(dfs(grid));
    }
    public static int dfs(char[][] grid){
        int count = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == '1'){
                    count++;
                    dfsHelper(grid, i, j);
                }
            }
        }
        return count;
    }
    private static void dfsHelper(char[][] grid, int y, int x){
        if (y < 0 || x < 0 || x >= grid[0].length || y >= grid.length){
            return;
        }
        if (grid[y][x] == '1'){
            grid[y][x] = '0';
            dfsHelper(grid, y + 1, x);
            dfsHelper(grid, y - 1, x);
            dfsHelper(grid, y, x + 1);
            dfsHelper(grid, y, x - 1);
        }
    }
    public int bfs(char[][] grid){
        return 0;
    }

}
