package LinkedListProblems;

public class LinkedListCycle141 {
    public boolean hasCycle(ListNode head) {
        boolean isCyclePresent=false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                isCyclePresent=true;
                break;
            }
        }
        return isCyclePresent;

    }
}
