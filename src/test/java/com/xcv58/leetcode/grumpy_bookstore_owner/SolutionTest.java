package com.xcv58.leetcode.grumpy_bookstore_owner;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.maxSatisfied(null, null, 0));
    assertEquals(0, solution.maxSatisfied(new int[] {}, new int[] {}, 0));
    assertEquals(
      18,
      solution.maxSatisfied(
        new int[] { 1, 0, 9, 2, 1, 1, 7, 5 },
        new int[] { 0, 1, 0, 1, 0, 1, 0, 1 },
        0
      )
    );
    assertEquals(
      23,
      solution.maxSatisfied(
        new int[] { 1, 0, 9, 2, 1, 1, 7, 5 },
        new int[] { 0, 1, 0, 1, 0, 1, 0, 1 },
        1
      )
    );
    assertEquals(
      23,
      solution.maxSatisfied(
        new int[] { 1, 0, 9, 2, 1, 1, 7, 5 },
        new int[] { 0, 1, 0, 1, 0, 1, 0, 1 },
        2
      )
    );
    assertEquals(
      24,
      solution.maxSatisfied(
        new int[] { 1, 0, 9, 2, 1, 1, 7, 5 },
        new int[] { 0, 1, 0, 1, 0, 1, 0, 1 },
        3
      )
    );
    assertEquals(
      24,
      solution.maxSatisfied(
        new int[] { 1, 0, 9, 2, 1, 1, 7, 5 },
        new int[] { 0, 1, 0, 1, 0, 1, 0, 1 },
        4
      )
    );
    assertEquals(
      26,
      solution.maxSatisfied(
        new int[] { 1, 0, 9, 2, 1, 1, 7, 5 },
        new int[] { 0, 1, 0, 1, 0, 1, 0, 1 },
        5
      )
    );
    assertEquals(
      26,
      solution.maxSatisfied(
        new int[] { 1, 0, 9, 2, 1, 1, 7, 5 },
        new int[] { 0, 1, 0, 1, 0, 1, 0, 1 },
        10
      )
    );
    assertEquals(
      26,
      solution.maxSatisfied(
        new int[] { 1, 0, 9, 2, 1, 1, 7, 5 },
        new int[] { 0, 1, 0, 1, 0, 1, 0, 1 },
        100
      )
    );
    assertEquals(
      22,
      solution.maxSatisfied(
        new int[] { 1, 0, 9, 2, 1, 1, 7, 5 },
        new int[] { 0, 1, 0, 1, 1, 1, 0, 1 },
        1
      )
    );
  }
}
