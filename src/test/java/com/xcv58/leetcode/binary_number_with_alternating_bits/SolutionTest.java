package com.xcv58.leetcode.binary_number_with_alternating_bits;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(true, solution.hasAlternatingBits(1));
    assertEquals(true, solution.hasAlternatingBits(2));
    assertEquals(true, solution.hasAlternatingBits(5));
    assertEquals(true, solution.hasAlternatingBits(10));
    assertEquals(false, solution.hasAlternatingBits(Integer.MAX_VALUE / 2));
    assertEquals(false, solution.hasAlternatingBits(Integer.MAX_VALUE));
    assertEquals(true, solution.hasAlternatingBits(0b101));
    assertEquals(
      true,
      solution.hasAlternatingBits(0b10101010101010101010101010101010)
    );
    assertEquals(
      true,
      solution.hasAlternatingBits(0b01010101010101010101010101010101)
    );
  }
}
