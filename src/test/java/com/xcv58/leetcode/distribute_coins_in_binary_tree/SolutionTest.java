package com.xcv58.leetcode.distribute_coins_in_binary_tree;

import static org.junit.Assert.*;

import com.xcv58.leetcode.TreeNode;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(0);
    root.right = new TreeNode(0);
    assertEquals(2, solution.distributeCoins(root));
    root.val = 0;
    root.left.val = 3;
    assertEquals(3, solution.distributeCoins(root));
    root.val = 1;
    root.left.val = 2;
    assertEquals(2, solution.distributeCoins(root));
    root.left.right = new TreeNode(3);
    root.left.val = 0;
    assertEquals(4, solution.distributeCoins(root));
  }
}
