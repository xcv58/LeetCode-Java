package com.xcv58.leetcode.sum_of_distances_in_tree;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertArrayEquals(
      new int[] { 30, 20, 24, 26, 16, 32, 22, 18, 28, 28 },
      solution.sumOfDistancesInTree(
        10,
        new int[][] {
          { 2, 5 },
          { 8, 1 },
          { 9, 1 },
          { 4, 6 },
          { 7, 2 },
          { 3, 7 },
          { 7, 4 },
          { 6, 0 },
          { 4, 1 },
        }
      )
    );
    assertArrayEquals(
      new int[] { 8, 12, 6, 10, 10, 10 },
      solution.sumOfDistancesInTree(
        6,
        new int[][] { { 0, 1 }, { 0, 2 }, { 2, 3 }, { 2, 4 }, { 2, 5 } }
      )
    );
  }
}
