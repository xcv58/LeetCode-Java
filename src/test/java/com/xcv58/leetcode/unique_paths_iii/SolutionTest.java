package com.xcv58.leetcode.unique_paths_iii;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      0,
      solution.uniquePathsIII(
        new int[][] { { 1, 0, 0, 0 }, { 0, 2, -1, 0 }, { 0, 0, 0, -1 } }
      )
    );
    assertEquals(
      2,
      solution.uniquePathsIII(
        new int[][] { { 1, 0, 0, 0 }, { 0, 2, -1, 0 }, { 0, 0, 0, 0 } }
      )
    );
    assertEquals(
      1,
      solution.uniquePathsIII(
        new int[][] { { 1, 0, 0, 0 }, { 2, -1, -1, 0 }, { 0, 0, 0, 0 } }
      )
    );
    assertEquals(
      4,
      solution.uniquePathsIII(
        new int[][] { { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 2 } }
      )
    );
    assertEquals(
      2,
      solution.uniquePathsIII(
        new int[][] { { 1, 2, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } }
      )
    );
    assertEquals(
      2,
      solution.uniquePathsIII(
        new int[][] { { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 2, -1 } }
      )
    );
    assertEquals(
      10204,
      solution.uniquePathsIII(
        new int[][] {
          { 1, 0, 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 0, 0, 2 },
        }
      )
    );
    assertEquals(
      6572,
      solution.uniquePathsIII(
        new int[][] {
          { 1, 0, 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 2, 0, 0 },
        }
      )
    );
  }
}
