package com.xcv58.leetcode.flip_equivalent_binary_trees;

import com.xcv58.leetcode.TreeNode;

public class Solution {

  public boolean flipEquiv(TreeNode root1, TreeNode root2) {
    if (root1 == null && root2 == null) {
      return true;
    }
    if (root1 == null || root2 == null) {
      return false;
    }
    if (root1.val != root2.val) {
      return false;
    }
    return (
      (
        this.flipEquiv(root1.left, root2.left) &&
        this.flipEquiv(root1.right, root2.right)
      ) ||
      (
        this.flipEquiv(root1.right, root2.left) &&
        this.flipEquiv(root1.left, root2.right)
      )
    );
  }
}
