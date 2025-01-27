package com.trees.twotreevalidations;

import com.trees.TreeNode;

public class MirrorTreeGFG {
    void mirror(TreeNode node) {
        if(node==null){
            return;
        }
        mirror(node.left);
        mirror(node.right);
        TreeNode temp=node.left;
        node.left=node.right;
        node.right=temp;
    }
}
