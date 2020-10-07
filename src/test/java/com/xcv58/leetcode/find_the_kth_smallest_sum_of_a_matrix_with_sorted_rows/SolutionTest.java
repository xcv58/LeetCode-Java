package com.xcv58.leetcode.find_the_kth_smallest_sum_of_a_matrix_with_sorted_rows;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      7,
      solution.kthSmallest(new int[][] { { 1, 3, 11 }, { 2, 4, 6 } }, 5)
    );
    assertEquals(
      17,
      solution.kthSmallest(new int[][] { { 1, 3, 11 }, { 2, 4, 6 } }, 9)
    );
    assertEquals(
      9,
      solution.kthSmallest(
        new int[][] { { 1, 10, 10 }, { 1, 4, 5 }, { 2, 3, 6 } },
        7
      )
    );
    assertEquals(
      12,
      solution.kthSmallest(new int[][] { { 1, 1, 10 }, { 2, 2, 9 } }, 7)
    );
    assertEquals(
      9,
      solution.kthSmallest(new int[][] { { 3, 11 }, { 4, 6 }, { 2, 99 } }, 1)
    );
    assertEquals(
      11,
      solution.kthSmallest(new int[][] { { 3, 11 }, { 4, 6 }, { 2, 99 } }, 2)
    );
    assertEquals(
      17,
      solution.kthSmallest(new int[][] { { 3, 11 }, { 4, 6 }, { 2, 99 } }, 3)
    );
    assertEquals(
      19,
      solution.kthSmallest(new int[][] { { 3, 11 }, { 4, 6 }, { 2, 99 } }, 4)
    );
    assertEquals(
      106,
      solution.kthSmallest(new int[][] { { 3, 11 }, { 4, 6 }, { 2, 99 } }, 5)
    );
    assertEquals(
      108,
      solution.kthSmallest(new int[][] { { 3, 11 }, { 4, 6 }, { 2, 99 } }, 6)
    );
    assertEquals(
      114,
      solution.kthSmallest(new int[][] { { 3, 11 }, { 4, 6 }, { 2, 99 } }, 7)
    );
    assertEquals(
      116,
      solution.kthSmallest(new int[][] { { 3, 11 }, { 4, 6 }, { 2, 99 } }, 8)
    );
  }
}
