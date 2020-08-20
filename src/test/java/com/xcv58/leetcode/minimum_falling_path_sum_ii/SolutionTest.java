package com.xcv58.leetcode.minimum_falling_path_sum_ii;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.minFallingPathSum(null));
    assertEquals(0, solution.minFallingPathSum(new int[][] {}));
    assertEquals(0, solution.minFallingPathSum(new int[][] { {} }));
    assertEquals(0, solution.minFallingPathSum(new int[][] { { 0 } }));
    assertEquals(1, solution.minFallingPathSum(new int[][] { { 1 } }));
    assertEquals(-1, solution.minFallingPathSum(new int[][] { { -1 } }));
    assertEquals(
      6,
      solution.minFallingPathSum(new int[][] { { 1, 2, 3 }, { 4, 5, 6 } })
    );
    assertEquals(
      13,
      solution.minFallingPathSum(
        new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }
      )
    );
    assertEquals(
      15,
      solution.minFallingPathSum(
        new int[][] {
          { 2, 3, 4, 3, 2, 4, 2, 4 },
          { 6, 5, 4, 5, 4, 6, 5, 6 },
          { 9, 10, 9, 100, 200, 100, 300, 9 },
        }
      )
    );
    assertEquals(
      -122,
      solution.minFallingPathSum(
        new int[][] { { -73, 61, 43 }, { 3, 30, 27 }, { 96, -76, 84 } }
      )
    );
    assertEquals(
      -192,
      solution.minFallingPathSum(
        new int[][] {
          { -73, 61, 43, -48, -36 },
          { 3, 30, 27, 57, 10 },
          { 96, -76, 84, 59, -15 },
          { 5, -49, 76, 31, -7 },
          { 97, 91, 61, -46, 67 },
        }
      )
    );
  }
}
