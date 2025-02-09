package com.trees.levelordertraversals;

import com.trees.TreeNode;

import java.util.*;

public class SerializeandDeserializeBinaryTree {
    public String serialize(TreeNode root) {

        if (root == null)
            return "";

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        StringBuilder sb = new StringBuilder();

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node == null) {
                sb.append("#").append(" ");
                continue;
            }

            sb.append(node.val).append(" ");
            q.add(node.left);
            q.add(node.right);
        }

        return sb.toString().trim();
    }

    public TreeNode deserialize(String data) {
        if (data.equals(""))
            return null;

        String[] nodes = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int len = nodes.length;
        for (int i = 1; i < len; i++) {
            TreeNode parent = q.poll();

            if (!nodes[i].equals("#")) {
                TreeNode leftNode = new TreeNode(Integer.parseInt(nodes[i]));
                parent.left = leftNode;
                q.add(leftNode);
            }

            if (!nodes[++i].equals("#")) {
                TreeNode rightNode = new TreeNode(Integer.parseInt(nodes[i]));
                parent.right = rightNode;
                q.add(rightNode);
            }
        }

        return root;
    }
}

