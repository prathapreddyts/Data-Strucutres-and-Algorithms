package linkedlist;

public class LeetCode1290 {
    public int getDecimalValue(ListNode head) {
        int binaryValue = 0;
        while (head != null) {
            binaryValue = 2 * binaryValue + head.val;
            head = head.next;
        }
        return binaryValue;

    }

    public int getDecimalValueUsingBuilder(ListNode head) {
        ListNode curr = head;
        StringBuilder num = new StringBuilder();
        while (curr != null) {
            num.append(curr.val);
            curr = curr.next;
        }
        return Integer.parseInt(num.toString(), 2);
    }

    public int getDecimalValueUsingArray(ListNode head) {
        int size = -1, sum = 0;
        for (ListNode temp = head; temp != null; temp = temp.next) {
            size++;
        }
        ListNode node = head;
        while (node != null) {
            sum += node.val * (Math.pow(2, size--));
            node = node.next;
        }
        return sum;
    }
}
