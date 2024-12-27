package linkedlist;

import java.util.Stack;

public class LeetCode234 {
    public boolean isPalindrome(ListNode head) {
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
}
