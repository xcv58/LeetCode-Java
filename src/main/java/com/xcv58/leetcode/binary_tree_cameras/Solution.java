package com.xcv58.leetcode.binary_tree_cameras;

import java.util.HashMap;

import com.xcv58.leetcode.TreeNode;

public class Solution {
  private HashMap<String, Integer> map = new HashMap<>();
  public int minCameraCover(TreeNode root) {
    this.map = new HashMap<>();
    return this.min(root, false, false);
  }

  protected int min(TreeNode root, boolean needParentCover, boolean isCovered) {
    if (root == null) {
      if (needParentCover) {
        return 1;
      }
      return 0;
    }
    String key = root.hashCode() + "-" + needParentCover + isCovered;
    if (map.containsKey(key)) {
      return map.get(key);
    }

    if (isCovered) {
      int res = Math.min(this.min(root.left, false, false) + this.min(root.right, false, false),
          1 + this.min(root.left, false, true) + this.min(root.right, false, true));
      map.put(key, res);
      return res;
    } else {
      int take = 1 + this.min(root.left, false, true) + this.min(root.right, false, true);
      if (needParentCover) {
        map.put(key, take);
        return take;
      }
      int left = this.min(root.left, true, false) + this.min(root.right, false, false);
      int right = this.min(root.left, false, false) + this.min(root.right, true, false);
      int res = Math.min(Math.min(left, right), take);
      map.put(key, res);
      return res;
    }
  }
}
