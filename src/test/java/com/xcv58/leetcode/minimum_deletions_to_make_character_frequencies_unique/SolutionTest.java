package com.xcv58.leetcode.minimum_deletions_to_make_character_frequencies_unique;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(3, solution.minDeletions("abcd"));
    assertEquals(0, solution.minDeletions("abbcccddddeeeee"));
    assertEquals(3, solution.minDeletions("aaabbbccc"));
    assertEquals(2, solution.minDeletions("ceabaacb"));
    assertEquals(2, solution.minDeletions("bbcebab"));
    assertEquals(2, solution.minDeletions("bbbbcea"));
  }
}
