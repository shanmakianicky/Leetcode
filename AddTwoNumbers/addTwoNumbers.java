package Leetcode.AddTwoNumbers;

import java.util.LinkedList;

public class addTwoNumbers {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode add(ListNode a, ListNode b){
        ListNode c = new ListNode(0);

        if (a.next == null){
            if (a.val + b.val >= 10) {
                c.val = a.val + b.val - 10;
                c.next = new ListNode(1);
                return c.next;
            }
            return c;
        }

        if (a.val + b.val >= 10){
            c.val = a.val + b.val - 10;
            a.next.val+=1;
        }else{
            c.val = a.val + b.val;
        }
        return c.next = add(a.next,b.next);



    }
}
