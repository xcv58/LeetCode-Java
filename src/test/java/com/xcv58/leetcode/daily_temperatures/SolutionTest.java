package com.xcv58.leetcode.daily_temperatures;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertArrayEquals(null, solution.dailyTemperatures(null));
    assertArrayEquals(new int[] {}, solution.dailyTemperatures(new int[] {}));
    assertArrayEquals(
      new int[] { 1, 1, 4, 2, 1, 1, 0, 0 },
      solution.dailyTemperatures(new int[] { 73, 74, 75, 71, 69, 72, 76, 73 })
    );
  }
}
