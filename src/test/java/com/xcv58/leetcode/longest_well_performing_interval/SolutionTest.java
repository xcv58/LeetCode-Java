package com.xcv58.leetcode.longest_well_performing_interval;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.longestWPI(null));
    assertEquals(0, solution.longestWPI(new int[] {}));
    assertEquals(0, solution.longestWPI(new int[] { 1 }));
    assertEquals(0, solution.longestWPI(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }));
    assertEquals(
      1,
      solution.longestWPI(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 })
    );
    assertEquals(
      1,
      solution.longestWPI(new int[] { 9, 1, 2, 3, 4, 5, 6, 7, 8, 9 })
    );
    assertEquals(
      3,
      solution.longestWPI(new int[] { 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 9 })
    );
    assertEquals(
      1,
      solution.longestWPI(new int[] { 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 9 })
    );
    assertEquals(3, solution.longestWPI(new int[] { 9, 9, 6, 0, 6, 6, 9 }));
    assertEquals(3, solution.longestWPI(new int[] { 9, 9, 6, 0, 6, 6, 9, 9 }));
    assertEquals(
      9,
      solution.longestWPI(new int[] { 9, 9, 6, 0, 6, 6, 9, 9, 9 })
    );
  }
}
