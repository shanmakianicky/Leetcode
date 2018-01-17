package Leetcode.ReverseLinkedList;

public class attempt2 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode reverseList(ListNode head){
        if (head == null){
            return head;
        }
        return helper(null,head,head);
    }
    private ListNode helper(ListNode pre, ListNode cur, ListNode next){
        if (cur == null){
            return pre;
        }
        next = cur.next;
        cur.next = pre;
        pre = cur;
        cur = next;
        if (next != null) {
            next = next.next;
        }
        return helper(pre, cur, next);
    }
}
