package com.xcv58.leetcode.count_square_submatrices_with_all_ones;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      7,
      solution.countSquares(
        new int[][] { { 1, 0, 1 }, { 1, 1, 0 }, { 1, 1, 0 } }
      )
    );
    assertEquals(
      15,
      solution.countSquares(
        new int[][] { { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 0, 1, 1, 1 } }
      )
    );
    assertEquals(
      20,
      solution.countSquares(
        new int[][] { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } }
      )
    );
    assertEquals(
      10,
      solution.countSquares(
        new int[][] { { 1, 1, 1, 1 }, { 1, 0, 0, 1 }, { 1, 1, 1, 1 } }
      )
    );
  }
}
