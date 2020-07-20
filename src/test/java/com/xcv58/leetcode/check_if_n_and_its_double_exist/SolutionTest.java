package com.xcv58.leetcode.check_if_n_and_its_double_exist;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(false, solution.checkIfExist(null));
    assertEquals(false, solution.checkIfExist(new int[] {}));
    assertEquals(true, solution.checkIfExist(new int[] { 0, 0 }));
    assertEquals(false, solution.checkIfExist(new int[] { 0 }));
    assertEquals(true, solution.checkIfExist(new int[] { 10, 2, 5, 3 }));
    assertEquals(true, solution.checkIfExist(new int[] { 7, 1, 14, 11 }));
    assertEquals(false, solution.checkIfExist(new int[] { 3, 1, 14, 11 }));
  }
}
