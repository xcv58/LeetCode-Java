package com.xcv58.leetcode.last_stone_weight_ii;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.lastStoneWeightII(null));
    assertEquals(0, solution.lastStoneWeightII(new int[] {}));
    assertEquals(0, solution.lastStoneWeightII(new int[] { 0 }));
    assertEquals(0, solution.lastStoneWeightII(new int[] { 0, 0 }));
    assertEquals(1, solution.lastStoneWeightII(new int[] { 0, 1 }));
    assertEquals(1, solution.lastStoneWeightII(new int[] { 2, 7, 4, 1, 8, 1 }));
    assertEquals(5, solution.lastStoneWeightII(new int[] { 2, 7 }));
    assertEquals(
      0,
      solution.lastStoneWeightII(
        new int[] {
          2,
          7,
          1,
          1,
          1,
          1,
          1,
          1,
          1,
          1,
          1,
          1,
          1,
          1,
          1,
          1,
          1,
          1,
          1,
          1,
          9,
        }
      )
    );
  }
}
