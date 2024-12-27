package LinkedListProblems;

public class LengthOfLoopGFG {
    public int countNodesinLoop(ListNode head) {
        int loopLength = 0;

        ListNode fast = head;
        ListNode slow = head;
        boolean isLoopFound = false;
        ListNode meetNode = null;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isLoopFound = true;
                meetNode = slow;
                break;
            }
        }
        if (isLoopFound) {
            loopLength = 1; // Start counting from the first node
            while (meetNode != slow.next) {
                loopLength++;
                slow = slow.next;
            }
        }


        return loopLength;
    }
}
