package com.trees.levelordertraversals;

import com.trees.TreeNode;

import java.util.*;

public class VerticalOrderTraversalLC987 {

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<NodePair> nodeQueue = new LinkedList<>();
        Map<Integer, List<NodePair>> verticalMap = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        nodeQueue.add(new NodePair(0, 0, root));

        while (!nodeQueue.isEmpty()) {
            NodePair currentNodePair = nodeQueue.remove();
            min = Math.min(min, currentNodePair.column);
            max = Math.max(max, currentNodePair.column);

            List<NodePair> tempList = verticalMap.getOrDefault(currentNodePair.column, new ArrayList<>());
            tempList.add(currentNodePair);
            verticalMap.put(currentNodePair.column, tempList);

            if (currentNodePair.node.left != null) {
                nodeQueue.add(
                        new NodePair(currentNodePair.row + 1, currentNodePair.column - 1, currentNodePair.node.left));
            }
            if (currentNodePair.node.right != null) {
                nodeQueue.add(
                        new NodePair(currentNodePair.row + 1, currentNodePair.column + 1, currentNodePair.node.right));
            }
        }
        for (int i = min; i <= max; i++) {
            List<Integer> verticalValues = new ArrayList<>();
            List<NodePair> nodePairs = verticalMap.get(i);
            Collections.sort(nodePairs, (x, y) -> {
                if (x.row == y.row)
                    return x.node.val - y.node.val;
                return x.row - y.row;
            });
            for (int j = 0; j < nodePairs.size(); j++) {
                verticalValues.add(nodePairs.get(j).node.val);
            }
            result.add(verticalValues);
        }
        return result;
    }
}

class NodePair {
    int row;
    int column;
    TreeNode node;

    NodePair(int r, int c, TreeNode n) {
        row = r;
        column = c;
        node = n;
    }
}