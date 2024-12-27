package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LeetCode25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        return reverseKGroupsWithoutExtraSpace(head, k);
    }

    public ListNode reverseKGroupsWithoutExtraSpace(ListNode head,int k){
        ListNode current=head;
        int count=0;
        while(current!=null && count!=k){
            current=current.next;
            count++;
        }
        int start=0;
        int end=k-1;
        while (count>k){
            reverseBetween(head,start,end);
            start+=k;
            end+=k;
            count-=k;
        }
        return head;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        for (int i = 1; i < left; i++) {
            previous = current;
            current = current.next;
        }
        ListNode newHead = null;
        ListNode newTail = current;
        for (int i = left; i <= right; i++) {
            ListNode next = current.next;
            current.next = newHead;
            newHead = current;
            current = next;
        }
        newTail.next = current;
        if (previous != null) {
            previous.next = newHead;
        } else {
            head = newHead;
        }

        return head;
    }

    public ListNode reverseKGroupUsingExtraSpace(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head; // No need to process for k <= 1 or null head
        }

        // Step 1: Extract all node values into a list
        List<Integer> nodeValueList = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            nodeValueList.add(current.val);
            current = current.next;
        }

        // Step 2: Reverse in groups of k
        int start = 0;
        int end = k - 1;
        while (end < nodeValueList.size()) {
            reverseListBetweenNode(nodeValueList, start, end);
            start += k;
            end += k;
        }

        // Step 3: Create a new linked list from the modified values
        ListNode newHead = new ListNode(nodeValueList.get(0));
        ListNode temp = newHead;
        for (int i = 1; i < nodeValueList.size(); i++) {
            temp.next = new ListNode(nodeValueList.get(i));
            temp = temp.next;
        }
        return newHead;
    }

    public static void reverseListBetweenNode(List<Integer> nodeValueList, int start, int end) {
        while (start < end) {
            int temp = nodeValueList.get(start);
            nodeValueList.set(start, nodeValueList.get(end));
            nodeValueList.set(end, temp);
            start++;
            end--;
        }
    }

}
