package com.xcv58.leetcode.sort_the_matrix_diagonally;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertArrayEquals(
      new int[][] { { 1, 1, 1, 1 }, { 1, 2, 2, 2 }, { 1, 2, 3, 3 } },
      solution.diagonalSort(
        new int[][] { { 3, 3, 1, 1 }, { 2, 2, 1, 2 }, { 1, 1, 1, 2 } }
      )
    );
    assertArrayEquals(
      new int[][] {
        { -1, 1, 1, 1, 8 },
        { 1, 0, 2, 2, 9 },
        { 2, 3, 2, 3, 9 },
        { 1, 2, 9, 4, 12 },
      },
      solution.diagonalSort(
        new int[][] {
          { 4, 3, 1, 1, 8 },
          { 3, 0, 1, 2, 9 },
          { 2, 1, -1, 2, 9 },
          { 1, 2, 9, 2, 12 },
        }
      )
    );
    assertArrayEquals(new int[][] {}, solution.diagonalSort(new int[][] {}));
    assertArrayEquals(new int[][] {}, solution.diagonalSort(null));
  }
}
