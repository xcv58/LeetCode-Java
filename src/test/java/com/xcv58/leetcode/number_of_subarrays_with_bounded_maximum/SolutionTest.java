package com.xcv58.leetcode.number_of_subarrays_with_bounded_maximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.numSubarrayBoundedMax(null, 2, 3));
    assertEquals(0, solution.numSubarrayBoundedMax(new int[] {}, 2, 3));
    assertEquals(
      5,
      solution.numSubarrayBoundedMax(new int[] { 2, 1, 3 }, 2, 3)
    );
    assertEquals(
      3,
      solution.numSubarrayBoundedMax(new int[] { 2, 1, 4, 3 }, 2, 3)
    );
    assertEquals(
      57,
      solution.numSubarrayBoundedMax(
        new int[] { 3, 0, 7, 3, 8, 0, 8, 4, 3, 8, 2 },
        7,
        8
      )
    );
    assertEquals(
      1161,
      solution.numSubarrayBoundedMax(
        new int[] {
          1,
          7,
          0,
          0,
          9,
          3,
          0,
          7,
          4,
          2,
          1,
          3,
          9,
          0,
          3,
          0,
          7,
          3,
          8,
          0,
          8,
          4,
          3,
          8,
          2,
          4,
          3,
          4,
          2,
          7,
          0,
          3,
          7,
          4,
          1,
          5,
          6,
          5,
          7,
          0,
          7,
          0,
          6,
          4,
          7,
          6,
          3,
          7,
          6,
          2,
          4,
          1,
          1,
          8,
          0,
          7,
          5,
          6,
          4,
          5,
          2,
          7,
          9,
          1,
          6,
          1,
          5,
        },
        7,
        8
      )
    );
  }
}
