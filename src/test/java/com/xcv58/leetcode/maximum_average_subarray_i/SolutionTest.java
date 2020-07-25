package com.xcv58.leetcode.maximum_average_subarray_i;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      true,
      Math.abs(3.0 - solution.findMaxAverage(new int[] { 3 }, 1)) < 0.001
    );
    assertEquals(
      true,
      Math.abs(
        12.75 - solution.findMaxAverage(new int[] { 1, 12, -5, -6, 50, 3 }, 4)
      ) <
      0.001
    );
  }
}
