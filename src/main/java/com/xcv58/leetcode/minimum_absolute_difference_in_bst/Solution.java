package com.xcv58.leetcode.minimum_absolute_difference_in_bst;

import com.xcv58.leetcode.TreeNode;
import java.util.*;

public class Solution {

  public int getMinimumDifference(TreeNode root) {
    if (root == null) {
      // TODO: Handle invalid input
      return -1;
    }
    Stack<TreeNode> stack = new Stack<>();
    TreeNode tmp = root;
    while (tmp != null) {
      stack.push(tmp);
      tmp = tmp.left;
    }
    int res = Integer.MAX_VALUE;
    TreeNode pre = null;
    while (!stack.empty()) {
      TreeNode cur = stack.pop();
      tmp = cur.right;
      while (tmp != null) {
        stack.push(tmp);
        tmp = tmp.left;
      }
      if (pre != null) {
        res = Math.min(res, cur.val - pre.val);
      }
      pre = cur;
    }
    return res;
  }
}
