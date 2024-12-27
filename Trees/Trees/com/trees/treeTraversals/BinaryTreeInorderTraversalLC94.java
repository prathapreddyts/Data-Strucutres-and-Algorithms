package com.trees.treeTraversals;

import com.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversalLC94 {

    public void inOrderTraversal(TreeNode head) {
        if (head == null) {
            return;
        }
        inOrderTraversal(head.left);
        System.out.println(head.val);
        inOrderTraversal(head.left);
    }
    public List<Integer> iterativeInOrderTraversal(TreeNode head){
        ArrayList<Integer> inOrderList = new ArrayList<>();
        Stack<TreeNode> treeNodesStack = new Stack<>();
        TreeNode current=head;
        while(!treeNodesStack.isEmpty()||current!=null){
            while(current!=null){
                treeNodesStack.push(current);
                current=current.left;
            }
            current = treeNodesStack.pop();
            inOrderList.add(current.val);
            current=current.right;
        }
        return inOrderList;
    }

}
