package com.xcv58.leetcode.subarray_sum_equals_k;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      1,
      solution.subarraySum(new int[] { 28, 54, 7, -70, 22, 65, -6 }, 100)
    );
    assertEquals(2, solution.subarraySum(new int[] { 1, 1, 1 }, 2));
    assertEquals(3, solution.subarraySum(new int[] { 1, 1, 1 }, 1));
    assertEquals(6, solution.subarraySum(new int[] { 1, 1, -1, 1, 1, 1 }, 2));
    assertEquals(3, solution.subarraySum(new int[] { 1, 1, -1, 1, 1, 1 }, 3));
    assertEquals(
      14,
      solution.subarraySum(new int[] { 1, 2, 1, 2, 0, 0, 0, -1, 1, 2, 1, 2 }, 3)
    );
  }
}
