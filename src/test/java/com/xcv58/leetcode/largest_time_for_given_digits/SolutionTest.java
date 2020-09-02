package com.xcv58.leetcode.largest_time_for_given_digits;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals("", solution.largestTimeFromDigits(null));
    assertEquals("", solution.largestTimeFromDigits(new int[] {}));
    assertEquals(
      "",
      solution.largestTimeFromDigits(new int[] { 1, 2, 3, 4, 5 })
    );
    assertEquals(
      "23:41",
      solution.largestTimeFromDigits(new int[] { 1, 2, 3, 4 })
    );
    assertEquals("", solution.largestTimeFromDigits(new int[] { 4, 5, 3, 4 }));
    assertEquals(
      "23:44",
      solution.largestTimeFromDigits(new int[] { 4, 2, 3, 4 })
    );
    assertEquals(
      "09:09",
      solution.largestTimeFromDigits(new int[] { 0, 9, 0, 9 })
    );
    assertEquals(
      "09:50",
      solution.largestTimeFromDigits(new int[] { 0, 9, 0, 5 })
    );
  }
}
