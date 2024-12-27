package linkedlist;

public class LeetCode92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        for (int i = 1; i < left; i++) {
            previous = current;
            current = current.next;
        }
        ListNode newHead = null;
        ListNode newTail = current;
        for (int i = left; i <= right; i++) {
            ListNode next = current.next;
            current.next = newHead;
            newHead = current;
            current = next;
        }
        newTail.next = current;
        if (previous != null) {
            previous.next = newHead;
        } else {
            head = newHead;
        }

        return head;
    }

}
