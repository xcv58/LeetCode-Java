package com.xcv58.leetcode.binary_tree_cameras;

import static org.junit.Assert.*;

import com.xcv58.leetcode.TreeNode;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(0);
    assertEquals(0, solution.minCameraCover(null));
    assertEquals(1, solution.minCameraCover(root.left));
    assertEquals(1, solution.minCameraCover(root));

    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(0);
    assertEquals(1, solution.minCameraCover(root));
    assertEquals(1, solution.minCameraCover(root.left));
    assertEquals(0, solution.minCameraCover(root.right));

    root.left.left = null;
    root.left.right = new TreeNode(0);
    root.left.right.right = new TreeNode(0);
    assertEquals(2, solution.minCameraCover(root));
    root.right = new TreeNode(0);
    root.right.left = new TreeNode(0);
    assertEquals(2, solution.minCameraCover(root));
  }
}
