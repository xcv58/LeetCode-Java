package com.xcv58.leetcode.coin_change;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(3, solution.coinChange(new int[] { 1, 2, 5 }, 11));
    assertEquals(
      16,
      solution.coinChange(
        new int[] { 461, 307, 4, 97, 352, 446, 479, 243 },
        7265
      )
    );
    assertEquals(
      22,
      solution.coinChange(new int[] { 4, 97, 352, 446, 479, 243 }, 10000)
    );
    assertEquals(
      102,
      solution.coinChange(
        new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 99 },
        10000
      )
    );
  }
}
