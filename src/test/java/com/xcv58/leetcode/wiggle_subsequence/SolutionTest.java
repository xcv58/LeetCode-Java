package com.xcv58.leetcode.wiggle_subsequence;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.wiggleMaxLength(null));
    assertEquals(0, solution.wiggleMaxLength(new int[] {}));
    assertEquals(1, solution.wiggleMaxLength(new int[] { 1 }));
    assertEquals(2, solution.wiggleMaxLength(new int[] { 1, 2 }));
    assertEquals(2, solution.wiggleMaxLength(new int[] { 1, 2, 3 }));
    assertEquals(
      7,
      solution.wiggleMaxLength(new int[] { 1, 17, 5, 10, 13, 15, 10, 5, 16, 8 })
    );
  }
}
