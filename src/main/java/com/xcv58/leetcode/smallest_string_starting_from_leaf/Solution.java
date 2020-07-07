package com.xcv58.leetcode.smallest_string_starting_from_leaf;

import com.xcv58.leetcode.TreeNode;
import java.util.*;

public class Solution {

  public String smallestFromLeaf(TreeNode root) {
    List<String> paths = this.getPaths(root);
    if (paths.size() <= 0) {
      return "";
    }
    String res = paths.get(0);
    for (String path : paths) {
      if (isLargerThan(res, path)) {
        res = path;
      }
    }
    return res;
  }

  private List<String> getPaths(TreeNode root) {
    List<String> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    char c = (char) (root.val + 'a');
    for (String path : getPaths(root.left)) {
      res.add(path + c);
    }
    for (String path : getPaths(root.right)) {
      res.add(path + c);
    }
    if (res.size() == 0) {
      res.add(String.valueOf(c));
    }
    return res;
  }

  private boolean isLargerThan(String s1, String s2) {
    for (int i = 0; i < s1.length() && i < s2.length(); i++) {
      char c1 = s1.charAt(i);
      char c2 = s2.charAt(i);
      if (c1 == c2) {
        continue;
      }
      if (c1 > c2) {
        return true;
      }
      return false;
    }
    return s1.length() > s2.length();
  }
}
