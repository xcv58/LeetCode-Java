package com.xcv58.leetcode.k_th_smallest_prime_fraction;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(null, solution.kthSmallestPrimeFraction(null, 1));
    assertArrayEquals(
      new int[] { 1, 5 },
      solution.kthSmallestPrimeFraction(new int[] { 1, 2, 3, 5 }, 1)
    );
    assertArrayEquals(
      new int[] { 1, 3 },
      solution.kthSmallestPrimeFraction(new int[] { 1, 2, 3, 5 }, 2)
    );
    assertArrayEquals(
      new int[] { 2, 5 },
      solution.kthSmallestPrimeFraction(new int[] { 1, 2, 3, 5 }, 3)
    );
    assertArrayEquals(
      new int[] { 1, 7 },
      solution.kthSmallestPrimeFraction(new int[] { 1, 7 }, 1)
    );
    assertArrayEquals(
      new int[] { 1, 19 },
      solution.kthSmallestPrimeFraction(
        new int[] { 1, 2, 3, 5, 7, 11, 13, 17, 19 },
        1
      )
    );
    assertArrayEquals(
      new int[] { 2, 19 },
      solution.kthSmallestPrimeFraction(
        new int[] { 1, 2, 3, 5, 7, 11, 13, 17, 19 },
        5
      )
    );
    assertArrayEquals(
      new int[] { 13, 17 },
      solution.kthSmallestPrimeFraction(new int[] { 1, 13, 17, 59 }, 6)
    );
  }
}
