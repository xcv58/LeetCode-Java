package com.xcv58.leetcode.longest_zigzag_path_in_a_binary_tree;

import com.xcv58.leetcode.TreeNode;

public class Solution {

  public int longestZigZag(TreeNode root) {
    int[] res = traversal(root);
    return Math.max(res[2] - 1, 0);
  }

  public int[] traversal(TreeNode root) {
    if (root == null) {
      return new int[3];
    }
    int[] left = traversal(root.left);
    int[] right = traversal(root.right);
    int max = Math.max(left[2], right[2]);
    max = Math.max(max, left[1] + 1);
    max = Math.max(max, right[0] + 1);
    return new int[] { left[1] + 1, right[0] + 1, max };
  }
}
