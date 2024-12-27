package com.trees.levelordertraversals;

import com.trees.TreeNode;

import java.util.*;

public class LevelOrderTraversalsLC107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        TreeNode current = root;
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> resultLevelOrder = new ArrayList<>();

        queue.add(current);
        while (!queue.isEmpty()) {
            List<Integer> innerLevel = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                innerLevel.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                } else if (node.right != null) {
                    queue.add(node.right);
                }
            }
            resultLevelOrder.add(0, innerLevel);
        }
        return resultLevelOrder;

    }
}
