package com.xcv58.leetcode.flip_game_ii;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(true, solution.canWin("++"));
    assertEquals(true, solution.canWin("+++"));
    assertEquals(true, solution.canWin("++++"));
    assertEquals(false, solution.canWin("+++++"));
    assertEquals(true, solution.canWin("++++++++++"));
    assertEquals(true, solution.canWin("+++++++++++"));
  }
}
