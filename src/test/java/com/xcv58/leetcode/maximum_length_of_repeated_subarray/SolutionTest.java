package com.xcv58.leetcode.maximum_length_of_repeated_subarray;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.findLength(null, null));
    assertEquals(0, solution.findLength(null, new int[] {}));
    assertEquals(0, solution.findLength(new int[] {}, null));
    assertEquals(0, solution.findLength(new int[] {}, new int[] {}));
    assertEquals(0, solution.findLength(new int[] { 1 }, new int[] { 2 }));
    assertEquals(1, solution.findLength(new int[] { 1 }, new int[] { 1 }));
    assertEquals(
      1,
      solution.findLength(new int[] { 2, 1 }, new int[] { 1, 2 })
    );
    assertEquals(
      3,
      solution.findLength(
        new int[] { 1, 2, 3, 2, 1 },
        new int[] { 3, 2, 1, 4, 7 }
      )
    );
    assertEquals(
      4,
      solution.findLength(
        new int[] { 1, 2, 3, 2, 1, 4, 1 },
        new int[] { 3, 2, 1, 4, 7 }
      )
    );
  }
}
