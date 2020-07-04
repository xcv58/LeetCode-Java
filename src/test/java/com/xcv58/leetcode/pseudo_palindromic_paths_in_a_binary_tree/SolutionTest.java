package com.xcv58.leetcode.pseudo_palindromic_paths_in_a_binary_tree;

import static org.junit.Assert.*;

import com.xcv58.leetcode.util.Tree;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      2,
      solution.pseudoPalindromicPaths(Tree.getTree("2,3,1,3,1,null,1"))
    );
    assertEquals(
      1,
      solution.pseudoPalindromicPaths(
        Tree.getTree("2,1,1,1,3,null,null,null,null,null,1")
      )
    );
    assertEquals(
      2,
      solution.pseudoPalindromicPaths(
        Tree.getTree("2,1,1,1,3,null,null,null,null,2,1,3")
      )
    );
  }
}
