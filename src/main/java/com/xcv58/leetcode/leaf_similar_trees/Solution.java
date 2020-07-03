package com.xcv58.leetcode.leaf_similar_trees;

import com.xcv58.leetcode.TreeNode;
import java.util.*;

public class Solution {

  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    List<Integer> seq1 = this.getLeafSeq(root1);
    List<Integer> seq2 = this.getLeafSeq(root2);
    if (seq1.size() == seq2.size()) {
      for (int i = 0; i < seq1.size(); i++) {
        if (seq1.get(i) != seq2.get(i)) {
          return false;
        }
      }
      return true;
    } else {
      return false;
    }
  }

  private List<Integer> getLeafSeq(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    if (root.left == null && root.right == null) {
      res.add(root.val);
      return res;
    }
    res.addAll(this.getLeafSeq(root.left));
    res.addAll(this.getLeafSeq(root.right));
    return res;
  }
}
