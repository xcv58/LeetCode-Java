package com.xcv58.leetcode.count_good_nodes_in_binary_tree;

import com.xcv58.leetcode.TreeNode;

public class Solution {

  public int goodNodes(TreeNode root) {
    return this.goodNodes(root, null);
  }

  private int goodNodes(TreeNode root, Integer max) {
    if (root == null) {
      return 0;
    }
    int res = 1;
    int tmp = root.val;
    if (max != null) {
      if (root.val < max) {
        res--;
      }
      tmp = Math.max(root.val, max);
    }
    return (
      res + this.goodNodes(root.left, tmp) + this.goodNodes(root.right, tmp)
    );
  }
}
