package Leetcode.FindAllNumbersDisappearedinanArray;

import java.util.ArrayList;
import java.util.List;

public class attempt1 {
    public List<Integer> find(int[] array){
        List<Integer> res = new ArrayList<>();
        if (array == null || array.length == 0){
            return res;
        }
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (res.contains(i)){
                count++;
            }
            res.set(i,i);
        }
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.MIN_VALUE;
        }
        for (int i = 0; i < res.size();i++){
            if (res.contains(i)){
                array[i] = i;
            }
        }
        res.clear();
        for (int i = 0; i < array.length; i++){
            if (array[i] != i){
                res.add(i);
            }
        }
        return res;
    }
}
