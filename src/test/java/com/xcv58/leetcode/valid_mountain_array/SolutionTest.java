package com.xcv58.leetcode.valid_mountain_array;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(false, solution.validMountainArray(null));
    assertEquals(false, solution.validMountainArray(new int[] {}));
    assertEquals(false, solution.validMountainArray(new int[] { 0 }));
    assertEquals(false, solution.validMountainArray(new int[] { 0, 1 }));
    assertEquals(false, solution.validMountainArray(new int[] { 0, 1, 2 }));
    assertEquals(false, solution.validMountainArray(new int[] { 0, 1, 2, 3 }));
    assertEquals(false, solution.validMountainArray(new int[] { 3, 2, 1, 0 }));
    assertEquals(
      false,
      solution.validMountainArray(new int[] { 0, 1, 2, 3, 0, 0 })
    );
    assertEquals(
      false,
      solution.validMountainArray(new int[] { 0, 1, 2, 3, 3, 0 })
    );
    assertEquals(
      false,
      solution.validMountainArray(new int[] { 0, 1, 2, 2, 3, 0 })
    );
    assertEquals(
      false,
      solution.validMountainArray(new int[] { 0, 1, 2, 1, 3, 0 })
    );
    assertEquals(
      true,
      solution.validMountainArray(new int[] { 0, 1, 2, 3, 0 })
    );
    assertEquals(
      true,
      solution.validMountainArray(new int[] { 0, 1, 2, 3, 0 })
    );
  }
}
