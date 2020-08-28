package com.xcv58.leetcode.count_odd_numbers_in_an_interval_range;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.countOdds(0, 0));
    assertEquals(1, solution.countOdds(0, 1));
    assertEquals(3, solution.countOdds(0, 5));
    assertEquals(3, solution.countOdds(0, 6));
    assertEquals(4, solution.countOdds(0, 7));
    assertEquals(47, solution.countOdds(7, 100));
    assertEquals(47, solution.countOdds(6, 100));
    assertEquals(47, solution.countOdds(6, 99));
    assertEquals(0, solution.countOdds(100, 100));
    assertEquals(1, solution.countOdds(101, 101));
    assertEquals(
      Integer.MAX_VALUE / 2 - 2,
      solution.countOdds(6, Integer.MAX_VALUE)
    );
    assertEquals(
      Integer.MAX_VALUE / 2 - 3,
      solution.countOdds(6, Integer.MAX_VALUE / 2 * 2)
    );
    assertEquals(
      Integer.MAX_VALUE / 4 + 2,
      solution.countOdds(Integer.MAX_VALUE / 2, Integer.MAX_VALUE)
    );
  }
}
