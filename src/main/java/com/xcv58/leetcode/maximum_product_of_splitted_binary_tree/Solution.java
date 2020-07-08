package com.xcv58.leetcode.maximum_product_of_splitted_binary_tree;

import com.xcv58.leetcode.TreeNode;
import java.util.*;

public class Solution {
  private long max = 0L;
  private long MODULO = 1000 * 1000 * 1000 + 7;

  public int maxProduct(TreeNode root) {
    this.max = 0L;
    HashMap<TreeNode, Integer> map = new HashMap<>();
    int sum = this.sum(root, map);
    maxProduct(root, sum, map);
    return (int) (this.max % MODULO);
  }

  private void maxProduct(
    TreeNode root,
    int sum,
    HashMap<TreeNode, Integer> map
  ) {
    if (root == null) {
      return;
    }
    int part = map.get(root);
    this.max = Math.max(this.max, (long) part * (sum - part));
    this.maxProduct(root.left, sum, map);
    this.maxProduct(root.right, sum, map);
  }

  private int sum(TreeNode root, HashMap<TreeNode, Integer> map) {
    if (root == null) {
      return 0;
    }
    int res = root.val + sum(root.left, map) + sum(root.right, map);
    map.put(root, res);
    return res;
  }
}
