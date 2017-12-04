package Leetcode.AddTwoNumbers;

public class attempt2 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode add(ListNode n1, ListNode n2){
        ListNode a1 = new ListNode(0);
        a1.next = n1;
        ListNode a2 = new ListNode(0);
        a2.next = n2;
        ListNode result = new ListNode(0);
        ListNode res = result;
        int carry  = 0;
        while(n1 != null || n2 != null){
            int x = (n1!=null)?n1.val:0;
            int y = (n2!=null)?n2.val:0;
            if (x+y+carry >= 10){
                result.next = new ListNode(x+y+carry-10);
                carry = 1;
            }else {
                result.next = new ListNode(x+y+carry);
                carry = 0;
            }

            if (n1 != null){n1 = n1.next;}
            if (n2 != null){n2 = n2.next;}
            result = result.next;
        }
        if(carry != 0){
            result.next = new ListNode(carry);
        }
        return res.next;
    }
}
