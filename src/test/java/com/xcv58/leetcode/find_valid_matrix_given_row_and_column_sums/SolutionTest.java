package com.xcv58.leetcode.find_valid_matrix_given_row_and_column_sums;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(null, solution.restoreMatrix(null, null));
    assertEquals(null, solution.restoreMatrix(null, new int[] {}));
    assertEquals(null, solution.restoreMatrix(new int[] {}, null));
    assertArrayEquals(
      new int[][] {},
      solution.restoreMatrix(new int[] {}, new int[] {})
    );
    assertArrayEquals(
      new int[][] { { 3, 0 }, { 1, 7 } },
      solution.restoreMatrix(new int[] { 3, 8 }, new int[] { 4, 7 })
    );
    assertArrayEquals(
      new int[][] { { 0, 5, 0 }, { 6, 1, 0 }, { 2, 0, 8 } },
      solution.restoreMatrix(new int[] { 5, 7, 10 }, new int[] { 8, 6, 8 })
    );
    assertArrayEquals(
      new int[][] { { 0, 9, 5 }, { 6, 0, 3 } },
      solution.restoreMatrix(new int[] { 14, 9 }, new int[] { 6, 9, 8 })
    );
    assertArrayEquals(
      new int[][] { { 1 }, { 0 } },
      solution.restoreMatrix(new int[] { 1, 0 }, new int[] { 1 })
    );
    assertArrayEquals(
      new int[][] { { 0 } },
      solution.restoreMatrix(new int[] { 0 }, new int[] { 0 })
    );
    assertArrayEquals(
      new int[][] { { 0 } },
      solution.restoreMatrix(new int[] { 9 }, new int[] { 0 })
    );
  }
}
