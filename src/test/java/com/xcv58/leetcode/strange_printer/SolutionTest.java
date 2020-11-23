package com.xcv58.leetcode.strange_printer;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.strangePrinter(null));
    assertEquals(0, solution.strangePrinter(""));
    assertEquals(1, solution.strangePrinter("a"));
    assertEquals(1, solution.strangePrinter("aaaa"));
    assertEquals(2, solution.strangePrinter("aaab"));
    assertEquals(3, solution.strangePrinter("aaabab"));
    assertEquals(5, solution.strangePrinter("abcbcbcba"));
    assertEquals(26, solution.strangePrinter("abcdefghijklmnopqrstuvwxyza"));
    assertEquals(
      26,
      solution.strangePrinter(
        "abcdefghijklmnopqrstuvwxyzzyxwvutsrqponmlkjihgfedcba"
      )
    );
  }
}
