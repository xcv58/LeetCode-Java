package com.xcv58.leetcode.maximum_performance_of_a_team;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      48,
      solution.maxPerformance(
        4,
        new int[] { 2, 10, 3, 1 },
        new int[] { 5, 4, 3, 9 },
        2
      )
    );
    assertEquals(
      60,
      solution.maxPerformance(
        6,
        new int[] { 2, 10, 3, 1, 5, 8 },
        new int[] { 5, 4, 3, 9, 7, 2 },
        2
      )
    );
  }
}
