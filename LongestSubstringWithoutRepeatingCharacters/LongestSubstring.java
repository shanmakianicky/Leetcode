package Leetcode.LongestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {

    }
    public static int sub(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        int j = 0;
        int max = 0;
        for (int i = 0; i < s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}
