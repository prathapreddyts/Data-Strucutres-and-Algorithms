package LinkedListProblems;

public class Add1ToLinkedListGFG {
    public ListNode addOne(ListNode head) {
        ListNode head2 = new ListNode(1);
        return addTwoNumbers(head,head2);
        // code here.
    }
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode newHead = null;
        ListNode newTail=null;

        int carry = 0;
        while (head1 != null && head2 != null) {
            int sum = head1.val + head2.val + carry;
            carry = sum / 10;
            if (newHead == null) {
                newHead = new ListNode(sum % 10);
                newTail=newHead;

            } else {
                newTail.next = new ListNode(sum % 10);
                newTail = newTail.next;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        while (head1 != null) {
            int sum = 0;
            sum = sum + head1.val + carry;
            carry = sum / 10;
            newTail.next = new ListNode(sum % 10);
            newTail = newTail.next;
            head1=head1.next;
        }
        while (head2 != null) {
            int sum = 0;
            sum = sum + head2.val + carry;
            carry = sum / 10;
            newTail.next = new ListNode(sum % 10);
            newTail = newTail.next;
            head2=head2.next;
        }
        if (carry != 0) {
            newTail.next = new ListNode(carry);
            newTail = newTail.next;
        }
        return newHead;
    }
}
