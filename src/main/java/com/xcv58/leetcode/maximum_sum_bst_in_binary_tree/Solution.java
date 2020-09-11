package com.xcv58.leetcode.maximum_sum_bst_in_binary_tree;

import com.xcv58.leetcode.TreeNode;

public class Solution {
  private int max = 0;

  public int maxSumBST(TreeNode root) {
    if (root == null) {
      return 0;
    }
    this.max = 0;
    this.traversal(root);
    return this.max;
  }

  private int[] traversal(TreeNode root) {
    if (root == null) {
      return null;
    }
    int[] left = traversal(root.left);
    int[] right = traversal(root.right);
    boolean isBST = isBST(root, left, right);
    if (isBST) {
      int sum =
        root.val +
        (left == null ? 0 : left[0]) +
        (right == null ? 0 : right[0]);
      this.max = Math.max(this.max, sum);
      return new int[] {
        sum,
        left == null ? root.val : left[1],
        right == null ? root.val : right[2],
      };
    }
    return new int[] { 0, Integer.MIN_VALUE, Integer.MAX_VALUE };
  }

  private boolean isBST(TreeNode root, int[] left, int[] right) {
    if (root == null) {
      return true;
    }
    if (left == null && right == null) {
      return true;
    }
    if (left != null && left[2] >= root.val) {
      return false;
    }
    if (right != null && right[1] <= root.val) {
      return false;
    }
    return true;
  }
}
