package com.xcv58.leetcode.longest_turbulent_subarray;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.maxTurbulenceSize(null));
    assertEquals(0, solution.maxTurbulenceSize(new int[] {}));
    assertEquals(
      5,
      solution.maxTurbulenceSize(new int[] { 9, 4, 2, 10, 7, 8, 8, 1, 9 })
    );
    assertEquals(
      8,
      solution.maxTurbulenceSize(
        new int[] { 9, 4, 2, 10, 7, 8, 8, 1, 9, 8, 10, 7, 9, 8 }
      )
    );
    assertEquals(2, solution.maxTurbulenceSize(new int[] { 4, 8, 12, 16 }));
    assertEquals(1, solution.maxTurbulenceSize(new int[] { 1000 }));
    assertEquals(
      2,
      solution.maxTurbulenceSize(new int[] { 1000, 999, 998, 997, 12, 1, 0 })
    );
    assertEquals(
      1,
      solution.maxTurbulenceSize(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 })
    );
    assertEquals(
      2,
      solution.maxTurbulenceSize(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 2 })
    );
    assertEquals(
      3,
      solution.maxTurbulenceSize(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1 })
    );
  }
}
