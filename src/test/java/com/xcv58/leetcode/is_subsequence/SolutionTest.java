package com.xcv58.leetcode.is_subsequence;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(false, solution.isSubsequence("axc", ""));
    assertEquals(true, solution.isSubsequence("", "ahbgdc"));
    assertEquals(true, solution.isSubsequence("abc", "ahbgdc"));
    assertEquals(false, solution.isSubsequence("axc", "ahbgdc"));
  }
}
