package linkedlist;

public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;

        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null) return head.next;
        while(fast!=null){
            prev=slow;
            fast=fast.next;
            slow=slow.next;
        }
        prev.next=slow.next;
        return head;
    }

    public ListNode removeNthFromEndDummyHead(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }

}
