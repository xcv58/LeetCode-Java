package com.xcv58.leetcode.utf_8_validation;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(true, solution.validUtf8(new int[] { 197, 130, 1 }));
    assertEquals(false, solution.validUtf8(new int[] { 235, 140, 1 }));
    assertEquals(true, solution.validUtf8(new int[] { 235, 140, 128 }));
    assertEquals(true, solution.validUtf8(new int[] { 235, 140, 128, 10 }));
    assertEquals(false, solution.validUtf8(new int[] { 235, 140, 128, 128 }));
  }
}
