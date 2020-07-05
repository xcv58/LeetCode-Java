package com.xcv58.leetcode.recover_a_tree_from_preorder_traversal;

import com.xcv58.leetcode.TreeNode;

public class Solution {

  public TreeNode recoverFromPreorder(String S) {
    if (S.length() == 0) {
      return null;
    }
    String num = "";
    int i = 0;
    for (; i < S.length(); i++) {
      char c = S.charAt(i);
      if (isNumber(c)) {
        num += c;
      } else {
        break;
      }
    }
    TreeNode root = new TreeNode(Integer.parseInt(num));
    int rightTreeIndex = this.findRightIndex(S, i);
    if (i + 1 < S.length()) {
      String left = S.substring(i + 1, rightTreeIndex);
      root.left = this.recoverFromPreorder(reduceHeight(left));
    }
    if (rightTreeIndex < S.length()) {
      String right = S.substring(rightTreeIndex + 1);
      root.right = this.recoverFromPreorder(reduceHeight(right));
    }
    return root;
  }

  private boolean isNumber(char c) {
    return c >= '0' && c <= '9';
  }

  private int findRightIndex(String S, int leftIndex) {
    int i = leftIndex + 1;
    int height = 0;
    for (; i < S.length(); i++) {
      if (S.charAt(i) == '-') {
        height++;
      } else {
        if (height == 1) {
          return i - 1;
        }
        height = 0;
      }
    }
    return i;
  }

  private String reduceHeight(String S) {
    String res = "";
    boolean removed = false;
    for (int i = 0; i < S.length(); i++) {
      char c = S.charAt(i);
      if (c != '-') {
        removed = false;
      } else {
        if (!removed) {
          removed = true;
          continue;
        }
      }
      res += c;
    }
    return res;
  }
}
