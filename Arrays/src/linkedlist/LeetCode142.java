package linkedlist;

public class LeetCode142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        boolean isLoopFound = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isLoopFound = true;
                break;
            }
        }
        if (isLoopFound) {
            ListNode current = head;
            while (current != slow) {
                current = current.next;
                slow = slow.next;
            }
            return current;
        }

        return null;
    }

}
