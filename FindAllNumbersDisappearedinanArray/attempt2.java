package Leetcode.FindAllNumbersDisappearedinanArray;

import java.util.ArrayList;
import java.util.List;

public class attempt2 {
    public static void main(String[] args) {
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums).toString());
    }
    public static List<Integer> findDisappearedNumbers(int[] array){
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= array.length; i++){
            res.add(i, Integer.MIN_VALUE);
        }
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (res.get(array[i]) != array[i]){
                res.set(array[i],array[i]);
            }
        }
        for (int i = 1; i <= array.length; i++){
            if(res.get(i) != i){
                count++;
            }
        }
        int save = count;
        for (int i = 1; i <= array.length; i++){
            if (res.get(i) == Integer.MIN_VALUE){
                array[count] = i;
                count--;
            }
        }
        res.clear();
        for (int i = 1; i <= save; i++){
            res.add(array[i]);
        }
        return res;
    }
}
