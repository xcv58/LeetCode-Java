package com.xcv58.leetcode.stone_game_ii;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(10, solution.stoneGameII(new int[] { 2, 7, 9, 4, 4 }));
    assertEquals(110, solution.stoneGameII(new int[] { 2, 7, 9, 4, 4, 100 }));
    assertEquals(3, solution.stoneGameII(new int[] { 1, 2, 3 }));
  }
}
