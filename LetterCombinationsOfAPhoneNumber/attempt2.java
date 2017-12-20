package Leetcode.LetterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class attempt2 {
    public char[][] letters = new char[][]{
            {},
            {},
            {'a','b','c'},
            {'d','e','f'},
            {'g','h','i'},
            {'j','k','l'},
            {'m','n','o'},
            {'p','q','r','s'},
            {'t','u','v'},
            {'w','x','y','z'}
    };
    public List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<>();
        if (digits==null || digits.length() == 0){
            return result;
        }
        int[] indexes = new int[digits.length()];
        for (int i = 0; i < indexes.length; i++){
            indexes[i] = Integer.parseInt(digits.substring(i,i+1));
        }
        helper(result,indexes,0,new StringBuilder());
        return result;
    }

    private void helper(List<String> result, int[] indexes, int index, StringBuilder sb){
        if (sb.length() == indexes.length){
            result.add(new StringBuilder(sb).toString());
        }
        if (index >= indexes.length){
            return;
        }
        for (int i = 0; i < letters[indexes[index]].length;i++){
            sb.append(letters[indexes[index]][i]);
            helper(result,indexes,index + 1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
