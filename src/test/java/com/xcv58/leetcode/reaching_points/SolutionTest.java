package com.xcv58.leetcode.reaching_points;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(true, solution.reachingPoints(1, 1, 1, 1));
    assertEquals(true, solution.reachingPoints(1, 1, 2, 1));
    assertEquals(true, solution.reachingPoints(1, 1, 2, 3));
    assertEquals(true, solution.reachingPoints(1, 1, 3, 1));
    assertEquals(true, solution.reachingPoints(1, 1, 3, 4));
    assertEquals(true, solution.reachingPoints(1, 1, 3, 400000));
    assertEquals(true, solution.reachingPoints(2, 1, 3, 4));
    assertEquals(
      true,
      solution.reachingPoints(1, 1, Integer.MAX_VALUE / 2, Integer.MAX_VALUE)
    );
    assertEquals(
      true,
      solution.reachingPoints(1, 1, Integer.MAX_VALUE - 1, Integer.MAX_VALUE)
    );
    assertEquals(
      true,
      solution.reachingPoints(1, 1, Integer.MAX_VALUE - 2, Integer.MAX_VALUE)
    );
    assertEquals(true, solution.reachingPoints(2, 1, 2, Integer.MAX_VALUE));
    assertEquals(true, solution.reachingPoints(2, 1, 2, Integer.MAX_VALUE / 2));
    assertEquals(
      false,
      solution.reachingPoints(1, 1, Integer.MAX_VALUE, Integer.MAX_VALUE)
    );
    assertEquals(
      false,
      solution.reachingPoints(1, 3, Integer.MAX_VALUE, Integer.MAX_VALUE)
    );
    assertEquals(false, solution.reachingPoints(1, 1, 2, 2));
    assertEquals(true, solution.reachingPoints(35, 13, 157, 109));
    assertEquals(true, solution.reachingPoints(35, 13, 35, 678));
    assertEquals(true, solution.reachingPoints(35, 13, 713, 678));
  }
}
