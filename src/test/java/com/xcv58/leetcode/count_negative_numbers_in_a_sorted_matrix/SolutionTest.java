package com.xcv58.leetcode.count_negative_numbers_in_a_sorted_matrix;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.countNegatives(null));
    assertEquals(0, solution.countNegatives(new int[][] {}));
    assertEquals(
      8,
      solution.countNegatives(
        new int[][] {
          { 4, 3, 2, -1 },
          { 3, 2, 1, -1 },
          { 1, 1, -1, -2 },
          { -1, -1, -2, -3 },
        }
      )
    );
    assertEquals(
      0,
      solution.countNegatives(
        new int[][] {
          { 4, 3, 2, 1 },
          { 3, 2, 1, 1 },
          { 1, 1, 1, 2 },
          { 1, 1, 2, 3 },
        }
      )
    );
  }
}
