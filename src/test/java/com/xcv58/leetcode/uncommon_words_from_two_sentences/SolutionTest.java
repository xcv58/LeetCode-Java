package com.xcv58.leetcode.uncommon_words_from_two_sentences;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertArrayEquals(
      new String[] { "sweet", "sour" },
      solution.uncommonFromSentences(
        "this apple is sweet",
        "this apple is sour"
      )
    );
    assertArrayEquals(
      new String[] { "banana" },
      solution.uncommonFromSentences("apple apple", "banana")
    );
    assertArrayEquals(
      new String[] { "a", "banana" },
      solution.uncommonFromSentences("apple apple apple a", "banana")
    );
  }
}
