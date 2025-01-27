package com.trees.treeProperties;

import com.trees.TreeNode;

public class CountCompleteTreeNodesLC222 {
    private int count=0;
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        return count+countNodes(root.left)+countNodes(root.right);
    }
}
