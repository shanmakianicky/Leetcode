package Leetcode.PalindromeLinkedList;

public class attempt1 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        l1.next = l2;
        attempt1 a1 = new attempt1();
        System.out.println(a1.isPalindrome(l1));
    }
    public boolean isPalindrome(ListNode head){
        if (head == null || head.next == null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        ListNode rightHead = reverse(slow);
        while (rightHead != null && !head.equals(slow)){
            if (rightHead.val != head.val){
                return false;
            }
            rightHead = rightHead.next;
            head = head.next;
        }

        return true;
    }
    public ListNode reverse(ListNode head){
        if (head == null){
            return null;
        }
        return helper(null, head, head);
    }

    private ListNode helper(ListNode pre, ListNode cur, ListNode next){
        if (cur == null){
            return pre;
        }
        next = cur.next;
        cur.next = pre;
        pre = cur;
        cur = next;
        return helper(pre, cur, next);
    }



}
