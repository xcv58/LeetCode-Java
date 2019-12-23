package com.xcv58.leetcode.sum_of_root_to_leaf_binary_numbers;

import static org.junit.Assert.*;

import com.xcv58.leetcode.TreeNode;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(0);
    assertEquals(0, solution.sumRootToLeaf(root));
    root = new TreeNode(1);
    assertEquals(1, solution.sumRootToLeaf(root));
    root = new TreeNode(1);
    root.left = new TreeNode(1);
    assertEquals(3, solution.sumRootToLeaf(root));
    root.right = new TreeNode(0);
    assertEquals(5, solution.sumRootToLeaf(root));
    root.right.right = new TreeNode(0);
    assertEquals(7, solution.sumRootToLeaf(root));
  }
}
