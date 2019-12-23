package com.xcv58.leetcode.all_possible_full_binary_trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.xcv58.leetcode.TreeNode;

public class Solution {
  private HashMap<Integer, List<TreeNode>> map = new HashMap<>();

  public List<TreeNode> allPossibleFBT(int N) {
    if (N % 2 == 0) {
      return new ArrayList<>();
    }
    if (!this.map.containsKey(N)) {
      List<TreeNode> res = new ArrayList<>();
      if (N == 1) {
        res.add(new TreeNode(0));
      }
      for (int i = 1; i < N; i += 2) {
        int j = N - i - 1;
        List<TreeNode> left = this.allPossibleFBT(i);
        List<TreeNode> right = this.allPossibleFBT(j);
        for (TreeNode l: left) {
          for (TreeNode r: right) {
            TreeNode root = new TreeNode(0);
            root.left = l;
            root.right = r;
            res.add(root);
          }
        }
      }
      this.map.put(N, res);
    }
    return this.map.get(N);
  }
}
