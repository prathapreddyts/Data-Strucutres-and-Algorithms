package com.trees.treeProperties;

import com.trees.TreeNode;

public class BalancedBinaryTreeLC110 {
    private boolean isBalancedTree=true;
    public boolean isBalanced(TreeNode root) {
        getHeightOfTree(root);
        return isBalancedTree;
    }
    public int getHeightOfTree(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftTreeHt=getHeightOfTree(root.left);
        int rightTreeHt=getHeightOfTree(root.right);
        if(Math.abs(leftTreeHt-rightTreeHt)>1){
            isBalancedTree=false;
        }
        return Math.max(leftTreeHt,rightTreeHt)+1;
    }

}
