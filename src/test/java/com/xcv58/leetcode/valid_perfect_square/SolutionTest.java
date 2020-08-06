package com.xcv58.leetcode.valid_perfect_square;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(true, solution.isPerfectSquare(1));
    assertEquals(false, solution.isPerfectSquare(2));
    assertEquals(false, solution.isPerfectSquare(3));
    assertEquals(true, solution.isPerfectSquare(4));
    assertEquals(false, solution.isPerfectSquare(5));
    assertEquals(false, solution.isPerfectSquare(6));
    assertEquals(false, solution.isPerfectSquare(7));
    assertEquals(false, solution.isPerfectSquare(8));
    assertEquals(true, solution.isPerfectSquare(9));
    assertEquals(false, solution.isPerfectSquare(10));
    assertEquals(true, solution.isPerfectSquare(81));
    assertEquals(false, solution.isPerfectSquare(82));
    assertEquals(false, solution.isPerfectSquare(83));
    assertEquals(false, solution.isPerfectSquare(Integer.MAX_VALUE));
    assertEquals(
      true,
      solution.isPerfectSquare(Integer.MAX_VALUE - Integer.MAX_VALUE / 2)
    );
    assertEquals(true, solution.isPerfectSquare(2 << 31));
  }
}
