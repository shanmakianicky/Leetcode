package Leetcode.GroupAnagrams;

import java.util.*;

public class attempt1 {
    public static void main(String[] args) {
        System.out.println(group(new String[]{"eat","tea","tan","ate","nat","bat"}).toString());
    }

    public static List<List<String>> group(String[] strings) {
        List<List<String>> result = new ArrayList<>();
        if (strings == null || strings.length == 0){
            return result;
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strings) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (map.containsKey(key)){
                map.get(key).add(s);
            }else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key,list);
            }
        }
        result.addAll(map.values());
        return result;
    }


}
