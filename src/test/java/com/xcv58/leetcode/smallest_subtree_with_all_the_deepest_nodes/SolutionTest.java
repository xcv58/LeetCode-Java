package com.xcv58.leetcode.smallest_subtree_with_all_the_deepest_nodes;

import static org.junit.Assert.*;

import com.xcv58.leetcode.TreeNode;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(0);
    assertEquals(root.left, solution.subtreeWithAllDeepest(root));
    root.right = new TreeNode(0);
    assertEquals(root, solution.subtreeWithAllDeepest(root));
    root.left.left = new TreeNode(0);
    assertEquals(root.left.left, solution.subtreeWithAllDeepest(root));
    root.left.right = new TreeNode(0);
    assertEquals(root.left, solution.subtreeWithAllDeepest(root));
  }
}
