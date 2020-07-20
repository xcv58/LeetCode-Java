package com.xcv58.leetcode.distinct_subsequences;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.numDistinct(null, null));
    assertEquals(0, solution.numDistinct(null, "a"));
    assertEquals(0, solution.numDistinct("a", null));
    assertEquals(0, solution.numDistinct("a", ""));
    assertEquals(0, solution.numDistinct("", ""));
    assertEquals(0, solution.numDistinct("", "a"));
    assertEquals(0, solution.numDistinct("a", "b"));
    assertEquals(0, solution.numDistinct("aaa", "aaaaaa"));
    assertEquals(0, solution.numDistinct("abcdefgh", "zz"));
    assertEquals(1, solution.numDistinct("a", "a"));
    assertEquals(1, solution.numDistinct("ab", "a"));
    assertEquals(4, solution.numDistinct("aaaabcd", "abcd"));
    assertEquals(96, solution.numDistinct("aaaabbcccdddd", "abcd"));
    assertEquals(5, solution.numDistinct("bbbbb", "bbbb"));
    assertEquals(108, solution.numDistinct("aaaababcccdddd", "abcd"));
    assertEquals(108, solution.numDistinct("aaaababcccddddad", "abcdad"));
    assertEquals(9, solution.numDistinct("aaaababcczcdad", "abzcdad"));
  }
}
