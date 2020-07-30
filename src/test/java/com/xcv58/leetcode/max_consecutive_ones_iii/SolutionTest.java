package com.xcv58.leetcode.max_consecutive_ones_iii;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.longestOnes(null, 0));
    assertEquals(
      6,
      solution.longestOnes(new int[] { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 }, 2)
    );
    assertEquals(
      10,
      solution.longestOnes(
        new int[] { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 },
        3
      )
    );
    assertEquals(
      19,
      solution.longestOnes(
        new int[] { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 },
        8
      )
    );
    assertEquals(
      17,
      solution.longestOnes(
        new int[] { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 },
        6
      )
    );
  }
}
