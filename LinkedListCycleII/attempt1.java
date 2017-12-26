package Leetcode.LinkedListCycleII;

public class attempt1 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        ListNode start = head;
        ListNode signNode = null;
        int sign = 0;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                sign = 1;
                signNode = fast;
                break;
            }
        }
        if (sign == 0){
            return null;
        }
        while(signNode != start){
            signNode = signNode.next;
            start = start.next;
        }
        return signNode;

    }
}
