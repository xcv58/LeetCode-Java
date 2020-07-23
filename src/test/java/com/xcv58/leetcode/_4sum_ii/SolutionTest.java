package com.xcv58.leetcode._4sum_ii;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      0,
      solution.fourSumCount(
        new int[] {},
        new int[] {},
        new int[] {},
        new int[] {}
      )
    );
    assertEquals(
      1,
      solution.fourSumCount(
        new int[] { 0 },
        new int[] { 0 },
        new int[] { 0 },
        new int[] { 0 }
      )
    );
    assertEquals(
      2,
      solution.fourSumCount(
        new int[] { 0, 0 },
        new int[] { 0 },
        new int[] { 0 },
        new int[] { 0 }
      )
    );
    assertEquals(
      16,
      solution.fourSumCount(
        new int[] { 0, 0 },
        new int[] { 0, 0 },
        new int[] { 0, 0 },
        new int[] { 0, 0 }
      )
    );
    assertEquals(
      2,
      solution.fourSumCount(
        new int[] { 1, 2 },
        new int[] { -2, -1 },
        new int[] { -1, 2 },
        new int[] { 0, 0 }
      )
    );
    assertEquals(
      2,
      solution.fourSumCount(
        new int[] { 1, 2 },
        new int[] { -2, -1 },
        new int[] { -1, 2 },
        new int[] { 0, 2 }
      )
    );
    assertEquals(
      98,
      solution.fourSumCount(
        new int[] { 1, 2, 3, 4, 5, 6 },
        new int[] { -2, -1, 3, 4, 5, 6 },
        new int[] { -1, 2, -3, -4, -5, -6 },
        new int[] { 0, 2, -3, -4, -5, -6 }
      )
    );
    assertEquals(
      216,
      solution.fourSumCount(
        new int[] { 1, 2, 1, -1, 1, -1 },
        new int[] { -2, -1, 1, 0, -1, 1 },
        new int[] { -1, 2, -1, 1, 1, -1 },
        new int[] { 0, 2, 1, -1, 0, -1 }
      )
    );
  }
}
