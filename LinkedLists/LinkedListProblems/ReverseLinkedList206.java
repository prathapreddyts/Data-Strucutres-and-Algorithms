package LinkedListProblems;

public class ReverseLinkedList206 {
    public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode reverseHead=null;
        while (current!=null){
            ListNode nextNode=current.next;
            current.next=reverseHead;
            reverseHead=current;
            current=nextNode;
        }
        return reverseHead;
    }
}
