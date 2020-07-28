package com.xcv58.leetcode.the_kth_factor_of_n;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(3, solution.kthFactor(12, 3));
    assertEquals(7, solution.kthFactor(7, 2));
    assertEquals(1, solution.kthFactor(7, 1));
    assertEquals(-1, solution.kthFactor(7, 3));
    assertEquals(1, solution.kthFactor(1, 1));
    assertEquals(-1, solution.kthFactor(1, 3));
    assertEquals(4, solution.kthFactor(1000, 3));
    assertEquals(50, solution.kthFactor(1000, 10));
    assertEquals(125, solution.kthFactor(1000, 12));
    assertEquals(200, solution.kthFactor(1000, 13));
    assertEquals(250, solution.kthFactor(1000, 14));
    assertEquals(500, solution.kthFactor(1000, 15));
    assertEquals(1000, solution.kthFactor(1000, 16));
    assertEquals(-1, solution.kthFactor(1000, 17));
  }
}
