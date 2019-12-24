package com.xcv58.leetcode.integer_break;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.integerBreak(1));
    assertEquals(1, solution.integerBreak(2));
    assertEquals(2, solution.integerBreak(3));
    assertEquals(4, solution.integerBreak(4));
    assertEquals(6, solution.integerBreak(5));
    assertEquals(9, solution.integerBreak(6));
    assertEquals(12, solution.integerBreak(7));
    assertEquals(18, solution.integerBreak(8));
    assertEquals(27, solution.integerBreak(9));
    assertEquals(36, solution.integerBreak(10));
    assertEquals(54, solution.integerBreak(11));
    assertEquals(1549681956, solution.integerBreak(58));
    assertEquals(2066242608, solution.integerBreak(59));
  }
}
