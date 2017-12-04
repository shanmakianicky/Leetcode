package Leetcode.GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

public class attempt1 {
    public List<String> generate(int n){
        return backtracking(new ArrayList<String>(),n,n,n,"");
    }
    public List<String> backtracking(List<String> list, int low, int high, int n, String s){
        if (s.length() == 2*n){
            list.add(s);
        }
        if (low < n){
            backtracking(list,low-1,high,n,s);
        }
        if (high < low){
            backtracking(list,low,high-1,n,s);
        }
        return list;
    }
}
