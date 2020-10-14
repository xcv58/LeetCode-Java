package com.xcv58.leetcode.count_all_possible_routes;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.countRoutes(null, 1, 1, 1));
    assertEquals(0, solution.countRoutes(new int[] {}, 1, 1, 1));
    assertEquals(0, solution.countRoutes(new int[] { 1 }, 1, 1, 1));
    assertEquals(1, solution.countRoutes(new int[] { 1 }, 0, 0, 1));
    assertEquals(1, solution.countRoutes(new int[] { 1 }, 0, 0, 0));
    assertEquals(5, solution.countRoutes(new int[] { 4, 3, 1 }, 1, 0, 6));
    assertEquals(0, solution.countRoutes(new int[] { 5, 2, 1 }, 1, 0, 2));
    assertEquals(2, solution.countRoutes(new int[] { 5, 2, 1 }, 2, 2, 3));
    assertEquals(4, solution.countRoutes(new int[] { 2, 3, 6, 8, 4 }, 1, 3, 5));
    assertEquals(
      615088286,
      solution.countRoutes(new int[] { 1, 2, 3 }, 0, 2, 40)
    );
    assertEquals(
      261023831,
      solution.countRoutes(new int[] { 4, 3, 1, 2, 9, 8, 7, 11 }, 1, 0, 111)
    );
  }
}
