package com.xcv58.leetcode.longest_common_subsequence;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.longestCommonSubsequence("", ""));
    assertEquals(0, solution.longestCommonSubsequence(null, ""));
    assertEquals(0, solution.longestCommonSubsequence("", null));
    assertEquals(0, solution.longestCommonSubsequence(null, null));
    assertEquals(4, solution.longestCommonSubsequence("text", "text"));
    assertEquals(0, solution.longestCommonSubsequence("abcd", "efgh"));
    assertEquals(5, solution.longestCommonSubsequence("abcdef", "bcdefgh"));
    assertEquals(5, solution.longestCommonSubsequence("cccabcdef", "bcdefgh"));
    assertEquals(4, solution.longestCommonSubsequence("cccabccc", "cabc"));
    assertEquals(6, solution.longestCommonSubsequence("cccabccc", "abccccccc"));
    assertEquals(5, solution.longestCommonSubsequence("cabccc", "abccccccc"));
  }
}
