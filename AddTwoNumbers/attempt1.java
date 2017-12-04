package Leetcode.AddTwoNumbers;

public class attempt1 {
    public static void main(String[] args) {

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode add(ListNode n1, ListNode n2){
        ListNode head = new ListNode(0);
        ListNode result = head;
        ListNode t1 = n1;
        ListNode t2 = n2;
        int carry = 0;
        while(t1 != null || t2 != null){
            int x = (t1==null)?0:t1.val;
            int y = (t2==null)?0:t2.val;
            if (carry != 0){
                result.val += 1;
            }
            if (x+y >= 10){
                result.val += x+y-10;
                carry = 1;
            }else{
                result.val += (x+y);
            }
            result.next = new ListNode(carry);
            result = result.next;
        }
        return head;
    }
}
