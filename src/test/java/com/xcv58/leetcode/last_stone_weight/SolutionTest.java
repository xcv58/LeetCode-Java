package com.xcv58.leetcode.last_stone_weight;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.lastStoneWeight(null));
    assertEquals(0, solution.lastStoneWeight(new int[] {}));
    assertEquals(0, solution.lastStoneWeight(new int[] { 1, 1 }));
    assertEquals(1, solution.lastStoneWeight(new int[] { 1, 2 }));
    assertEquals(1, solution.lastStoneWeight(new int[] { 1 }));
    assertEquals(0, solution.lastStoneWeight(new int[] { 1, 2, 3 }));
    assertEquals(1, solution.lastStoneWeight(new int[] { 1, 2, 3, 4, 5, 6 }));
    assertEquals(
      85,
      solution.lastStoneWeight(new int[] { 1, 2, 3, 4, 5, 100 })
    );
  }
}
