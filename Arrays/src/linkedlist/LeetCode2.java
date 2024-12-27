package linkedlist;

public class LeetCode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode list1 = new ListNode(-1);
        ListNode list = list1;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;

            list.next = new ListNode(sum % 10);
            carry = sum / 10;
            list = list.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            list.next = new ListNode(carry);
        }

        return list1.next;
    }
}
