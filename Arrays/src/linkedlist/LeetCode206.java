package linkedlist;

public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        ListNode reverseHead=null;
        ListNode currentHead=head;
        while (currentHead!=null){
            ListNode temp=currentHead.next;
            currentHead.next=reverseHead;
            reverseHead=currentHead;
            currentHead=temp;
        }
        return  reverseHead;

    }
}
