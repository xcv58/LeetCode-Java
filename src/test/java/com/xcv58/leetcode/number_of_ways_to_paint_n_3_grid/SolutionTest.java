package com.xcv58.leetcode.number_of_ways_to_paint_n_3_grid;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(12, solution.numOfWays(1));
    assertEquals(54, solution.numOfWays(2));
    assertEquals(246, solution.numOfWays(3));
    assertEquals(1122, solution.numOfWays(4));
    assertEquals(106494, solution.numOfWays(7));
    assertEquals(210323922, solution.numOfWays(12));
    assertEquals(30228214, solution.numOfWays(5000));
    assertEquals(779575021, solution.numOfWays(10000));
    assertEquals(643508713, solution.numOfWays(999999));
  }
}
