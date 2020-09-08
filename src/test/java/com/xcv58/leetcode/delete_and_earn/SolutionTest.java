package com.xcv58.leetcode.delete_and_earn;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.deleteAndEarn(null));
    assertEquals(0, solution.deleteAndEarn(new int[] {}));
    assertEquals(1, solution.deleteAndEarn(new int[] { 1 }));
    assertEquals(6, solution.deleteAndEarn(new int[] { 3, 4, 2 }));
    assertEquals(9, solution.deleteAndEarn(new int[] { 3, 4, 2, 2, 3, 3 }));
    assertEquals(8, solution.deleteAndEarn(new int[] { 1, 1, 2, 2, 3, 3, 4 }));
    assertEquals(
      43,
      solution.deleteAndEarn(new int[] { 1, 1, 3, 3, 3, 4, 6, 8, 8, 10 })
    );
  }
}
