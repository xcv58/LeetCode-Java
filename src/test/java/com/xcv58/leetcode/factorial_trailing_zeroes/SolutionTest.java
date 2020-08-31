package com.xcv58.leetcode.factorial_trailing_zeroes;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.trailingZeroes(0));
    assertEquals(0, solution.trailingZeroes(1));
    assertEquals(0, solution.trailingZeroes(2));
    assertEquals(0, solution.trailingZeroes(3));
    assertEquals(0, solution.trailingZeroes(4));
    assertEquals(1, solution.trailingZeroes(5));
    assertEquals(1, solution.trailingZeroes(6));
    assertEquals(1, solution.trailingZeroes(7));
    assertEquals(1, solution.trailingZeroes(8));
    assertEquals(1, solution.trailingZeroes(9));
    assertEquals(2, solution.trailingZeroes(10));
    assertEquals(2, solution.trailingZeroes(11));
    assertEquals(2, solution.trailingZeroes(12));
    assertEquals(2, solution.trailingZeroes(13));
    assertEquals(2, solution.trailingZeroes(14));
    assertEquals(3, solution.trailingZeroes(15));
    assertEquals(3, solution.trailingZeroes(16));
    assertEquals(3, solution.trailingZeroes(17));
    assertEquals(3, solution.trailingZeroes(18));
    assertEquals(3, solution.trailingZeroes(19));
    assertEquals(4, solution.trailingZeroes(20));
    assertEquals(4, solution.trailingZeroes(24));
    assertEquals(6, solution.trailingZeroes(25));
    assertEquals(536870902, solution.trailingZeroes(Integer.MAX_VALUE));
    assertEquals(268435446, solution.trailingZeroes(Integer.MAX_VALUE / 2));
    assertEquals(4194297, solution.trailingZeroes(Integer.MAX_VALUE / 128));
  }
}
