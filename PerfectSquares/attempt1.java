package Leetcode.PerfectSquares;

import java.util.ArrayList;
import java.util.List;

public class attempt1 {
    public static void main(String[] args) {
        attempt1 a = new attempt1();
        System.out.println(a.numSquares(137));
    }
    public int numSquares(int n){
        List<Integer> list = new ArrayList<>();
        int i = 1;
        while (i * i <= n){
            list.add(i * i);
            i++;
        }
        List<List<Integer>> result = new ArrayList<>();
        kSum(result, new ArrayList<>(), list, 0, n);
        int size = Integer.MAX_VALUE;
        for (int j = 0; j < result.size(); j++){
            size = ((result.get(j).size() < size) ? result.get(j).size() : size);
        }
        return size;
    }
    private void kSum(List<List<Integer>> result,
                      List<Integer> list,
                      List<Integer> array,
                      int index,
                      int target){
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        if (sum > target){
            return;
        }
        if (sum == target){
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < array.size(); i++){
            list.add(array.get(i));
            kSum(result, list, array, i, target);
            list.remove(list.get(list.size() - 1));
        }
    }

}
