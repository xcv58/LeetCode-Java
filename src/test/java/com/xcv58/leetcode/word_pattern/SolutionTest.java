package com.xcv58.leetcode.word_pattern;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by xcv58 on 10/19/15.
 */
public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertTrue(solution.wordPattern("abba", "dog cat cat dog"));
    assertFalse(solution.wordPattern("abba", "dog cat cat fish"));
    assertFalse(solution.wordPattern("aaaa", "dog cat cat dog"));
    assertFalse(solution.wordPattern("abba", "dog dog dog dog"));
    assertTrue(solution.wordPattern("aaaa", "a a a a"));
    assertFalse(solution.wordPattern("aaaa", "a c c a"));
    assertTrue(solution.wordPattern("caac", "a c c a"));
  }
}
