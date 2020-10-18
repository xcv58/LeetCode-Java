package com.xcv58.leetcode.smallest_rotation_with_highest_score;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.bestRotation(null));
    assertEquals(0, solution.bestRotation(new int[] {}));
    assertEquals(0, solution.bestRotation(new int[] { 0 }));
    assertEquals(0, solution.bestRotation(new int[] { 0, 1, 2 }));
    assertEquals(3, solution.bestRotation(new int[] { 2, 3, 1, 4, 0 }));
    assertEquals(0, solution.bestRotation(new int[] { 1, 3, 0, 2, 4 }));
    assertEquals(0, solution.bestRotation(new int[] { 3, 1, 0, 2, 4 }));
    assertEquals(2, solution.bestRotation(new int[] { 3, 1, 0, 4, 2 }));
  }
}
