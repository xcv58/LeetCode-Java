package com.xcv58.leetcode.integer_replacement;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.integerReplacement(0));
    assertEquals(0, solution.integerReplacement(1));
    assertEquals(1, solution.integerReplacement(2));
    assertEquals(2, solution.integerReplacement(3));
    assertEquals(2, solution.integerReplacement(4));
    assertEquals(3, solution.integerReplacement(5));
    assertEquals(3, solution.integerReplacement(6));
    assertEquals(4, solution.integerReplacement(7));
    assertEquals(3, solution.integerReplacement(8));
    assertEquals(4, solution.integerReplacement(9));
    assertEquals(4, solution.integerReplacement(10));
    assertEquals(5, solution.integerReplacement(11));
    assertEquals(4, solution.integerReplacement(12));
    assertEquals(5, solution.integerReplacement(13));
    assertEquals(5, solution.integerReplacement(14));
    assertEquals(5, solution.integerReplacement(15));
    assertEquals(4, solution.integerReplacement(16));
    assertEquals(5, solution.integerReplacement(17));
    assertEquals(5, solution.integerReplacement(18));
    assertEquals(6, solution.integerReplacement(19));
    assertEquals(5, solution.integerReplacement(20));
    assertEquals(6, solution.integerReplacement(21));
    assertEquals(6, solution.integerReplacement(22));
    assertEquals(6, solution.integerReplacement(23));
    assertEquals(5, solution.integerReplacement(24));
    assertEquals(6, solution.integerReplacement(25));
    assertEquals(6, solution.integerReplacement(26));
    assertEquals(7, solution.integerReplacement(27));
    assertEquals(6, solution.integerReplacement(28));
    assertEquals(7, solution.integerReplacement(29));
    assertEquals(6, solution.integerReplacement(30));
    assertEquals(6, solution.integerReplacement(31));
    assertEquals(5, solution.integerReplacement(32));
    assertEquals(6, solution.integerReplacement(33));
    assertEquals(6, solution.integerReplacement(34));
    assertEquals(7, solution.integerReplacement(35));
    assertEquals(6, solution.integerReplacement(36));
    assertEquals(7, solution.integerReplacement(37));
    assertEquals(7, solution.integerReplacement(38));
    assertEquals(7, solution.integerReplacement(39));
    assertEquals(7, solution.integerReplacement(39));
    assertEquals(0, solution.integerReplacement(-1));
    assertEquals(0, solution.integerReplacement(-10));
    assertEquals(0, solution.integerReplacement(Integer.MIN_VALUE));
    assertEquals(32, solution.integerReplacement(Integer.MAX_VALUE));
    assertEquals(32, solution.integerReplacement(Integer.MAX_VALUE - 1));
    assertEquals(32, solution.integerReplacement(Integer.MAX_VALUE - 3));
    assertEquals(32, solution.integerReplacement(Integer.MAX_VALUE - 1023));
    assertEquals(
      31,
      solution.integerReplacement(Integer.MAX_VALUE - Integer.MAX_VALUE / 4)
    );
    assertEquals(
      31,
      solution.integerReplacement(Integer.MAX_VALUE - Integer.MAX_VALUE / 2 + 1)
    );
  }
}
