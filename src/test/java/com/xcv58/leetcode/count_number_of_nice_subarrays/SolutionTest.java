package com.xcv58.leetcode.count_number_of_nice_subarrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.numberOfSubarrays(null, 1));
    assertEquals(0, solution.numberOfSubarrays(new int[] {}, 1));
    assertEquals(0, solution.numberOfSubarrays(new int[] { 2 }, 1));
    assertEquals(2, solution.numberOfSubarrays(new int[] { 2, 1 }, 1));
    assertEquals(2, solution.numberOfSubarrays(new int[] { 1, 1, 2, 1, 1 }, 3));
    assertEquals(0, solution.numberOfSubarrays(new int[] { 1, 1, 2, 1, 1 }, 5));
    assertEquals(
      16,
      solution.numberOfSubarrays(new int[] { 2, 2, 2, 1, 2, 2, 1, 2, 2, 2 }, 2)
    );
    assertEquals(
      38,
      solution.numberOfSubarrays(
        new int[] { 2, 2, 2, 1, 1, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1 },
        2
      )
    );
  }
}
