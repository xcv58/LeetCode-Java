package com.xcv58.leetcode.subarrays_with_k_different_integers;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.subarraysWithKDistinct(new int[] {}, 2));
    assertEquals(0, solution.subarraysWithKDistinct(null, 2));
    assertEquals(0, solution.subarraysWithKDistinct(new int[] { 1 }, 2));
    assertEquals(
      0,
      solution.subarraysWithKDistinct(new int[] { 1, 1, 1, 1 }, 2)
    );
    assertEquals(
      4,
      solution.subarraysWithKDistinct(new int[] { 1, 1, 1, 1, 2 }, 2)
    );
    assertEquals(
      8,
      solution.subarraysWithKDistinct(new int[] { 1, 1, 2, 1, 1 }, 2)
    );
    assertEquals(
      7,
      solution.subarraysWithKDistinct(new int[] { 1, 2, 1, 1, 3 }, 2)
    );
    assertEquals(
      7,
      solution.subarraysWithKDistinct(new int[] { 1, 2, 1, 2, 3 }, 2)
    );
    assertEquals(
      5,
      solution.subarraysWithKDistinct(new int[] { 1, 2, 1, 3, 4 }, 2)
    );
    assertEquals(
      3,
      solution.subarraysWithKDistinct(new int[] { 1, 2, 1, 3, 4 }, 3)
    );
    assertEquals(
      7,
      solution.subarraysWithKDistinct(new int[] { 1, 2, 1, 2, 3 }, 2)
    );
    assertEquals(
      5,
      solution.subarraysWithKDistinct(new int[] { 1, 2, 1, 1 }, 2)
    );
    assertEquals(3, solution.subarraysWithKDistinct(new int[] { 1, 2, 1 }, 2));
    assertEquals(
      131,
      solution.subarraysWithKDistinct(
        new int[] {
          1,
          1,
          2,
          1,
          1,
          2,
          3,
          1,
          3,
          2,
          1,
          3,
          1,
          2,
          3,
          4,
          1,
          2,
          4,
          5,
          7,
          1,
          2,
          3,
          4,
          2,
          12,
          3,
          1,
          2,
          3,
          4,
          4,
          4,
          4,
          4,
          4,
          1,
          2,
          3,
          4,
          5,
          6,
          1,
          2,
          3,
          3,
          4,
          4,
          1,
          2,
          4,
          4,
        },
        3
      )
    );
  }
}
