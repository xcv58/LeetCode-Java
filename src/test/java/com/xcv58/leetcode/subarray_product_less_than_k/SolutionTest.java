package com.xcv58.leetcode.subarray_product_less_than_k;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      10,
      solution.numSubarrayProductLessThanK(new int[] { 10, 5, 2, 6 }, 1000)
    );
    assertEquals(
      8,
      solution.numSubarrayProductLessThanK(new int[] { 10, 5, 2, 6 }, 100)
    );
    assertEquals(
      6,
      solution.numSubarrayProductLessThanK(new int[] { 10, 5, 2, 6 }, 25)
    );
    assertEquals(
      3,
      solution.numSubarrayProductLessThanK(new int[] { 10, 5, 2, 6 }, 10)
    );
    assertEquals(
      6,
      solution.numSubarrayProductLessThanK(new int[] { 10, 5, 2, 6 }, 13)
    );
    assertEquals(
      3,
      solution.numSubarrayProductLessThanK(new int[] { 10, 5, 2, 6 }, 8)
    );
    assertEquals(
      32,
      solution.numSubarrayProductLessThanK(
        new int[] { 10, 5, 2, 6, 19, 31, 91, 12, 19, 123, 1, 3, 5, 9 },
        1000
      )
    );
  }
}
