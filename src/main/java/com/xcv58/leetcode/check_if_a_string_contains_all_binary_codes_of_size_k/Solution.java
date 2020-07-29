package com.xcv58.leetcode.check_if_a_string_contains_all_binary_codes_of_size_k;

import java.util.*;

public class Solution {

  class TreeNode {
    TreeNode[] children = new TreeNode[2];
  }

  public boolean hasAllCodes(String s, int k) {
    List<String> allCodes = getCodes(k);
    TreeNode root = getTree(s, k);
    for (String code : allCodes) {
      if (!contains(root, code)) {
        return false;
      }
    }
    return true;
  }

  private boolean contains(TreeNode root, String s) {
    for (char c : s.toCharArray()) {
      int index = c - '0';
      if (root.children[index] == null) {
        return false;
      }
      root = root.children[index];
    }
    return true;
  }

  private TreeNode getTree(String s, int k) {
    TreeNode root = new TreeNode();
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      TreeNode node = root;
      for (int j = i; j < chars.length && j < i + k; j++) {
        int index = chars[j] - '0';
        if (node.children[index] == null) {
          node.children[index] = new TreeNode();
        }
        node = node.children[index];
      }
    }
    return root;
  }

  private List<String> getCodes(int k) {
    List<String> res = new ArrayList<>();
    if (k == 0) {
      res.add("");
      return res;
    }
    for (String s : getCodes(k - 1)) {
      res.add('0' + s);
      res.add('1' + s);
    }
    return res;
  }
}
