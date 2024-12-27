package LinkedListProblems;

import java.util.*;

public class ReverseNodesInKGroupLC25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        ListNode currentNode = head;
        ListNode newHead = null;
        ListNode kGrpNode = head;
        ListNode newTail = null;

        int len = getLengthOflinkedList(head);  // Using head instead of currentNode

        while (len >= k) {
            ListNode revHead = null;
            ListNode oldHead = kGrpNode;
            int i = 0;

            while (i < k) {
                ListNode nextNode = kGrpNode.next;
                kGrpNode.next = revHead;
                revHead = kGrpNode;
                kGrpNode = nextNode;
                i++;
            }

            if (newHead == null) {
                newHead = revHead;
            } else {
                newTail.next = revHead;
            }

            newTail = oldHead;
            len -= k;
        }

        if (newTail != null) {
            newTail.next = kGrpNode;
        }

        return newHead != null ? newHead : head;
    }
    public int getLengthOflinkedList(ListNode currentNode){
        int len=0;
        while(currentNode!=null){
            len++;
            currentNode=currentNode.next;
        }
        return len;
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
