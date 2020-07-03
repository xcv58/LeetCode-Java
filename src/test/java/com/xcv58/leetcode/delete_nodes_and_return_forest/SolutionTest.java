package com.xcv58.leetcode.delete_nodes_and_return_forest;

import static org.junit.Assert.*;

import com.xcv58.leetcode.util.Tree;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      1,
      solution
        .delNodes(Tree.getTree("1,2,3,null,null,null,4"), new int[] { 1, 2 })
        .size()
    );
    assertEquals(
      3,
      solution
        .delNodes(Tree.getTree("1,2,3,4,5,6,7"), new int[] { 3, 5 })
        .size()
    );
    assertEquals(
      4,
      solution
        .delNodes(Tree.getTree("1,2,3,4,5,6,7"), new int[] { 1, 2, 3 })
        .size()
    );
  }
}
