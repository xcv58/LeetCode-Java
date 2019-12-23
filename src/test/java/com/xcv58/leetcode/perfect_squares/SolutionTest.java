package com.xcv58.leetcode.perfect_squares;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(1, solution.numSquares(1));
    assertEquals(1, solution.numSquares(4));
    assertEquals(1, solution.numSquares(9));
    assertEquals(1, solution.numSquares(16));
    assertEquals(1, solution.numSquares(25));
    assertEquals(2, solution.numSquares(13));
    assertEquals(2, solution.numSquares(17));
    assertEquals(2, solution.numSquares(26));
    assertEquals(3, solution.numSquares(12));
  }
}
