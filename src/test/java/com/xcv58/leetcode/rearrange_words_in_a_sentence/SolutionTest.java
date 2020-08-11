package com.xcv58.leetcode.rearrange_words_in_a_sentence;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      "On and keep calm code",
      solution.arrangeWords("Keep calm and code on")
    );
    assertEquals("A b c d e f g", solution.arrangeWords("A b c d e f g"));
    assertEquals("A g bc def", solution.arrangeWords("A bc def g"));
  }
}
