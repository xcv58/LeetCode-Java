package com.xcv58.leetcode.pseudo_palindromic_paths_in_a_binary_tree;

import com.xcv58.leetcode.TreeNode;

public class Solution {

  public int pseudoPalindromicPaths(TreeNode root) {
    return this.pseudoPalindromicPaths(root, 0);
  }

  private int pseudoPalindromicPaths(TreeNode root, int prefix) {
    if (root == null) {
      return 0;
    }
    int path = prefix ^ (1 << root.val);
    if (root.left == null && root.right == null) {
      if (path == 0 || ((path & (path - 1)) == 0)) {
        return 1;
      }
    }
    return (
      this.pseudoPalindromicPaths(root.left, path) +
      this.pseudoPalindromicPaths(root.right, path)
    );
  }
}
