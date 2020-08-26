package com.xcv58.leetcode.how_many_numbers_are_smaller_than_the_current_number;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(null, solution.smallerNumbersThanCurrent(null));
    assertArrayEquals(
      new int[] {},
      solution.smallerNumbersThanCurrent(new int[] {})
    );
    assertArrayEquals(
      new int[] { 0 },
      solution.smallerNumbersThanCurrent(new int[] { 1 })
    );
    assertArrayEquals(
      new int[] { 0, 1, 2 },
      solution.smallerNumbersThanCurrent(new int[] { 1, 2, 3 })
    );
    assertArrayEquals(
      new int[] { 0, 0, 0, 0, 0 },
      solution.smallerNumbersThanCurrent(new int[] { 1, 1, 1, 1, 1 })
    );
    assertArrayEquals(
      new int[] { 0, 0, 6, 6, 3, 5, 4, 0 },
      solution.smallerNumbersThanCurrent(new int[] { 1, 1, 5, 5, 2, 4, 3, 1 })
    );
  }
}
