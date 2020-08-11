package com.xcv58.leetcode.binary_search;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(-1, solution.search(null, 1));
    assertEquals(-1, solution.search(new int[] {}, 1));
    assertEquals(-1, solution.search(new int[] { 1 }, 2));
    assertEquals(-1, solution.search(new int[] { 1, 2 }, 20));
    assertEquals(-1, solution.search(new int[] { -1, 0, 3, 5, 10, 12 }, 20));
    assertEquals(-1, solution.search(new int[] { -1, 0, 3, 5, 10, 12 }, 9));
    assertEquals(-1, solution.search(new int[] { -1, 0, 3, 5, 10, 12 }, 2));
    assertEquals(4, solution.search(new int[] { -1, 0, 3, 5, 9, 12 }, 9));
  }
}
