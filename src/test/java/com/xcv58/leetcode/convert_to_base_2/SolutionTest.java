package com.xcv58.leetcode.convert_to_base_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals("0", solution.baseNeg2(0));
    assertEquals("1", solution.baseNeg2(1));
    assertEquals("1", solution.baseNeg2(1));
    assertEquals("110", solution.baseNeg2(2));
    assertEquals("111", solution.baseNeg2(3));
    assertEquals("100", solution.baseNeg2(4));
    assertEquals("101", solution.baseNeg2(5));
    assertEquals("11010", solution.baseNeg2(6));
    assertEquals("11011", solution.baseNeg2(7));
    assertEquals("11000", solution.baseNeg2(8));
    assertEquals("11001", solution.baseNeg2(9));
    assertEquals("11110", solution.baseNeg2(10));
    assertEquals("11111", solution.baseNeg2(11));
    assertEquals("11100", solution.baseNeg2(12));
    assertEquals("11101", solution.baseNeg2(13));
    assertEquals("10010", solution.baseNeg2(14));
    assertEquals("10011", solution.baseNeg2(15));
    assertEquals("10000", solution.baseNeg2(16));
    assertEquals("10001", solution.baseNeg2(17));
    assertEquals("10110", solution.baseNeg2(18));
    assertEquals("10111", solution.baseNeg2(19));
    assertEquals("10100", solution.baseNeg2(20));
    assertEquals("10101", solution.baseNeg2(21));
    assertEquals("1101010", solution.baseNeg2(22));
    assertEquals("1101011", solution.baseNeg2(23));
    assertEquals("1101000", solution.baseNeg2(24));
    assertEquals("1101001", solution.baseNeg2(25));
    assertEquals("1101110", solution.baseNeg2(26));
    assertEquals("1101111", solution.baseNeg2(27));
    assertEquals("1101001101001011000", solution.baseNeg2(99912));
    assertEquals(
      "110000000000000000000000000000011",
      solution.baseNeg2(Integer.MAX_VALUE)
    );
  }
}
