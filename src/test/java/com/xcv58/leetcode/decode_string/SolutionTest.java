package com.xcv58.leetcode.decode_string;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals("aa", solution.decodeString("2[a]"));
    assertEquals("aa", solution.decodeString("2[a]"));
    assertEquals("aa", solution.decodeString("2[a]"));
    assertEquals("bcccbccc", solution.decodeString("2[b3[c]]"));
    assertEquals("aaabcbc", solution.decodeString("3[a]2[bc]"));
    assertEquals("accaccacc", solution.decodeString("3[a2[c]]"));
    assertEquals("abcabccdcdcdcdef", solution.decodeString("2[abc]4[cd]ef"));
  }
}
