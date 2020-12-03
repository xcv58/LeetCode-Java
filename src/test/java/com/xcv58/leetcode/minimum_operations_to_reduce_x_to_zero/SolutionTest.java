package com.xcv58.leetcode.minimum_operations_to_reduce_x_to_zero;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(-1, solution.minOperations(null, 0));
    assertEquals(-1, solution.minOperations(new int[] {}, 0));
    assertEquals(1, solution.minOperations(new int[] { 1 }, 1));
    assertEquals(-1, solution.minOperations(new int[] { 1, 1 }, 3));
    assertEquals(3, solution.minOperations(new int[] { 1, 1, 1 }, 3));
    assertEquals(3, solution.minOperations(new int[] { 1, 1, 1, 1 }, 3));
    assertEquals(2, solution.minOperations(new int[] { 1, 1, 1, 1, 2 }, 3));
    assertEquals(3, solution.minOperations(new int[] { 1, 1, 2, 1, 1 }, 3));
    assertEquals(2, solution.minOperations(new int[] { 1, 1, 1, 2, 1 }, 3));
    assertEquals(
      -1,
      solution.minOperations(new int[] { 3, 2, 20, 1, 1, 3 }, 10000)
    );
    assertEquals(
      5,
      solution.minOperations(new int[] { 3, 2, 20, 1, 1, 3 }, 10)
    );
    assertEquals(
      6,
      solution.minOperations(new int[] { 3, 2, 20, 1, 1, 3 }, 30)
    );
    assertEquals(
      -1,
      solution.minOperations(new int[] { 3, 2, 20, 1, 1, 3 }, 20)
    );
  }
}
