package com.xcv58.leetcode.the_k_weakest_rows_in_a_matrix;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {}, solution.kWeakestRows(new int[][] {}, 3));
    assertArrayEquals(new int[] {}, solution.kWeakestRows(null, 3));
    assertArrayEquals(
      new int[] { 2, 0, 3 },
      solution.kWeakestRows(
        new int[][] {
          { 1, 1, 0, 0, 0 },
          { 1, 1, 1, 1, 0 },
          { 1, 0, 0, 0, 0 },
          { 1, 1, 0, 0, 0 },
          { 1, 1, 1, 1, 1 },
        },
        3
      )
    );
    assertArrayEquals(
      new int[] { 0, 2, 3, 1 },
      solution.kWeakestRows(
        new int[][] {
          { 1, 0, 0, 0 },
          { 1, 1, 1, 1 },
          { 1, 0, 0, 0 },
          { 1, 0, 0, 0 },
        },
        4
      )
    );
    assertArrayEquals(
      new int[] { 0, 2, 3, 1 },
      solution.kWeakestRows(
        new int[][] {
          { 1, 0, 0, 0 },
          { 1, 1, 1, 1 },
          { 1, 0, 0, 0 },
          { 1, 0, 0, 0 },
        },
        10
      )
    );
  }
}
