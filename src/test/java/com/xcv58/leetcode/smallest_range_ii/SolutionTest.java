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
    assertEquals(8, solution.smallestRangeII(new int[] { 0, 10 }, 9));
    assertEquals(9, solution.smallestRangeII(new int[] { 0, 1, 10 }, 9));
    assertEquals(10, solution.smallestRangeII(new int[] { 0, 1, 9, 10 }, 9));
    assertEquals(
      10,
      solution.smallestRangeII(new int[] { 0, 1, 2, 8, 9, 10 }, 9)
    );
    assertEquals(3, solution.smallestRangeII(new int[] { 10, 7, 1 }, 3));
    assertEquals(1, solution.smallestRangeII(new int[] { 3, 2, 4, 2 }, 1));
    assertEquals(1, solution.smallestRangeII(new int[] { 3, 4, 2 }, 1));
    assertEquals(2, solution.smallestRangeII(new int[] { 4, 2, 6 }, 2));
    assertEquals(2, solution.smallestRangeII(new int[] { 4, 2, 6 }, 1));
    assertEquals(4, solution.smallestRangeII(new int[] { 4, 2, 6 }, 3));
  }
}
