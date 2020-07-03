package com.xcv58.leetcode.leaf_similar_trees;

import static org.junit.Assert.*;

import com.xcv58.leetcode.util.Tree;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      true,
      solution.leafSimilar(
        Tree.getTree("3,5,1,6,2,9,8,null,null,7,4"),
        Tree.getTree("3,5,1,6,7,4,2,null,null,null,null,null,null,9,8")
      )
    );
    assertEquals(
      false,
      solution.leafSimilar(
        Tree.getTree("3,5,1,6,2,9,8,null,null,7,4"),
        Tree.getTree("3,5,1,6,7,4,2,null,null,null,null,null,null,9")
      )
    );
    assertEquals(
      true,
      solution.leafSimilar(
        Tree.getTree("9,6,11,null,null,2,3,7,null,1,8,null,null,4,9"),
        Tree.getTree("3,5,1,6,7,4,2,null,null,null,null,null,null,9,8")
      )
    );
    assertEquals(
      true,
      solution.leafSimilar(
        Tree.getTree("9,6,11,null,null,2,3,7,null,1,null,null,null,4,9"),
        Tree.getTree("3,5,1,6,7,4,2,null,null,null,null,null,null,9")
      )
    );
    assertEquals(false, solution.leafSimilar(Tree.getTree("0"), null));
    assertEquals(false, solution.leafSimilar(null, Tree.getTree("0")));
    assertEquals(true, solution.leafSimilar(null, null));
  }
}
