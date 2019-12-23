package com.xcv58.leetcode.shortest_palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals("", solution.shortestPalindrome(""));
    assertEquals("a", solution.shortestPalindrome("a"));
    assertEquals("aba", solution.shortestPalindrome("ba"));
    assertEquals("abcba", solution.shortestPalindrome("cba"));
    assertEquals("ababa", solution.shortestPalindrome("baba"));
    assertEquals("aaabaaa", solution.shortestPalindrome("baaa"));
    assertEquals("aaacecaaa", solution.shortestPalindrome("aacecaaa"));
    assertEquals("dcbabcd", solution.shortestPalindrome("abcd"));
    assertEquals(
      "cbbcadbcbbcbdacbbc",
      solution.shortestPalindrome("cbbcbdacbbc")
    );
  }
}
