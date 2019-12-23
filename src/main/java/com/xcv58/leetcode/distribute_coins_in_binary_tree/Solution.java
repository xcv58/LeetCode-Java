package com.xcv58.leetcode.distribute_coins_in_binary_tree;

import com.xcv58.leetcode.TreeNode;

public class Solution {

  public int distributeCoins(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int[] res = this.visit(root);
    return res[1];
  }

  private int[] visit(TreeNode root) {
    if (root == null) {
      return new int[] { 0, 0 };
    }
    int[] l = this.visit(root.left);
    int[] r = this.visit(root.right);
    int rest = l[0] + r[0] + root.val - 1;
    int steps = l[1] + r[1] + Math.abs(l[0]) + Math.abs(r[0]);
    return new int[] { rest, steps };
  }
}
