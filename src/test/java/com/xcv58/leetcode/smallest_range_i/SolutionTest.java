package com.xcv58.leetcode.smallest_range_i;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.smallestRangeI(null, 0));
    assertEquals(0, solution.smallestRangeI(new int[] {}, 0));
    assertEquals(0, solution.smallestRangeI(new int[] { 1 }, 0));
    assertEquals(1, solution.smallestRangeI(new int[] { 1, 2 }, 0));
    assertEquals(0, solution.smallestRangeI(new int[] { 1, 2 }, 2));
    assertEquals(0, solution.smallestRangeI(new int[] { 1, 200 }, 200));
    assertEquals(5, solution.smallestRangeI(new int[] { 1, 10 }, 2));
    assertEquals(4, solution.smallestRangeI(new int[] { 1, 10, 15 }, 5));
  }
}
