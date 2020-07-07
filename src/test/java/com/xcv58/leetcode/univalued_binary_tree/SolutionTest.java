package com.xcv58.leetcode.univalued_binary_tree;

import static org.junit.Assert.*;

import com.xcv58.leetcode.util.Tree;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(true, solution.isUnivalTree(Tree.getTree("1,1,1,1,1,1")));
    assertEquals(false, solution.isUnivalTree(Tree.getTree("1,1,1,1,1,2")));
    assertEquals(true, solution.isUnivalTree(Tree.getTree("1,1,1,1,1,null,1")));
  }
}
