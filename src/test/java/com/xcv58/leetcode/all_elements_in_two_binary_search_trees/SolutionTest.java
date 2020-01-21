package com.xcv58.leetcode.all_elements_in_two_binary_search_trees;

import static org.junit.Assert.*;

import com.xcv58.leetcode.TreeNode;
import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    TreeNode r1 = new TreeNode(2);
    TreeNode r2 = new TreeNode(2);
    r1.left = new TreeNode(1);
    r1.right = new TreeNode(3);
    assertEquals(Arrays.asList(), solution.getAllElements(null, null));
    assertEquals(Arrays.asList(1, 2, 3), solution.getAllElements(r1, null));
    assertEquals(Arrays.asList(1, 2, 3), solution.getAllElements(null, r1));
    assertEquals(Arrays.asList(2), solution.getAllElements(null, r2));
    assertEquals(Arrays.asList(1, 2, 2, 3), solution.getAllElements(r1, r2));
    assertEquals(
      Arrays.asList(1, 1, 2, 2, 3, 3),
      solution.getAllElements(r1, r1)
    );
  }
}
