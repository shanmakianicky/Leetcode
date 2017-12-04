package Leetcode.ValidParentheses;

import java.util.Stack;

public class attempt2 {
    public boolean verify(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if (c == '('){
                stack.push(')');
            }else if(c == '['){
                stack.push(']');
            }else if (c == '{'){
                stack.push('}');
            }else if (stack.isEmpty() || c != stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
