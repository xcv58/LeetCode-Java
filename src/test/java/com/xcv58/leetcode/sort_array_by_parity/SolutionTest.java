package com.xcv58.leetcode.sort_array_by_parity;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(null, solution.sortArrayByParity(null));
    assertArrayEquals(new int[] {}, solution.sortArrayByParity(new int[] {}));
    assertArrayEquals(
      new int[] { 1 },
      solution.sortArrayByParity(new int[] { 1 })
    );
    assertArrayEquals(
      new int[] { 2, 1 },
      solution.sortArrayByParity(new int[] { 1, 2 })
    );
    assertArrayEquals(
      new int[] { 4, 2, 3, 1 },
      solution.sortArrayByParity(new int[] { 1, 2, 3, 4 })
    );
    assertArrayEquals(
      new int[] { 4, 6, 8, 10, 1, 3, 5, 7 },
      solution.sortArrayByParity(new int[] { 4, 6, 8, 10, 1, 3, 5, 7 })
    );
    assertArrayEquals(
      new int[] { 4, 6, 8, 10, 1, 3, 5, 7 },
      solution.sortArrayByParity(new int[] { 7, 5, 3, 1, 10, 8, 6, 4 })
    );
  }
}
