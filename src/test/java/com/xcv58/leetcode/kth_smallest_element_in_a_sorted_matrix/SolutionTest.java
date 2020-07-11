package com.xcv58.leetcode.kth_smallest_element_in_a_sorted_matrix;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      5,
      solution.kthSmallest(
        new int[][] { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } },
        2
      )
    );
    assertEquals(
      13,
      solution.kthSmallest(
        new int[][] { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } },
        8
      )
    );
    assertEquals(
      1,
      solution.kthSmallest(new int[][] { { 1, 2 }, { 1, 3 } }, 1)
    );
    assertEquals(
      1,
      solution.kthSmallest(new int[][] { { 1, 2 }, { 1, 3 } }, 2)
    );
    assertEquals(
      0,
      solution.kthSmallest(
        new int[][] {
          { 0, 1, 2, 3, 4, 5 },
          { 1, 3, 6, 7, 9, 10 },
          { 2, 4, 7, 8, 10, 12 },
          { 3, 9, 10, 11, 12, 14 },
          { 4, 10, 11, 12, 20, 21 },
          { 5, 20, 21, 22, 23, 30 },
        },
        1
      )
    );
    assertEquals(
      3,
      solution.kthSmallest(
        new int[][] {
          { 0, 1, 2, 3, 4, 5 },
          { 1, 3, 6, 7, 9, 10 },
          { 2, 4, 7, 8, 10, 12 },
          { 3, 9, 10, 11, 12, 14 },
          { 4, 10, 11, 12, 20, 21 },
          { 5, 20, 21, 22, 23, 30 },
        },
        8
      )
    );
    assertEquals(
      4,
      solution.kthSmallest(
        new int[][] {
          { 0, 1, 2, 3, 4, 5 },
          { 1, 3, 6, 7, 9, 10 },
          { 2, 4, 7, 8, 10, 12 },
          { 3, 9, 10, 11, 12, 14 },
          { 4, 10, 11, 12, 20, 21 },
          { 5, 20, 21, 22, 23, 30 },
        },
        9
      )
    );
    assertEquals(
      5,
      solution.kthSmallest(
        new int[][] {
          { 0, 1, 2, 3, 4, 5 },
          { 1, 3, 6, 7, 9, 10 },
          { 2, 4, 7, 8, 10, 12 },
          { 3, 9, 10, 11, 12, 14 },
          { 4, 10, 11, 12, 20, 21 },
          { 5, 20, 21, 22, 23, 30 },
        },
        12
      )
    );
  }
}
