package com.xcv58.leetcode.sum_of_root_to_leaf_binary_numbers;

import com.xcv58.leetcode.TreeNode;

class Solution {
  public int sumRootToLeaf(TreeNode root) {
    return this.sumRootToLeaf(root, 0);
  }

  private int sumRootToLeaf(TreeNode root, int prefix) {
    if (root == null) {
      return 0;
    }
    int current = prefix * 2 + root.val;
    if (root.left == null && root.right == null) {
      return current;
    }
    return this.sumRootToLeaf(root.left, current) + this.sumRootToLeaf(root.right, current);
  }
}
