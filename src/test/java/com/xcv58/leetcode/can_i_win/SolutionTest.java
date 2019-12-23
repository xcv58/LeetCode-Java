package com.xcv58.leetcode.can_i_win;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.getIndex(0));
    assertEquals(1, solution.getIndex(1));
    assertEquals(3, solution.getIndex(2));
    assertEquals(7, solution.getIndex(3));
    assertEquals(false, solution.canIWin(2, 3));
    assertEquals(false, solution.canIWin(10, 11));
    assertEquals(true, solution.canIWin(10, 20));
    assertEquals(true, solution.canIWin(10, 30));
    assertEquals(true, solution.canIWin(5, 9));
    assertEquals(true, solution.canIWin(5, 10));
    assertEquals(false, solution.canIWin(5, 11));
    assertEquals(true, solution.canIWin(3, 6));
    assertEquals(true, solution.canIWin(3, 5));
    assertEquals(false, solution.canIWin(4, 10));
    assertEquals(true, solution.canIWin(5, 15));
    assertEquals(false, solution.canIWin(10, 55));
    assertEquals(false, solution.canIWin(20, 210));
    assertEquals(true, solution.canIWin(5, 5));
  }
}
