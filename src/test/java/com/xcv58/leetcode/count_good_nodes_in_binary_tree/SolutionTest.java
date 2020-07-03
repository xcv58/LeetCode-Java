package com.xcv58.leetcode.count_good_nodes_in_binary_tree;

import static org.junit.Assert.*;

import com.xcv58.leetcode.TreeNode;
import com.xcv58.leetcode.util.Tree;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(5);
    assertEquals(0, solution.goodNodes(null));
    assertEquals(1, solution.goodNodes(root));
    root.left = new TreeNode(1);
    assertEquals(1, solution.goodNodes(root));
    root.right = new TreeNode(6);
    assertEquals(2, solution.goodNodes(root));
    root.left.left = new TreeNode(5);
    assertEquals(3, solution.goodNodes(root));
    assertEquals(5, solution.goodNodes(Tree.getTree("3,1,4,3,null,1,5,9")));
    assertEquals(3, solution.goodNodes(Tree.getTree("3,3,null,4,2")));
  }
}
