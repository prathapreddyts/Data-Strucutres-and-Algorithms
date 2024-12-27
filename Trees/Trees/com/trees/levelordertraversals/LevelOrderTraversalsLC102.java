package com.trees.levelordertraversals;

import com.trees.TreeNode;

import java.util.*;

public class LevelOrderTraversalsLC102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> resultLevelOrder = new ArrayList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> innerLevel = new ArrayList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                innerLevel.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            resultLevelOrder.add(innerLevel);
        }

        return resultLevelOrder;
    }

}
