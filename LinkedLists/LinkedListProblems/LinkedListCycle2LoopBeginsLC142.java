package LinkedListProblems;

public class LinkedListCycle2LoopBeginsLC142 {
    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode result=null;

        ListNode slow=head;
        ListNode fast=head;
        boolean isLoopDetected=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                isLoopDetected=true;
                break;
            }
        }
        if (isLoopDetected) {
            ListNode newSlow = head;
            while (newSlow != slow) { // Find the cycle's entry point
                slow = slow.next;
                newSlow = newSlow.next;
            }
            result = newSlow; // Entry point of the cycle
        }

        return result;

    }
}
