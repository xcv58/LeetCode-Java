package com.xcv58.leetcode.minimum_value_to_get_positive_step_by_step_sum;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(1, solution.minStartValue(null));
    assertEquals(1, solution.minStartValue(new int[] {}));
    assertEquals(1, solution.minStartValue(new int[] { 0, 1, 2, 3 }));
    assertEquals(1, solution.minStartValue(new int[] { 1, 2, 3, 100, -1 }));
    assertEquals(4, solution.minStartValue(new int[] { 1, 2, 3, 100, -109 }));
    assertEquals(1, solution.minStartValue(new int[] { 1, -1, 2, 3, 1 }));
    assertEquals(2, solution.minStartValue(new int[] { -1, 2, 3, 1 }));
  }
}
