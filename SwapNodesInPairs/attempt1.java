package Leetcode.SwapNodesInPairs;

public class attempt1 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swap(ListNode head) {
        ListNode result = new ListNode(0);
        result.next = head;
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode left = head;
        ListNode right = head.next;
        ListNode next = right.next;

        while (right != null) {
            if (pre == null) {
                right.next = left;
                left.next = next;
                ListNode temp = right;
                right = left;
                left = temp;
                result = left;
            } else {
                right.next = left;
                left.next = next;
                ListNode temp = right;
                right = left;
            }
            pre = pre == null ? right : pre.next.next;
            if (next == null) {
                next=null;
                right = null;
            }else if(next != null && next.next == null){
                break;
            }else {
                next = next.next.next;
                right = right.next.next;
                left = left.next.next;

            }

        }
        return result;

    }
}
