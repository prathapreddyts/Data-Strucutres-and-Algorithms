package com.trees.treeProperties;

import com.trees.TreeNode;

import java.util.*;

public class CheckCompletenessBinaryTreeLC958 {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean seenNull = false;

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr == null) {
                seenNull = true;
            } else {
                if (seenNull) return false;
                q.offer(curr.left);
                q.offer(curr.right);
            }
        }

        return true;
    }
}
