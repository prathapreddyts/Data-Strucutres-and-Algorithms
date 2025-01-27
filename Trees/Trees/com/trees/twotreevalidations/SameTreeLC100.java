package com.trees.twotreevalidations;

import com.trees.TreeNode;

import java.util.LinkedList;

public class SameTreeLC100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSameTreeLevelOrderTraversal(p, q);

    }

    public boolean isSameTreeLevelOrderTraversal(TreeNode p, TreeNode q) {
        LinkedList<TreeNode> queue1 = new LinkedList<>();
        LinkedList<TreeNode> queue2 = new LinkedList<>();

        if (p != null) {
            queue1.add(p);
        }
        if (q != null) {
            queue2.add(q);
        }

        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            // Compare sizes of the queues
            if (queue1.size() != queue2.size()) {
                return false;
            }

            TreeNode pNode = queue1.poll();
            TreeNode qNode = queue2.poll();

            if (pNode == null && qNode == null) {
                continue; // Both null, move to the next nodes
            }
            if (pNode == null || qNode == null || pNode.val != qNode.val) {
                return false; // One null or values do not match
            }

            // Add children to the queues
            queue1.add(pNode.left);
            queue2.add(qNode.left);

            queue1.add(pNode.right);
            queue2.add(qNode.right);
        }

        // Ensure both queues are empty (trees are fully traversed and matched)
        return queue1.isEmpty() && queue2.isEmpty();
    }

}
