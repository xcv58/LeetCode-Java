package com.xcv58.leetcode.coin_change_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(23, solution.change(10, new int[] { 1, 2, 3, 4 }));
    assertEquals(5, solution.change(12, new int[] { 2, 4, 5 }));
    assertEquals(6, solution.change(11, new int[] { 1, 4, 5 }));
    assertEquals(
      599218,
      solution.change(7265, new int[] { 461, 307, 4, 97, 352, 446, 479, 243 })
    );
  }
}
