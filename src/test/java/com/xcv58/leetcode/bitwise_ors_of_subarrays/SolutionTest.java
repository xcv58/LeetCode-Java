package com.xcv58.leetcode.bitwise_ors_of_subarrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.subarrayBitwiseORs(new int[] {}));
    assertEquals(1, solution.subarrayBitwiseORs(new int[] { 0 }));
    assertEquals(1, solution.subarrayBitwiseORs(new int[] { 1 }));
    assertEquals(3, solution.subarrayBitwiseORs(new int[] { 1, 1, 2 }));
    assertEquals(5, solution.subarrayBitwiseORs(new int[] { 1, 2, 3, 4 }));
    assertEquals(
      17,
      solution.subarrayBitwiseORs(new int[] { 1, 2, 3, 4, 8, 16, 32 })
    );
  }
}
