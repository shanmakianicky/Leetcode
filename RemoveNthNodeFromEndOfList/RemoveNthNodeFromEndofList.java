package Leetcode.RemoveNthNodeFromEndOfList;

public class RemoveNthNodeFromEndofList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }}

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode sec = new ListNode(2);
        head.next = sec;
        System.out.println(remove(head,1).toString());
    }
    public static ListNode remove(ListNode head, int n){
        // 这是为了防止要被删除的节点是第一个节点。
        ListNode node = new ListNode(0);
        ListNode fast = node;
        ListNode slow = node;
        node.next = head;
        for (int i = 0; i <= n; i++){
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return node.next;
    }
}
