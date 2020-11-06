package com.xcv58.leetcode.remove_k_digits;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(null, solution.removeKdigits(null, 0));
    assertEquals(null, solution.removeKdigits(null, 10));
    assertEquals("", solution.removeKdigits("", 0));
    assertEquals("", solution.removeKdigits("", 10));
    assertEquals("0", solution.removeKdigits("10", 10));
    assertEquals("123", solution.removeKdigits("12345", 2));
    assertEquals("24500432219", solution.removeKdigits("10245600432219", 2));
    assertEquals("1219", solution.removeKdigits("1432219", 3));
    assertEquals("119", solution.removeKdigits("1432219", 4));
    assertEquals("11", solution.removeKdigits("1432219", 5));
    assertEquals("1", solution.removeKdigits("1432219", 6));
    assertEquals("0", solution.removeKdigits("1432219", 7));
    assertEquals("0", solution.removeKdigits("1432219", 1000));
    assertEquals("1212735", solution.removeKdigits("912346712735", 5));
  }
}
