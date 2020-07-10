package com.xcv58.leetcode.maximum_sum_of_two_non_overlapping_subarrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      31,
      solution.maxSumTwoNoOverlap(
        new int[] { 2, 1, 5, 6, 0, 9, 5, 0, 3, 8 },
        4,
        3
      )
    );
    assertEquals(
      20,
      solution.maxSumTwoNoOverlap(new int[] { 0, 6, 5, 2, 2, 5, 1, 9, 4 }, 1, 2)
    );
    assertEquals(
      29,
      solution.maxSumTwoNoOverlap(new int[] { 3, 8, 1, 3, 2, 1, 8, 9, 0 }, 3, 2)
    );
    assertEquals(
      42,
      solution.maxSumTwoNoOverlap(
        new int[] { 2, 1, 5, 6, 0, 9, 5, 0, 3, 8, 5, 9 },
        4,
        3
      )
    );
  }
}
