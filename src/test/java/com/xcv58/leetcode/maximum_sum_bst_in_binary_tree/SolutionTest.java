package com.xcv58.leetcode.maximum_sum_bst_in_binary_tree;

import static org.junit.Assert.*;

import com.xcv58.leetcode.TreeNode;
import com.xcv58.leetcode.util.Tree;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.maxSumBST(null));
    assertEquals(1, solution.maxSumBST(Tree.getTree("1")));
    assertEquals(0, solution.maxSumBST(Tree.getTree("-1")));
    assertEquals(
      20,
      solution.maxSumBST(
        Tree.getTree("1,4,3,2,4,2,5,null,null,null,null,null,null,4,6")
      )
    );
    assertEquals(2, solution.maxSumBST(Tree.getTree("4,3,null,1,2")));
    assertEquals(6, solution.maxSumBST(Tree.getTree("2,1,3")));
    assertEquals(7, solution.maxSumBST(Tree.getTree("5,4,8,3,null,6,3")));
    assertEquals(7, solution.maxSumBST(Tree.getTree("-5,4,-8,3,null,6,3")));
    assertEquals(12, solution.maxSumBST(Tree.getTree("-5,4,-8,3,5,6,3")));
    assertEquals(6, solution.maxSumBST(Tree.getTree("-5,4,-8,3,-2,6,3")));
    assertEquals(99, solution.maxSumBST(Tree.getTree("-5,4,-8,3,-2,-10,99")));
    assertEquals(101, solution.maxSumBST(Tree.getTree("-5,4,12,3,-2,-10,99")));
  }
}
