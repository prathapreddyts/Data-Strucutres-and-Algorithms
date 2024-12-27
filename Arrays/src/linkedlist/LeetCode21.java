package linkedlist;

import java.util.ArrayList;
import java.util.Collection;

public class LeetCode21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return mergeTwoListWithoutExtraSpace(list1, list2);
    }

    public ListNode mergeTwoListWithoutExtraSpace(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode head = null, tail = null;
        if (list1.val < list2.val) {
            head = list1;
            tail = list1;
            list1 = list1.next;
        } else {
            head = list2;
            tail = list2;
            list2 = list2.next;
        }
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                tail = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                tail = list2;
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
        }

        return head;
    }

    public ListNode mergeTwoListsUsingExtraSpace (ListNode list1, ListNode list2){
            ArrayList<Integer> dataList = new ArrayList<>();
            while (list1 != null) {
                dataList.add(list1.val);
                list1 = list1.next;
            }
            while (list2 != null) {
                dataList.add(list2.val);
                list2 = list2.next;
            }
            dataList.sort((a, b) -> a - b);

            ListNode head = null;
            ListNode tail = null;
            for (int i = 0; i < dataList.size(); i++) {
                ListNode newNode = new ListNode(dataList.get(i));
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }
            return head;
        }
    }
