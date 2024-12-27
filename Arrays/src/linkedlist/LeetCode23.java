package linkedlist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode23 {
    public ListNode mergeKLists(ListNode[] lists) {
      return  mergeKListsUsingPriortyQues(lists);
    }

    public ListNode mergeKListsUsingPriortyQues(ListNode[] lists) {
        ListNode head=null;
        ListNode tail=null;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(ListNode list:lists){
            while(list!=null){
                priorityQueue.add(list.val);
                list=list.next;
            }
        }
        while(!priorityQueue.isEmpty()){
            ListNode newNode = new ListNode(priorityQueue.poll());
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
        }

        return head;
    }

    public ListNode mergeKListsUsingExtraSpace(ListNode[] lists) {
        ListNode head=null;
        ListNode tail=null;

        ArrayList<Integer> dataList = new ArrayList<>();
        for(ListNode list:lists){
            while(list!=null){
                dataList.add(list.val);
                list=list.next;
            }
        }
        dataList.sort((a,b)->a-b);

        for(int i=0;i<dataList.size();i++){
            ListNode newNode = new ListNode(dataList.get(i));
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
        }

        return head;
    }
}
