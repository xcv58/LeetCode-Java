package com.xcv58.leetcode.koko_eating_bananas;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.minEatingSpeed(null, 8));
    assertEquals(0, solution.minEatingSpeed(new int[] {}, 8));
    assertEquals(4, solution.minEatingSpeed(new int[] { 3, 6, 7, 11 }, 8));
    assertEquals(
      30,
      solution.minEatingSpeed(new int[] { 30, 11, 23, 4, 20 }, 5)
    );
    assertEquals(
      23,
      solution.minEatingSpeed(new int[] { 30, 11, 23, 4, 20 }, 6)
    );
    assertEquals(
      14,
      solution.minEatingSpeed(
        new int[] {
          332484035,
          524908576,
          855865114,
          632922376,
          222257295,
          690155293,
          112677673,
          679580077,
          337406589,
          290818316,
          877337160,
          901728858,
          679284947,
          688210097,
          692137887,
          718203285,
          629455728,
          941802184,
        },
        823855818
      )
    );
  }
}
