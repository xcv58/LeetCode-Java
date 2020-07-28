package com.xcv58.leetcode.construct_binary_tree_from_inorder_and_postorder_traversal;

import com.xcv58.leetcode.TreeNode;
import java.util.*;

public class Solution {

  public TreeNode buildTree(int[] inorder, int[] postorder) {
    if (
      inorder == null ||
      postorder == null ||
      inorder.length == 0 ||
      postorder.length == 0 ||
      inorder.length != postorder.length
    ) {
      return null;
    }
    int len = inorder.length;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < len; i++) {
      map.put(inorder[i], i);
    }
    return this.buildTree(inorder, postorder, 0, len - 1, 0, len - 1, len, map);
  }

  private TreeNode buildTree(
    int[] inorder,
    int[] postorder,
    int i1,
    int i2,
    int p1,
    int p2,
    int len,
    HashMap<Integer, Integer> map
  ) {
    if (i1 > i2 || p1 > p2) {
      return null;
    }
    TreeNode root = new TreeNode(postorder[p2]);
    if (i1 == i2 || p1 == p2) {
      return root;
    }
    int x = map.get(postorder[p2]);
    root.left =
      buildTree(inorder, postorder, i1, x - 1, p1, p1 + x - i1 - 1, len, map);
    root.right =
      buildTree(inorder, postorder, x + 1, i2, p1 + x - i1, p2 - 1, len, map);
    return root;
  }
}
