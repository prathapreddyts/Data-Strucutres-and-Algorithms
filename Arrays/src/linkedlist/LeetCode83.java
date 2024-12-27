package linkedlist;

import java.util.LinkedHashSet;

public class LeetCode83 {
    public ListNode deleteDuplicates(ListNode head) {
        return optimisedWayRemoveDuplicate(head);
    }
    public ListNode optimisedWayRemoveDuplicate(ListNode current){
        ListNode temp=current;
        while (temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return current;
    }
    public ListNode removeDuplicatesUsingExtraSpace(ListNode current){
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        while (current!=null){
            hashSet.add(current.val);
            current=current.next;
        }
        ListNode result=null;
        for(Integer val:hashSet){
            if(result==null){
                result=new ListNode(val);
                current=result;
            }else{
                current.next=new ListNode(val);
                current=current.next;
            }
        }
        return result;
    }
}
