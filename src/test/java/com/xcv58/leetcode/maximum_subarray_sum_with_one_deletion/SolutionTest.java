package com.xcv58.leetcode.maximum_subarray_sum_with_one_deletion;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.maximumSum(null));
    assertEquals(0, solution.maximumSum(new int[] {}));
    assertEquals(-1, solution.maximumSum(new int[] { -1 }));
    assertEquals(0, solution.maximumSum(new int[] { 0 }));
    assertEquals(0, solution.maximumSum(new int[] { 0, -1, -2 }));
    assertEquals(3, solution.maximumSum(new int[] { 0, -1, -2, 3, -9 }));
    assertEquals(-1, solution.maximumSum(new int[] { -1, -1, -2, -3, -9 }));
    assertEquals(14, solution.maximumSum(new int[] { -1, -1, 14, -3, -9, 2 }));
    assertEquals(26, solution.maximumSum(new int[] { -1, -1, 14, -3, -9, 15 }));
    assertEquals(20, solution.maximumSum(new int[] { -1, -1, 14, -9, -9, 15 }));
    assertEquals(
      35,
      solution.maximumSum(new int[] { 14, -9, -9, 15, -10, 15, -11, 15 })
    );
  }
}
