package com.xcv58.leetcode._132_pattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(true, solution.find132pattern(new int[] { 3, 1, 4, 0, 2 }));
    assertEquals(true, solution.find132pattern(new int[] { 3, 5, 0, 3, 4 }));
    assertEquals(
      true,
      solution.find132pattern(new int[] { 9, 9, 9, 9, 1, 3, 2, 9, 9, 9, 9 })
    );
    assertEquals(
      true,
      solution.find132pattern(new int[] { 9, 9, 9, 9, 1, 9, 9, 8, 9, 9, 9 })
    );
    assertEquals(true, solution.find132pattern(new int[] { 1, 3, 2 }));
    assertEquals(true, solution.find132pattern(new int[] { -1, 3, 2, 4 }));
    assertEquals(
      false,
      solution.find132pattern(new int[] { 9, 9, 9, 9, 2, 9, 1, 9, 9, 9, 9, 9 })
    );
    assertEquals(false, solution.find132pattern(null));
    assertEquals(false, solution.find132pattern(new int[] {}));
    assertEquals(false, solution.find132pattern(new int[] { 1, 0, 1, -4, -3 }));
    assertEquals(false, solution.find132pattern(new int[] { 1, 2, 3 }));
    assertEquals(false, solution.find132pattern(new int[] { 1, 2, 3, 1 }));
    assertEquals(
      false,
      solution.find132pattern(new int[] { 1, 2, 3, 4, 5, 6, 6, 7, 8, 9 })
    );
  }
}
