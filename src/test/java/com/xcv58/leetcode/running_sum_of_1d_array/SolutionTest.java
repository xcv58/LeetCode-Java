package com.xcv58.leetcode.running_sum_of_1d_array;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(null, solution.runningSum(null));
    assertArrayEquals(new int[] {}, solution.runningSum(new int[] {}));
    assertArrayEquals(new int[] { 1 }, solution.runningSum(new int[] { 1 }));
    assertArrayEquals(
      new int[] { 1, 3 },
      solution.runningSum(new int[] { 1, 2 })
    );
    assertArrayEquals(
      new int[] { 1, 2, 3, 4, 5, 6, 7 },
      solution.runningSum(new int[] { 1, 1, 1, 1, 1, 1, 1 })
    );
    assertArrayEquals(
      new int[] { 1, 3, 6, 10, 15, 21, 28, 36, 45, 55 },
      solution.runningSum(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 })
    );
  }
}
