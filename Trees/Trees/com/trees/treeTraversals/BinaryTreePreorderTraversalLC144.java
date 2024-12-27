package com.trees.treeTraversals;


import com.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversalLC144 {
    public void preOrderTraversal(TreeNode head) {
        if (head == null) {
            return;
        }
        System.out.println(head.val);
        preOrderTraversal(head.left);
        preOrderTraversal(head.right);
    }

    public List<Integer> iterativePreOrderTraversal(TreeNode head){
        ArrayList<Integer> preOrderList = new ArrayList<>();
        Stack<TreeNode> treeNodesStack = new Stack<>();
        TreeNode current=head;
        treeNodesStack.push(current);
        while(!treeNodesStack.isEmpty()){
            TreeNode node = treeNodesStack.pop();
            preOrderList.add(node.val);
           if(node.right!=null){
               treeNodesStack.push(node.right);
           }
            if(node.left!=null){
                treeNodesStack.push(node.left);
            }
        }
        return preOrderList;
    }
}
