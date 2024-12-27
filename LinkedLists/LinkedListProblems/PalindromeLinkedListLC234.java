package LinkedListProblems;

import java.util.Stack;

public class PalindromeLinkedListLC234 {

    public boolean isPalindromeUsingStack(ListNode head) {
        ListNode current=head;
        Stack<Integer> revStack = new Stack<>();
        while (current!=null){
            revStack.push(current.val);
            current=current.next;
        }
        while (head!=null){
            if(head.val!=revStack.pop()){
                return false;
            }
            head=head.next;
        }
        return true;

    }
    public boolean isPalindromeUsingMidPoint(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slowHead = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slowHead = slowHead.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = reverseList(slowHead);
        ListNode firstHalf = head;
        ListNode secondHalfCopy = secondHalf; // To restore the list later if needed
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        reverseList(secondHalfCopy);
        return true;
    }

    //  Method to reverse a list
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode reverseHead = null;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = reverseHead;
            reverseHead = current;
            current = nextNode;
        }
        return reverseHead;
    }

}
