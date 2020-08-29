package com.xcv58.leetcode.preimage_size_of_factorial_zeroes_function;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(5, solution.preimageSizeFZF(3));
    assertEquals(5, solution.preimageSizeFZF(4));
    assertEquals(5, solution.preimageSizeFZF(0));
    assertEquals(5, solution.preimageSizeFZF(1));
    assertEquals(5, solution.preimageSizeFZF(2));
    assertEquals(0, solution.preimageSizeFZF(5));
    assertEquals(5, solution.preimageSizeFZF(6));
    assertEquals(5, solution.preimageSizeFZF(1000000000));
    assertEquals(5, solution.preimageSizeFZF(Integer.MAX_VALUE));
    assertEquals(5, solution.preimageSizeFZF(Integer.MAX_VALUE - 1));
    assertEquals(5, solution.preimageSizeFZF(Integer.MAX_VALUE - 2));
    assertEquals(0, solution.preimageSizeFZF(Integer.MAX_VALUE - 3));
    assertEquals(5, solution.preimageSizeFZF(Integer.MAX_VALUE - 4));
    assertEquals(5, solution.preimageSizeFZF(Integer.MAX_VALUE - 5));
    assertEquals(5, solution.preimageSizeFZF(Integer.MAX_VALUE - 6));
    assertEquals(5, solution.preimageSizeFZF(Integer.MAX_VALUE - 6));
    assertEquals(5, solution.preimageSizeFZF(Integer.MAX_VALUE - 7));
    assertEquals(5, solution.preimageSizeFZF(Integer.MAX_VALUE - 8));
    assertEquals(0, solution.preimageSizeFZF(Integer.MAX_VALUE - 9));
    assertEquals(5, solution.preimageSizeFZF(Integer.MAX_VALUE - 10));
    assertEquals(0, solution.preimageSizeFZF(Integer.MAX_VALUE / 2));
    assertEquals(5, solution.preimageSizeFZF(Integer.MAX_VALUE / 5));
    assertEquals(5, solution.preimageSizeFZF(Integer.MAX_VALUE / 10));
    assertEquals(5, solution.preimageSizeFZF(Integer.MAX_VALUE / 8));
  }
}
