package linkedlist;

import java.util.HashMap;
import java.util.HashSet;

public class Leetcode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
    public ListNode getIntersectionNodeOptimised(ListNode headA, ListNode headB) {

        if(headA==null || headB==null){
            return null;
        }

        ListNode currentA=headA;
        ListNode currrentB=headB;
        HashSet<ListNode> set=new HashSet<>();
        while(currentA!=null){
            set.add(currentA);
            currentA=currentA.next;
        }
        while (currrentB!=null){
            if(set.contains(currrentB)){
                return currrentB;
            }
            currrentB=currrentB.next;
        }
        return null;
    }

}
