package com.xcv58.leetcode.minimum_absolute_difference_in_bst;

import static org.junit.Assert.*;

import com.xcv58.leetcode.TreeNode;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(50);
    root.left = new TreeNode(25);
    assertEquals(-1, solution.getMinimumDifference(null));
    assertEquals(25, solution.getMinimumDifference(root));
    root.right = new TreeNode(70);
    assertEquals(20, solution.getMinimumDifference(root));
    root.left.left = new TreeNode(20);
    root.left.right = new TreeNode(28);
    assertEquals(3, solution.getMinimumDifference(root));
    root.right.left = new TreeNode(51);
    assertEquals(1, solution.getMinimumDifference(root));
  }
}
