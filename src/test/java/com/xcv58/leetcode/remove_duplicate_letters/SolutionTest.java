package com.xcv58.leetcode.remove_duplicate_letters;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals("", solution.removeDuplicateLetters(null));
    assertEquals("", solution.removeDuplicateLetters(""));
    assertEquals("abc", solution.removeDuplicateLetters("abc"));
    assertEquals("cba", solution.removeDuplicateLetters("cba"));
    assertEquals("cab", solution.removeDuplicateLetters("cbab"));
    assertEquals("abc", solution.removeDuplicateLetters("bcabc"));
    assertEquals("acdb", solution.removeDuplicateLetters("cbacdcbc"));
    assertEquals("abdc", solution.removeDuplicateLetters("cbacdcbdc"));
    assertEquals("abcd", solution.removeDuplicateLetters("cbacdcbcd"));
  }
}
