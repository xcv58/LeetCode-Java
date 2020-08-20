package com.xcv58.leetcode.number_of_good_leaf_nodes_pairs;

import com.xcv58.leetcode.TreeNode;

public class Solution {

  public int countPairs(TreeNode root, int distance) {
    if (root == null) {
      return 0;
    }
    int[] res = new int[1];
    traversal(root, distance, res);
    return res[0];
  }

  private int[] traversal(TreeNode root, int distance, int[] cache) {
    if (root == null) {
      return new int[] {};
    }
    if (root.left == null && root.right == null) {
      return new int[] { 1 };
    }
    int[] left = traversal(root.left, distance, cache);
    int[] right = traversal(root.right, distance, cache);
    for (int i = 0; i < left.length; i++) {
      for (int j = 0; j < right.length; j++) {
        if (i + j + 2 <= distance) {
          cache[0] += left[i] * right[j];
        }
      }
    }
    int length = Math.max(left.length, right.length) + 1;
    int[] res = new int[length];
    for (int i = 0; i < left.length; i++) {
      res[i + 1] += left[i];
    }
    for (int i = 0; i < right.length; i++) {
      res[i + 1] += right[i];
    }
    return res;
  }
}
