package com.xcv58.leetcode.sort_array_by_parity_ii;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertArrayEquals(
      new int[] { 4, 5, 2, 7, 12, 9, 100, 99 },
      solution.sortArrayByParityII(new int[] { 4, 2, 5, 7, 9, 12, 100, 99 })
    );
    assertArrayEquals(
      new int[] { 2, 1, 4, 3, 6, 5 },
      solution.sortArrayByParityII(new int[] { 2, 1, 4, 3, 6, 5 })
    );
  }
}
