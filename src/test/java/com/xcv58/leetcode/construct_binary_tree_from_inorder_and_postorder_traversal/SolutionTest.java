package com.xcv58.leetcode.construct_binary_tree_from_inorder_and_postorder_traversal;

import static org.junit.Assert.*;

import com.xcv58.leetcode.util.Tree;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(null, solution.buildTree(null, null));
    assertEquals(
      null,
      solution.buildTree(new int[] { 9, 3, 15, 20, 7, 1 }, null)
    );
    assertEquals(
      null,
      solution.buildTree(
        new int[] { 9, 3, 15, 20, 7, 1 },
        new int[] { 9, 15, 6, 20, 3 }
      )
    );
    assertEquals(
      true,
      Tree.isSameTree(
        solution.buildTree(
          new int[] { 9, 3, 15, 20, 7 },
          new int[] { 9, 15, 7, 20, 3 }
        ),
        Tree.getTree("3,9,20,null,null,15,7")
      )
    );
    assertEquals(
      true,
      Tree.isSameTree(
        solution.buildTree(
          new int[] { 8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15 },
          new int[] { 8, 9, 4, 10, 11, 5, 2, 12, 13, 6, 14, 15, 7, 3, 1 }
        ),
        Tree.getTree("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15")
      )
    );
  }
}
