package com.xcv58.leetcode.construct_k_palindrome_strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(false, solution.canConstruct(null, 1));
    assertEquals(false, solution.canConstruct("", 1));
    assertEquals(false, solution.canConstruct("a", 2));
    assertEquals(false, solution.canConstruct("abc", 4));
    assertEquals(true, solution.canConstruct("abcd", 4));
    assertEquals(true, solution.canConstruct("true", 4));
    assertEquals(true, solution.canConstruct("yzyzzyzyzyzy", 2));
    assertEquals(true, solution.canConstruct("xxyzyzzyzyzyzy", 2));
    assertEquals(false, solution.canConstruct("leetcode", 2));
    assertEquals(false, solution.canConstruct("leetcode", 3));
    assertEquals(true, solution.canConstruct("annabelle", 2));
  }
}
