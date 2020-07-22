package com.xcv58.leetcode.ipo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      4,
      solution.findMaximizedCapital(
        2,
        0,
        new int[] { 1, 2, 3 },
        new int[] { 0, 1, 1 }
      )
    );
    assertEquals(
      6,
      solution.findMaximizedCapital(
        2,
        1,
        new int[] { 1, 2, 3 },
        new int[] { 0, 1, 1 }
      )
    );
    assertEquals(
      8,
      solution.findMaximizedCapital(
        3,
        0,
        new int[] { 1, 2, 3, 4, 5 },
        new int[] { 0, 1, 1, 4, 5 }
      )
    );
    assertEquals(
      13,
      solution.findMaximizedCapital(
        4,
        0,
        new int[] { 1, 2, 3, 4, 5 },
        new int[] { 0, 1, 1, 4, 5 }
      )
    );
    assertEquals(
      15,
      solution.findMaximizedCapital(
        4,
        1,
        new int[] { 1, 2, 3, 4, 5 },
        new int[] { 0, 1, 1, 4, 5 }
      )
    );
  }
}
