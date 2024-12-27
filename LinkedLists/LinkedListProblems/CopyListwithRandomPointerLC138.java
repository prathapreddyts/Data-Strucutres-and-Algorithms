package LinkedListProblems;
import java.util.*;

public class CopyListwithRandomPointerLC138 {

    /*
    * Need to optimise further 
    * */

    public Node copyRandomListUsingHashMap(Node head) {
        if(head == null){
            return null;
        }

        Map<Node, Node> map = new HashMap<>();

        Node curr = head;
        while(curr!=null){
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while(curr!=null){
            Node coppiedNode = map.get(curr);
            coppiedNode.next = map.get(curr.next);
            coppiedNode.random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }

}
