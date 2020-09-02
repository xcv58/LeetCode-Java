package com.xcv58.leetcode.three_consecutive_odds;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(false, solution.threeConsecutiveOdds(null));
    assertEquals(false, solution.threeConsecutiveOdds(new int[] {}));
    assertEquals(false, solution.threeConsecutiveOdds(new int[] { 1 }));
    assertEquals(false, solution.threeConsecutiveOdds(new int[] { 1, 2, 3 }));
    assertEquals(
      false,
      solution.threeConsecutiveOdds(new int[] { 1, 2, 3, 5, 8 })
    );
    assertEquals(
      false,
      solution.threeConsecutiveOdds(
        new int[] { 1, 2, 3, 5, 8, 9, 10, Integer.MAX_VALUE }
      )
    );
    assertEquals(
      true,
      solution.threeConsecutiveOdds(
        new int[] { 1, 3, 5, 8, 9, 10, Integer.MAX_VALUE }
      )
    );
    assertEquals(
      true,
      solution.threeConsecutiveOdds(new int[] { 1, 9, Integer.MAX_VALUE })
    );
    assertEquals(
      false,
      solution.threeConsecutiveOdds(new int[] { 1, 9, Integer.MIN_VALUE })
    );
  }
}
