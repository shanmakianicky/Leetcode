package Leetcode.ValidParentheses;

public class attempt1 {
    public static void main(String[] args) {
        System.out.println(verify("){"));
    }
    public static boolean verify(String s){
        String[] string = s.split("");
        if (string.length % 2 != 0){
            return false;
        }
        for (int i = 0; i < (string.length/2); i++){
            if (correspond(string[i])==null){
                return false;
            }
            if (correspond(string[i]).equals(string[string.length-1-i])){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
    public static String correspond(String s){
        if (s.equals("{")){
            return "}";
        }else if(s.equals("[")){
            return "]";
        }else if (s.equals("(")){
            return ")";
        }
        return null;
    }
}
