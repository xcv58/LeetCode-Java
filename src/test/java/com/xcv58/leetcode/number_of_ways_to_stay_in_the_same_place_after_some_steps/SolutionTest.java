package com.xcv58.leetcode.number_of_ways_to_stay_in_the_same_place_after_some_steps;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(4, solution.numWays(3, 2));
    assertEquals(2, solution.numWays(2, 4));
    assertEquals(8, solution.numWays(4, 2));
    assertEquals(8, solution.numWays(4, 2));
    assertEquals(404113244, solution.numWays(200, 30000));
    assertEquals(404113244, solution.numWays(200, Integer.MAX_VALUE));
    assertEquals(374847123, solution.numWays(500, Integer.MAX_VALUE));
    assertEquals(898068982, solution.numWays(1000, Integer.MAX_VALUE));
    assertEquals(671857319, solution.numWays(10000, Integer.MAX_VALUE));
    assertEquals(700070536, solution.numWays(20000, Integer.MAX_VALUE));
  }
}
