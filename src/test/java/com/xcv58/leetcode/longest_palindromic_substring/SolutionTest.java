package com.xcv58.leetcode.longest_palindromic_substring;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals("", solution.longestPalindrome(null));
    assertEquals("", solution.longestPalindrome(""));
    assertEquals("a", solution.longestPalindrome("a"));
    assertEquals("a", solution.longestPalindrome("abcdef"));
    assertEquals("bcb", solution.longestPalindrome("abcbdef"));
    assertEquals("abcba", solution.longestPalindrome("abcbadef"));
    assertEquals(
      "abcbadeffedabcba",
      solution.longestPalindrome("abcbadeffedabcba")
    );
  }
}
