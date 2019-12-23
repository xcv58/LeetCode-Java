package com.xcv58.leetcode.unique_paths_ii;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      1,
      solution.uniquePathsWithObstacles(
        new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }
      )
    );
    assertEquals(
      0,
      solution.uniquePathsWithObstacles(
        new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 1, 1 } }
      )
    );
    assertEquals(
      0,
      solution.uniquePathsWithObstacles(
        new int[][] { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }
      )
    );
    assertEquals(
      28,
      solution.uniquePathsWithObstacles(
        new int[][] {
          { 0, 0, 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 0, 0, 0 }
        }
      )
    );
  }
}
