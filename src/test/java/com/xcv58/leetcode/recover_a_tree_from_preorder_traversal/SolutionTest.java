package com.xcv58.leetcode.recover_a_tree_from_preorder_traversal;

import static org.junit.Assert.*;

import com.xcv58.leetcode.util.Tree;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      true,
      Tree.isSameTree(
        Tree.getTree("1,2,3"),
        solution.recoverFromPreorder("1-2-3")
      )
    );
    assertEquals(
      true,
      Tree.isSameTree(
        Tree.getTree("1,2,5,3,null,6,null,4,null,7"),
        solution.recoverFromPreorder("1-2--3---4-5--6---7")
      )
    );
    assertEquals(
      true,
      Tree.isSameTree(
        Tree.getTree("1,401,null,349,88,90"),
        solution.recoverFromPreorder("1-401--349---90--88")
      )
    );
    assertEquals(
      true,
      Tree.isSameTree(
        Tree.getTree("1,2,5,3,4,6,7"),
        solution.recoverFromPreorder("1-2--3--4-5--6--7")
      )
    );
    assertEquals(
      true,
      Tree.isSameTree(
        Tree.getTree("10,1,null,8,null,8,null,1,null,2"),
        solution.recoverFromPreorder("10-1--8---8----1-----2")
      )
    );
  }
}
