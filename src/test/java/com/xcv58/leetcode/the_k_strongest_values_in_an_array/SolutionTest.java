package com.xcv58.leetcode.the_k_strongest_values_in_an_array;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertArrayEquals(
      new int[] { 5, 1, 0, 0 },
      solution.getStrongest(new int[] { 1, 5 }, 4)
    );
    assertArrayEquals(
      new int[] { 5, 1 },
      solution.getStrongest(new int[] { 1, 2, 3, 4, 5 }, 2)
    );
    assertArrayEquals(
      new int[] { 5, 5 },
      solution.getStrongest(new int[] { 1, 1, 3, 5, 5 }, 2)
    );
    assertArrayEquals(
      new int[] { 11, 8, 6, 6, 7 },
      solution.getStrongest(new int[] { 6, 7, 11, 7, 6, 8 }, 5)
    );
    assertArrayEquals(
      new int[] { -3, 11, 2 },
      solution.getStrongest(new int[] { 6, -3, 7, 2, 11 }, 3)
    );
  }
}
