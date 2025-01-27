package com.trees.treeProperties;

import com.trees.TreeNode;

public class DiameterBinaryTreeLC543 {
    private int diaMeter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameterOfBinaryTreeHelpler(root,diaMeter);
        return diaMeter;

    }
    public int diameterOfBinaryTreeHelpler(TreeNode root,int max){
        if(root==null){
            return 0;
        }
        int leftTreeHeight=diameterOfBinaryTreeHelpler(root.left,max);
        int rightTreeHeight=diameterOfBinaryTreeHelpler(root.right,max);
        max=Math.max(max,leftTreeHeight+rightTreeHeight);

        return 1+Math.max(leftTreeHeight,rightTreeHeight);

    }

}
