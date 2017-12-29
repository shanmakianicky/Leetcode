package Leetcode.SortList;

public class attempt1 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode sortList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode headNode = head;
        ListNode pre = new ListNode(Integer.MIN_VALUE);
        pre.next = head;
        ListNode next = head.next;
        while(next != null){

        }
        return null;
    }
}
