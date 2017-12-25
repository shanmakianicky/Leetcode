package Leetcode.WordBreak;

import java.util.List;

public class attempt3 {
    public boolean wordBreak(String s, List<String> wordDict){
        boolean[] result = new boolean[s.length()+1];
        result[0] = true;
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < i; j++){
                if (result[j] && wordDict.contains(s.substring(j,i))){
                    result[i] = true;
                    break;
                }
            }
        }
        return result[result.length - 1];
    }
}
