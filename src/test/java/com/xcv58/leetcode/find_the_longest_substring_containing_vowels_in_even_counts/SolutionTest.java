package com.xcv58.leetcode.find_the_longest_substring_containing_vowels_in_even_counts;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.findTheLongestSubstring(null));
    assertEquals(0, solution.findTheLongestSubstring(""));
    assertEquals(0, solution.findTheLongestSubstring("aeiou"));
    assertEquals(0, solution.findTheLongestSubstring("aeioua"));
    assertEquals(0, solution.findTheLongestSubstring("aeiouaeio"));
    assertEquals(10, solution.findTheLongestSubstring("aeiouaeiou"));
    assertEquals(13, solution.findTheLongestSubstring("eleetminicoworoep"));
    assertEquals(5, solution.findTheLongestSubstring("leetcodeisgreat"));
    assertEquals(6, solution.findTheLongestSubstring("bcbcbc"));
  }
}
