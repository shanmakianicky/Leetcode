package Leetcode.ReverseLinkedList;

public class attempt {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        ListNode next;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    public ListNode reverse(ListNode head){
        if (head == null || head.next == null){
            return null;
        }
        return helper(null,head,head.next);
    }
    public ListNode helper(ListNode prev, ListNode cur, ListNode next){
        if (cur == null){
            return prev;
        }
        next = cur.next;
        cur.next = prev;
        prev = cur;
        cur = next;
        return helper(prev,cur,next);
    }
}
