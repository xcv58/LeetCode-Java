package com.xcv58.leetcode.univalued_binary_tree;

import com.xcv58.leetcode.TreeNode;

public class Solution {

  public boolean isUnivalTree(TreeNode root) {
    return this.isUnivalTree(root, null);
  }

  private boolean isUnivalTree(TreeNode root, Integer target) {
    if (root == null) {
      return true;
    }
    if (target != null && root.val != target) {
      return false;
    }
    return (
      this.isUnivalTree(root.left, root.val) &&
      this.isUnivalTree(root.right, root.val)
    );
  }
}
