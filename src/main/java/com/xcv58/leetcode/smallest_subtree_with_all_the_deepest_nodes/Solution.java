package com.xcv58.leetcode.smallest_subtree_with_all_the_deepest_nodes;

import com.xcv58.leetcode.TreeNode;

public class Solution {

  private int height(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return 1 + Math.max(this.height(root.left), this.height(root.right));
  }

  public TreeNode subtreeWithAllDeepest(TreeNode root) {
    if (root == null) {
      return null;
    }
    int left = this.height(root.left);
    int right = this.height(root.right);
    if (left == right) {
      return root;
    }
    return this.subtreeWithAllDeepest(left > right ? root.left : root.right);
  }
}
