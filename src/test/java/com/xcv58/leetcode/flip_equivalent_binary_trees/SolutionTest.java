package com.xcv58.leetcode.flip_equivalent_binary_trees;

import static org.junit.Assert.*;

import com.xcv58.leetcode.util.Tree;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      true,
      solution.flipEquiv(
        Tree.getTree("1,3,2,null,6,4,5,null,null,null,null,8,7"),
        Tree.getTree("1,2,3,4,5,6,null,null,null,7,8")
      )
    );
    assertEquals(
      true,
      solution.flipEquiv(
        Tree.getTree("1,3,2,null,6,4,5,null,null,null,null,8,7"),
        Tree.getTree("1,3,2,null,6,4,5,null,null,null,null,8,7")
      )
    );
    assertEquals(
      true,
      solution.flipEquiv(Tree.getTree("1,3,2"), Tree.getTree("1,2,3"))
    );
    assertEquals(
      false,
      solution.flipEquiv(Tree.getTree("1,3,2"), Tree.getTree("1,2,2"))
    );
    assertEquals(
      true,
      solution.flipEquiv(
        Tree.getTree("1,3,2,null,null,5,4"),
        Tree.getTree("1,2,3,4,5")
      )
    );
    assertEquals(
      true,
      solution.flipEquiv(
        Tree.getTree("1,3,2,null,null,4,5"),
        Tree.getTree("1,2,3,4,5")
      )
    );
    assertEquals(
      false,
      solution.flipEquiv(Tree.getTree("1,3,2,4,5"), Tree.getTree("1,2,3,4,5"))
    );
  }
}
