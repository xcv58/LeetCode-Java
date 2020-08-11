package com.xcv58.leetcode.smallest_range_ii;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.smallestRangeII(null, 0));
    assertEquals(0, solution.smallestRangeII(new int[] {}, 0));
    assertEquals(0, solution.smallestRangeII(new int[] { 1 }, 0));
    assertEquals(0, solution.smallestRangeII(new int[] { 1, 1 }, 0));
    assertEquals(0, solution.smallestRangeII(new int[] { 1, 1 }, 2));
    assertEquals(89, solution.smallestRangeII(new int[] { 1, 100 }, 5));
    assertEquals(50, solution.smallestRangeII(new int[] { 1, 50, 100 }, 50));
    assertEquals(3, solution.smallestRangeII(new int[] { 1, 3, 6 }, 3));
    assertEquals(
      5,
      solution.smallestRangeII(new int[] { 3, 0, 3, 0, 6, 3 }, 4)
    );
  }
}
