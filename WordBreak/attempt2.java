package Leetcode.WordBreak;

import java.util.Arrays;
import java.util.List;

public class attempt2 {
    public static void main(String[] args) {
        String s = new String("cars");
        System.out.println(wordBreak(s, Arrays.asList("car","ca","rs")));
    }
    public static boolean wordBreak(String s, List<String> wordDict){
        return helper(s,wordDict);
    }
    private static boolean helper(String target, List<String> wordDict){
        if (target.equals("")){
            return true;
        }
        for (int i = 0; i < wordDict.size(); i++){
            if (target.contains(wordDict.get(i))){
                if (helper(target.replace(wordDict.get(i),""),wordDict)){
                    return true;
                }
            }
        }
        return false;
    }
}
