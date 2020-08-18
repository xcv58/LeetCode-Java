package com.xcv58.leetcode.non_decreasing_array;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(true, solution.checkPossibility(null));
    assertEquals(true, solution.checkPossibility(new int[] {}));
    assertEquals(true, solution.checkPossibility(new int[] { 0 }));
    assertEquals(true, solution.checkPossibility(new int[] { 0, 1 }));
    assertEquals(true, solution.checkPossibility(new int[] { 0, 2 }));
    assertEquals(true, solution.checkPossibility(new int[] { 3, 2 }));
    assertEquals(true, solution.checkPossibility(new int[] { 1, 2, 3, 3, 2 }));
    assertEquals(false, solution.checkPossibility(new int[] { 4, 2, 3, 1 }));
    assertEquals(false, solution.checkPossibility(new int[] { 4, 2, 3, 2 }));
  }
}
