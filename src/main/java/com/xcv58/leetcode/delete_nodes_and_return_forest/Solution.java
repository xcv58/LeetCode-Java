package com.xcv58.leetcode.delete_nodes_and_return_forest;

import com.xcv58.leetcode.TreeNode;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

  public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
    HashSet<Integer> set = Arrays
      .stream(to_delete)
      .boxed()
      .collect(Collectors.toCollection(HashSet::new));
    List<TreeNode> res = new ArrayList<>();
    return this.delNodes(root, set, null);
  }

  private List<TreeNode> delNodes(
    TreeNode root,
    HashSet<Integer> set,
    TreeNode parent
  ) {
    List<TreeNode> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    TreeNode current = root;
    if (set.contains(root.val)) {
      this.deleteChild(parent, root);
      current = null;
    } else {
      if (parent == null) {
        res.add(root);
      }
    }
    res.addAll(this.delNodes(root.left, set, current));
    res.addAll(this.delNodes(root.right, set, current));
    return res;
  }

  private void deleteChild(TreeNode parent, TreeNode child) {
    if (parent == null) {
      return;
    }
    if (parent.left == child) {
      parent.left = null;
    }
    if (parent.right == child) {
      parent.right = null;
    }
  }
}
