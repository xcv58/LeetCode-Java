package com.xcv58.leetcode.smallest_string_starting_from_leaf;

import static org.junit.Assert.*;

import com.xcv58.leetcode.util.Tree;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      "dba",
      solution.smallestFromLeaf(Tree.getTree("0,1,2,3,4,3,4"))
    );
    assertEquals(
      "adz",
      solution.smallestFromLeaf(Tree.getTree("25,1,3,1,3,0,2"))
    );
    assertEquals(
      "abc",
      solution.smallestFromLeaf(Tree.getTree("2,2,1,null,1,0,null,0"))
    );
    assertEquals(
      "ababz",
      solution.smallestFromLeaf(
        Tree.getTree("[25,1,null,0,0,1,null,null,null,0]")
      )
    );
  }
}
