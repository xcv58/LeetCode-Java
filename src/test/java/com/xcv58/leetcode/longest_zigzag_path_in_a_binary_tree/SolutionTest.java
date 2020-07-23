package com.xcv58.leetcode.longest_zigzag_path_in_a_binary_tree;

import static org.junit.Assert.*;

import com.xcv58.leetcode.util.Tree;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.longestZigZag(null));
    assertEquals(
      3,
      solution.longestZigZag(
        Tree.getTree(
          "1,null,1,1,1,null,null,1,1,null,1,null,null,null,1,null,1"
        )
      )
    );
    assertEquals(
      4,
      solution.longestZigZag(
        Tree.getTree("[1,1,1,null,1,null,null,1,1,null,1]")
      )
    );
    assertEquals(0, solution.longestZigZag(Tree.getTree("1")));
    assertEquals(1, solution.longestZigZag(Tree.getTree("1,2")));
  }
}
