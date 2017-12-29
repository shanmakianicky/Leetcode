package Leetcode.MinStack;

import java.util.ArrayList;
import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(512);
        stack.push(-1024);
        stack.push(-1024);
        stack.push(512);
        stack.pop();
        stack.pop();
        stack.pop();

        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        a1.add(222);
        a1.add(111);
        a2.add(222);
        a2.add(111);
        System.out.println(a1.get(0) == a2.get(0));
        System.out.println(a1.get(0).equals(a2.get(0)));
        System.out.println(a1.get(1) == a2.get(1));
        System.out.println(a1.get(1).equals(a2.get(1)));

    }
    public Stack<Integer> integerStack;
    public Stack<Integer> min;

    public MinStack() {
        integerStack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        if (integerStack.empty()){
            integerStack.push(x);
            min.push(x);
            return;
        }

        if (x <= min.peek()){
            min.push(x);
        }
        integerStack.push(x);
    }

    public void pop() {
        if (integerStack.empty()){
            return;
        }
        if (integerStack.peek() == min.peek()){
            min.pop();
        }
        integerStack.pop();

    }

    public int top() {
        return integerStack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
