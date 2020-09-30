package com.xcv58.leetcode.minimum_numbers_of_function_calls_to_make_target_array;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.minOperations(null));
    assertEquals(0, solution.minOperations(new int[] {}));
    assertEquals(0, solution.minOperations(new int[] { 0 }));
    assertEquals(
      0,
      solution.minOperations(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 })
    );
    assertEquals(
      1,
      solution.minOperations(new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 })
    );
    assertEquals(
      2,
      solution.minOperations(new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 })
    );
    assertEquals(
      3,
      solution.minOperations(new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 2 })
    );
    assertEquals(
      4,
      solution.minOperations(new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 2, 2 })
    );
    assertEquals(
      16,
      solution.minOperations(new int[] { 1, 4, 8, 16, 32, 256, 0, 0, 2, 2 })
    );
    assertEquals(
      24,
      solution.minOperations(new int[] { 1, 4, 8, 16, 32, 256, 1111, 0, 2, 2 })
    );
  }
}
