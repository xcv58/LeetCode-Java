package com.xcv58.leetcode.reverse_bits;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(1 << 31, solution.reverseBits(1));
    assertEquals((1 << 31) | (1 << 30), solution.reverseBits(3));
    assertEquals(1, solution.reverseBits(1 << 31));
    assertEquals(1 << 27, solution.reverseBits(16));
    assertEquals((1 << 31) | (1 << 30) | (1 << 28), solution.reverseBits(11));
  }
}
