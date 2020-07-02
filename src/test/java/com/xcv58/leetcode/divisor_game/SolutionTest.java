package com.xcv58.leetcode.divisor_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(solution.divisorGame(1), false);
    assertEquals(solution.divisorGame(2), true);
    assertEquals(solution.divisorGame(3), false);
    assertEquals(solution.divisorGame(4), true);
    assertEquals(solution.divisorGame(5), false);
    assertEquals(solution.divisorGame(6), true);
    assertEquals(solution.divisorGame(7), false);
    assertEquals(solution.divisorGame(8), true);
    assertEquals(solution.divisorGame(9), false);
    assertEquals(solution.divisorGame(10), true);
    assertEquals(solution.divisorGame(15), false);
    assertEquals(solution.divisorGame(999), false);
    assertEquals(solution.divisorGame(9999), false);
    assertEquals(solution.divisorGame(99990), true);
  }
}
