package com.xcv58.leetcode._01_matrix;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertArrayEquals(
      new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } },
      solution.updateMatrix(
        new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }
      )
    );
    assertArrayEquals(
      new int[][] { { 3, 2, 1 }, { 2, 1, 0 }, { 1, 0, 0 } },
      solution.updateMatrix(
        new int[][] { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 0 } }
      )
    );
  }
}
