package Leetcode.MergeTwoSortedList;

public class attempt1 {
    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }
    public ListNode merger(ListNode l1, ListNode l2){
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while(l1 != null || l2 != null){
            if (l1 != null && l2 != null){
                int a = l1.val;
                int b = l2.val;
                if (a > b){
                    temp.next = new ListNode(b);
                    l2 = l2.next;
                }else{
                    temp.next = new ListNode(a);
                    l1 = l1.next;
                }
            }else if (l2 == null){
                temp.next = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                temp.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            temp = temp.next;
        }
        return result.next;
    }
}
