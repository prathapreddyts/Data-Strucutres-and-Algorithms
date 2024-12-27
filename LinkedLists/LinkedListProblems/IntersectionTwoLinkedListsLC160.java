package LinkedListProblems;

import java.util.HashSet;

/*
 * Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
 * If the two linked lists have no intersection at all, return null.*/
public class IntersectionTwoLinkedListsLC160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        return getIntersectionUsingSet(headA, headB);
    }

    public ListNode getIntersectionUsingSet(ListNode headA, ListNode headB) {

        HashSet<ListNode> listNodesSet = new HashSet<>();

        if (headA == null || headB == null) {
            return null;
        }

        while (headA != null) {
            listNodesSet.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (!listNodesSet.isEmpty() && listNodesSet.contains(headB)) {
                return headB;
            } else {
                headB = headB.next;
            }
        }
        return null;
    }

    public ListNode getIntersectionUsingRareTortise(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null; // If either list is null, there can't be an intersection
        }

        ListNode currentA = headA;
        ListNode tailNodeA = null;

        // Traverse to the end of list A to get its tail
        while (currentA.next != null) {
            currentA = currentA.next;
        }
        tailNodeA = currentA;
        tailNodeA.next = headB;

        ListNode slow = headA;
        ListNode fast = headA;
        boolean isLoopFound = false;

        // Detect loop using Floyd's Cycle Detection Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isLoopFound = true;
                break; // Exit the loop once the cycle is detected
            }
        }

        ListNode intersectionNode = null;
        if (isLoopFound) {
            ListNode newSlow = headA;
            while (slow != newSlow) {
                slow = slow.next;
                newSlow = newSlow.next;
            }
            intersectionNode = newSlow; // Intersection point
        }
        tailNodeA.next = null;

        return intersectionNode;
    }


}
