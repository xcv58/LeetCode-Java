package com.xcv58.leetcode.bulb_switcher_iv;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.minFlips(null));
    assertEquals(0, solution.minFlips(""));
    assertEquals(0, solution.minFlips("000"));
    assertEquals(1, solution.minFlips("111"));
    assertEquals(2, solution.minFlips("111000"));
    assertEquals(3, solution.minFlips("111000111"));
    assertEquals(5, solution.minFlips("001011101"));
    assertEquals(6, solution.minFlips("0010111010"));
    assertEquals(7, solution.minFlips("1001011101"));
    assertEquals(7, solution.minFlips("01001011101"));
  }
}
