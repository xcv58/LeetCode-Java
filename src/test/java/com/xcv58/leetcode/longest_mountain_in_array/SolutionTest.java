package com.xcv58.leetcode.longest_mountain_in_array;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.longestMountain(null));
    assertEquals(
      5,
      solution.longestMountain(new int[] { 2, 1, 4, 7, 3, 2, 5 })
    );
    assertEquals(3, solution.longestMountain(new int[] { 2, 4, 1 }));
    assertEquals(
      4,
      solution.longestMountain(new int[] { 2, 4, 1, 7, 3, 2, 2 })
    );
  }
}
