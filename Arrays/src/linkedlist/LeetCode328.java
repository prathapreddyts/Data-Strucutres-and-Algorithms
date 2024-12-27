package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LeetCode328 {


    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode oddHead = head;
        ListNode evenHead = head.next;
        List<Integer> oddNumberList = oddNumbers(oddHead);
        List<Integer> evenNumberList = evenNumbers(evenHead);

        ListNode result = null;
        ListNode tail = null;
        for (Integer num : oddNumberList) {
            if (result == null) {
                result = new ListNode(num);
                tail = result;
            } else {
                tail.next = new ListNode(num);
                tail = tail.next;
            }
        }
        for (Integer num : evenNumberList) {
            if (result == null) {
                result = new ListNode(num);
                tail = result;
            } else {
                tail.next = new ListNode(num);
                tail = tail.next;
            }
        }

        return result;
    }

    public List<Integer> oddNumbers(ListNode current) {
        ArrayList<Integer> oddNumList = new ArrayList<>();
        while (current != null) {
            oddNumList.add(current.val);
            current = (current.next != null) ? current.next.next : null; // Advance by two
        }
        return oddNumList;
    }

    public List<Integer> evenNumbers(ListNode current) {
        ArrayList<Integer> evenNumList = new ArrayList<>();
        while (current != null) {
            evenNumList.add(current.val);
            current = (current.next != null) ? current.next.next : null; // Advance by two
        }
        return evenNumList;
    }
    public ListNode oddEvenListOptimised(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }


}
