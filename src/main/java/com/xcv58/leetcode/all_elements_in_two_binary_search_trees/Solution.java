package com.xcv58.leetcode.all_elements_in_two_binary_search_trees;

import com.xcv58.leetcode.TreeNode;
import java.util.*;

public class Solution {

  public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
    List<Integer> res = new ArrayList<>();
    Stack<TreeNode> s1 = new Stack<>();
    Stack<TreeNode> s2 = new Stack<>();
    this.push(root1, s1);
    this.push(root2, s2);
    while (!s1.isEmpty() && !s2.isEmpty()) {
      root1 = s1.peek();
      root2 = s2.peek();
      if (root1.val > root2.val) {
        res.add(root2.val);
        this.push(s2.pop().right, s2);
      } else {
        res.add(root1.val);
        this.push(s1.pop().right, s1);
      }
    }
    this.add(res, s1);
    this.add(res, s2);
    return res;
  }

  private void add(List<Integer> list, Stack<TreeNode> stack) {
    while (!stack.isEmpty()) {
      TreeNode tmpNode = stack.pop();
      list.add(tmpNode.val);
      this.push(tmpNode.right, stack);
    }
  }

  private void push(TreeNode root, Stack<TreeNode> stack) {
    while (root != null) {
      stack.push(root);
      root = root.left;
    }
  }
}
