package com.xcv58.leetcode.maximum_equal_frequency;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.maxEqualFreq(null));
    assertEquals(0, solution.maxEqualFreq(new int[] {}));
    assertEquals(1, solution.maxEqualFreq(new int[] { 1 }));
    assertEquals(2, solution.maxEqualFreq(new int[] { 1, 2 }));
    assertEquals(3, solution.maxEqualFreq(new int[] { 1, 2, 1 }));
    assertEquals(3, solution.maxEqualFreq(new int[] { 1, 2, 3 }));
    assertEquals(3, solution.maxEqualFreq(new int[] { 1, 2, 1, 2 }));
    assertEquals(5, solution.maxEqualFreq(new int[] { 1, 2, 1, 2, 3 }));
    assertEquals(
      7,
      solution.maxEqualFreq(new int[] { 2, 2, 1, 1, 5, 3, 3, 5 })
    );
    assertEquals(
      13,
      solution.maxEqualFreq(new int[] { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5 })
    );
    assertEquals(5, solution.maxEqualFreq(new int[] { 1, 1, 1, 2, 2, 2 }));
    assertEquals(
      8,
      solution.maxEqualFreq(new int[] { 10, 2, 8, 9, 3, 8, 1, 5, 2, 3, 7, 6 })
    );
  }
}
