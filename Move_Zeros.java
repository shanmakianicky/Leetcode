package Leetcode;

import java.util.Arrays;

public class Move_Zeros {
    //1 0 0 2 0
    public static void main(String[] args) {
        int[] a = {1,0,2,3,0,0,4,0,5};
        moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
    public static int[] move(int[] array){
        int l = array.length;
        int count = 0;
        for (int i = 0; i < l - count; i++){
            if (array[i] == 0){
                count++;
                for (int j = i+1; j < l; j++){
                    array[j-1] = array[j];
                }
                array[l-count] = 0;
                //向左移位后再检查一遍移位之后的array[i](也就是原来的i+1)是不是0，
                // 否则会漏掉这种情况.
                i--;
            }
        }
        return array;
    }
    //Sample
    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) nums[insertPos++] = num;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
