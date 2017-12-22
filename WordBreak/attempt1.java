package Leetcode.WordBreak;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class attempt1 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < wordDict.size(); i++){
            if (wordDict.get(i).equals(s)){
                return true;
            }
            if (s.contains(wordDict.get(i))){
                String string = new String(wordDict.get(i));
                while(string.length() <= s.length()){
                    if(string.equals(s)){
                        return true;
                    }else{
                        string += string;
                    }
                }
                if (map.containsKey(new String(s).replace(wordDict.get(i),""))){
                    return true;
                }else {
                    map.put(wordDict.get(i), i);
                }
            }
        }
        return false;
    }
}
