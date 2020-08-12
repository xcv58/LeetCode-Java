package com.xcv58.leetcode.greatest_common_divisor_of_strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals("", solution.gcdOfStrings(null, null));
    assertEquals("", solution.gcdOfStrings(null, ""));
    assertEquals("", solution.gcdOfStrings("", null));
    assertEquals("", solution.gcdOfStrings("", ""));
    assertEquals("", solution.gcdOfStrings("A", "AB"));
    assertEquals("AB", solution.gcdOfStrings("AB", "AB"));
    assertEquals("ABC", solution.gcdOfStrings("ABCABC", "ABC"));
    assertEquals("ABABAB", solution.gcdOfStrings("ABABAB", "ABABAB"));
    assertEquals("", solution.gcdOfStrings("ABABABC", "ABABAB"));
    assertEquals("", solution.gcdOfStrings("ABCDE", "AZEA"));
  }
}
