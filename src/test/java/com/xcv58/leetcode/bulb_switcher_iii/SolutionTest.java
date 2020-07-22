package com.xcv58.leetcode.bulb_switcher_iii;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.numTimesAllBlue(null));
    assertEquals(0, solution.numTimesAllBlue(new int[] {}));
    assertEquals(1, solution.numTimesAllBlue(new int[] { 1 }));
    assertEquals(2, solution.numTimesAllBlue(new int[] { 1, 2 }));
    assertEquals(1, solution.numTimesAllBlue(new int[] { 2, 1 }));
    assertEquals(3, solution.numTimesAllBlue(new int[] { 1, 2, 3 }));
    assertEquals(3, solution.numTimesAllBlue(new int[] { 4, 1, 2, 3, 5, 6 }));
  }
}
