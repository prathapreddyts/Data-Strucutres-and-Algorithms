package com.trees.treeProperties;

import com.trees.TreeNode;

import java.util.*;

public class MinimumDepthOfBinaryTreeLC111 {
    public int minDepth(TreeNode root) {
        // Base case
        if (root == null) {
            return 0;
        }
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
    public int minDepthBFS(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        int depth=1;
        while(!q.isEmpty()){
            int levelSize=q.size();
            for(int i=0;i<levelSize;i++){
                TreeNode curr= q.remove();
                if(curr.left==null&&curr.right==null){
                    return depth;
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            depth++;
        }
        return 0;

    }
}
