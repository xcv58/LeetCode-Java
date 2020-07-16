package com.xcv58.leetcode.number_of_sub_arrays_of_size_k_and_average_greater_than_or_equal_to_threshold;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.numOfSubarrays(null, 3, 4));
    assertEquals(0, solution.numOfSubarrays(new int[0], 3, 4));
    assertEquals(
      3,
      solution.numOfSubarrays(new int[] { 2, 2, 2, 2, 5, 5, 5, 8 }, 3, 4)
    );
    assertEquals(5, solution.numOfSubarrays(new int[] { 1, 1, 1, 1, 1 }, 1, 0));
    assertEquals(
      6,
      solution.numOfSubarrays(
        new int[] { 11, 13, 17, 23, 29, 31, 7, 5, 2, 3 },
        3,
        5
      )
    );
  }
}
