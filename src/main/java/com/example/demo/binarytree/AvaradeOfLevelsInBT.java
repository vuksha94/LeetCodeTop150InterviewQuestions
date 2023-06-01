package com.example.demo.binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AvaradeOfLevelsInBT {
  public List<Double> averageOfLevels(TreeNode root) {
    if (root == null) return Collections.emptyList();
    List<Double> result = new ArrayList<>();

    Queue<TreeNode> currLevelNodes = new LinkedList<>();
    currLevelNodes.add(root);
    while (!currLevelNodes.isEmpty()) {
      // double avg = currLevelNodes.stream().mapToDouble(n -> n.val).average().getAsDouble();
      double row = 0;
      // number of top level elements
      int size = currLevelNodes.size();
      for (int i=0; i<size; i++) {
        TreeNode node = currLevelNodes.poll();
        if (node.left != null) {
          currLevelNodes.add(node.left);
        }
        if (node.right != null) {
          currLevelNodes.add(node.right);
        }
        row += node.val;
      }

      result.add(row / size);
    }

    return result;
  }

}
