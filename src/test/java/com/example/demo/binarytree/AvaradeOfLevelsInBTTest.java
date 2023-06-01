package com.example.demo.binarytree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AvaradeOfLevelsInBTTest {

  AvaradeOfLevelsInBT avaradeOfLevelsInBT = new AvaradeOfLevelsInBT();
  @Test
  void averageOfLevels() {
    TreeNode left1 = new TreeNode(9);
    TreeNode right1 = new TreeNode(20, new TreeNode(7), new TreeNode(8));
    TreeNode root = new TreeNode(3, left1, right1);

    List<Double> avg = avaradeOfLevelsInBT.averageOfLevels(root);

    Double[] expected = new Double[] {3.0, 14.5, 7.5};

    Assertions.assertTrue(avg.equals(Arrays.asList(expected)));
  }

  @Test
  void averageOfLevelsNoElementsInLeftChildOfRoot() {
    TreeNode right1 = new TreeNode(20, new TreeNode(7), new TreeNode(8));
    TreeNode root = new TreeNode(3, null, right1);

    List<Double> avg = avaradeOfLevelsInBT.averageOfLevels(root);

    Double[] expected = new Double[] {3.0, 20.0, 7.5};

    Assertions.assertTrue(avg.equals(Arrays.asList(expected)));
  }
}