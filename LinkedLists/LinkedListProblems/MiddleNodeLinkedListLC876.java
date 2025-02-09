package LinkedListProblems;

public class MiddleNodeLinkedListLC876 {
    public ListNode middleNode(ListNode head) {
        if(head==null){
            return null;
        }

        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
