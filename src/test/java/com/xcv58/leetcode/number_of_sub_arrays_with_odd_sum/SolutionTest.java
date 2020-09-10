package com.xcv58.leetcode.number_of_sub_arrays_with_odd_sum;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.numOfSubarrays(null));
    assertEquals(0, solution.numOfSubarrays(new int[] {}));
    assertEquals(0, solution.numOfSubarrays(new int[] { 0, 2, 4 }));
    assertEquals(0, solution.numOfSubarrays(new int[] { 0, 2, 4, 8 }));
    assertEquals(5, solution.numOfSubarrays(new int[] { 0, 2, 4, 8, 1 }));
    assertEquals(
      32,
      solution.numOfSubarrays(new int[] { 0, 2, 4, 8, 1, 2, 3, 4, 5, 6, 7 })
    );
    assertEquals(
      16,
      solution.numOfSubarrays(new int[] { 1, 2, 3, 4, 5, 6, 7 })
    );
  }
}
