package com.xcv58.leetcode.minimum_falling_path_sum;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.minFallingPathSum(null));
    assertEquals(0, solution.minFallingPathSum(new int[][] {}));
    assertEquals(0, solution.minFallingPathSum(new int[][] { {} }));
    assertEquals(1, solution.minFallingPathSum(new int[][] { { 1 } }));
    assertEquals(1, solution.minFallingPathSum(new int[][] { { 1, 2, 3 } }));
    assertEquals(
      5,
      solution.minFallingPathSum(new int[][] { { 1, 2, 3 }, { 4, 5, 6 } })
    );
    assertEquals(
      12,
      solution.minFallingPathSum(
        new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }
      )
    );
    assertEquals(
      13,
      solution.minFallingPathSum(
        new int[][] { { 1, 2, 3 }, { 6, 5, 4 }, { 7, 8, 9 } }
      )
    );
    assertEquals(
      16,
      solution.minFallingPathSum(
        new int[][] {
          { 2, 3, 4, 3, 2, 4, 2, 4 },
          { 6, 5, 4, 5, 4, 6, 5, 6 },
          { 9, 10, 9, 100, 200, 100, 300, 9 },
        }
      )
    );
  }
}
